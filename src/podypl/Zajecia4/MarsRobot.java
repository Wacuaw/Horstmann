package podypl.Zajecia4;

import podypl.Robot;

public class MarsRobot implements Robot{
    public String status;
    public int speed;
    public float temperature;
    public  String nazwa;


    MarsRobot (String status, int speed, float temperature){
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }


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
