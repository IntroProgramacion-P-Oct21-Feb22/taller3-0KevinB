/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Usuario 0KevinB
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolucion
        int var1 = 81;
        int var2 = 25;
        int var3 = 10;
        int var4 = 50;
        
        double operacion = (Math.sqrt(var1) + Math.sqrt(var2) * var3);
        System.out.println(operacion);
        boolean resultado = ((Math.sqrt(var1) + Math.sqrt(var2) * var3) >= var4);
        System.out.println(resultado);
    }
    
}
