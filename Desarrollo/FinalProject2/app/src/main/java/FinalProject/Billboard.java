/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fundacion
 */
public class Billboard { 
    String[] showTime = {"Afternon","Evening", "Night"};
    public ArrayList<Movie> movies;
    String billboardTitle;
    
    public Billboard(String billboardTitle){
        this.billboardTitle = billboardTitle;
        movies = new ArrayList<Movie>();
    }
        
    public String getBillboardTitle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a name for your Billboard");
        System.out.print("Name: ");
        billboardTitle = input.nextLine();
        return billboardTitle;
    }
        
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    
    public void eliminateMovie(Movie movie) {
        movies.remove(movie);
    }
    
    public int getNumberMovies() {
        System.out.println("There are " + movies.size() + " movies in Billboard");
        return movies.size();
    }
    
    public void getMovieTitle(int indicator) {
        Scanner in = new Scanner(System.in);
        int num = indicator;
                        
        try {
            if (num <= movies.size()) {
                System.out.println("To search a movie, you need the position of that movie");
                System.out.print("Position: ");
                num = in.nextInt();

                Movie movie = movies.get(num);
                System.out.println("Movie: " + movie.getTitle());
                System.out.println("");
            }
        } catch (InputMismatchException e) {
            System.out.println("You have to write a number!");
            System.out.println("");
        } catch (Exception e) {
            while (num > movies.size() || num < 0) {
                System.out.println("There are no movies in that position");
                System.out.println("");
                
                System.out.print("Position: ");
                num = in.nextInt();

                Movie movie = movies.get(num);
                System.out.println("Movie: " + movie.getTitle());
                System.out.println(""); 
            } 
        }
    }
    
    public void showMovies() {
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("Movie: " + (i + 1)); //
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Synopsis: " + movie.getSynopsis());
            System.out.println("Language: " + movie.getLanguage());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Classify: " + movie.getClassify());
            System.out.println("Duration: " + movie.getDuration());
            System.out.println("Year: " + movie.getYear());
            System.out.println(""); //
        }
    }
    
    //Could have changes
    public boolean compareCriteria(String criteria, String parameter, Movie movie) {
        boolean isSame;
        if ("Title".equals(criteria)) {
            isSame = parameter == movie.getTitle();
        } else if ("Genre".equals(criteria)){
            isSame = parameter == movie.getGenre();
        } else if ("Synopsis".equals(criteria)){
            isSame = parameter == movie.getSynopsis();
        } else if ("Language".equals(criteria)){
            isSame = parameter == movie.getLanguage();
        } else if ("Director".equals(criteria)){
            isSame = parameter == movie.getDirector();
        } else if ("Classify".equals(criteria)){
            isSame = parameter == movie.getClassify();
        } else if ("Duration".equals(criteria)){
            isSame = parameter == movie.getDuration();
        } else if ("Year".equals(criteria)){
            isSame = parameter == movie.getYear();
        } else {
            isSame = false;
        }
        return isSame;
    }
    
    //Could have changes
    public void searchMovieCriteria(String criteria, String parameter) {
        for (int i = 0; i < movies.size(); i++) {
            Movie actualMovie = movies.get(i);
            
            if (compareCriteria(criteria, parameter, actualMovie)) {
                System.out.println("Position: " + i);
                System.out.println("Movie: " + actualMovie.getTitle());
            }
        } 
    }
    
    // Could have changes
    @Override
    public String toString() {
        return "Billboard \n " + billboardTitle + "\n " +
                "Movies: \n " + movies;
    }
}
