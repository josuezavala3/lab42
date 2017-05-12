/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Suazo
 */
public class cifradoVigenere {
    
    public String vigenere(String contraseña, String clave){
        char[][] tabla = tabla();
        String salida="";
        contraseña.toUpperCase();
        clave.toUpperCase();
        int contador=0;
        for (int i = 0; i < contraseña.length(); i++) {
            int letra=contraseña.charAt(i)-65;
            if (contador==clave.length()) {
                contador=0;
            }
            if (letra<0 || letra>26) {
                salida+=contraseña.charAt(i);
            }else{
                int letraClave=clave.charAt(contador)-65;
                salida+=tabla[letra][letraClave];
                contador++;
            }
        }
        return salida;
    }
    
    private char[][] tabla(){
        char[][] tabla=new char[26][26];
        int abecedario=65;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                tabla[i][j]=(char)abecedario;
                abecedario++;
                if (abecedario==91) {
                    abecedario=65;
                }
            }
            abecedario++;
        }
        return tabla;
    }
    
    public String decoVigenere (String contraseña, String clave){
        char[][] tabla=tabla();
        String salida="";
        int contador=0;
        contraseña.toUpperCase();
        clave.toUpperCase();
        for (int i = 0; i < contraseña.length(); i++) {
            int letra=contraseña.charAt(i)-65;
            if (contador==clave.length()) {
                contador=0;
            }
            if (letra<0 || letra>26) {
                salida+=contraseña.charAt(i);
            }else{
                int letraClave=clave.charAt(contador)-65;
                for (int j = 0; j < 26; j++) {
                    if (tabla[letraClave][j]==contraseña.charAt(i)) {
                        salida+=(char)(j+65);
                    }
                }
                contador++;
            }
        }
        return salida;
    }
}
