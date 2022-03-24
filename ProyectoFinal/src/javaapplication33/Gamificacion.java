/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Gamificacion {
    int puntos;
    String retos;
    String premios;
    String [] reto = new String [10];
    public int random(){
        int random = (int)(Math.random()*(3 - 0));
        return random;
    }
    public String retos(){
        String ans="";
        int random = (int)(Math.random()*8+1);
        int ind = 0;
        switch(random){
            case 1:
                ans = "Ver una pelicula de terror";
                reto[ind] = ans;
                ind ++;
                break;
            case 2:
                ans = "Comentar en cuatro peliculas";
                reto[ind] = ans;
                ind ++;
                break;
            case 3:
                ans = "Ver dos peliculas de comedia";
                reto[ind] = ans;
                ind ++;
                break;
            case 4:
                ans = "ver una pelicula de accion";
                reto[ind] = ans;
                ind ++;
                break;
            case 5:
                ans = "ver dos peliculas de accion";
                reto[ind] = ans;
                ind ++;
                break;
            case 6:
                ans = "ver una pelicula en ingles";
                reto[ind] = ans;
                ind ++;
                break;
            case 7:
                ans = "ver una pelicula subtitulada en ingles";
                reto[ind] = ans;
                ind ++;
                break;
            case 8:
                ans = "ver una pelicula de drama";
                reto[ind] = ans;
                ind ++;
                break;
            default:
                ans = "ver tres pelicutlas";
                reto[ind] = ans;
                ind ++;
        }
        return ans;
    }
    public void menuGamifiacion(){
        System.out.println("Elija una opcion: ");
        System.out.println("1. Tomar un reto");
        System.out.println("2. Ver mis retos");
        System.out.println("3. Salir");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        if(option == "1"){
            retos();
            menuGamifiacion();
        }else{
            if(option == "2"){
                imprimir();
            }
        }
        
    }
    public void imprimir(){
        for(int i = 0; i < reto.length;i++){
            if(reto[i] != null){
                System.out.println(reto[i]);
            }
        }
    }
}
