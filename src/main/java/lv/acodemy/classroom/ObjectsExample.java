package lv.acodemy.classroom;

public class ObjectsExample {
    public static void main(String[] args) {
        Animal catBarsik = new Animal();

        catBarsik.printAllInfo();
        System.out.println();

        catBarsik.hasBody = true;
        catBarsik.name = "Barsik";
        catBarsik.age = 2;
        catBarsik.color = "Gray";

        catBarsik.printAllInfo();

        //create behaviour for Animal
        catBarsik.speak();
        catBarsik.feedAnimal();

        catBarsik.walk();
        catBarsik.feed();

        //kormim ciklom

        for (int i = 0; i < 6; i++) {
            catBarsik.walk();
        }

        catBarsik.feed();
        catBarsik.walk();

        int number = 0;
        while (number < 5){
            catBarsik.feed();
            number++;
        }
    }
}
