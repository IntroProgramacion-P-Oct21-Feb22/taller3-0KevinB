/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author 0KevinB
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolucion
        int var1 = 25;
        int var2 = 100;
        int var3 = 10;
        int var4 = 5;
        int var5 = 2;
        
        boolean operacion1 = (Math.sqrt(var1) * var3 >= var2);
        System.out.println(operacion1);
        boolean operacion2 = (var3 / var4 >= var5);
        System.out.println(operacion2);
        boolean resultado = (operacion1 && true || false || operacion2);
        System.out.println(resultado);
    }
    
}
