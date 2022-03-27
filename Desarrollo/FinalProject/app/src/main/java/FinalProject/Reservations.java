/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import java.util.Scanner;

/**
 *
 * @author fundacion
 */
public class Reservations {
    String username;
    String user;
    String password;
    String movie;
    int space; // posible cambio a char u otro dependiendo como se creen los asientos
    int tickets;
    String hour; // ejemplo: "16:50" para tomar en cuenta el :
    int ticketNumber;
    
    Asientos asiento = new Asientos();
    
    public Reservations(String username, String user, String password) {
        this.username = username;
        this.user = user;
        this.password = password;
    }
    
    public String getUser() {
        System.out.println("Write your full name");
        Scanner input = new Scanner(System.in);
        user = input.nextLine();
        return user;
    }

    public String getUserName() {
        System.out.println("Write your user name");
        Scanner input = new Scanner(System.in);
        username = input.nextLine();
        return username;
    }

    public String getPassword() {
        System.out.println("Write your password");
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        return password;
    } 
    
    public char[] Ticket() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su asiento para reservar entre A1-A7 y H1-H7");
        String ticket = input.nextLine();
        ticket = ticket.toUpperCase();
        //"se ingresa de A-H y un numero 1-7
        char[] ch = new char[2];
        for (int i = 0; i < 2; i++) {
            ch[i] = ticket.charAt(i);
        }
        return ch;
    }
    
    public String[][] reserve(String[][] Seat) { //basicamente crea un "ticket" con toda la informacion del cliente     
        char[] pos = Ticket();
        Client cliente = new Client(username, user, password);
        char[]abc = new char[26];
        
        for (int i = 0; i < 26; i++) {
            abc[i] = (char) ('A' + i );
        }
        int aux = 0;
        
        for (int i = 0; i < 26; i++) {
            if (abc[i] == pos[0]) {
                aux=  i;
                break;
            }
        }
        asiento.asignarAsiento(aux, Character.getNumericValue(pos[1]), cliente.getName());
        return Seat;
    }
}