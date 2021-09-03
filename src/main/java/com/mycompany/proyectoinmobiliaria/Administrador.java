package com.mycompany.proyectoinmobiliaria;

import java.io.*;
import java.util.HashMap;


public class Administrador {
    
    private String idAdmin;
    private String nombreAdmin;
    private HashMap<String,Edificio> edificio;
    
    public Administrador(String idAdmin, String nombreAdmin){
        this.nombreAdmin = nombreAdmin;
        this.idAdmin=idAdmin;
        this.edificio = new HashMap<String,Edificio>();
    }
 
    
    public void agregarEdificio()
    {   
       
    }
   
    public void quitarEdificio()
    {
        
    }
    
    public void modificarAdministrador()
    {
        
        
    }
    
    public Edificio buscarEdificio(String idEdificio)
    {
        return this.edificio.get(idEdificio);
    }     
    
    
    
    
}
