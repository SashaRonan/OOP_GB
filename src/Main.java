import Homeworks.Homework_01.FamilyTree;
import Homeworks.Homework_01.Person;
import Seminar_01.Ex001.Bottle;
import Seminar_01.Ex001.Dispensing_Machine;
import Seminar_01.Ex001.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*region Lesson_01 */

////        product.setName("Бутылка");
////        product.setPrice(110.5);
//
//        Bottle bottle = new Bottle("Молоко", 200, 10);
//        Bottle bottle1 = new Bottle("Кефир", 150, 8);
//        Bottle bottle2 = new Bottle("Гречка", 97, 15);
//        Bottle bottle3 = new Bottle("Облепиха", 122, 9);
//
//        Dispensing_Machine machine = new Dispensing_Machine();
//        machine.add_product(bottle);
//        machine.add_product(bottle1);
//        machine.add_product(bottle2);
//        machine.add_product(bottle3);
////    System.out.println(product);
////    System.out.println(bottle.getName());
////    System.out.println(bottle.getName());
//        machine.printList();
//        machine.delete_product("Гречка");
//
//        System.out.println(machine);\\

        /*endregion Lesson_01 */


        /*region Homework_01 */


        FamilyTree familyTree = new FamilyTree();
// Создаем людей
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
// Устанавливаем родительские связи
        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        mary.addChild(susan);
// Добавляем людей в древо
        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(susan);
// Пример получения всех детей Джона
        List<Person> johnsChildren = familyTree.getChildren(john);
        for (Person child : johnsChildren) {
            System.out.println("John's child: " + child.getName());
        }
    }


    }
