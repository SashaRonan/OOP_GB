package Lesson_01.Ex004;

public class Program {


    public static void main(String[] args) {

        // #region Robot1 demo
//        Robot01 robot01 = new Robot01("name_1", 1);
//        System.out.printf("%s %d\n", robot01.name, robot01.level);
//
//        robot01.startBIOS();
//        robot01.startOS();
//        robot01.sayHi();
//
//        robot01.work();
//        robot01.work();
//        robot01.work();
//
//        robot01.sayBay();
//        robot01.stopOS();
//        robot01.stopBIOS();
//        // #endregion
//
//
//        // #region Robot2 demo
//        Robot02 robot02 = new Robot02("name_2", 1);
//        System.out.printf("%s %d\n",
//                robot02.getName(), robot02.getLevel());
//
//        robot02.powerOn();
//        robot02.work();
//        robot02.work();
//        robot02.work();
//        robot02.powerOff();
        // #endregion

        // #region Robot3 demo
        Robot03 robot03 = new Robot03("name_3");
        System.out.println("------------");
        System.out.println(robot03);
        robot03.power();
        robot03.work();
        robot03.power();
        robot03.work();
        robot03.power();
        // #endregion

    }


}
