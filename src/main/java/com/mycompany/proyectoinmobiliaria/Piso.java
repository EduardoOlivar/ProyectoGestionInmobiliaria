
package com.mycompany.proyectoinmobiliaria;

//import java.util.ArrayList;


public class Piso {

    private int numeroDePiso;
    private int cantidadDpto;

    //constructor
    public Piso(int numeroDePiso, int cantidadDpto) {
        this.numeroDePiso = numeroDePiso;
        this.cantidadDpto = cantidadDpto;
    }
    //constructor vacio
    public Piso(){}
    

    //aqui iran metodos
    public void mostrarPiso() {
        System.out.println("El piso es: " + this.numeroDePiso +  " y la cantidad de departamentos que hay son " + this.cantidadDpto + "\n\n");
    }
    
    
    //getter
    public int getNumeroDePiso() {return numeroDePiso;}
    public int getCantidadDpto() {return cantidadDpto;}
    //setter
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.cantidadDpto = cantidadDpto;}
    
}
