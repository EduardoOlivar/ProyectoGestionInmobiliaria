
package com.mycompany.proyectoinmobiliaria;

//import java.util.ArrayList;


public class Piso {
    //private String id;
    //private String tipoDpto;
    private int numeroDePiso;
    private int cantidadDpto;
    //private  final ArrayList<Departamento> departamentos; <-- luego una lista para agregar departamentos a los pisos
    //constructor
    public Piso(/*String id,String tipoDpto, */int numeroDePiso, int cantidadDpto /*ArrayList<Departamento> departamentos*/) {
        //this.id = id;
        //this.tipoDpto = tipoDpto;
        this.numeroDePiso = numeroDePiso;
        this.cantidadDpto = cantidadDpto;
        //this.departamentos = new ArrayList <>();
    }
    //constructor vacio
    public Piso(){}
    

    //aqui iran metodos
    public void mostrarPiso() {
        System.out.println("El piso es: " + this.numeroDePiso +  " y la cantidad de departamentos que hay son " + this.cantidadDpto + "\n\n");
    }
    
    
    //getter
    //public String getId() {return id;}
    //public String getTipoDpto() {return tipoDpto;}
    public int getNumeroDePiso() {return numeroDePiso;}
    public int getCantidadDpto() {return cantidadDpto;}
    //setter
    //public void setId(String id) {this.id = id;}
    //public void setTipoDpto(String tipoDpto) {this.tipoDpto = tipoDpto;}
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.cantidadDpto = cantidadDpto;}
    
}
