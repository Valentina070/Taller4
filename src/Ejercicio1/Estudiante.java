/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;
    
     // Se usa el set para validar
    public Estudiante(String nombre, int edad,double notaPromedio) {
       setNombre(nombre);      
       setEdad(edad);
       setNotaPromedio(notaPromedio);
     //Uso de getter y setter
    }
      public String getNombre() {
         return nombre;
}

      public void setNombre(String nombre) {
         this.nombre = nombre;
}
      public int getEdad() {
         return edad;
}
      public void setEdad(int edad) {
         if (edad >= 0) {
         this.edad = edad;    
}
      }
      public void setNotaPromedio(double notaPromedio) {
         if (notaPromedio >= 0 && notaPromedio <= 5){// La nota es de 0 a 5
             this.notaPromedio=notaPromedio;
         }
      }
       public double getNotaPromedio() {
         return notaPromedio;
       }
}
