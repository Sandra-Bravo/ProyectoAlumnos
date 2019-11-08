package com.alumnos.app;

public class Mascota{

	String tipoMascota;
	String nombre;
	String color;
	
	
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString (){
        String mensaje=" y tiene de Mascota a un: "+tipoMascota+" de nombre "+nombre;
      return mensaje;
    }

	
	
	
}
