package Seminar_01.Ex001;

import java.util.ArrayList;
import java.util.List;

public class Dispensing_Machine {

    private List <Product> products;

    public Dispensing_Machine() {
        this.products = new ArrayList<>(); // Инициализация списка
    }
    public void add_product(Product product) {
        this.products.add(product);
    }


}
