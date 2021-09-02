
package com.mycompany.proyectoinmobiliaria;

import java.util.ArrayList;


public class Edificio
{
    private String id;
    private String nombre;
    private String direccion;
    private String localidad;
    private String arquitecto;
    private ArrayList<Piso> listaPiso;

    //constructor
    
    public Edificio(String id ,String nombre, String direccion, String localidad, String arquitecto)
    {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.arquitecto = arquitecto;
        this.listaPiso = new ArrayList<>(); // por ahora ira asi para poder hacer el entregable 2
             
    }
    public Edificio(){}
    //aqui iran metodos
    
    
    //metodo para mostrar 
    public void mostrarEdificio()
    {
        System.out.println("Rol unico del Edificio: " + this.id);
        System.out.println("Nombre del Edificio u Hotel: " + this.nombre);
        System.out.println("Direccion: " + this.direccion + ", localidad: " + this.localidad);
        System.out.println("Nombre del Arquitecto: " + this.arquitecto + "\n\n");
    }
    
    public void agregarPiso(Piso piso)
    {
        this.listaPiso.add(piso);
    }
    
    public void mostrarPiso()
    {
        for(int i = 0 ; i < this.listaPiso.size(); i++)
        {
            this.listaPiso.get(i).mostrarDepto();
        }
    }
    
    public void mostrarPiso(String id)
    {
        for(int i = 0; i < this.listaPiso.size();i++)
        {
            if(this.listaPiso.get(i).getIdPiso().equals(id))
            {
              this.listaPiso.get(i).mostrarPiso();
            }
            
        }
    }
    
    

    //getter
    public String getId(){return id;}
    public String getNombre(){return nombre;}
    public String getLocalidad(){return localidad;}
    public String getDireccion(){return direccion;}
    public String getArquitecto(){return arquitecto;}
    //setter
    public void setId(String id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setLocalidad(String localidad){this.localidad = localidad;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setArquitecto(String arquitecto){this.arquitecto = arquitecto;}

}
