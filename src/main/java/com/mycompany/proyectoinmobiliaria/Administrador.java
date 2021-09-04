package com.mycompany.proyectoinmobiliaria;

import java.util.*;


public class Administrador {
    
    private ArrayList<Edificio> listaEdificio;
    private HashMap<String,Edificio>edificiosId;
    private HashMap<String,Departamento>CatDepartamentosId;
    private ArrayList<Departamento>CatDepartamentos;
    
    private int idEdificio;
    private int idDepartamento;

    public Administrador() {
        listaEdificio = new ArrayList();
        edificiosId = new HashMap();
        idEdificio = 0;
        idDepartamento = 0;
    }
    
    private void agregarEdificios(Edificio edificio){
        if(edificiosId.containsKey(edificio.getId())){
            System.out.println("Edificio " + edificio.getNombre() + "existe");
            return;
        }
        listaEdificio.add(edificio);
        edificiosId.put(edificio.getId(), edificio);
        System.out.println("El id del edificio  "+edificio.getNombre() + " es: "+edificio.getId());
    }
    
    public void agregarEdificios(String nombre, String direccion, String localidad, String arquitecto){
        this.idEdificio = this.idEdificio + 1;
        Edificio nuevoEdificio = new Edificio(String.valueOf(idEdificio),nombre,direccion,localidad,arquitecto);
        this.agregarEdificios(nuevoEdificio);
    }
    public void agregaEdificios(ArrayList<Edificio>nuevosEdificios){
        int i;
        for (i = 0; i < nuevosEdificios.size(); i++) {
            this.agregarEdificios(nuevosEdificios.get(i));
        }
    }
    public boolean existeDepartamento(String idDepartamento){
        int i;
        for ( i = 0; i < listaEdificio.size(); i++) {
            if(listaEdificio.get(i).existeDepartamento(idDepartamento));
            return true;
        }
        return false;        
    }    
    public String existeDepartamento(String numeroDpto, String idEdificio){
        int i;
        for(i=0; i<CatDepartamentos.size();i++){
            if(CatDepartamentos.get(i).getNumeroDpto().equals(numeroDpto) && listaEdificio.get(i).getId().equals(idEdificio)){
                return CatDepartamentos.get(i).getIdDepartamento();
            }
        }
        return"x";
    }
    
    public void BuscarDepartamento(String idDepartamento){
        int i;
        for(i = 0; i<listaEdificio.size();i++){
            listaEdificio.get(i).BuscarDepartamento(idDepartamento);
        }
    }
    
    public void agregarDepartamentoAedificio(String idEdificio,String numeroPiso,String numeroDpto, String valorDpto, String orientacion, int cantidadBaños, int cantidadDormitorios, double metrosCuadrados){
        if(edificiosId.containsKey(idEdificio)){         
            this.idDepartamento = this.idDepartamento + 1;
            Departamento nuevoDepartamento = new Departamento(String.valueOf(idDepartamento),numeroPiso,numeroDpto,valorDpto,orientacion,cantidadBaños,cantidadDormitorios,metrosCuadrados);                
            edificiosId.get(idEdificio).agregarDepartamento(String.valueOf(idDepartamento),numeroPiso,numeroDpto,valorDpto,orientacion,cantidadBaños,cantidadDormitorios,metrosCuadrados);
            System.out.println("El codigo del departamento "+nuevoDepartamento.getNumeroDpto()+" es: " +idDepartamento);
            return;           
        }
    }
    
    public boolean vacio(){return listaEdificio.isEmpty();}
    
    public boolean existeEdifcio(String idEdificio){return edificiosId.containsKey(idEdificio);}
    
    public void mostrarNombreEdifcios(){
        if(edificiosId.isEmpty()){
            System.out.println("No existen Edificiod");
            return;
        }
        int i;
        System.out.println("codigo:     nombre edifciio        direccion          localidad         arquitecto");
        for(i=0; i<listaEdificio.size(); i++){
            System.out.println("   "+listaEdificio.get(i).getId()+":-"+listaEdificio.get(i).getNombre()+"           "+listaEdificio.get(i).getDireccion()+"          "+listaEdificio.get(i).getLocalidad()+"       "+listaEdificio.get(i).getArquitecto()+"    ");
        }
    }
    
