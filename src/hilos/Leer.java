/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;
public class Leer extends Thread{
    Buzon buzon;
    public Leer(Buzon b) {
        super();
        this.buzon=b;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buzon.Lectura();
        }
    }
}