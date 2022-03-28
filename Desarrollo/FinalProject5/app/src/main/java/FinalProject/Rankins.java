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

    public String writeComment(String comment, boolean valid){
        String ans;
        
        if (valid == true) {
            comments.add(comment + "\n");
            ans = "Your comment was wrote successfully";
        } else {
            ans = "The movie is not available yet";
        }
        return ans;
    }
    
    public String addRank(int ranks, boolean valid){
        String ans;
        
        if (valid == true) {
            rank.add(ranks);
            ans = "Your puntuation was saved successfully";
        } else {
            ans = "The movie is not available yet";
        }
        return ans;
    }
    
    public void printComment() {
        for (int i = 0; i < comments.size(); i++){
            System.out.println(comments.get(i));
        }
    }
    
    public void printRankin() {
        String list = "";
        
        for (int i = 0; i < rank.size(); i++){
            list = list + rank.get(i)+"";
            System.out.println(list);
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