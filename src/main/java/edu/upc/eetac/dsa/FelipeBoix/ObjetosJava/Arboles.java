package edu.upc.eetac.dsa.FelipeBoix.ObjetosJava;

public class Arboles {
	String nombre;
    int altura;
    
	public Arboles(){
		nombre = "genérico";
		System.out.println( "Un arbol genérico" );
	}
	public Arboles(String name){
		nombre = name;
		System.out.println( "Un " + nombre);
	}
	public Arboles(int heigh){
		altura = heigh;
		System.out.println( "Un arbol de " + altura + " metros" );
	}
	
	public Arboles(int heigh, String name){
		nombre = name;
		altura = heigh;
		System.out.println( "Un " + name + " de " + altura + " metros" );

	}

}
