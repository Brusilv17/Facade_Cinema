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
public class FacadeCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
public class FacadeCinema {
 boolean verdadeiro = true;
 ArCondicionado a;
 BlueRay b;
 Cadeira  c;
 HomeTheater h;
 Iluminacao i;
 Pipoqueira p;
 ProjMulti m;
 
 public FacadeCinema (int funcao) {

 switch (funcao) {
 case 1: comedia ();
 break;
 case 2 :aventura ();
 break;
 case 3 :romance ();
 break;
 default :
 System.out.println ("Opção incorreta!!!");
verdadeiro = false;

}

 if (verdadeiro) {
 a.ligar();
 b.ligar();
 c.ligar();
 h.ligar();
 i.ligar();
 p.ligar();
 m.ligar();
public void forte () {
 int grau = 20;
 int midia = 110;
 int inclinacao = 75;
 int luz = 75;
 int som = 40;
 int aquecer = 75;
 int projetar = 75;
 p = new Pipoqueira (aquecer);
 m = new ProjMulti (projetar);
 r = new Repositorio (qtdAgua, temperatura);

}
 public void medio () {
 int pressao = 30;
 int temperatura = 105;
 int qtdAgua = 95;
 int qtdCafe = 35;
 p = new Pressurizador (pressao);
 m = new Moenda (qtdCafe);
 r = new Repositorio (qtdAgua, temperatura);

}
 public void fraco () {
 int pressao = 30;
 int temperatura = 100;
 int qtdAgua = 110;
 int qtdCafe = 30;
 p = new Pressurizador (pressao);
 m = new Moenda (qtdCafe);
 r = new Repositorio (qtdAgua, temperatura);

}
}

}
    }
    
}
