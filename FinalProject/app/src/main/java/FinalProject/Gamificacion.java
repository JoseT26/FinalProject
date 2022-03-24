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
        int random = (int)(Math.random()*8+1);
        int ind = 0;
        
        switch (random) {
            case 1:
                ans = "Watch a terror movie";
                challenge[ind] = ans;
                ind ++;
                break;
            case 2:
                ans = "Comment four movies";
                challenge[ind] = ans;
                ind ++;
                break;
            case 3:
                ans = "Watch two comedy movies";
                challenge[ind] = ans;
                ind ++;
                break;
            case 4:
                ans = "Watch an action movie";
                challenge[ind] = ans;
                ind ++;
                break;
            case 5:
                ans = "Watch two action movies";
                challenge[ind] = ans;
                ind ++;
                break;
            case 6:
                ans = "Watch an English movie";
                challenge[ind] = ans;
                ind ++;
                break;
            case 7:
                ans = "Watch a movie subtitled in English";
                challenge[ind] = ans;
                ind ++;
                break;
            case 8:
                ans = "Watch a drama movie";
                challenge[ind] = ans;
                ind ++;
                break;
            default:
                ans = "Watch three movies";
                challenge[ind] = ans;
                ind ++;
        }
        return ans;
    }
    
    public void gamificacionMenu() {
        System.out.println("Choose an option: ");
        System.out.println("1. Do a challenge");
        System.out.println("2. See my challenges");
        System.out.println("3. Exit");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        
        if (option == "1") {
            challenges();
            gamificacionMenu();
        } else {
            if(option == "2") {
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