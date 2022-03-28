/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

/**
 *
 * @author fundacion
 */
public class Butaca {
    int capacity;
    String butacaName;
    boolean start;
    boolean free;
    boolean vip;
    String roomName;
    String [] salasEnCine = {"A1","A2","A3","B1","B2","B3"};
    
    public Butaca(int capacidad, String nombre, boolean vip) {
        this.capacity = capacidad;
        this.butacaName = nombre;
        this.vip = vip;
    }
    
    public String full(int numberOfPeople) {
        String ans = "";
        
        if (numberOfPeople >= capacity) {
            ans = "The room is full";
        } else {
            if (numberOfPeople > capacity / 2) {
                ans = "The room is not full";
            } else {
                if (numberOfPeople == 0) {
                    ans = "The room is empty";
                }
            }
            
        }
        return ans;
    }
    
    public boolean getLibre(){
        return free;
    }
    
    public boolean validRoom(String roomNumber){
        boolean valid = false;
        
        for (int i=0; i<salasEnCine.length;i++) {
            if (salasEnCine[i] == roomNumber) {
                valid = true;
            }
        }
        return valid;
    }
    
    public void asientosValidos(){
    }
}
