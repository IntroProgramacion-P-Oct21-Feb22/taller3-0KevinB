/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author 0KevinB
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolucion
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 200;
        int variable8 = 50;
        int variable9 = 51;
        
        double operacion1 = ((variable1 * variable2) + variable3 - variable4 /
                variable5 + (Math.pow(variable6, variable5)));
        System.out.println(operacion1);
        
        boolean resultado1 = (operacion1 >= variable7);
        System.out.println(resultado1);
        
        boolean operacion2 = (variable8 >= (variable8 - variable8 + variable9));
        System.out.println(operacion2);
        
        boolean resultado = (resultado1 || operacion2);
        System.out.println(resultado);
    }
    
}
