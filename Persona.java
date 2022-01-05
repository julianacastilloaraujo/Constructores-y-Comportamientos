
package com.ProgramacionJava.paquete;


public class persona {
    //atributos
    String nombre;
    int edad;
    
    //constructor 1
    public persona (String _nombre){
        nombre= _nombre;
    }
    
    
    
    //constructor 2
    public persona (String _nombre,int _edad){
        this.nombre=_nombre;
        this.edad=_edad;
    }
    
    
    
    //comportamientos
    
    public void correr (){
        System.out.println("soy"+nombre+"tengo"+edad+"y estoy corriendo");
    }
}
