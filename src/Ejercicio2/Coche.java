/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class Coche {
      private String marca;
      private String modelo;
      private double velocidadMaxima;
public Coche(String marca,String modelo, double velocidadMaxima) {
     this.marca = marca;
     this.modelo=modelo;
     this.velocidadMaxima= velocidadMaxima;
}
public String getMarca() {
return marca;
}
public String getModelo() {
return modelo;
}
public double getVelocidadMaxima() {
return velocidadMaxima;
}
public void acelerar(double incremento) {
if (incremento > 0) {
velocidadMaxima += incremento;
}
}
}

