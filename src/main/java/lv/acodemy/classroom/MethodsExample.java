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
        for (int i = 0; i < 3; i++) {
            printMyFullName("Julija", "Jako");
        }
        System.out.println();

        System.out.println(isPalindrome("tenet"));

        System.out.println();

        printMyFullName("Julija", "Jakobsone", 30, 5);

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
    public static int sum(int x, int y) {
        return x + y;
    }

    //metod kotorij vozvodit v kvadrat

    public static int kvadrat(int x) {
        return x * x;
    }

    //rezultat boonean (true/false)
    //proveritj slovo
    //Zada4a so zvezdo4koj..

    public static boolean isPalindrome(String palindromeWord) {
        String word = "";
        // t e n e t
        // 0 1 2 3 4
        for (int i = palindromeWord.length() - 1; i >= 0; i--) {
            word = word + palindromeWord.charAt(i);
            //"" = "" + (palindromeWord.length (5) - 1 = 4 (bukva t) => "" + "t";
            //"t" = "t" + "e" (4-1=3);
            //"te" = "te" + "n"
            //"ten" = "ten" + "e"
            //"tene" = "tene" + "t"
            }
        System.out.println("Word= " + word);
        return word.equals(palindromeWord);
    }

    public static void printMyFullName(String name, String lastName, int age, int repeat) {
        for (int i = 0; i <= repeat; i++) {
            System.out.printf("My name is %s. My last name is %s. I'm %s years old. %n", name, lastName, age);
        }
    }
}


