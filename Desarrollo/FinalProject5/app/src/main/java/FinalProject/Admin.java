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

public class Admin extends Client {
    String codeAdmin;

    public Admin(String codeAdmin, String name, String userName, String password) {
        super(name, userName, password);
        this.codeAdmin = "codeAdmin";
    }

    public String getCodeAdmin() {
        System.out.println("Wtite the admistrator code");
        Scanner input = new Scanner(System.in);
        codeAdmin = input.nextLine();
        return codeAdmin;
    }
    
}
