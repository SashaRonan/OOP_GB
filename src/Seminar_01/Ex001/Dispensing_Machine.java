package Seminar_01.Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dispensing_Machine  {

    private List <Product> products;

    public Dispensing_Machine() {
        this.products = new ArrayList<>(); // Инициализация списка
    }
    public void add_product(Product product) {
        this.products.add(product);
    }

    public void delete_product(String product_name) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(product_name)) {
                iterator.remove(); // Используем итератор для безопасного удаления
            }
        }
    }

    public void printList() {
        for (Product itVar : products) {
            System.out.println(itVar);
        }
    }

//    public void delete_product(String product_name) {
//        for(Product itVar : products) {
//            if(Object.equals(itVar.getName(), product_name)){
//                this.products.remove();
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Dispensing_Machine{" +
                "products=" + products +
                '}';
    }
}
