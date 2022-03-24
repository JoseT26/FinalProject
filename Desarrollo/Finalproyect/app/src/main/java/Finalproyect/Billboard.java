/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finalproyect;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fundacion
 */
/*public class Billboard extends Movie {
    String showtime []={"Afternon","Evening", "Night"};
    String moviename [];
    String billboardtitl;
    List<String> filmname = new ArrayList<>(); 
public Billboard(String showtime[], String title,String genre){
    super(title);
    
    this.showtime= showtime;
}
public void Addmovie(){
    int i=0;
    /*moviename [i]= title;
    i++;*/
/*
        filmname.add(title); 
  
} 
public void Eliminatemovie(){

        filmname.remove(title); 
        ;
}  
public String findmovie(String genre){ 
    
}
    
}
}
vv
*/
public class Billboard { 
    String showtime []={"Afternon","Evening", "Night"};
    public ArrayList<Movie> movies;
    String billboardTitle;
        
    public Billboard(String billboardTitle){
        this.billboardTitle = billboardTitle;
        movies = new ArrayList<Movie>();
    }
        
    public String getBillboardTitle() {
        return billboardTitle;
    }
        
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    
    public void eliminateMovie(Movie movie) {
        movies.remove(movie);
    }
        
    public String getMovieTitle(int indicador) {
        if (indicador >= movies.size()) {
            return null;
        }
        Movie movie = movies.get(indicador);
        return movie.getTitle();
    }
}