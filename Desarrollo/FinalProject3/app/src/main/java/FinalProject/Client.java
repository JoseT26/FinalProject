/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

/**
 *
 * @author fundacion
 */
import java.util.Scanner;

public class Client {
    String name;
    String userName;
    String password;

    public Client(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        System.out.println("Write your full name");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        return name;
    }

    public String getUserName() {
        System.out.println("Write your user name");
        Scanner input = new Scanner(System.in);
        userName = input.nextLine();
        
        return userName;
    }

    public String getPassword() {
        System.out.println("Write your password");
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        
        return password;
    }
    
        
}