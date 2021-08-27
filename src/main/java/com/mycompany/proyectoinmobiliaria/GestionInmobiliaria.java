package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {

    public static void main(String[] args) throws IOException {
        Edificio [] edificios = new Edificio[1];//String nombre, String localidad, String direccion, String arquitecto
       
        
        llenadoEdificiosPorConsola(edificios);
        mostrarEdificios(edificios);
        llenadoPisos(edificios[0]);
        mostrarPisos(edificios[0]);
        
        
    }
    
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
      
    public static void llenadoPisos(Edificio edificios) throws IOException{
        
        
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
  
    }
}
