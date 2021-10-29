/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author 0KevinB
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolucion
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        double raiz = ((Math.sqrt(var1)2));
        double operacion = ((raiz + var2) / 3);
        System.out.println(operacion);
        boolean resultado1 = operacion == 9;
        System.out.println(resultado1);
        boolean resultado2 = (var4 > var1);
        System.out.println(resultado2);
        boolean resultado3 = (resultado1 && resultado2);
        System.out.println(resultado3);
    }

}
