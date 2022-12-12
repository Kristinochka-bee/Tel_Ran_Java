package practic.enums.enums;

import practic.abstrac.Subjects;
import practic.abstrac.Teacher;
import practic.enums.Color;

import java.util.Arrays;

import static practic.abstrac.Subjects.GEOGRAPHY;

public class TestEnums {
    public static void main(String[] args) {
        /*
        System.out.println(Color.BLUE);
        System.out.println(Color.RED);
        System.out.println(Color.YELLOW);
        System.out.println(Color.GREEN);


         */
        Color[] values = Color.values();
        //System.out.println(Arrays.asList(values));


        Color.BLUE.someMethod();
        Color.RED.someMethod();

        MyDay myDay = MyDay.THURSDAY;
        dayIsNice(myDay);
        dayIsNice(MyDay.FRIDAY);
        dayIsNice(MyDay.WEDNESDAY);

        Color red = Color.RED;
        red.specialMethod();




            }
    public static void dayIsNice(MyDay day) {
        switch (day) {
            case MONDAY:
                System.out.println("bad");
                break;
            case FRIDAY:
                System.out.println("better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("best");
                break;
            default:
                System.out.println("so-so");
                break;
        }
    }
}