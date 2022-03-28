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
    int limit = 0;
    int points = 0;
    String challenge;
    int ind= 0 ;
    String [] challenges = new String [7];
  public int random(){
        int random = (int)(Math.random()*(3 - 0));
        return random;
    }
    public String retos(){
        String ans="";
        if(limit > 4){
            ans = "You have reached the limit of challenges, finish the assigned challenges to take a new one";
            System.out.println(ans);
        }else{
        int random = (int)(Math.random()*8+1);
        int num;
        switch(random){
            case 1:
                ans = "To watch a horror movie";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 2:
                ans = "Comment four movies";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 3:
                ans = "To watch two comedy movies";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 4:
                ans = "To watch a action movie";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 5:
                ans = "to watch two action movies";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 6:
                ans = "To watch a movie in english";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 7:
                ans = "Watch a movie subtitled in english";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
                break;
            case 8:
                ans = "To watch a drama movie";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                limit ++;
                ind ++;
                break;
            default:

                ans = "To watch three movies";
                num = ind;
                challenges[ind] = ans + " /challenge number: " + num;
                System.out.println(ans);
                ind ++;
                limit ++;
        }
        }
        return ans;
    }
       public void gamificacionMenu(){
        boolean exit = false;
        do{
        System.out.println("Choose an option: ");
        System.out.println("1. Take a challenge");
        System.out.println("2. See all chosen challenges");
        System.out.println("3. Finish a challenge");
        System.out.println("4. Exit");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        switch(option){
            case "1":
                if(option.equals("1")){
                retos();
                exit = true;
                }
            case "2":
                if(option.equals("2")){
                    imprimir();
                    exit = true;
                }
            case "3":
            if(option.equals("3")){
                try{
                    System.out.println("Select in order starting from 0, the number of the challenge you finished");
                    Scanner in = new Scanner(System.in);
                    String opt = in.nextLine();
                    int num = Integer. parseInt(opt);
                     if(num <challenges.length){
                    terminarReto(num);
                    }else{
                    System.out.println("Enter a valid value please");
                    }
                     if(points == 30){
                         System.out.println("Congratulations, you have won a ROOKIE trophy.");
                     }
                     if(points == 50){
                         System.out.println("Congratulations, you have won a INITIATED trophy.");
                     }
                     if(points == 70){
                         System.out.println("Congratulations, you have won a VETERAN trophy.");
                     }
                    exit = true;
                }catch(Exception e){
                    System.out.println("Enter a number please");
                }
            }
            case "4":
                if(option.equals("4")){
                    exit = false;
            }
            default:
            }   
        }while(exit);
    }
    public void imprimir(){
        int contnu = 0;
        for(int i = 0; i < challenges.length;i++){
            if(challenges[i] != null){
                System.out.println(challenges[i]);
            }
            if(challenges[i] == null){
                contnu ++;
                if(contnu == 7){
                    System.out.println("** There are no challenge in the list **");
                }
            }
        }
    }
       public void terminarReto(int ind){
        if(challenges[ind] == null){
            System.out.println("there are no challenge in this position: " + ind);
        }
        if(empty() == true){
            System.out.println("** There are no challenges in the list **");
        }else{
            challenges[ind] = null;
            limit --;
            System.out.println("Congratulations, you finished a challenge");
            points += 10;
        }
    }
    public boolean empty(){
        int contnu=0;
        boolean emp = false;
         for(int i = 0; i < challenges.length;i++){
              if(challenges[i] == null){
                contnu ++;
                if(contnu == 7){
                    emp = true;
                }
            }
        }
         return emp;
    }
    // PARA LA GRAFICA
    public String print(){
        String ans="";
        String fin="";
        for(int i = 0; i < challenges.length;i++){
            if(challenges[i] != null){
                ans = challenges[i];
                fin = fin + " " + ans + "\n";
            }
        }
        System.out.println(fin);
        return fin;
    }
    
}