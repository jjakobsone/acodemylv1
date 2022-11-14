package lv.acodemy.classroom;

public class LoopsExample {
    public static void main(String[] args) {

        //for
        //counter
        //condition
        //increment++

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!" + i);
        }

        //pe4ataem 4etnie 4isla ot 0 do 20
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println();
        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < dayOfTheWeek.length; i++) {
            System.out.println(dayOfTheWeek[i]);
        }

        System.out.println();
        //raspe4atatj dni s ponedelnika po 4etverg

        for (int i = 0; i < 4; i++) {
            System.out.println(dayOfTheWeek[i]);
        }

        System.out.println();
        //for each
        for (String day : dayOfTheWeek) {
            System.out.println(day);
        }

        System.out.println();
        //break cikl
        for (String day : dayOfTheWeek) {
            if (day.equals("Friday")) {
                System.out.println("Friday exist!");
                break;
            }
        }
        System.out.println();
        //zadanie n1
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers.length -1 ; i >= 0; i--){
            System.out.print(numbers [i] + " ");
        }

        System.out.println();
        //while
        int number = 0;
        while (number < 5){
            System.out.println("Hello World!");
            number++;
        }

        System.out.println();
        //do while
        number = 0;
        do{
            System.out.println("Hello World!");
            number++;
        } while (number < 5);
    }
}
