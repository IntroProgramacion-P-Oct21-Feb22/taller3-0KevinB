/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author 0KevinB
 */
public class Ejercicio07 {

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
        int var6 = 100;
        int var7 = 25;

        double raiz1 = (Math.sqrt(var1));
        double operacion1 = ((raiz1 + var2) / var3);
        System.out.println(operacion1);

        boolean resultado1 = operacion1 == 9;
        System.out.println(resultado1);

        boolean resultado2 = (var4 > var5);
        System.out.println(resultado2);

        boolean resultado3 = (var6 / var7 > Math.sqrt(var6));
        System.out.println(resultado3);

        boolean resultado_final = (resultado1 || resultado2 && resultado3);
        System.out.println(resultado_final);
    }

}
