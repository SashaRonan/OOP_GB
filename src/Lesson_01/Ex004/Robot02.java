package Lesson_01.Ex004;

public class Robot02 {
    //** Имя робота */
    private String name;

    //** Уровень робота */
    private int level;

    /**
     * @param name Имя робота !Не должно начинаться с цифры.
     * @param level Уровень робота
     */

    public Robot02(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Методы вкл/выкл подсистем


    public void powerOn () {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff () {
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
    public void work () { System.out.println(" Working..."); }
}
