package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		//Scanner scanner =new Scanner(System.in);
		//NOS PIDEN QUE PARA EL ALUMNO MAURO TARIFA SE REGISTREN LAS NOTAS FINALES DE 4 MATERIAS
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 1);
		//scanner.close();
		}

	
	public static Alumno generarAlumno(){
		Alumno alumno = new Alumno();
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMateria) {

		Scanner scanner =new Scanner(System.in);
		while( numMateria <= 4) {
			//CARGAR MATERIAS
			System.out.println("Ingrese el codigo de la Materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la Materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			float notaMateria = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, notaMateria);
			
			System.out.println(registroNota.toString());
			numMateria++;	
		}
		//scanner.close();
	}
}
