package lv.acodemy.classroom;

public class MethodsExample {
    public static void main(String[] args) {
        printMyFullName();
        printMyFullName("Julija", "Jakobsone");

        informationAboutMe("Julija", "Jakobsone", 30);

        System.out.println();
         System.out.println(sum(5, 2));

        int twoNumberSum = sum(50, 20);
        System.out.println(twoNumberSum);

        System.out.println(kvadrat(2));

        //v cikle metod
        for (int i = 0; i < 3; i++){
            printMyFullName("Julija", "Jako");
        }

    }

    public static void printMyFullName() {
        System.out.println("Julija Jakobsone");
    }

    public static void printMyFullName(String name, String lastName) {
        System.out.printf("My name is %s. My last name is %s.%n", name, lastName);
    }

    //print information about you
    //metod budet sprasivatj imja familiju i vozrast (int)
    //metod dolzhen raspe4atatj: my name is name. My last name is lastNane. I am age years old.

    public static void informationAboutMe(String name, String lastName, int age) {
        System.out.printf("My name is %s. My last name is %s. I am %s years old", name, lastName, age);
    }

    //metod kotorij vozvra6aet summu 2 4isel
    public static int sum (int x, int y){
        return x + y;
    }

    //metod kotorij vozvodit v kvadrat

    public static int kvadrat(int x) {
        return x * x;
    }

    //rezultat boonean (true/false)
    //proveritj slovo


}