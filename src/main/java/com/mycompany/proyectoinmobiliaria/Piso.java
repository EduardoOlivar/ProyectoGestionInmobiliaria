
package com.mycompany.proyectoinmobiliaria;

import java.util.ArrayList;


public class Piso {

    private String idPiso;
    private int numeroDePiso;
    private int cantidadDpto;
    private ArrayList<Departamento> listaDepartamentos;
    

    //constructor
    public Piso(String idPiso,int numeroDePiso, int cantidadDpto) {
        this.idPiso = idPiso;
        this.numeroDePiso = numeroDePiso;
        this.cantidadDpto = cantidadDpto;
        this.listaDepartamentos = new ArrayList<>();
    }
    //constructor vacio
    public Piso(){}
    

    //aqui iran metodos
    public void mostrarPiso() {
        System.out.println("El id del piso es: " + this.idPiso + "El piso es: " + this.numeroDePiso +  " y la cantidad de departamentos que hay son " + this.cantidadDpto + "\n\n");
    }
    
    public void agregarDepartamento(Departamento departamento)
    {
        int i;
        for( i = 0; i < cantidadDpto;i++)
        {
            this.listaDepartamentos.add(departamento);
        }
    }
    /*Este metodo agregara a la lista departamentos de tipo oficinas*/
    public void agregarDepartamento(String rol, String numero, String valor, int cantidadBaños,int cantidadOficinas, double metrosCuadrados)
    {
        int i;
        
        for(i=0; i< this.cantidadDpto ; i++)
        {
            Departamento dptoOficina = new Departamento(rol,numero,valor,cantidadBaños,cantidadOficinas,metrosCuadrados);
            this.listaDepartamentos.add(dptoOficina);
        }
    }
    
    public void mostrarDepto()
    {
        for(int i = 0 ; i < this.listaDepartamentos.size();i++)
        {
            this.listaDepartamentos.get(i).mostrarDpto();
        }
    }
    
    
    
    
    //getter
    public int getNumeroDePiso() {return numeroDePiso;}
    public int getCantidadDpto() {return cantidadDpto;}
    public String getIdPiso(){return idPiso;}
    //setter
    public void setIdPiso(String idPiso){this.idPiso = idPiso;}
    public void setNumeroDePiso(int numeroDePiso) {this.numeroDePiso = numeroDePiso;}
    public void setCantidadDpto(int cantidadDpto) {this.cantidadDpto = cantidadDpto;}
    
}
