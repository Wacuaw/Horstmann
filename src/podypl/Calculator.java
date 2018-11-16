package podypl;

public class Calculator {
    public static void main(String[] args) {


        int firstNumber = 5;
        int secondNumber = 8;

        addition(firstNumber, secondNumber);
        subtraction (firstNumber, secondNumber);
        multiplication (firstNumber, secondNumber);



    }




public static void addition (int firstNumber, int secondNumber){
        int additionResult = firstNumber+secondNumber;
    System.out.println("suma dodawania to " + additionResult);
    System.out.println("-----------------------------");

}


public static void subtraction (int firstNumber, int secondNumber){
        int subtractionResultFirst = firstNumber - secondNumber;
        int subtractionResultSecond = secondNumber - firstNumber;
    System.out.println("wyniki odejmowania to : " + subtractionResultFirst + " oraz " + subtractionResultSecond);
    System.out.println("-----------------------------");
}

public static void multiplication (int firstNumber, int secondNumber){
        int multiplicationResult = firstNumber*secondNumber;
    System.out.println("wynik mnożenia to : " + multiplicationResult);
    System.out.println("-----------------------------");

}



}
