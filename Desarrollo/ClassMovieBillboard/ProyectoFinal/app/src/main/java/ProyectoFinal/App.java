/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ProyectoFinal;

public class App {

    public static void main(String[] args) {
        Movie movie1 = new Movie("3 gatos", "Romantico" , "Vida loca", "Espa�ol", "Roberto", "Adultos", 2, 2022, true);
        // System.out.println(movie1);
        
        // Movie movie2 = new Movie("3 gatos", "Romantico" , "Vida loca", "Espa�ol", "Roberto", "Adultos", 2, 2022, true);
        // System.out.println(movie2);
        
        /* System.out.println(movie1.getTitle()); 
        System.out.println(movie1.getClassify()); 
        System.out.println(movie1.getYear()); 
        System.out.println(movie1.getLanguage()); */
        
        Billboard billboard1 = new Billboard("Cartelera 1");
        // System.out.println(billboard1); 

        billboard1.addMovie(movie1);
        System.out.println(billboard1);
        
        // billboard1.addMovie(movie2);
        // System.out.println(billboard1);
        
        // System.out.println(billboard1.getNumberMovies());
        // billboard1.showMovies();
        
        billboard1.searchMovieCriteria("Duration", "2");
    }
}