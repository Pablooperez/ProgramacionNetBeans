/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestortareas;

/**
 *
 * @author casa
 */
public class Main {
    public static void main(String[] args) {
        
        GestorTareas gestor = new GestorTareas();
        
        //Crear tareas
        
        Tarea t1 = new Tarea("Estudiar", Tarea.Prioridad.ALTA);
        Tarea t2 = new Tarea("Hacer ejercicio", Tarea.Prioridad.MEDIA);
        Tarea t3 = new Tarea("Descansar", Tarea.Prioridad.BAJA);
        
        //Añadir tareas
        
        gestor.añadirTarea(t1);
        System.out.println("");
        gestor.añadirTarea(t2);
        System.out.println("");
        gestor.añadirTarea(t3);
        System.out.println("");
        
        //Marcar completada
        
        t1.marcarComoCompletada();
        System.out.println("");
        
        //Mostrar todas
        
        for(Tarea t : gestor.mostrarTodas()){
            System.out.println(t);
        }
        System.out.println("");
        
        
        //Mostrar completadas
        
        for(Tarea t : gestor.filtrarCompletadas()){
            System.out.println(t);
        }
        System.out.println("");
        
        //Mostrar incompletas
        
        for(Tarea t : gestor.filtrarIncompletas()){
            System.out.println(t);
        }
        System.out.println("");
        
        //Mostrar por prioridad
        
       for(Tarea t : gestor.filtrarPorPrioridad(Tarea.Prioridad.ALTA)){
           System.out.println(t);
       }
        
    }
}
