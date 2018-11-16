package czescPierwsza;

public class ElementyOrazInstrukcjeBreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("petla zostala przerwana");
                break;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("jestesmy juz za petla");


        etykieta: for (int i = 0; i < 10; i++){
            for (;;)    {
                for(;;) {
                    break etykieta;
                }
            }


        }




        jeden: {
            dwa: {
                trzy: {
                    System.out.println("poczatek trzeciego bloku");
                    if (true) break dwa;
                    System.out.println("koniec trzeciego bloku");
                }
                System.out.println("za trzecim blokiem");
            }
        }

        System.out.println();
        System.out.println();

        for (int k = 0; k < 10; k++){
            if (k % 2 == 0) continue;
            System.out.println(k);
        }


    }
}
