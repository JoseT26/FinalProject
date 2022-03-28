/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import static FinalProject.App.menu;
import java.util.Scanner;

/**
 *
 * @author fundacion
 */

public class Gamificacion {
    int limit = 0;
    int points = 0;
    int ind = 0;
    String challenge;
    String rewards;
    String[] challenges = new String[7];
    
    public int random() {
        int random = (int)(Math.random()*(3 - 0));
        return random;
    }
    
    public String challenges() {
        String ans = "";
        
        if(limit > 4){
            ans = "There is a limit of challenges, complete your challenges in order to take another one";
            System.out.println(ans);
        } else {
            int random = (int)(Math.random()*8+1);
        
            switch (random) {
                case 1:
                    ans = "Watch a terror movie";
                    challenges[ind] = "Watch a terror movie";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 2:
                    ans = "Comment four movies";
                    challenges[ind] = "Comment four movies";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 3:
                    ans = "Watch two comedy movies";
                    challenges[ind] = "Watch two comedy movies";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 4:
                    ans = "Watch an action movie";
                    challenges[ind] = "Watch an action movie";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 5:
                    ans = "Watch two action movies";
                    challenges[ind] = "Watch two action movies";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 6:
                    ans = "Watch an English movie";
                    challenges[ind] = "Watch an English movie";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 7:
                    ans = "Watch a movie subtitled in English";
                    challenges[ind] = "Watch a movie subtitled in English";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                case 8:
                    ans = "Watch a drama movie";
                    challenges[ind] = "Watch a drama movie";
                    System.out.println(ans);
                    ind++;
                    limit++;
                    break;
                default:
                    ans = "Watch three movies";
                    challenges[ind] = "Watch three movies";
                    System.out.println(ans);
                    ind++;
                    limit++;
            }        
        }
        return ans;
    }
    
    public void print() {
        int contnu = 0;
        
        for (int i = 0; i < challenges.length;i++) {
            if (challenges[i] != null) {
                System.out.println(challenges[i]);
            } else if (challenges[i] == null) {
                contnu ++;
                if (contnu == 7) {
                    System.out.println("** There are no challenges in the list **");
                }
            }
        }
    }
    
    public boolean empty() {
        int contnu = 0;
        boolean emp = false;
        
        for (int i = 0; i < challenges.length;i++) {
            if (challenges[i] == null) {
                contnu ++;
                if (contnu == 7) {
                    emp = true;
                }
            }
        }
        return emp;
    }
    
    public void completeChallenge(int ind) {
        if (challenges[ind] == null) {
            System.out.println("There are no challenges in this position: " + ind);
        } else if (empty() == true) {
            System.out.println("** There are no challenges in the list **");
        } else {
            challenges[ind] = null;
            limit --;
            System.out.println("Congratulations, you have finished a challenge \n");
            points += 10;
        }
    }
    
    public void gamificacionMenu(){
        boolean exit = false;
        
        do{
            System.out.println("Choose an option: ");
            System.out.println("1. Take a challenge");
            System.out.println("2. See my challenges");
            System.out.println("3. Complete a challenge");
            System.out.println("4. Exit");

            Scanner input = new Scanner(System.in);
            System.out.print("Option: ");
            String option = input.nextLine();
            System.out.println("");
            
            switch (option) {
                case "1":
                    challenges();
                    exit = true;
                    System.out.println("");
                    break;
                case "2":
                    print();
                    exit = true;
                    break;
                case "3":
                    try {
                        System.out.println("Write in order, begining at 1");    
                        System.out.println("Write the number of the challenge you have finished");
                        Scanner in = new Scanner(System.in);
                        String opt = in.nextLine();
                        int num = Integer.parseInt(opt);
                        
                        if (num < challenges.length) {
                            completeChallenge(num);
                        } else {
                            System.out.println("That is not an option");
                        }
                        exit = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number please");
                    }   break;
                case "4":
                    exit = false;
                    menu();
                default:
                    System.out.println("That is not an option");
                    exit = true;
                    break;
            }
        } while (exit);
    }
}