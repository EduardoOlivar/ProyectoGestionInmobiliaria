package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {

    public static void main(String[] args) throws IOException {
        Edificio[] edificios = new Edificio[1];//String nombre, String localidad, String direccion, String arquitecto
        
       
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0 ; i < edificios.length ; i++)
        {
            edificios[i] = new Edificio();
            System.out.println("Ingrese Nombre del edificio " + (i+1));
            edificios[i].setNombre(leer.readLine());
            System.out.println("Ingrese Localidad del Edificio y direccion");
            edificios[i].setLocalidad(leer.readLine());
            edificios[i].setDireccion(leer.readLine());
            System.out.println("Ingrese nombre del Arquitecto");
            edificios[i].setArquitecto(leer.readLine());            
        }
        
        for(int i = 0 ; i < edificios.length;i++)
        {
            edificios[i].mostrarEdificio();
        }
        //depto1.mostrarDepto();
     
        
        // set es para guardar parametros
        //get para retorna parametros
        
    }
    
    

   /*private static void crearEdificios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
    }*/
    
    
}

//String nombre, String localidad, String direccion, String arquitecto
//Prueba cambio al proyecto por Daniel