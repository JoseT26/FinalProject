/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finalproyect;

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
    public double duration;
    public int year;
    public boolean isActive;

    public Movie(String title, String genre, String synopsis, String language, String director, String classify, double duration, int year, boolean isActive) {
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

    public double getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }  
}

