
package com.mycompany.proyectoinmobiliaria;

public class Departamento {
    private String rol;
    private String numeroDpto;
    private String valorDpto;
    private String orientacion;
    private int cantidadBaños;
    private int cantidadDormitorios;
    private double metrosCuadrados;
    private boolean ocupado;
    
    //constructor
    public Departamento(){} 
    
    public Departamento(String rol,String numeroDpto, String valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados) {
        this.rol = rol;
        this.numeroDpto = numeroDpto;
        this.valorDpto = valorDpto;
        this.orientacion = orientacion;
        this.cantidadBaños = cantidadBaños;
        this.cantidadDormitorios = cantidadDormitorios;
        this.metrosCuadrados = metrosCuadrados;
        this.ocupado = false; 
    }
    
    //aqui iran metodos
    
    public void mostrar()
    {
        System.out.println("El numero del departamento es: " + this.numeroDpto + " tiene un valor de: "+ this.valorDpto + " y su rol es: " + this.rol);
        System.out.println("Su orientación es: " + this.orientacion);
        System.out.println("Tiene "+ this.cantidadBaños +" baños y " + this.cantidadDormitorios + " dormitorios, con una cantidad de " + this.metrosCuadrados +" metros cuadrados\n\n");
    }       
    
    
    
    //getter
    public String getRol(){return rol;}
    public String getNumeroDpto(){return numeroDpto;}
    public String getValorDpto(){return valorDpto;}
    public String getOrientacion(){return orientacion;}
    public int getCantidadBaños(){return cantidadBaños;}
    public int getCantidadDormitorios(){return cantidadDormitorios;}
    public double getMetrosCuadrados(){return metrosCuadrados;}
    public boolean getOcupado(){return ocupado;}
    //setter
    public void setRol(String rol){this.rol = rol;}
    public void setNumeroDpto(String numeroDpto){this.numeroDpto = numeroDpto;}
    public void setValorDpto(String valorDpto){this.valorDpto = valorDpto;}
    public void setOrientacion(String orientacion){this.orientacion = orientacion;}
    public void setCantidadBaños(int cantidadBaños){this.cantidadBaños = cantidadBaños;}
    public void setCantidadDormitorios(int cantidadDormitorios){this.cantidadDormitorios = cantidadDormitorios;}
    public void setMetrosCuadrados(double metrosCuadrados){this.metrosCuadrados = metrosCuadrados;}
    public void setOcupado(boolean ocupado){this.ocupado = ocupado;}
    
}
