package podypl.Zajecia3;

public class HalsDollarsWithLoop {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000, 2_500_000, 1_000_000, 3432423};
        int[] philadelphia = {1_800_000, 5_000_000, 2_500_000, 0,0};
        int[] total = new int[denver.length];
        int average;
        int sum = 0;


//
//        philadelphia[0] = 1_800_000;
//        philadelphia[1] = 5_000_000;
//        philadelphia[2] = 2_500_000;



    /*    total[0] = denver[0]+philadelphia[0];
        total[1] = denver[1]+philadelphia[1];
        total[2] = denver[2]+philadelphia[2];
        */
        for (int i = 0; i<denver.length; i++){
            total[i] =  denver[i] + philadelphia[i];
            System.out.println("Produkcja w " + (2012 + i) + ": ");
            System.out.format("%,d%n", total[i]);
            sum += total[i];
        }

//        average = (total[1]+total[2]+total[0]) / total.length;


//        System.out.println("produkcja w 2012: ");
//        System.out.format("%,d%n", total[0]);
//        System.out.println("produkcja w 2013: ");
//        System.out.format("%,d%n", total[1]);
//        System.out.println("produkcja w 2014: ");
//        System.out.format("%,d%n", total[2]);
//        System.out.println("produkcja w 2015: ");
//        System.out.format("%,d%n", total[3]);
//        System.out.println("produkcja w 2016: ");
//        System.out.format("%,d%n", total[4]);

        average = sum / denver.length;
        System.out.println("Srednia produkcja wyniosla: ");
        System.out.format("%,d%n", average);


    }
}
