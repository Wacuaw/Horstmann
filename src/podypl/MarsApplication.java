package podypl;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit  = new MarsRobot();
        spirit.nazwa = "spirit";
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Zwiększamy prędkość do 3");

        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("zmiana temperatury na -90");
        spirit.temperature = -90;

        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.nazwa = "opportunity";
        opportunity.temperature = -20;
        opportunity.status = "renowation";
        opportunity.speed = 0;

        opportunity.showAttributes();
    }

}
