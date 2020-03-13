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
public class Iluminacao {
    int luz;
    
    public Iluminacao (int luz) {
 this.luz = luz;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.luz; i++)
 System.out.println("Iluminacao em:   " + i + "...");
}
}