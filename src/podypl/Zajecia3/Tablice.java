package podypl.Zajecia3;

import java.awt.*;

public class Tablice {
    //po ang Arays

    public static void main(String[] args) {
        String[] request;
        Point[] points;
        //point to jakies punkty z java.awt

        int[] temps = new int[99];
        temps[0] = 5;
        temps[1] = 42;
        temps[13] = 2;

        System.out.println(temps[5]);
        //sout wartosci ktorej nie podalismy w tablicy to 0

        Point[] markup = {new Point(1,2), new Point(1,5), new Point(5, 6)};
        System.out.println(markup[2]);


        String[] titles = {"Pan", "Pani", "Państwo"};
        System.out.println(titles.length);

    }
}
