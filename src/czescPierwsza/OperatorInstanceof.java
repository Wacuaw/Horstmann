package czescPierwsza;

public class OperatorInstanceof {
    public static void main(String[] args) {
        Double x = 10.0;
        metoda(x);

    }



    private static void metoda (Number number) {
        if (number instanceof Integer) {
            System.out.println("Zmienna number jest typou integer");
        } else if (number instanceof Double) {
            System.out.println("Zmienna number jest tyu double");
        } else {
            System.out.println("Blad");
        }

    }
}
