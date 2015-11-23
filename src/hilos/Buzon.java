
package hilos;

/**
 *
 * @author David
 */
public class Buzon{

    private String mensaje = "";
           
    synchronized public void Escritura(String msg) {
        if (mensaje != "") {
            try {
                System.out.println("Esperando lectura de correo");
                wait();
                
            } catch (InterruptedException ex) {
                System.out.println("Interrupcion " + ex);
            }
        }   
            mensaje = msg;
            System.out.println("Correo escrito --> " + mensaje);
            notify();
        }
    

    synchronized public void Lectura() {
        if(mensaje==""){
            try {
                System.out.println("Esperando nuevo correo");
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupcion " + ex);
            }
        }
            System.out.println("Correo Leido --> " + mensaje);
            mensaje="";
            notify();
        }
    
    
}
