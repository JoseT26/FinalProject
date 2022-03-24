/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import java.util.ArrayList;

/**
 *
 * @author fundacion
 */

public class Rankins {
    ArrayList<String> comments = new ArrayList <String>();
    ArrayList<Integer> rank = new ArrayList <Integer>();
    String movieName;
    String coment;
    
    public boolean validMovie(String[] movies){
        boolean valid = false;
        
        for (int i = 0; i < movies.length -1; i++){
            if (movies[i] == movieName){
                valid = true;
            }
        }
        return valid;
    }
    
    public String writeComment(String comment, String[] movies){
        String ans;
        
        if (validMovie(movies) == true) {
            comments.add(comment);
            ans = "Your comment was wrote successfully";
        } else {
            ans = "The movie is not available yet";
        }
        return ans;
    }
    
    public String addRank(int ranks, String[] peliculas){
        String ans;
        
        if (validMovie(peliculas) == true) {
            rank.add(ranks);
            ans = "Your puntuation was saved successfully";
        } else {
            ans = "The movie is not available yet";
        }
        return ans;
    }
    
    public void printComment(){
        for (int i = 0; i < comments.size(); i++){
            System.out.println(comments.get(i));
        }
    }
    
    public void printRankin(){
        for (int i = 0; i < rank.size(); i++){
            System.out.println(rank.get(i));
        }
    }
     
    public int movieRankin(){
        int sum = 0;
        int num;
        
        for (int i = 0; i < rank.size();i++){
            num = rank.get(i);
            sum = sum + num;
        }
        sum = sum / rank.size();
        return sum;
    }
}