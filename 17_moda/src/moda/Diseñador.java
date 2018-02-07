package moda;

public class Diseñador extends SeleccionDesfile  {

	private String dni;
	
	
	public Diseñador(int id, String nombre, String apellidos, int edad, String dni) {
		super(id, nombre, apellidos, edad);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String concentrarse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viajar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String practicar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void diseñarVestidos() {
		System.out.println("Diseñando vestidos...");
	}

}
