package podypl.Zajecia4;

public class Printer {
    int x = 0;
    int y = 1;

    void printMe(){
        System.out.println("x wynosi " + x + "   y wynosi " + y);
        System.out.println("jestem egzemplarzem klasy " + this.getClass().getName());

    }

}
