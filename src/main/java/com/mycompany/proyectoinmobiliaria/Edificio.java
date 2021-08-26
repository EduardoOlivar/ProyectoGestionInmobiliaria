
package com.mycompany.proyectoinmobiliaria;

public class Edificio
{
    private String nombre;
    private String localidad;
    private String direccion;
    private String arquitecto;
    private Piso[] pisos;

    //constructor
    public Edificio(String nombre, String localidad, String direccion, String arquitecto) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccion = direccion;
        this.arquitecto = arquitecto;
        this.pisos = new Piso[5];
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
    
    public void setPiso(Piso piso)
    {
        int i;
        for(i = 0 ; i < pisos.length && pisos[i] == null ; i++){
            if( piso.getNumeroDePiso() == pisos[i].getNumeroDePiso())
            {
                System.out.println("Ya existe el piso");
                return;
            }
        }
        if( i == pisos.length)
        {
            System.out.println("arreglo completo");
            return;
        }
        pisos[i] = piso;
        }
    public void setPiso(int numeroPiso, int cantidadDepto)
    {
        Piso piso = new Piso(numeroPiso,cantidadDepto);
        this.setPiso(piso);
    }
}
