package moda;

import java.util.ArrayList;

public class Main {

	public static ArrayList<SeleccionDesfile> integrantes = new ArrayList<SeleccionDesfile>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		SeleccionDesfile delBosque = new Dise�ador(1, "Vicente", "Del Bosque", 60, "11864181E");
		SeleccionDesfile iniesta = new Modelo(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionDesfile raulMartinez = new Maquillador(3, "Ra�l", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo m�todo)");
		for (SeleccionDesfile integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo m�todo)");
		for (SeleccionDesfile integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Todos los integrantes tienen su funci�n en un entrenamiento (Especializaci�n)");
		for (SeleccionDesfile integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.practicar();
		}


		// PLANIFICAR ENTRENAMIENTO
		System.out.println("\nPlanificar Entrenamiento: Solo el Dise�ador tiene el m�todo para planificar un entrenamiento:");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((Dise�ador) delBosque).dise�arVestidos();

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el Modelo tiene el m�todo para dar una entrevista:");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((Modelo) iniesta).desfilar();

		// MASAJE
		System.out.println("\nMasaje: Solo el Maquillador tiene el m�todo para dar un masaje:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Maquillador) raulMartinez).maquillar();
		
		
		
		
	}

}
