package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char r = 's';
        while (r == 's' || r == 'S') {
            System.out.println("1. Almacenes");
            System.out.println("2. Personas");
            System.out.println("3. productos");
            Scanner sc = new Scanner(System.in);
            boolean entro = true;
            int opcion;
            while (entro) {
                try {
                    opcion = sc.nextInt();
                    System.out.println("Ingrese numero de opcion: ");
                    entro = false;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese opcion correcta");
                    sc = new Scanner(System.in);
                }

            }
            
        }
    }

}
