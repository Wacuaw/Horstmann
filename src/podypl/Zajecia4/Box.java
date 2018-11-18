package podypl.Zajecia4;
//przeciążanie


//to co zakomentowane jest nepotrzebne/zrefaktorowane
import java.awt.*;

public class Box {

    int x1; //= 0;
    int x2; //= 0;
    int y1; //= 0;
    int y2; // = 0;

    Box (int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    Box (Point topLeft, Point bottomRight){
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y );
//        this.x1 = topLeft.x;
//        this.y1 = topLeft.y;
//        this.x2 = bottomRight.x;
//        this.y2 = bottomRight.y;
    }

    Box  (Point topLeft, int w, int h){
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);

//        this.x1 = topLeft.x;
//        this.y1 = topLeft.y;
//        this.x2 = (this.x1 + w);
//        this.y2 = (this.y1 + h);
    }

    void printBox(){
        System.out.println("Box: <" + x1 + " , " + y1 + " , " + x2 + " , " + y2 + " >");
    }

    public static void main(String[] args) {

        // Box rect = new Box();  //tworzenie obiektu

        Box rect;

        System.out.println("Wywołanie buildBox ze współrzędnymi rect.buildBox (25,25) i (50,50)");

        rect = new Box(25,25,50,50);
        rect.printBox();

        System.out.println("Wywołanie buildBox z punktami rect.buildBox (10, 10) i (20, 20)");
        Point a = new Point(10, 10);
        Point b = new Point(20, 20);
        rect = new Box(a,b);
        rect.printBox();

        System.out.println("Wywołanie buildBox z punktem (10, 10), szerokoscia 50 i wysokoscia 50");
        Point c = new Point(10, 10);
        rect = new Box(c,50, 50);
        rect.printBox();



    }
}
