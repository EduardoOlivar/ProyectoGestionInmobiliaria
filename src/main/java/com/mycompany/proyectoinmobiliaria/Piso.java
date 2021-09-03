
package com.mycompany.proyectoinmobiliaria;

import java.util.ArrayList;


public class Piso {

    private int numeroDePiso;
    private int maxDpto;
    private ArrayList<Departamento> listaDepartamentos;
    

    //constructor
    public Piso(int numeroDePiso, int cantidadDpto) {
        this.numeroDePiso = numeroDePiso;
        this.maxDpto = cantidadDpto;
        this.listaDepartamentos = new ArrayList<>();
    }
    //constructor vacio
    public Piso(){}
    

    //aqui iran metodos
    public void mostrarPiso() {
        System.out.println( "El piso es: " + this.numeroDePiso +  " y la cantidad de departamentos que hay son " + this.maxDpto + "\n\n");
    }
    
    private boolean agregarDepartamento(Departamento departamento)
    {
        
        if (this.listaDepartamentos.size() < maxDpto)
        {
            this.listaDepartamentos.add(departamento);
            return true;
        }
        return false;        
    }
    
      
  
    public void mostrarDepto()
    {
        for(int i = 0 ; i < this.listaDepartamentos.size();i++)
        {
            this.listaDepartamentos.get(i).mostrar();
        }
    }
    
    
    
    
    
    //getter
    public int getNumeroDePiso() {return numeroDePiso;}
    public int getCantidadDpto() {return maxDpto;}

    //setter
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.maxDpto = cantidadDpto;}
    
}
