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
public class Cadeira {
    int inclinacao;
    
     public Cadeira (int inclinacao) {
 this.inclinacao = inclinacao;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.inclinacao; i++)
 System.out.println("Inclinação em    " + i + "...");                                        
}
}
