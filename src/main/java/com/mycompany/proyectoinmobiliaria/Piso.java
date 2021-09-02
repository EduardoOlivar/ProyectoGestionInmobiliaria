
package com.mycompany.proyectoinmobiliaria;

import java.util.ArrayList;


public class Piso {

    private int idPiso;
    private int numeroDePiso;
    private int cantidadDpto;
    private ArrayList<Departamento> departamentos;
    

    //constructor
    public Piso(int idPiso,int numeroDePiso, int cantidadDpto) {
        this.idPiso = idPiso;
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
    public int getIdPiso(){return idPiso;}
    //setter
    public void setIdPiso(int idPiso){this.idPiso = idPiso;}
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.cantidadDpto = cantidadDpto;}
    
}
