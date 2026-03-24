/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestortareas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author casa
 */
public class GestorTareas {
    
    //Atributos
    
    private List<Tarea> listaTareas;
    
    //Constructor
    
    public GestorTareas(){
        this.listaTareas = new ArrayList<>();
    }
    
    //Métodos
    
    public void añadirTarea(Tarea tarea){
        listaTareas.add(tarea);
    }
    
    public void eliminarTarea(Tarea tarea){
        listaTareas.remove(tarea);
    }
    
    public void editarTarea(Tarea tarea, String nuevoNombre, Tarea.Prioridad nuevaPrioridad){
        tarea.setNombre(nuevoNombre);
        tarea.setPrioridad(nuevaPrioridad);
    }
    
    public void ordenarPorPrioridad(){
        listaTareas.sort(Comparator.comparing(Tarea::getPrioridad).reversed());
    }
    
    public List<Tarea> filtrarCompletadas(){
        List<Tarea> resultado = new ArrayList<>();
        for (Tarea t : listaTareas){
            if (t.isCompletada()) {
                resultado.add(t);
            }
        }
        return resultado;
    }
    
    public List<Tarea> filtrarIncompletas(){
        List<Tarea> resultado = new ArrayList<>();
        for(Tarea t : listaTareas){
            if(!t.isCompletada()){
                resultado.add(t);
            }
        }
        return resultado;
    }
    
    public List<Tarea> filtrarPorPrioridad(Tarea.Prioridad p){
        List<Tarea> resultado = new ArrayList<>();
        for(Tarea t : listaTareas){
            if (t.getPrioridad() == p ) {
                resultado.add(t);
            }
        }
        return resultado;
    }
    
    public List<Tarea> mostrarTodas(){
        List<Tarea> resultado = new ArrayList<>();
        for(Tarea t : listaTareas){
            resultado.add(t);
        }
        return resultado;
    }
    
    
    
    
        
}
    

