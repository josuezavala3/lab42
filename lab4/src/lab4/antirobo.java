/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author HP
 */
public class antirobo {
    
    private String vigenere;
    private String adelantar;
    private String binario;

    public antirobo(String contraseña, String clave) {
        vigenere=new cifradoVigenere().vigenere(contraseña, clave);
        adelantar=new adelantar().adelantar(contraseña);
        binario=new binario().binario(contraseña);
                
    }

    public String getVigenere() {
        return vigenere;
    }

    public void setVigenere(String vigenere) {
        this.vigenere = vigenere;
    }

    public String getAdelantar() {
        return adelantar;
    }

    public void setAdelantar(String adelantar) {
        this.adelantar = adelantar;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    @Override
    public String toString() {
        return "antirobo{" + "vigenere=" + vigenere + ", adelantar=" + adelantar + ", binario=" + binario + '}';
    }
    
    
            
}
