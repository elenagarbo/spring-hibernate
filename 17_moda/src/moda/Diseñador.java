package moda;

public class Dise�ador extends SeleccionDesfile  {

	private String dni;
	
	
	public Dise�ador(int id, String nombre, String apellidos, int edad, String dni) {
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
	
	public void dise�arVestidos() {
		System.out.println("Dise�ando vestidos...");
	}

}
