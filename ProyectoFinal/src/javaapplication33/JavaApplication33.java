/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author Personal
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usser cliente1 = new Usser("default", "default", "default");
        cliente1.getName();
        cliente1.getUserName();
        cliente1.getPassword();
        System.out.println(cliente1.name);
        System.out.println(cliente1.userName);
        System.out.println(cliente1.password);
        Admin admin1 = new Admin("default", "default", "default", "default");
        admin1.getName();
        admin1.getUserName();
        admin1.getPassword();
        admin1.getCodeAdmin();
        System.out.println(admin1.name);
        System.out.println(admin1.userName);
        System.out.println(admin1.password);
        System.out.println(admin1.codeAdmin);
    }
    
}
