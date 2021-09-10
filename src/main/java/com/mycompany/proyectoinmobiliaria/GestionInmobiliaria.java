/*
Autores:
    Daniel Duran;
    José Eduardo Olivar;
    Paula Vargas
*/
package com.mycompany.proyectoinmobiliaria;

import java.io.*;


public class GestionInmobiliaria {
    static Administrador administrador = new Administrador();//Contiene informacion de todos los edificios se hizo como variable global
    
    public static void main(String[] args) throws IOException{
        BufferedReader lectura = new BufferedReader(new InputStreamReader( System.in ));
        boolean mostrarMenu = true;
        
        System.out.println("Bienvenido, ingrese la opcion que desee utilizar");
        
        while(mostrarMenu){
            System.out.println("(1)  Agregar Edificio");
            System.out.println("(2)  Agregar Departamento");
            System.out.println("(3)  Agregar Edifcios predeterminados");
            System.out.println("(4)  Agregar Departamentos predeterminados");
            System.out.println("(5)  Mostrar listado de Edificios");
            System.out.println("(6)  Mostrar todos los departamentos");
            System.out.println("(7)  Eliminar Edificio");
            System.out.println("(8)  Buscar Departamento");
            System.out.println("(9)  Modificar nombre de Edificio");
            System.out.println("(10) Mostrar Departamentos por rango de precios");
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
                case "9":
                    modificarNombreEdificio();
                    break;
                case "10":
                    mostrarDepartamentosPorPrecios();
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
    /*metodo para agregar edificios por consola*/
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
        if(administrador.agregarEdificios(nombreEdificio, direccionEdificio, localidadEdificio, arquitectoEdificio)){
          System.out.println("El edificio  "+nombreEdificio + " tiene el id: "+administrador.getEdificiosNombre().get(nombreEdificio).getId());
        }
        else
          System.out.println("Edificio " + nombreEdificio + " ya existe");
    }
    
    /* agrega departamentos a edificios*/
    public static void agregarDepartamento() throws IOException{
        /*comprueba si es que hay o no edificios*/
        if(administrador.vacio()){
            System.out.println("No existen edificios, no se agregaran departamentos");
            return;
        }
        
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        /*Por id se le asignan los departamentos al edificio*/
        System.out.println("Ingrese el id del edificio al que pertenece el departamento");
        String idEdificio = lectura.readLine();
        /*Se comprueba que exista el edificio y se le agrega departamento al edificio buscado por id*/
        if(administrador.existeEdifcio(idEdificio)){
            System.out.println("Ingrese numero de piso en el que se encuentra el departamento");
            String numeroPiso = lectura.readLine();        
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
            
            administrador.agregarDepartamentoAedificio(idEdificio, numeroPiso, numeroDpto, valorDpto, orientacion, cantidadBaños, cantidadDormitorios, metrosCuadrados);
            return;
        }
        System.out.println("El edifcio ingresado no existe");
    }
    
    /* Lista de departamentos predeterminados*/
    public static void llenadoDeDepartamentos(){
        if(administrador.getListaEdificio().size() >=3){
            
            administrador.agregarDepartamentoAedificio("1", "1","1", "2000", "sur", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "1","2", "2000", "sur", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "2","3", "2000", "norte", 1, 2, 36);
            administrador.agregarDepartamentoAedificio("1", "2","4", "2000", "norte", 1, 2, 36);         
            administrador.agregarDepartamentoAedificio("2", "1","1", "3500", "sur", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "1","2", "3500", "sur", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "2","3", "3500", "norte", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("2", "2","4", "3500", "norte", 2, 3, 56);
            administrador.agregarDepartamentoAedificio("3", "1","1", "3420", "Este", 2, 3, 50);
            administrador.agregarDepartamentoAedificio("3", "1","2", "3420", "surOeste", 2, 3, 50);
            administrador.agregarDepartamentoAedificio("3", "2","3", "3420", "norEste", 2, 3, 50);
            administrador.agregarDepartamentoAedificio("3", "2","4", "3420", "norOeste", 2, 3, 50);
            return;
        }
        System.out.println("Crear primero 3 edificios para acceder a esta opcion");
    }
    
    /*Llenado predeterminado*/
    public static void llenadoDeEdifcios(){
        administrador.agregarEdificios("Viana Miramar","Viana 161","Viña del mar","Roberto Rau");
        administrador.agregarEdificios("LADY","15 norte 242","Viña del mar","Mario Castañeda");
        administrador.agregarEdificios("10 norte","10 norte 655","Viña del mar","Quiroz y Puelma Arquitectos");
    }
    
    /*muestrra la lista de edificios si es que hay*/
    public static void mostrarListadoDeEdifcios() {
        if(administrador.getEdificiosId().isEmpty()){
            System.out.println("No existen Edificios");
            return;
        }
        int i;
        System.out.println("Id:  || nombre edifcio || direccion || localidad || arquitecto");
        for(i=0; i<administrador.getListaEdificio().size(); i++){
            System.out.println(administrador.getListaEdificio().get(i).getId()+": "+administrador.getListaEdificio().get(i).getNombre()+" || "+administrador.getListaEdificio().get(i).getDireccion()+" || "+administrador.getListaEdificio().get(i).getLocalidad()+" || " +administrador.getListaEdificio().get(i).getArquitecto());
        }        
    }
    /*muestra todos los departamentos si es que hay*/
    public static void mostrarTodosLosDepartamentos(){
        administrador.mostrarTodosLosDepartamentos();
    }
    
    
    public static void modificarNombreEdificio()throws IOException{
        if(administrador.vacio()){
            System.out.println("No existen Edificios");
            return;
        }
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        System.out.println("Ingrese id del edificio que quiere modificar su nombre");
        String idEdificio = lectura.readLine();
        System.out.println("Ingrese el nuevo nombre del Edificio");
        String NombreEdificio = lectura.readLine();
        administrador.modificarNombreEdificio(NombreEdificio, idEdificio);
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
    
    /*busca el departamento a partir de la id ingresada*/
    public static void buscarDepartamento()throws IOException{
        BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
        System.out.println("Ingrese id del departamento que busca");
        String idDepartamento = lectura.readLine();
        if(administrador.BuscarDepartamento(idDepartamento))
          mostrarDepartamento(idDepartamento);
    }
    public static void mostrarDepartamento(String idDepartamento){//Se seguieron las recomendaciones y se movieron al main todas las interacciones con el usuario
      for(int i = 0; i<administrador.getListaEdificio().size();i++){
        if(administrador.getListaEdificio().get(i).getDepartamentosId().containsKey(idDepartamento)){
          System.out.println("Id: || Numero de piso || Numero de departamento || Valor en uf || Orientacion || Cantidad de baños || Cantidad de dormitorios || Metro cuadrados");
          System.out.println(administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getIdDepartamento()+":             "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getNumeroPiso()+ "      ||            "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getNumeroDpto()+"           ||     "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getValorDpto()+"    ||     "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getOrientacion()+"     ||         "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getCantidadBaños()+"         ||             "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getCantidadDormitorios()+"           ||          "+administrador.getListaEdificio().get(i).getDepartamentosId().get(idDepartamento).getMetrosCuadrados());       
          return;
        }
      }               
    }
    /*Muestra por pantalla los departamentos en los edificios que esten en un rango especificado por el usuario*/
    public static void mostrarDepartamentosPorPrecios()throws IOException
    {
      BufferedReader lectura = new  BufferedReader( new InputStreamReader( System.in));
      if(administrador.vacio())
      {
        System.out.println("No hay Edificios, ingrese Edificios para tener departamentos");
        return;
      }
      if(!administrador.existeDepartamentos())
      {
        System.out.println("No hay departamentos almacenados");
        return;
      }

      System.out.println("Ingrese el primer valor para el rango");
      int valorDpto1 = Integer.parseInt(lectura.readLine());
      System.out.println("Ingrese el segundo valor para el rango");
      int valorDpto2 = Integer.parseInt(lectura.readLine());     

      if(valorDpto1 < valorDpto2){
        administrador.mostrarDepartamentosPorPrecios(valorDpto1,valorDpto2);
        return;
      }
     administrador.mostrarDepartamentosPorPrecios(valorDpto2,valorDpto1);
    }


}