/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas;

import java.time.LocalDate;

/**
 *
 * @author casa
 */
public class Tarea {
   
    //Atributos
    
    public enum Prioridad {
        ALTA, MEDIA, BAJA
    }
    
    private String nombre;
    private Prioridad prioridad;
    private boolean completada;
    private final LocalDate fechaCreacion;
    
    // Constructores
    
    public Tarea(String snombre, Prioridad prioridad1){
        this.nombre=snombre;
        this.prioridad=prioridad1;
        this.completada=false;
        this.fechaCreacion=LocalDate.now();
    }
    
    //Getter and Setter
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String snombre){
        this.nombre=snombre;
    }
    
    public Prioridad getPrioridad(){
        return this.prioridad;
    }
    
    public void setPrioridad(Prioridad pprioridad){
        this.prioridad=pprioridad;
    }
    
    public boolean isCompletada(){
        return this.completada;
    }
    
    public void setCompletada(boolean bcompletada){
        this.completada=bcompletada;
    }
    
    public LocalDate getFecha(){
        return this.fechaCreacion;
    }
    
    //Métodos
    
    public void marcarComoCompletada(){
        if (!this.completada) {
            this.completada=true;
            
        }
        
    }
    
    public void marcarComoIncompleta(){
        if (this.completada) {
            this.completada=false;
            
        }
    }
    
    public void cambiarPrioridad(Prioridad nueva){
        if (nueva==this.prioridad) {
            
        }else{
            this.prioridad=nueva;
            
        }
    }
    
    @Override
    public String toString(){
        return  this.nombre + " - " + this.prioridad + " - " + (this.completada ? "Completada" : "Pendiente") 
                + " -  " + this.fechaCreacion;
    }
    
    
    
    
}
