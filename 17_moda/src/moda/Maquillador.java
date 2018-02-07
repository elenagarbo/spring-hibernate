package moda;

public class Maquillador extends SeleccionDesfile {

	private String titulacion;
	
	public Maquillador(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	private int aniosExperiencia;
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

	public void maquillar() {
		System.out.println("Maquillando...");
	}
}
