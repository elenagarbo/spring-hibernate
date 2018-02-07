

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consultar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//buscar el nombre del river en apache tomcat..mysql
		Class.forName("com.mysql.jdbc.Driver");
		//hacer conexion. no se hace un new xk es interfaz
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root","");
		
		//con la conexion
		Statement st= conn.createStatement();
		//ejecutar las instrucciones query. RS contenedor donde se guarda todo.
		ResultSet rs = st.executeQuery("select * from libros");
		//mientras haya siguientes resultados, se muestran
		while (rs.next()){
			 System.out.println("Titulo " + rs.getString("titulo"));
			 System.out.println("Autor " + rs.getString("autor"));
			 System.out.println("Fecha " + rs.getDate("fechapublicacion"));
			 System.out.println("Precio " + rs.getFloat("precio")+ "€");
		}		
		
		System.out.println("----------------------------");
		//nos devuelve cuantas filas han sido insertadas
		int insertar= st.executeUpdate("insert into libros (titulo, autor, fechapublicacion, precio) values ('El Quijote','cervantes','2018/01/25','50.50')");
		System.out.println("Fila insertada "+ insertar );
		
		
		PreparedStatement pstmt= conn.prepareStatement("select*from libros where titulo = ? ");
		pstmt.setString(1, "El Quijote");
		ResultSet rs1= pstmt.executeQuery();
		while (rs1.next()){
			 System.out.println("Titulo de rs1 " + rs1.getString("titulo"));
			 System.out.println("Autor " + rs1.getString("autor"));
			 System.out.println("Fecha " + rs1.getDate("fechapublicacion"));
			 System.out.println("Precio " + rs1.getFloat("precio")+ "€");
		}
		System.out.println("----------------------------");
		//callable
		
		CallableStatement cs= conn.prepareCall("{call listaLibros()}");
		ResultSet rs2= cs.executeQuery();
		while (rs2.next()){
			 System.out.println("Titulo de rs2 " + rs2.getString("titulo"));
			 System.out.println("Autor " + rs2.getString("autor"));
			 System.out.println("Fecha " + rs2.getDate("fechapublicacion"));
			 System.out.println("Precio " + rs2.getFloat("precio")+ "€");
		}
		
		System.out.println("-------sin el libro origen----------------------------");
		
		CallableStatement cs1= conn.prepareCall("{call listaLibrosPorAutor(?)}");
		cs1.setString(1, "cervantes");
		ResultSet rs3= cs1.executeQuery();
		while (rs3.next()){
			 System.out.println("Titulo de rs2 " + rs3.getString("titulo"));
			 System.out.println("Autor " + rs3.getString("autor"));
			 System.out.println("Fecha " + rs3.getDate("fechapublicacion"));
			 System.out.println("Precio " + rs3.getFloat("precio")+ "€");
		}
		
		
	}
	
}
