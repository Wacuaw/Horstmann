package podypl.Zajecia4;

public class Const {
    public static void main(String[] args) {

      //  new A(true);

        new B();

    }
}

class A {

    A(){
        System.out.println("Działą konstruktor klasy A");

    }

    A(boolean arg) {
        System.out.println("dziala konstruktos z argumentem " + arg + " klasy A");
    }
}




class B extends podypl.Zajecia4.A {
    B(){
        super(true);
        System.out.println("Działa konstruktor klasy B");
    }
}
