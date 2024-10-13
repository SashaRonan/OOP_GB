import Seminar_01.Ex001.Bottle;
import Seminar_01.Ex001.Dispensing_Machine;
import Seminar_01.Ex001.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Бутылка", 110.5);
//        product.setName("Бутылка");
//        product.setPrice(110.5);

        Bottle bottle = new Bottle("Молоко", 200, 10);

        Dispensing_Machine machine = new Dispensing_Machine();
        machine.add_product(bottle);
//    System.out.println(product);
//    System.out.println(bottle.getName());
//    System.out.println(bottle.getName());
    System.out.println(machine);


    }
}