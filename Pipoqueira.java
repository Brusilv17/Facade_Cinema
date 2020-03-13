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
public class Pipoqueira {
    int aquecer;
    
    public Pipoqueira (int aquecer) {
 this.aquecer = aquecer;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.aquecer; i++)
 System.out.println("Aquecido em:   " + i + "...");
}
}