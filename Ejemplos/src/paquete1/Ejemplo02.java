/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[5];
        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);
        //Inprime 0 porque no  tiene ningun valor asignado y es deo tipo
        //entero
        
        // arreglo de tipo double
        double[] arreglo2 = new double[5];
        System.out.println(arreglo2[0]);
        //Inprime 0.0 porque no tiene ningun valor asignado y es de tipo double
        //(Decimal)
        
        // arreglo de tipo String
        String[] arreglo4 = new String[5];
        System.out.println(arreglo4[0]);
        //Inprime null porque no tiene ningun valor asignado y es de tipo cadena
        
        // arreglo de tipo boleano
        boolean[] arreglo5 = new boolean[5];
        System.out.println(arreglo5[0]);
        //Inprime false porque no tiene ningun valor asignado y es de tipo
        //boleano
    }

}
