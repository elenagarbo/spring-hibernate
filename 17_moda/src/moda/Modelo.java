package moda;

public class Modelo extends SeleccionDesfile {

	private int numeroParticipante;
	
	
	public Modelo(int id, String nombre, String apellidos, int edad, int numeroParticipante, String titulo) {
		super(id, nombre, apellidos, edad);
		this.numeroParticipante = numeroParticipante;
		this.titulo = titulo;
	}
	
		
	public int getNumeroParticipante() {
		return numeroParticipante;
	}

	public void setNumeroParticipante(int numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	private String titulo;
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

	
	public void desfilar() {
		System.out.println("Desfilando...");
	}

}

