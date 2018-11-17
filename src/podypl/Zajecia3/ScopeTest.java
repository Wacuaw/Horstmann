package podypl.Zajecia3;

import java.awt.*;

public class ScopeTest {

    int test = 10;  //typ prosty
    Point point = new Point(4, 6); //obiekt

    void changePoint(Point point){
        point.x = 10;
        point.y = 10;
    }

    void changeTest(int test){
        test = 5;
    }



    void printTest(){
        int test = 20;
        System.out.println("test:  " + test);
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.printTest();

        //jesli to uruchomimy to dostaniemy wynik 20,     jesli dodamy .this.test w void print.Test, dostaniemy 10

        System.out.println("test: " + scopeTest.test);

    }

//tutaj nie mam wszystkiego



}
