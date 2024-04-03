package sorenrahimi.g2s1m3.entities;

import javax.swing.text.TabableView;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private int numeroOrdine;
    private State state;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<MenuItem> orderedProducts;
    private Table table;

    public Order(int numCoperti, Table table) {
        Random rndm = new Random();
        if (table.getNumMaxCoperti() <= numCoperti)
            throw new
                    RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        this.numeroOrdine = rndm.nextInt(1000, 100000);
        this.state = State.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        this.orderedProducts = new ArrayList<>();
        this.table = table;
    }
    public void addMenuItem(MenuItem menuItem) {
        this.orderedProducts.add(menuItem);
    }
    public double getTotal() {
        return this.orderedProducts.stream().mapToDouble(MenuItem::getPrice)
                .sum() + (this.table.getCostoCoperto() * this.numCoperti);
    }

    public void print() {
        System.out.println("id ordine -> " + this.numeroOrdine);
        System.out.println("statp -> " + this.state);
        System.out.println("numero coperti -> " + this.numCoperti);
        System.out.println("ora acquisizione -> " + this.oraAcquisizione);
        System.out.println("numero tavolo -> " + this.table.getNumTable());
        System.out.println("Lista: ");
        this.orderedProducts.forEach(System.out::println);
        System.out.println("totale -> " + this.getTotal());
    }
}
