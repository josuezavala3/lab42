/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hola = new Scanner(System.in);
        String bueno = hola.next();
        char[][] cod = new char[bueno.length()][bueno.length()];
        Random ale = new Random();
        for (int i = 0; i < bueno.length(); i++) {
            for (int j = 0; j < bueno.length(); j++) {
                int numero = ale.nextInt(0+bueno.length());
                if (j == 0) {
                    cod[numero][i] = bueno.charAt(i);

                }
            }
        }
        for (int i = 0; i < cod.length; i++) {
            for (int j = 0; j < cod.length; j++) {
                System.out.print(cod[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
