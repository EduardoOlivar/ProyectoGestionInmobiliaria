
package com.mycompany.proyectoinmobiliaria;

public class Piso {
    private String tipoDpto;
    private int numeroDePiso;
    private int cantidadDpto;
    // coleccion de deptos
    
    //constructor
    public Piso(String tipoDpto, int numeroDePiso, int cantidadDpto) {
        this.tipoDpto = tipoDpto;
        this.numeroDePiso = numeroDePiso;
        this.cantidadDpto = cantidadDpto;
    }
    public Piso(){}    
    //aqui iran metodos
    
    
    
    
    
    //getter
    public String getTipoDpto() {return tipoDpto;}
    public int getNumeroDePiso() {return numeroDePiso;}
    public int getCantidadDpto() {return cantidadDpto;}
    //setter
    public void setTipoDpto(String tipoDpto) {this.tipoDpto = tipoDpto;}
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.cantidadDpto = cantidadDpto;}
    
}
