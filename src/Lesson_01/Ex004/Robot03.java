package Lesson_01.Ex004;

import java.util.ArrayList;

public class Robot03 {

    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<>();
    }

    //** Имя робота */
    private String name;

    //** Уровень робота */
    private int level;

    private State state;

    /**
     * @param name  Имя робота !Не должно начинаться с цифры.
     * @param level Уровень робота
     */

    private Robot03(String name, int level) {
        if (
                (name.isEmpty()
                        || Character.isDigit(name.charAt(0)))
                        || Robot03.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;

            Robot03.names.add(name);
            this.level = level;
            this.state = State.Off;
        }

        // #region другие конструкции



    }

//    public Robot03(String name) {
//        if (
//                (name.isEmpty()
//                        || Character.isDigit(name.charAt(0)))
//                        || Robot03.names.indexOf(name) == -1) {
//            this.name = String.format("DefaultName_%d", defaultIndex++);
//        } else {
//            this.name = name;
//
//            Robot03.names.add(name);
//            this.level = 1;
//            this.state = State.Off;
//        }
//    }
//
//    public Robot03() {
//
//        this.name = String.format("DefaultName_%d", defaultIndex++);
//        Robot03.names.add(name);
//        this.level = 1;
//        this.state = State.Off;
//    }



    // #region правильные конструкции

    public Robot03(String name) {
        this(name, 1);
    }

    public Robot03() {
        this("");
    }
    // Методы вкл.выкл подсистем
    // #region правильные конструкции

    // Методы вкл.выкл подсистем

    public void power() {
        if(this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    private void powerOff() {
        this.stopBIOS();
        this.stopOS();
        this.sayBay();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }


    //**Загрузка BIOS */
    private void startBIOS () { System.out.println(" Start BIOS..."); }

    //**Загрузка OS */
    private void startOS () { System.out.println(" Start OS..."); }

    //**Приветствие */
    private void sayHi () { System.out.println(" Hello world..."); }

    //**Выгрузка BIOS */
    private void stopBIOS () { System.out.println(" Stop BIOS..."); }

    //**Выгрузка OS */
    private void stopOS () { System.out.println(" Stop OS..."); }

    //**Прощание */
    private void sayBay () { System.out.println(" Bye..."); }

    //**Работа */
    public void work () {
        if (this.state == State.On) {
            System.out.println(" Working...");
        }

    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