 /*   public void mostrarTodosLosDepartamentos(){
        if(listaEdificio.isEmpty()){
            System.out.println("No existen Edifcios, por lo tanto, tampoco departamentos");
            return;
        }
        if(CatDepartamentos.isEmpty()){
            System.out.println("No existen Departamentos");
            return;
        }
        int i;
        int j;
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("codigo: Numero de piso         numero de departamento            valor en uf                 orientacion               cantidad de baños            cantidad de dormitorios       metro cuadrados");
        System.out.println("Disponible en el edificio:");
        System.out.println("codigo: nombre edifciio             direccion          localidad           arquitecto");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for(i = 0; i<CatDepartamentos.size();i++){
            System.out.println("     :"+CatDepartamentos.get(i).getIdDepartamento()+"            "+CatDepartamentos.get(i).getNumeroPiso() +"           "+CatDepartamentos.get(i).getNumeroDpto()+"                              "+CatDepartamentos.get(i).getValorDpto()+"                       "+CatDepartamentos.get(i).getOrientacion()+"                         "+CatDepartamentos.get(i).getCantidadBaños()+"                               "+CatDepartamentos.get(i).getCantidadDormitorios()+"                          "+CatDepartamentos.get(i).getMetrosCuadrados());
            
            for(j=0;j<listaEdificio.size();j++){
                Departamento departamento = listaEdificio.get(j).buscarDepartamento(CatDepartamentos.get(i).getIdDepartamento());
                if(departamento != null){
                    System.out.println("    "+listaEdificio.get(j).getId()+":    "+listaEdificio.get(j).getNombre()+"              "+listaEdificio.get(j).getDireccion()+"       "+listaEdificio.get(j).getLocalidad()+"       "+listaEdificio.get(j).getArquitecto()+"   ");
                }
            }
        }
    }
    */
    public Edificio  eliminarEdificio(String idEdificio){
        if(!edificiosId.containsKey(idEdificio)){
            System.out.println("No existe un Edificio con el codigo ingresado");
            return null;

        }
        if(listaEdificio.size()<2){
            System.out.println("no existe otro edificio, por lo que todos los datos seran eliminados");
            Edificio edificioEliminado = edificiosId.remove(idEdificio);
            int i;
            for (i = 0; i < listaEdificio.size(); i++) {
                if(listaEdificio.get(i).getId().equals(idEdificio)){
                    listaEdificio.remove(i);
                    break;
                }
            }
                listaEdificio.get(i).eliminarDepartamentos();
                this.idEdificio = 0;
                this.idDepartamento = 0;
                return edificioEliminado;
            
        }
        Edificio edificioEliminado = edificiosId.remove(idEdificio);
        int i;
        for ( i = 0; i < listaEdificio.size(); i++) {
            //se busca edificio en la lista para luego eliminarlo
            if (listaEdificio.get(i).getId().equals(idEdificio)) {
                listaEdificio.remove(i);//lista
                break;
            }
        }
        return edificioEliminado;
    }
 
    public void mostrarTodosLosDepartamentos(){
        for (int i = 0; i < listaEdificio.size(); i++) {
            listaEdificio.get(i).mostrarDepartamento();
        }
    }
    
    public ArrayList<Edificio> getListaEdificio() {
        return listaEdificio;
    }

    public int getIdEdificio() {
        return idEdificio;
    }


    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setCatDepartamentosId(HashMap<String, Departamento> CatDepartamentosId) {
        this.CatDepartamentosId = CatDepartamentosId;
    }

    public void setCatDepartamentos(ArrayList<Departamento> CatDepartamentos) {
        this.CatDepartamentos = CatDepartamentos;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }


    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    

}
