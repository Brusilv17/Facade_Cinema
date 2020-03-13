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
public class ArCondicionado {
    int grau;
    
    public ArCondicionado (int grau) {
 this.grau = grau;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.grau; i++)
 System.out.println("Temperatura em " + i + "...");

 }

}
