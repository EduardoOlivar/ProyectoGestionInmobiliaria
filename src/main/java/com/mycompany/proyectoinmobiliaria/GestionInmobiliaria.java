/*
Autores:
    Daniel Duran;
    José Eduardo Olivar;
    Paula Vargas
*/

package com.mycompany.proyectoinmobiliaria;

import java.io.*;
import java.util.ArrayList;


public class GestionInmobiliaria {

    public static void main(String[] args) throws IOException 
    {
        ArrayList<Edificio> edificios = new ArrayList();
        
        System.out.println("Buenos Dias");
        System.out.println("¿Qué desea hacer?");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        boolean mostrarMenu = true;
        
         while(mostrarMenu){
            System.out.println("(1)  Agregar Edificio");
            System.out.println("(2)  Buscar  Edificio");
            System.out.println("(3)  Modificar Edificio");
            System.out.println("(4)  Quitar  Edificio");
            System.out.println("(5)  Buscar  Departamento");
            System.out.println("presione x para salir");
            
            String eleccion = leer.readLine(); 
            
            switch(eleccion){
                case "1":
                        agregarEdificio();
                        break;
                case "2":
                        buscarEdificio();
                        break;
                case "3":
                        modificarEdificio();
                        break;
                case "4":
                        quitarEdificio();
                        break;
                case "5":
                        buscarDepartamento();
                        break;
                case "x":
                        System.out.println("Adios!!");
                        mostrarMenu = false;
                        break;
                default:
                        System.out.println("La opción ingresada no es válida");
                        break;
            }   
        }
    }
    }
    
    /* metodo para agregar Edificios por consola.*/
    public static void llenadoEdificiosPorConsola(ArrayList<Edificio> edificios) throws IOException 
    {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
                       
        // rellenar un arreglo de edificios
        for (int i = 0 ; i < edificios.size() ; i++)
        {
            Edificio edificio = new Edificio();
            System.out.println("Ingrese Nombre del edificio " + (i+1));
            edificio.setNombre(leer.readLine());
            System.out.println("Ingrese localidad del Edificio y su direccion");
            edificio.setLocalidad  (leer.readLine());
            edificio.setDireccion(leer.readLine());
            System.out.println("Ingrese nombre del Arquitecto");
            edificio.setArquitecto(leer.readLine());            
        }           
    }
       
    /* metodo para llamar a mostrarEdificio*/
    public static void mostrarEdificios(ArrayList<Edificio> edificios)
    {
        System.out.println("Lista de Edificios");
        for(int i = 0 ; i < edificios.size();i++)
        {
            Edificio edificio = (Edificio)edificios.get(i);
            edificio.mostrarEdificio();
        }  
    }


/*
   Aqui usamos el metodo para pedir datos por consola
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la cantidad de Edificios que quiera agregar");
        int cantidadEdificio = Integer.parseInt(leer.readLine());
        /*instanciador de un arreglo de edificios con la cantidad que el usuario quiera
        Edificio[] edificios = new Edificio[cantidadEdificio];
        /*metodo para llenar el arreglo de edificios
        llenadoEdificiosPorConsola(edificios);
        
        System.out.println("Ingrese la cantidad de Pisos que quiera agregar");
        int cantidadPiso = Integer.parseInt(leer.readLine());
        /* instanciador de un arreglo de pisos con la cantidad que el usuario quiera
        Piso[] piso = new Piso[cantidadPiso];
        /*metodo para llenar el arreglo de pisos
        llenadoPiso(piso);
        
        /*metodos para mostrar por pantalla los objetos que el usuario incorpore
          en un arreglo de tipo edificio y en un arreglo de tipo piso
        
        mostrarEdificios(edificios);
        mostrarPiso(piso);
        
        /*Parametros para objetos iniciales de clase Edificio
        Edificio objEdificio1 = new Edificio("132123","10 norte","10 norte 655","Viña del mar","Quiroz y Puelma Arquitectos");
        Edificio objEdificio2 = new Edificio("123123","15 norte","15 norte 242","Viña del mar","Mario Castañeda");
        Edificio objEdificio3 = new Edificio("12222","Viana Miramar","Viana 161","Viña del mar","Roberto Rau");
        /*Mostrar por pantalla los objetos iniciales
        objEdificio1.mostrarEdificio();
        objEdificio2.mostrarEdificio();
        objEdificio3.mostrarEdificio();
        
        /*Parametros para objetos iniciales de clase Piso
        Piso objPiso1 = new Piso("12221",1,4);
        Piso objPiso2 = new Piso("122212",2,4);
        Piso objPiso3 = new Piso("12121",3,4);
        Piso objPiso4 = new Piso("123123",4,4);
        /*Mostrar por pantalla los objetos iniciales
        objPiso1.mostrarPiso();
        objPiso2.mostrarPiso();
        objPiso3.mostrarPiso();
        objPiso4.mostrarPiso();
        /*Parametros para objetos iniciales de clase Departamento
        Departamento objDepartamento1 = new Departamento ("bb","22A","3000UF","Poniente",2,3,67);
        Departamento objDepartamento2 = new Departamento("aa","51A","3500UF","oriente",2,3,109);
        
        /*Mostrar por pantalla los objetos iniciales
        objDepartamento1.mostrarDpto();
        objDepartamento2.mostrarDpto();   
*/
}

    
