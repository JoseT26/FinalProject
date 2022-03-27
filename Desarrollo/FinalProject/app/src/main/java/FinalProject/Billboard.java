/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import java.util.ArrayList;
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
        System.out.println("Write a name for your Billboard");
        Scanner input = new Scanner(System.in);
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
        return movies.size();
    }
    
    public String getMovieTitle(int indicator) {
        if (indicator >= movies.size()) {
            return null;
        }
        Movie movie = movies.get(indicator);
        return movie.getTitle();
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
        if (criteria == "Title") {
            isSame = parameter == movie.getTitle();
        } else if (criteria == "Genre"){
            isSame = parameter == movie.getGenre();
        } else if (criteria == "Synopsis"){
            isSame = parameter == movie.getSynopsis();
        } else if (criteria == "Language"){
            isSame = parameter == movie.getLanguage();
        } else if (criteria == "Director"){
            isSame = parameter == movie.getDirector();
        } else if (criteria == "Classify"){
            isSame = parameter == movie.getClassify();
        } else if (criteria == "Duration"){
            isSame = parameter == movie.getDuration();
        } else if (criteria == "Year"){
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
