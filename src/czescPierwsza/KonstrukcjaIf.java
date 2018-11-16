package czescPierwsza;

public class KonstrukcjaIf {

    public static void main(String[] args) {
        double a = 5;
        double b = 0;
        double c;

        if (b != 0 ){
            c = a / b;
        }  else if (a != 0) {

            System.out.println("jestesmy w bloku elseif");
        }

        else {
            System.out.println("nie mozna dzielic przez zero");
        }
}

}
