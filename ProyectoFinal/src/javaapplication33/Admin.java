package javaapplication33;

import java.util.Scanner;

public class Admin extends Client {
    String codeAdmin;

    public Admin(String codeAdmin, String name, String userName, String password) {
        super(name, userName, password);
        this.codeAdmin = codeAdmin;
    }

    public String getCodeAdmin() {
        System.out.println("Escriba el codigo de administrador");
        Scanner input = new Scanner(System.in);
        codeAdmin = input.nextLine();
        return codeAdmin;
    }
    
}
