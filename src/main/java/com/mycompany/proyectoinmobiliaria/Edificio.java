
package com.mycompany.proyectoinmobiliaria;

public class Edificio
{
    private String nombre;
    private String localidad;
    private String direccion;
    private String arquitecto;
    // queria poner aqui una lista o arraylist para los pisos 

    //constructor
    public Edificio(String nombre, String localidad, String direccion, String arquitecto) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccion = direccion;
        this.arquitecto = arquitecto;
    }
    public Edificio()
    {
        
    }
    
    //aqui iran metodos
    
    
    //metodo para mostrar 
    public void mostrarEdificio()
    {
        System.out.println("Nombre del Edificio u Hotel: " + this.nombre);
        System.out.println("Direccion: " + this.direccion + ", localidad: " + this.localidad);
        System.out.println("Nombre del Arquitecto: " + this.arquitecto);
    }
    
    
    
    
    
    
    
    

    //getter
    public String getNombre(){return nombre;}
    public String getLocalidad(){return localidad;}
    public String getDireccion(){return direccion;}
    public String getArquitecto(){return arquitecto;}
    //setter
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setLocalidad(String localidad){this.localidad = localidad;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setArquitecto(String arquitecto){this.arquitecto = arquitecto;}
    
    
}
