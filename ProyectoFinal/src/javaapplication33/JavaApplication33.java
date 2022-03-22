/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        registrarse();
        menu();
    }
    
    public static void registrarse(){
       boolean valid = false;
        do{
        System.out.println("Registrese para comenza:");
        System.out.println("1. Usario  2. Administrador");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        if(option.equals("1")){
           Usser usser1 = new Usser("", "", "");
           usser1.getName();
           usser1.getUserName();
           usser1.getPassword();
           valid = false;
        }
        else if(option.equals("2")){
           Admin admin1 = new Admin("", "", "", "");
           admin1.getName();
           admin1.getUserName();
           admin1.getPassword();
           admin1.getCodeAdmin();
           valid = false;
        }
        else{
           System.out.println("Opcion no valida");
           valid = true;
       }
       }while(valid);
    }
    public static void menu(){
        System.out.println("Elija una opcion: ");
        System.out.println("1. Mostrar cartelera");
        System.out.println("2. Reservacion");
        System.out.println("3. Retos");
        System.out.println("4. Salir");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        
        if(option.equals("1")){
            Billboard bill = new Billboard("");
            bill.showMovies();   
        }
    }
}
