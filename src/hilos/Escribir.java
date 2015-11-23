package hilos;

/**
 *
 * @author David
 */
public class Escribir extends Thread{
     Buzon buzon;

    public Escribir(Buzon b) {
        this.buzon= b;
    }
     
     @Override
     public void run() {
         for (int i = 0; i <5; i++) {
             buzon.Escritura("FEITO"+ i);
         }
     }
}