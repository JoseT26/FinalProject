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
    int limite = 0;
    int puntos = 0;
    String retos;
    String premios;
    int ind= 0 ;
    String [] reto = new String [7];
  public int random(){
        int random = (int)(Math.random()*(3 - 0));
        return random;
    }
    public String retos(){
        String ans="";
        if(limite > 4){
            ans = "Ha llegado al limite de retos, termine los retos asignados para tomar uno nuevo";
            System.out.println(ans);
        }else{
        int random = (int)(Math.random()*8+1);
        switch(random){
            case 1:
                ans = "Ver una pelicula de terror";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 2:
                ans = "Comentar en cuatro peliculas";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 3:
                ans = "Ver dos peliculas de comedia";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 4:
                ans = "ver una pelicula de accion";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 5:
                ans = "ver dos peliculas de accion";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 6:
                ans = "ver una pelicula en ingles";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 7:
                ans = "ver una pelicula subtitulada en ingles";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
                break;
            case 8:
                ans = "ver una pelicula de drama";
                reto[ind] = ans;
                System.out.println(ans);
                limite ++;
                ind ++;
                break;
            default:
                ans = "ver tres pelicutlas";
                reto[ind] = ans;
                System.out.println(ans);
                ind ++;
                limite ++;
        }
        }
        return ans;
    }
    public void gamificacionMenu(){
        boolean exit = false;
        do{
        System.out.println("Elija una opcion: ");
        System.out.println("1. Tomar un reto");
        System.out.println("2. Ver mis retos");
        System.out.println("3. terminar un reto");
        System.out.println("4. Salir");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        if(option.equals("1")){
            retos();
            exit = true;
        }else{ 
            if(option.equals("2")){
                imprimir();
                exit = true;
            }
            if(option.equals("3")){
                try{
                    System.out.println("Selecciona por orden empezando desde 0, el numero del reto que terminaste");
                    Scanner in = new Scanner(System.in);
                    String opt = in.nextLine();
                    int num = Integer. parseInt(opt);
                     if(num <reto.length){
                    terminarReto(num);
                    }else{
                    System.out.println("Ingrese un valor valido por favor");
                    }
                    exit = true;
                }catch(Exception e){
                    System.out.println("Enter a number please");
                }
            }
            if(option.equals("4")){
                exit = false;
            }else{
                System.out.println("Ingrese un valor valido");
                exit = true;
            }    
        }
        }while(exit);
    }
    public void imprimir(){
        for(int i = 0; i < reto.length;i++){
            if(reto[i] != null){
                System.out.println(reto[i]);
            }
        }
    }
    public void terminarReto(int ind){
        reto[ind] = null;
        limite --;
        System.out.println("Felicidades, terminaste un reto");
        puntos += 10;
    }
}