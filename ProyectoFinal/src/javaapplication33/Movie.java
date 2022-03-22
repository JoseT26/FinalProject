/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

/**
 *
 * @author fundacion
 */
public class Movie {
    public String title;
    public String genre;
    public String synopsis;
    public String language;
    public String director;
    public String classify;
    public String duration;
    public String year;
    public boolean isActive;
    
    public Movie(String title, String genre, String synopsis, String language, String director, String classify, String duration, String year) {
        this.title = title;
        this.genre = genre;
        this.synopsis = synopsis;
        this.language = language;
        this.director = director;
        this.classify = classify;
        this.duration = duration;
        this.year = year;
        this.isActive = false;
    }
    
    public void updateIsActive(boolean active) {
        isActive = active;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getSynopsis() {
        return synopsis;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getDirector() {
        return director;
    }
    
    public String getClassify() {
        return classify;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public String getYear() {
        return year;
    } 
    
    // Could have changes
    @Override
    public String toString() {
        return " " + "Title: " + title + "\n " 
                + "Genre: " + genre + "\n "
                + "Synopsis: " + synopsis + "\n "
                + "Language: " + language + "\n "
                + "Director: " + director + "\n "
                + "Classify: " + classify + "\n "
                + "Duration: " + duration + "\n "
                + "Year: " + year;
    }  
}
