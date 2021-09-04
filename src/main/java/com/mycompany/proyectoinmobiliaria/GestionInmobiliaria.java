/*
Autores:
    Daniel Duran;
    José Eduardo Olivar;
    Paula Vargas
*/

package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {
    static Administrador administrador = new Administrador();//Contiene informacion de todos los edificios
   
    public static void main(String[] args) throws IOException{
        BufferedReader lectura = new BufferedReader(new InputStreamReader( System.in ));
        boolean mostrarMenu = true;
        
        while(mostrarMenu){
            System.out.println("(1) Agregar Edificio");
            System.out.println("(2) Agregar Departamento");
            System.out.println("(3) Agregar Edifcios predeterminador");
            System.out.println("(4) Agregar Departamentos predeterminador");
            System.out.println("(5) Mostrar listado de Edificios");
            System.out.println("(6) Mostrar todos los departamentos");
            System.out.println("(7) Eliminar Edificio");
            System.out.println("(8) Buscar Departamento");
            
            System.out.println("presione x para salir");
            
            String eleccion = lectura.readLine();
            
            switch(eleccion){
                case "1":
                    agregarEdifcio();
                    break;
                case "2":
                    agregarDepartamento();
                    break;
                case "3":
                    llenadoDeEdifcios();
                    break;
                case "4":
                    llenadoDeDepartamentos();
                    break;
                case "5":
                    mostrarListadoDeEdifcios();
                    break;
                case "6":
                    mostrarTodosLosDepartamentos();   
                    break;
                case "7":
                    eliminarEdificio();
                    break;
                case "8":
                    buscarDepartamento();
                    break;                    
                case "x":
                    System.out.println("Nos vemos!");
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
        }
        
    }
    
    public static void agregarEdifcio()throws IOException{
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        
        System.out.println("Ingrese nombre del edificio");
        String nombreEdificio = lectura.readLine();
        System.out.println("Ingrese direccion del edificio");
        String direccionEdificio = lectura.readLine();   
        System.out.println("Ingrese localidad del edificio");
        String localidadEdificio = lectura.readLine();
        System.out.println("Ingrese arquitecto del edificio");
        String arquitectoEdificio = lectura.readLine();         
        
        administrador.agregarEdificios(nombreEdificio, direccionEdificio, localidadEdificio, arquitectoEdificio);
    }
    
    public static void agregarDepartamento() throws IOException{
        if(administrador.vacio()){
            System.out.println("No existen edificios, no se agregaran departamentos");
            return;
        }
        
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        System.out.println("Ingrese el id del edificio al que pertenece el departamento");
        String idEdificio = lectura.readLine();
        
        if(administrador.existeEdifcio(idEdificio)){
            System.out.println("Ingrese numero de piso en el que se encuentra el departamento");
            String numeroPiso = lectura.readLine();
            System.out.println("Ingrese rol del departamento");
            String rol = lectura.readLine();            
            System.out.println("Ingrese numero de departamento");
            String numeroDpto = lectura.readLine();     
            System.out.println("Ingrese valor en uf del departamento");
            String valorDpto = lectura.readLine();
            System.out.println("Ingrese orientacion del departamento");
            String orientacion = lectura.readLine();
            System.out.println("Ingrese cantidad de banos del departamento");
            int cantidadBaños = Integer.parseInt(lectura.readLine());
            System.out.println("Ingrese cantidad de dormitorios del departamento");
            int cantidadDormitorios = Integer.parseInt(lectura.readLine());
            System.out.println("Ingrese los metros cuadrados del departamento");
            int metrosCuadrados = Integer.parseInt(lectura.readLine());
            
            administrador.agregarDepartamentoAedificio(idEdificio, numeroPiso, rol, numeroDpto, valorDpto, orientacion, cantidadBaños, cantidadDormitorios, metrosCuadrados);
            return;
        }
        System.out.println("El edifcio ingresado no existe");
    }
    
    public static void llenadoDeDepartamentos(){
        if(administrador.getListaEdificio().size() >=2){
            
            administrador.agregarDepartamentoAedificio("1", "1", "Departamento", "1", "20", "sur", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "1", "Departamento", "2", "20", "sur", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "2", "Departamento", "3", "20", "norte", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "2", "Departamento", "4", "20", "norte", 1, 2, 36);         
            administrador.agregarDepartamentoAedificio("2", "1", "Departamento", "1", "35", "sur", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "1", "Departamento", "2", "35", "sur", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "2", "Departamento", "3", "35", "norte", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "2", "Departamento", "4", "35", "norte", 2, 3, 56);   
            return;
        }
        System.out.println("Crear primero 2 edificios para acceder a esta opcion");
    }
    
    public static void llenadoDeEdifcios(){
        administrador.agregarEdificios("Viana Miramar","Viana 161","Viña del mar","Roberto Rau");
        administrador.agregarEdificios("LADY","15 norte 242","Viña del mar","Mario Castañeda");
    }
    
    public static void mostrarListadoDeEdifcios() {
        administrador.mostrarNombreEdifcios();
    }
    
    public static void mostrarTodosLosDepartamentos(){
        administrador.mostrarTodosLosDepartamentos();
    }
    
    public static void eliminarEdificio()throws IOException{
        if(administrador.vacio()){
            System.out.println("No existen Edificios");
            return;
        }
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        System.out.println("Ingrese id del edificio que quiere eliminar");
        String idEdificio = lectura.readLine();
        administrador.eliminarEdificio(idEdificio);
    }
    
    public static void buscarDepartamento()throws IOException{
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        System.out.println("Ingrese id del departamento que busca");
        String idDepartamento = lectura.readLine();
        administrador.BuscarDepartamento(idDepartamento);
    }
}    


    
