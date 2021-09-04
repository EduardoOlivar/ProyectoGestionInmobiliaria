
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
    public void agregarDepartamento(String idDepartamento,String numeroPiso,String rol,String numeroDpto, String valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados)
    {
        Departamento departamento = new Departamento(idDepartamento,numeroPiso,rol,numeroDpto,valorDpto,orientacion,cantidadBaños,cantidadDormitorios,metrosCuadrados);
        this.agregarDepartamento(departamento);     
    }   

    public void agregarDepartamento(ArrayList<Departamento>departamentos){
        int i;
        for (i = 0;  i< departamentos.size(); i++) {
            this.agregarDepartamento(departamentos.get(i));
        }
    }

    public void mostrarDepartamento(){
        int i;
        System.out.println("Lista de Departamentos");
        for (i = 0; i < departamentos.size(); i++) {
            System.out.println("Numero Dpto: "+departamentos.get(i).getNumeroDpto()+"Orientacion:  "+departamentos.get(i).getOrientacion()+"Valor(UF): "+departamentos.get(i).getValorDpto()+"Cantidad de baños: "+departamentos.get(i).getCantidadBaños()+"Cantidad de dormitorios: "+departamentos.get(i).getCantidadDormitorios()+"Metros cuadrado: "+departamentos.get(i).getMetrosCuadrados());                    
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
