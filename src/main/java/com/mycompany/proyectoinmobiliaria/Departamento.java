
package com.mycompany.proyectoinmobiliaria;

public class Departamento {
    //private String id;
    private String numeroDpto;
    private String valorDpto;
    private String orientacion;
    private int cantidadBaños;
    private int cantidadDormitorios;
    private double metrosCuadrados;
    
    //constructor
    public Departamento(/*String id*/ String numeroDpto, String valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados) {
        //this.id = id;
        this.numeroDpto = numeroDpto;
        this.valorDpto = valorDpto;
        this.orientacion = orientacion;
        this.cantidadBaños = cantidadBaños;
        this.cantidadDormitorios = cantidadDormitorios;
        this.metrosCuadrados = metrosCuadrados;
    }
    public Departamento(){}
    //aqui iran metodos
    
    
    
    
    
    
    
    //getter
    //public String getId(){return id;}
    public String getNumeroDpto(){return numeroDpto;}
    public String getValorDpto(){return valorDpto;}
    public String getOrientacion(){return orientacion;}
    public int getCantidadBaños(){return cantidadBaños;}
    public int getCantidadDormitorios(){return cantidadDormitorios;}
    public double getMetrosCuadrados(){return metrosCuadrados;}
    //setter
    //public void setId(String Id){this.id = Id;}
    public void setNumeroDpto(String numeroDpto){this.numeroDpto = numeroDpto;}
    public void setValorDpto(String valorDpto){this.valorDpto = valorDpto;}
    public void setOrientacion(String orientacion){this.orientacion = orientacion;}
    public void setCantidadBaños(int cantidadBaños){this.cantidadBaños = cantidadBaños;}
    public void setCantidadDormitorios(int cantidadDormitorios){this.cantidadDormitorios = cantidadDormitorios;}
    public void setMetrosCuadrados(double metrosCuadrados){this.metrosCuadrados = metrosCuadrados;}

    
    
 
    /*public void mostrarDepto() //String numeroDpto, double valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados
    {        
    }*/
    
    
}
