
package com.mycompany.proyectoinmobiliaria;

import java.util.*;


public class Edificio
{
    private String id;
    private String nombre;
    private String direccion;
    private String localidad;
    private String arquitecto;
    private ArrayList<Departamento> departamentos;
    private HashMap<String,Departamento>departamentosId;

    //constructor
    
    public Edificio(String id ,String nombre, String direccion, String localidad, String arquitecto)
    {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.arquitecto = arquitecto;
        this.departamentos = new ArrayList(); // por ahora ira asi para poder hacer el entregable 2
        departamentosId = new HashMap();
             
    }

    //aqui iran metodos
    
    
    //metodo para mostrar 

    private void agregarDepartamento(Departamento departamento)
    {
        if(departamentosId.containsKey(departamento.getIdDepartamento())){
            System.out.println("El Departamento ya existe");
            return;
        }
        departamentosId.put(departamento.getIdDepartamento(), departamento);
        departamentos.add(departamento);
    }
    public void agregarDepartamento(String idDepartamento,String numeroPiso,String numeroDpto, String valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados)
    {
        Departamento departamento = new Departamento(idDepartamento,numeroPiso,numeroDpto,valorDpto,orientacion,cantidadBaños,cantidadDormitorios,metrosCuadrados);
        this.agregarDepartamento(departamento);     
    }   

    public void agregarDepartamento(ArrayList<Departamento>departamentos){
        int i;
        for (i = 0;  i< departamentos.size(); i++) {
            this.agregarDepartamento(departamentos.get(i));
        }
    }
    public void eliminarDepartamentos(){
             departamentosId = new HashMap();
             departamentos = new ArrayList();
    }
    public void mostrarDepartamento(){
        int i;
        System.out.println("Lista de Departamentos");
        for (i = 0; i < departamentos.size(); i++) {
            System.out.println("Numero Dpto: "+departamentos.get(i).getNumeroDpto()+", Orientacion: "+departamentos.get(i).getOrientacion()+", Valor(UF): "+departamentos.get(i).getValorDpto()+", Cantidad de baños: "+departamentos.get(i).getCantidadBaños()+", Cantidad de dormitorios: "+departamentos.get(i).getCantidadDormitorios()+", Metros cuadrado: "+departamentos.get(i).getMetrosCuadrados());                    
        }
    }
    public void BuscarDepartamento(String idDepartamento){
        int i;
        for(i = 0; i<departamentos.size();i++){
            if(departamentos.get(i).getIdDepartamento().equals(idDepartamento)){
                System.out.println("codigo: Numero de piso     numero de departamento            valor en uf                 orientacion               cantidad de baños            cantidad de dormitorios       metro cuadrados");
                System.out.println("     "+departamentos.get(i).getIdDepartamento()+":            "+departamentos.get(i).getNumeroPiso()+ "               "+departamentos.get(i).getNumeroDpto()+"                              "+departamentos.get(i).getValorDpto()+"                       "+departamentos.get(i).getOrientacion()+"                         "+departamentos.get(i).getCantidadBaños()+"                               "+departamentos.get(i).getCantidadDormitorios()+"                          "+departamentos.get(i).getMetrosCuadrados());
            }
        }
    }
    public boolean existeDepartamento(String idDepartamento){return departamentosId.containsKey(idDepartamento);}
    public Departamento buscarDepartamento(String idDepartamento){return departamentosId.get(idDepartamento);}
    public boolean buscarDepartamentoE(String idDepartamento){return departamentosId.containsKey(idDepartamento);}

    //getter
    public String getId(){return id;}
    public String getNombre(){return nombre;}
    public String getLocalidad(){return localidad;}
    public String getDireccion(){return direccion;}
    public String getArquitecto(){return arquitecto;}
    public ArrayList<Departamento> getDepartamentos(){return departamentos;}
    //setter
    public void setId(String id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setLocalidad(String localidad){this.localidad = localidad;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setArquitecto(String arquitecto){this.arquitecto = arquitecto;}
    public void setDepartamentos(ArrayList<Departamento>departamentos){this.departamentos = departamentos;}

}