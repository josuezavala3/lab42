/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;

/**
 *
 * @author Suazo
 */
public class adelantar {
    
    static Random r=new Random();
    
    public String adelantar (String contraseña){
        int clave=r.nextInt(9)+1;
        String salida="";
        for (int i = 0; i < contraseña.length(); i++) {
            int letra=contraseña.length();
            if (letra>=65 && letra<=90) {
                for (int j = clave; j >0; j--) {
                    letra+=1;
                    if ((letra==91)) {
                        letra=65;
                    }
                }
            }else if(letra>=97 && letra<=122){
                for (int j = clave; j > 0; j--) {
                    letra+=1;
                    if(letra==123)
                        letra=97;
                }
            }
            salida+=(char)letra;
        }
        return salida;
    }
    
    public String decoAdelantar(String contraseña, int llave){
        String salida="";
        for (int i = 0; i < contraseña.length(); i++) {
            int letra=contraseña.charAt(i);
            if (letra>=65 && letra<=90) {
                for (int j = llave; j >0; j--) {
                    letra--;
                    if (letra<65) {
                        letra=90;
                    }
                }
            }else if (letra >= 97 && letra <= 122) {
                for (int j = llave; j > 0; j--) {
                    letra--;
                    if (letra < 97) 
                    {
                        letra = 122;
                    }
                }
            }
            salida+=(char)letra;
        }
        return salida;
    }
}
