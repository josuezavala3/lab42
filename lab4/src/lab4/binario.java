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
public class binario {
    
    public String binario(String contraseña) {
        String salida = "";
        for (int i = 0; i < contraseña.length(); i++) {
            String caracter = "";
            for (int j = contraseña.charAt(i); j > 0; j /= 2) {
                if (j % 2 == 0) {
                    caracter += "0";
                } else {
                    caracter += "1";
                }
            }
            salida += new StringBuilder(caracter).reverse().toString() + " ";
        }
        return salida;
    }

    public String decoBinario(String clave){
        String salida="";
        String[] caracteres=clave.split(" ");
        for (int i = 0; i < caracteres.length; i++) {
            String caracter=new StringBuilder(caracteres[i]).reverse().toString();
            int caracterDec=0;
            int contador=2;
            for (int j = 0; j < caracter.length(); j++) {
                if (j==0) {
                    int binario=caracter.charAt(j)-48;
                    caracterDec+=binario;
                }else{
                    int binario=caracter.charAt(j)-48;
                    caracterDec+=binario*contador;
                    contador*=2;
                }
            }
            salida+=(char)caracterDec;
        }
        return salida;
    }
}
