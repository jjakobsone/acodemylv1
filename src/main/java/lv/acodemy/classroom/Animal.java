package lv.acodemy.classroom;

public class Animal {
    public String name;
    public String color;
    public int age;
    public boolean hasBody;

    public int energy = 4;


    public void printAllInfo() {
        System.out.println("Has Body: " + hasBody);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }

    public void speak() {
        System.out.println("Mrrrrr!");
    }

    public void feedAnimal() {
        System.out.println("Omnomnom!");
    }

    public void walk() {
        if (energy <= 0) {
            System.out.println("Not enough energy to walk!");
        } else {
            System.out.println("Walking!");
            energy--;
        }
    }

    public void feed() {
        if (energy < 4) {
            System.out.println("Omnomnom..");
            energy++;
        } else {
            System.out.println("I can't eat, I'm full");
        }
    }
}

