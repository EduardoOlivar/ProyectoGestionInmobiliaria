/*
Autores:
    Daniel Duran;
    José Eduardo Olivar;
    Paula Vargas
*/

package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {

    public static void main(String[] args) throws IOException 
    {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la cantidad de Edificios que quiera agregar");
        int cantidadEdificio = Integer.parseInt(leer.readLine());
        
        Edificio[] edificios = new Edificio[cantidadEdificio];//String nombre, String localidad, String direccion, String arquitecto
        llenadoEdificiosPorConsola(edificios);
        
        System.out.println("Ingrese la cantidad de Pisos que quiera agregar");
        int cantidadPiso = Integer.parseInt(leer.readLine());
        Piso[] piso = new Piso[cantidadPiso];
        llenadoPiso(piso);
        
        mostrarEdificios(edificios);
        mostrarPiso(piso);
        
        
        Edificio objEdificio1 = new Edificio("10 norte","10 norte 655","Viña del mar","Quiroz y Puelma Arquitectos");
        Edificio objEdificio2 = new Edificio("15 norte","15 norte 242","Viña del mar","Mario Castañeda");
        Edificio objEdificio3 = new Edificio("Viana Miramar","Viana 161","Viña del mar","Roberto Rau");
        objEdificio1.mostrarEdificio();
        objEdificio2.mostrarEdificio();
        objEdificio3.mostrarEdificio();
        Piso objPiso1 = new Piso(1,4);
        Piso objPiso2 = new Piso(2,4);
        Piso objPiso3 = new Piso(3,4);
        Piso objPiso4 = new Piso(4,4);
        objPiso1.mostrarPiso();
        objPiso2.mostrarPiso();
        objPiso3.mostrarPiso();
        objPiso4.mostrarPiso();
        
        Departamento objDepartamento1 = new Departamento ("22A","3000UF","Poniente",2,3,67);
        Departamento objDepartamento2 = new Departamento("51A","3500UF","oriente",2,3,109);
        objDepartamento1.mostrarDpto();
        objDepartamento2.mostrarDpto();
        
    }
    
    // metodo para agregar lista de Edificios.
    public static void llenadoEdificiosPorConsola(Edificio[] edificios) throws IOException 
    {
        
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
            //numeroDePiso cantidadDepto
            piso[i] = new Piso();
            System.out.println("Ingrese el numero de piso: ");
            piso[i].setNumeroDePiso(Integer.parseInt(leer.readLine()));
            System.out.println("Ingrese cantidad de departamentos del piso: ");
            piso[i].setCantidadDpto(Integer.parseInt(leer.readLine()));
        }       
        
    }
   public static void mostrarPiso(Piso[] piso) 
   {
      for(int i = 0 ; i < piso.length ; i++)
      {
          piso[i].mostrarPiso();
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

    
