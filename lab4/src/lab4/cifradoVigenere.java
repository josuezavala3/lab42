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
    
}
