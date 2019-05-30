package ec.ups.edu.appdis.Model;

import java.util.List;

public class Carrera {

	private String nombre;
	private String descripcion;
	private int duracion;
	private List<Malla> mallas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public List<Malla> getMallas() {
		return mallas;
	}
	public void setMallas(List<Malla> mallas) {
		this.mallas = mallas;
	}
	
	
}
