/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Reservations extends client{
    String movie;
    int space; ///posible cambio a char u otro dependiendo como se creen los asientos
    int tickets;
    String hour; //ejemplo: "16:50" para tomar en cuenta el :
    int ticketNumber;
    public Reservations(){
        this.username;
        this.user;
        this.password;
        
    }
    public char[] Ticket(){
        Scanner input = new Scanner(System.in);
         System.out.println("Escriba su asiento para reservar entre A1-A7 y H-1-7");
        String ticket = input.nextLine();
        ticket=ticket.toUpperCase();
        //"se ingresa de A-H y un numero 1-7
        char[] ch = new char[2];
        for (int i = 0; i < 2; i++) {
            ch[i] = ticket.charAt(i);
        }
        
        
        
        return ch;
    }
    
    public String[][] reserve(String[][] Seat){ //basicamente crea un "ticket" con toda la informacion del cliente
                
        char[] pos=Ticket();
        Client cliente =new Client(name,userName,password);
        char[]abc =new char[26];
        for ( int i=0; i<26; i++) {
            abc[i] = (char) ('A' + i );
        }
        int aux=0;
        for(int i=0;i<26;i++){
            if(abc[i]==pos[0]){
                aux=i;
                break;
            }
        }
        asignarAsiento(aux,Character.getNumericValue(pos[1]),cliente.getName());
        
        
        
        return Seat;
        
        
    }
    
    
}
