package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {

    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la cantidad de Edificios que quiera agregar");
        int cantidadEdificio = Integer.parseInt(leer.readLine());
        int cantidadPiso = Integer.parseInt(leer.readLine());
        
        Edificio[] edificios = new Edificio[cantidadEdificio];//String nombre, String localidad, String direccion, String arquitecto
        llenadoEdificiosPorConsola(edificios);
        
        System.out.println("Ingrese la cantidad de Pisos que quiera agregar");
        Piso[] piso = new Piso[cantidadPiso];
        llenadoPiso(piso);

        mostrarEdificios(edificios);
        
        
    }
    
    // metodo para agregar lista de Edificios.
    public static void llenadoEdificiosPorConsola(Edificio[] edificios) throws IOException {
        
           BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));              
        // rellenar un arreglo de edificios
        for (int i = 0 ; i < edificios.length ; i++)
        {
            edificios[i] = new Edificio();
            System.out.println("Ingrese Nombre del edificio " + (i+1));
            edificios[i].setNombre(leer.readLine());
            System.out.println("Ingrese localidad del Edificio y su direccion");
            edificios[i].setLocalidad  (leer.readLine());
            edificios[i].setDireccion(leer.readLine());
            System.out.println("Ingrese nombre del Arquitecto");
            edificios[i].setArquitecto(leer.readLine());            
        }           
    }
    public static void mostrarEdificios(Edificio[] edificios)
    {
     for(int i = 0 ; i < edificios.length;i++)
        {
            edificios[i].mostrarEdificio();
        }  
    }
    public static void llenadoPiso(Piso[] piso) throws IOException
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //rellenar un arreglo de piso
        for(int i = 0 ; i < piso.length ; i++)
        {
            
        }
        
    }
    
    
    //metodos para mas la proxima entrega para las anidaciones
    /*public static void llenadoPisos(Edificio edificios) throws IOException{
        
        
        Piso piso1 = new Piso("a",1,4);
        Piso piso2 = new Piso("b",2,4);
        Piso piso3 = new Piso("c",3,4);
        Piso piso4 = new Piso("d",4,4);
        
                
        edificios.agregarPiso(piso1);
        edificios.agregarPiso(piso2);
        edificios.agregarPiso(piso3);
        edificios.agregarPiso(piso4);
        
        
    }
    
    public static void mostrarPisos(Edificio hotel) 
    {
            hotel.mostrarPiso();
  
    }*/
}
