package javaapplication33;

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
        System.out.println("Escriba su nombre completo");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        return name;
    }

    public String getUserName() {
        System.out.println("Escriba su nuevo usuario");
        Scanner input = new Scanner(System.in);
        userName = input.nextLine();
        
        return userName;
    }

    public String getPassword() {
        System.out.println("Escriba su nueva contraseña");
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        
        return password;
    }
    
        
}
