import java.util.LinkedList;
import java.util.Queue;

class ProductorConsumidor{
    private Queue<Integer> almacen = new LinkedList<>();
    private final int CAPACIDAD = 5;

    public synchronized void producir() throws InterruptedException{
        int elemento = 0;
        while (true){
            while (almacen.size() == CAPACIDAD){
                wait();
            }
            System.out.println("Productor produce: "+elemento);
            almacen.add(elemento);
            elemento++;
            notify();
            Thread.sleep(1000);
        }
    }

    public synchronized void consumir() throws InterruptedException{
        while (true){
            while (almacen.isEmpty()){
                wait();
            }
            int elemento = almacen.poll();
            System.out.println("Consumidor consume: "+elemento);
            notify();
            Thread.sleep(1000);
        }
    }


}

public class Main {
    public static void main(String[] args) {
            ProductorConsumidor pc =new ProductorConsumidor();
            Thread productor = new Thread( () -> {
                try {
                    pc.producir();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } );

            Thread consumidor = new Thread( () -> {
                try {
                    pc.consumir();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } );

            productor.start();
            consumidor.start();

    }
}
