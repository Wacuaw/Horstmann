package podypl.Zajecia4.taski;

public class Task_4_1_3 {

    public static void main(String[] args) {


        C c = new C();
    }
}

class A {
    A(){
        System.out.println("jestem konstruktorem klasy 'A'");
    }

    A(boolean isSilent) {
        if (!isSilent){
            System.out.println("zadzialal konstruktor a");
        }
    }

}

class B extends A {
    B(){
        System.out.println("jestem konstruktorem klasy 'B'");
    }
    B(boolean isSilent) {
        super(true);
        if (!isSilent){
            System.out.println("zadzialal konstruktor b");
        }

    }
}

class C extends B{
    C(){
        System.out.println("jestem konstruktorem klasy 'C'");
    }
    C(boolean isSilent) {
        super(true);
        if (!isSilent){
            System.out.println("zadzialal konstruktor C");
        }
    }
}

