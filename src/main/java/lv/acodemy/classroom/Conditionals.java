package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        //Operator IF
        //boolean: TRUE/FALSE
        //5>2 (true)
        //10<1 (false)

        if (1 < 2) {
            System.out.println("Yes, 1<2");
        }
        if (10 < 1) {
            System.out.println("Hello World!");
        }

        //boolean

        boolean isNikitaToxic = true;
        if (isNikitaToxic) {
            System.out.println("Spank him!");
        }

        //String example

        String myCity = "Riga";
        if (myCity.equals("Riga")) {
            System.out.println("Yes, my city is Riga");
        }

        if (myCity.contains("Rig")) {
            System.out.println("Yes, city is Riga");
        }

        String name = "Julja";
        if (!name.equals("John")) {
            System.out.println(name + " can be registered");
        }

        //if else

        int age = 17;
        if (age <18) {
            System.out.println("Please come later");
        } else {
            System.out.println("you can by everithing you want");
        }

        //<= less or equals
        //>= more or equals

        //if-else-if-else

        int currentTime = 24;
        if (currentTime <= 11 && currentTime >=6) {
            System.out.println("Good morning!");
        } else if (currentTime >11 && currentTime <+17) {
            System.out.println("Good day!");
        } else if (currentTime >17 && currentTime <+24) {
            System.out.println("Good evening!");
        } else if (currentTime >=0 && currentTime <6){
            System.out.println("Good night!");
        } else {
            System.out.println("Current time is not correct " + currentTime);
        }


    }
}

