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

public class Gamificacion {
    int points;
    String challenges;
    String rewards;
    String[] challenge = new String[10];
    
    public int random() {
        int random = (int)(Math.random()*(3 - 0));
        return random;
    }
    
    public String challenges() {
        String ans = "";
        int random = (int)(Math.random()*8 + 1);
        int ind = 0;
        
        switch (random) {
            case 1:
                System.out.println("Watch a terror movie");
                challenge[ind] = "Watch a terror movie";
                ind++;
                break;
            case 2:
                System.out.println("Comment four movies");
                challenge[ind] = "Comment four movies";
                ind++;
                break;
            case 3:
                System.out.println("Watch two comedy movies");
                challenge[ind] = "Watch two comedy movies";
                ind++;
                break;
            case 4:
                System.out.println("Watch an action movie");
                challenge[ind] = "Watch an action movie";
                ind++;
                break;
            case 5:
                System.out.println("Watch two action movies");
                challenge[ind] = "Watch two action movies";
                ind++;
                break;
            case 6:
                System.out.println("Watch an English movie");
                challenge[ind] = "Watch an English movie";
                ind++;
                break;
            case 7:
                System.out.println("Watch a movie subtitled in English");
                challenge[ind] = "Watch a movie subtitled in English";
                ind++;
                break;
            case 8:
                System.out.println("Watch a drama movie");
                challenge[ind] = "Watch a drama movie";
                ind++;
                break;
            default:
                System.out.println("Watch three movies");
                challenge[ind] = "Watch three movies";
                ind++;
        }
        return ans;
    }
    
    public void gamificacionMenu() {
        System.out.println("Choose an option: ");
        System.out.println("1. Do a challenge");
        System.out.println("2. See my challenges");
        System.out.println("3. Exit");

        Scanner entry = new Scanner(System.in);
        System.out.print("Option: ");
        String val = entry.nextLine();

        if ("1".equals(val)) {
            challenges();
            gamificacionMenu();
        } else {
            if("2".equals(val)) {
                print();
            }
        } 
    }
    
    public void print() {
        for (int i = 0; i < challenge.length; i++) {
            if (challenge[i] != null) {
                System.out.println(challenge[i]);
            }
        }
    }
}