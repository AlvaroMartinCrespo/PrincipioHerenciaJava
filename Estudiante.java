package domain;

public class Estudiante extends Persona {

//	atrib
	
	private int codigoEstudiante;
	private float notaFinal;

//	const
	
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {

		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;

	}


//	get
	
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public float getNotaFinal() {
		return notaFinal;
	}


	@Override
	public String toString() {
		return "Persona Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad +" Estudiante [codigoEstudiante=" + codigoEstudiante + ", notaFinal=" + notaFinal + "]";
	}

	
	
	
}
