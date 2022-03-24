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
}
