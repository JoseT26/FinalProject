/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author Personal
 */
public class Butaca {
     int capacidad;
    String nombre;
    boolean inicio;
    boolean libre;
    boolean vip;
    String nombreDeSala;
    String [] salasEnCine = {"A1","A2","A3","B1","B2","B3"};
    public Butaca(int capacidad,String nombre,boolean vip){
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.vip = vip;
    }
    public String lleno( int  numeroDePersonas){
        String ans="";
        if(numeroDePersonas >= capacidad){
            ans = "LA SALA ESTA LLENA";
        }else{
            if(numeroDePersonas > capacidad/2){
                ans = "LA SALA ESTA A LA MITAD DE SU CAPACIDAD";
            }else{
                if(numeroDePersonas == 0){
                    ans = "LA SALA ESTA VACIA";
                }
            }
            
        }
        return ans;
    }
    public boolean getLibre(){
        return libre;
    }
    public boolean salaValida(String roomNumber){
        boolean valida = false;
        for(int i=0; i<salasEnCine.length;i++){
            if(salasEnCine[i] == roomNumber){
                valida = true;
            }
        }
        return valida;
    }
    public void asientosValidos(){
    
    }
}
