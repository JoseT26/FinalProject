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
    
    public static void billboardMenu() {
        int ans;
        Movie movie1 = new Movie("Spidermann", "Acción" , "Vida de un Superheroe", "Español", "Sam Raimi", "General", "2 hrs", "2004");
        Movie movie2 = new Movie("Spidermann 2", "Acción" , "Vida de un Superheroe", "Español", "Sam Raimi", "General", "2:30 hrs", "2006");
        Movie movie3 = new Movie("Spidermann 3", "Acción" , "Vida de un Superheroe", "Español", "Sam Raimi", "General", "2 hrs", "2008");
        
        Billboard billboard1 = new Billboard("");
        
        billboard1.addMovie(movie3);
        
        do {
            System.out.println("Choose an option: ");
            System.out.println("1. Watch movies in Billboard");
            System.out.println("2. Numbers of movies in Billboard");
            System.out.println("3. Add some movie");
            System.out.println("4. Search a movie by position");
            System.out.println("5. Search a movie by criteria");
            System.out.println("6. Exit");

            Scanner in = new Scanner(System.in);
            System.out.print("Option: ");
            ans = in.nextInt();
            
            while (ans < 1 || ans > 5) {
                System.out.println("That is not an option");
                System.out.println("");
                System.out.println("Choose an option: ");
                System.out.println("1. Watch movies in Billboard");
                System.out.println("2. Numbers of movies in Billboard");
                System.out.println("3. Add some movie");
                System.out.println("4. Search a movie by position");
                System.out.println("5. Search a movie by criteria");
                System.out.println("6. Exit");
                System.out.print("Option: ");
                ans = in.nextInt();
            }

            if ("1".equals(ans)) {
                billboard1.showMovies();
            } else if ("2".equals(ans)) {
                billboard1.getNumberMovies();
            } else if ("3".equals(ans)) {
                billboard1.addMovie(movie3);
            } else if ("4".equals(ans)) {
                billboard1.eliminateMovie(movie3);
            } else if ("5".equals(ans)) {
                billboard1.searchMovieCriteria("", "");
            } else {
                System.out.println("Take Care!");
                break;
            }
        } while (ans >= 1 && ans < 5);
    }
    
    // Could have changes
    @Override
    public String toString() {
        return "Billboard \n " + billboardTitle + "\n " +
                "Movies: \n " + movies;
    }
}
