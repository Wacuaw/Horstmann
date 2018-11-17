package podypl.Zajecia3;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("i = " + i);
        }



//        teraz przykład pętli do while

        int i = 0;

        do {
            System.out.println("i = " + i);
            i++;
        } while(false);


//        teraz przykłady na break i continue

        final String FORBIDDEN = "cztery";
        String[] strings = {"raz", "dwa", "trzy", "cztery", "pięć"};
        int b = 0;

        while (b < strings.length){
            if (strings[b].equals(FORBIDDEN)){
                break;
            }
            System.out.println(strings[b]);
            b++;
        }



        out: for (int c = 0; c < 10; c++){
            for (int d = 0; d<10; d++){
                System.out.println("c = " + c + "   d = " + d);

                if (c==4 && d == 4){
                    break out;
                }

            }

        }

    }

}


