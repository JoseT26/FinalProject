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
    String [][] asientos = new String[8][7];
    String [][] asi ={{"A0","A1","A2","A3","A4","A5","A6"},
                      {"B0","B1","B2","B3","B4","B5","B6"},
                      {"C0","C1","C2","C3","C4","C5","C6"},
                      {"D0","D1","D2","D3","D4","D5","D6"},
                      {"E0","E1","E2","E3","E4","E5","E6"},
                      {"F0","F1","F2","F3","F4","F5","F6"},
                      {"G0","G1","G2","G3","G4","G5","G6"},
                      {"H0","H1","H2","H3","H4","H5","H6"}};
    
    
    public void imprimirAsientos(){
        for(int i = 0; i < asientos.length; i++){ 
            for(int j = 0; j < asientos[i].length; j++){ 
		System.out.print(asientos[i][j] + " ");	// Imprime elemento 
	} 
	System.out.println();	// Imprime salto de línea 
        } 
    
    }
    public boolean asientoValido(int x, int y){
        boolean disponible = false;
        if(asientos[x][y] == null){
            disponible = true;
        }
        return disponible;
    }
    public void asignarAsiento(int x, int y,String nombre){
        if(asientoValido(x,y)== true){
            asientos[x][y] = nombre;
        }
    }
    public String [][] darAsientos(){
        return asientos;
    }
    public void verLosAsientos(){
        for(int i = 0; i < asi.length; i++){ 
            for(int j = 0; j < asi[i].length; j++){ 
		System.out.print(asi[i][j] + " ");	// Imprime elemento 
	} 
	System.out.println();	// Imprime salto de línea 
        } 
    
    }
    public void liberarAsientos(int x,int y){
        if(asientos[x][y] != null){
            asientos[x][y] = null;
        }else{
            System.out.println("This seat is already empty");
        }
    }
}

