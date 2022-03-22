/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author Personal
 */
public class Rankins {
    String moviename;
    String coments;
    public boolean estaEnCartelera(String [] peliculas){
        boolean valido = false;
        for(int i = 0; i<peliculas.length -1; i++){
            if(peliculas[i] == moviename){
                valido = true;
            }
        }
        return valido;
    }
    public void escribirComentario(String nombrePelicula){
        
    }   
}
