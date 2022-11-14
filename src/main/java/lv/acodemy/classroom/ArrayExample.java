package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // array (massiv) of 7 elements
        //in java counting starts from 0
        int [] ages = {20, 18, 16, 16, 17, 18, 21};
        //get number 17 by index 4
        System.out.println(ages [4]);

        //pe4ataem dlinnu massiva
        System.out.println(ages.length + " Dlinna massiva");

        //menjaem zna4enie v massive - cifru 16 pod indeksom 3 menjaem na cifru 10
        ages [3] = 10;
        System.out.println(ages [3]);
        //pe4ataem vesj ispravlennij massiv
        System.out.println(Arrays.toString(ages));

        //Sozdaem pustoj tekstovoj massiv v kotorom v perspektive budut hranitsja dni nedeli
        String [] daysOfTheWeek = new String [8];
        daysOfTheWeek [0] = "Monday";
        daysOfTheWeek [1] = "Tuesday";
        daysOfTheWeek [2] = "Wednesday";
        daysOfTheWeek [3] = "Thursday";
        daysOfTheWeek [4] = "Friday";
        daysOfTheWeek [5] = "Saturday";
        daysOfTheWeek [6] = "Sunday";
        System.out.println(Arrays.toString(daysOfTheWeek));

        //sozdaem massiv s imenami
        String [] names = {"John", "Alex", "Roman","Natalija"};
        System.out.println(names[2]);
    }
}
