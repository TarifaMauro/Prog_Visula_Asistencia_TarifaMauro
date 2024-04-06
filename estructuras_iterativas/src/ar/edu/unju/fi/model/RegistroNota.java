package ar.edu.unju.fi.model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private float NotaFinal;
	
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}
	
	public RegistroNota(String codigo, Alumno alumno, Materia materia, float notaFinal) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		NotaFinal = notaFinal;
	}
	
	

	@Override
	public String toString() {
		return "Registro de Nota: codigo de registro de nota=" + codigo + ", alumno=" + alumno + ", materia:" + materia + ", NotaFinal="
				+ NotaFinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public float getNotaFinal() {
		return NotaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		NotaFinal = notaFinal;
	}

	
}
