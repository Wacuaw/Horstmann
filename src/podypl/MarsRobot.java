package podypl;

public class MarsRobot implements Robot{
    public String status;
    public int speed;
    public float temperature;
    public  String nazwa;

//    public void checkTemperature(){
//        if (temperature < 80){
//            status = "turn on heater";
//            speed = 5;
//        }
//    }

    @Override
    public void checkStatus(){}
    public void checkTemperature(){ if (temperature < 80){
        status = "turn on heater";
        speed = 5;
    }}


    public void showAttributes(){
        System.out.println("nazwa: " + nazwa);
        System.out.println("status: " + status);
        System.out.println("temperatura: " + temperature);
        System.out.println("prędkość: " + speed);
    }
}
