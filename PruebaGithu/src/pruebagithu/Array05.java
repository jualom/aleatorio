/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithu;
import java.util.Scanner;

public class Array05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
               
        double[] nota = new double[4];
        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus exámenes.");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen nº " + (i + 1) + ": ");
            nota[i] = teclado.nextDouble(); 
        }
        System.out.println("Tus notas son: ");
        double suma = 0;
        for (int i = 0; i < 4; i++) {
        System.out.print(nota[i] + " ");
        suma += nota[i];
        }
        System.out.println("\nLa media es " + suma / 4);
        }

}