package com.alumnos.app;

public class App
{
    public static void main( String[] args )
    {
    	Alumno sujeto = new Alumno();
    	Alumno sujeto2 = new Alumno();
    	Alumno sujeto3 = new Alumno();
    	Alumno sujeto4 = new Alumno();
    	Alumno sujeto5 = new Alumno();
    	Alumno sujeto6 = new Alumno();
    	
    	sujeto.setNombre("Magali Abigail");
    	sujeto.setApellidoPaterno("Juarez");
    	sujeto.setApellidoMaterno("Montes");
    	sujeto2.setNombre("Monica Priscila");
    	sujeto2.setApellidoPaterno("Aquino");
    	sujeto2.setApellidoMaterno("Luna");
    	sujeto3.setNombre("Ana karen");
    	sujeto3.setApellidoPaterno("Monroy");
    	sujeto3.setApellidoMaterno("Diaz");
    	sujeto4.setNombre("Samuel");
    	sujeto4.setApellidoPaterno("Montiel");
    	sujeto4.setApellidoMaterno("Santos");
    	sujeto5.setNombre("Jose Luis");
    	sujeto5.setApellidoPaterno("Perez");
    	sujeto5.setApellidoMaterno("Sanchez");
    	sujeto6.setNombre("Uriel");
    	sujeto6.setApellidoPaterno("Ordan");
    	sujeto6.setApellidoMaterno("Lilis");
    
        Mascota mascota = new Mascota();
        Mascota mascota2 = new Mascota();
        Mascota mascota3 = new Mascota();
        Mascota mascota4 = new Mascota();
        Mascota mascota5 = new Mascota();
        Mascota mascota6 = new Mascota();
        
        mascota.setNombre("Konnan");
        mascota.setTipoMascota("Perro");
        mascota.setColor("Negro");
        mascota2.setNombre("Cheester");
        mascota2.setTipoMascota("Perro");
        mascota2.setColor("beige");
        mascota3.setNombre("Luca");
        mascota3.setTipoMascota("cotorro");
        mascota3.setColor("verde");
        mascota4.setNombre("Gringo");
        mascota4.setTipoMascota("Perro");
        mascota4.setColor("blanco");
        mascota5.setNombre("Tigger");
        mascota5.setTipoMascota("Perro");
        mascota5.setColor("beige");
        mascota6.setNombre("Gatina");
        mascota6.setTipoMascota("Gato");
        mascota6.setColor("Blanco");
        
        sujeto.setMascota(mascota);
        sujeto2.setMascota(mascota2);
        sujeto3.setMascota(mascota3);
        sujeto4.setMascota(mascota4);
        sujeto5.setMascota(mascota5);
        sujeto6.setMascota(mascota6);  
       
        
        System.out.println(sujeto.toString());
        System.out.println(sujeto2.toString());
        System.out.println(sujeto3.toString());
        System.out.println(sujeto4.toString());
        System.out.println(sujeto5.toString());
        System.out.println(sujeto6.toString());
        
               
        
    }

}
