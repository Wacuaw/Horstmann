package podypl.Zajecia3;

import javax.sound.midi.Soundbank;

public class IfAndSwitch {
    public static void main(String[] args) {

        if(args.length<3){
            System.out.println("Zbyt malo argumentow");
            System.exit(-1);
        }  //tej klamry {}mozna nie dac, ale wykona sie tylko 1 nastepna instrukcja- to nie jest dobre

        String server;

        if (args.length < 1) {
            server = "localhost";
        } else {
            server = args[0];
        }

        System.out.println(server);




        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Wspaniale");
                break;

            case 'B':
                System.out.println("Bardzo dobrze!");
                break;

            case 'C':
                System.out.println("Mogło być lepiej");
                break;

            default:
                System.out.println("Rozważ oszukiwanie");

        }


        if (grade=='A') {
            System.out.println("Wspaniale");
        } else if (grade=='B'){
            System.out.println("Bardzo dobrze!");
        } else if (grade=='C'){
            System.out.println("Mogło być lepiej");
        } else {
            System.out.println("Rozważ oszukiwanie");
        }


        int myScore = 8;
        int yourScore  =  7;
        int bestScore;

        bestScore = myScore > yourScore ? myScore : yourScore;


    }
}
