
package com.ProgramacionJava.paquete;

public class main {
    public static void main (String []args){
        persona p1= new persona ("Nicolas");
        p1.nombre="Bernardo";
        p1.edad=30;
        p1.correr();
        
        persona p2=new persona("Jaime");
        p2.nombre="Ana";
        p2.edad=25;
        p2.correr();
        
        persona p3=new persona ("Ramon",24);
        p3.correr(80);
    }
}
