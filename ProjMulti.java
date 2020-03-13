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
public class ProjMulti {
    int projetar;
    
    public ProjMulti (int projetar) {
 this.projetar = projetar;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.projetar; i++)
 System.out.println("Projetado em:   " + i + "...");
}
}