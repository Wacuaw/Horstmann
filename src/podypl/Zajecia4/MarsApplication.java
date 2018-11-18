package podypl.Zajecia4;

import podypl.MarsRobot;

public class MarsApplication {
    public static void main(String[] args) {


        podypl.Zajecia4.MarsRobot spirit2 = new podypl.Zajecia4.MarsRobot("oczekiwanie", 0, 0);
        podypl.Zajecia4.MarsRobot spirit3 = new podypl.Zajecia4.MarsRobot("eksploracja", 2, 20);



        spirit2.showAttributes();
        System.out.println("Zwiększamy prędkość do 3");

        spirit2.speed = 3;
        spirit2.showAttributes();

        System.out.println("zmiana temperatury na -90");
        spirit2.temperature = -90;

        spirit2.checkTemperature();
        spirit2.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.nazwa = "opportunity";
        opportunity.temperature = -20;
        opportunity.status = "renowation";
        opportunity.speed = 0;

        opportunity.showAttributes();
    }

}
