package podypl.Zajecia3;

public class Averager {
    public static void main(String[] args) {

        int sum = 0;

        if (args.length>0){

            for(int i = 0; i<args.length; i++){
                sum += Integer.parseInt(args[i]);
            }


            System.out.println("suma wynosi: " + sum);
            System.out.println("średnia wynosi: " + (double)sum/args.length);

        }else{
            System.out.println("Brak argumentow programu");
        }
    }
}


//tutaj sa potrzebne  argumenty funkcji/programu
