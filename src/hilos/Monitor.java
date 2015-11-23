package hilos;

/**** @author David ****/
public class Monitor {

    

    public static void main(String[] args) {
        Buzon b = new Buzon();
        Escribir esc = new Escribir(b);
        Leer ler = new Leer(b);

        esc.start();
        ler.start();

    }
}


