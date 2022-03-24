/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Rankins {
    ArrayList <String> coments = new ArrayList <String>();
    ArrayList <Integer> rank = new ArrayList <Integer>();
    String moviename;
    String coment;
    
    public boolean peliculaValida(String [] peliculas){
        boolean valido = false;
        for(int i = 0; i<peliculas.length -1; i++){
            if(peliculas[i] == moviename){
                valido = true;
            }
        }
        return valido;
    }
    public String escribirComentario(String comentario, String [] peliculas){
        String ans;
        if(peliculaValida(peliculas) == true){
            coments.add(comentario);
            ans = "Su comentario fue redactado correctamente";
        }else{
            ans = "La pelicula no existe";
        }
        return ans;
    }
    public String addRank(int ranks, String [] peliculas){
           String ans;
        if(peliculaValida(peliculas) == true){
            rank.add(ranks);
            ans = "Su puntuacion fue redactado correctamente";
        }else{
            ans = "La pelicula no existe";
        }
        return ans;
    }
    public void imprimirComentarios(){
        for(int i = 0; i<coments.size(); i++){
            System.out.println(coments.get(i));
        }
    }
     public void imprimirRankin(){
        for(int i = 0; i<rank.size(); i++){
            System.out.println(rank.get(i));
        }
    }
   public int rankinDePelicula(){
       int sum = 0;
       int num;
       for(int i=0; i<rank.size();i++){
           num = rank.get(i);
           sum = sum + num;
       }
       sum = sum / rank.size();
       return sum;
   }
}
