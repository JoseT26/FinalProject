/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

/**
 *
 * @author fundacion
 */
public class Asientos {
    String [][] seats = new String[8][7];
    String [][] sea = {{"A0","A1","A2","A3","A4","A5","A6"},
                      {"B0","B1","B2","B3","B4","B5","B6"},
                      {"C0","C1","C2","C3","C4","C5","C6"},
                      {"D0","D1","D2","D3","D4","D5","D6"},
                      {"E0","E1","E2","E3","E4","E5","E6"},
                      {"F0","F1","F2","F3","F4","F5","F6"},
                      {"G0","G1","G2","G3","G4","G5","G6"},
                      {"H0","H1","H2","H3","H4","H5","H6"}};
    
    public void printSeats(){
        for (int i = 0; i < seats.length; i++) { 
            for (int j = 0; j < seats[i].length; j++) { 
		System.out.print(seats[i][j] + " ");	// Imprime elemento 
            } 
            System.out.println();	// Imprime salto de línea 
        } 
    
    }
    
    public boolean validSeat(int x, int y) {
        boolean available = false;
        
        if (seats[x][y] == null) {
            available = true;
        }
        return available;
    }
    
    public void assignSeat(int x, int y, String nam) {
        if (validSeat(x,y) == true) {
            seats[x][y] = nam;
        }
    }
    
    public String[][] giveSeats() {
        return seats;
    }
    
    public void seeSeats(){
        for (int i = 0; i < sea.length; i++) { 
            for (int j = 0; j < sea[i].length; j++) { 
		System.out.print(sea[i][j] + " ");	// Imprime elemento 
	} 
            System.out.println();	// Imprime salto de línea 
        } 
    
    }
    
    public void liberateSeats(int x,int y){
        if (seats[x][y] != null) { 
            seats[x][y] = null;
        } else {
            System.out.println("This seat is already empty");
        }
    }
}
