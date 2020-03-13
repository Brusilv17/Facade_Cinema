/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadecinema;

/**
 *
 * @author bruna
 */
public class BlueRay {
    int midia;
    
    public BlueRay (int midia) {
 this.midia = midia;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.midia; i++)
 System.out.println("Midia em:   " + i + "...");

 }

}
