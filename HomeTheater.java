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
public class HomeTheater {
    int som;
    
    public HomeTheater (int som) {
 this.som = som;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.som; i++)
 System.out.println("Som em:   " + i + "...");
}
}