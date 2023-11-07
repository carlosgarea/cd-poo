package com.campusdual.exercisespoo.exercise16;

public class Plane implements IMachine{
    protected String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El avión está apagado");
    }

    @Override
    public void maintenance() {
        System.out.println("El avión está en mantenimiento");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails(){
        return "La marca del avión es: " + this.getName();
    }
    public void takeOff(){
        System.out.println("El avión está despegando");
    }
    public void land(){
        System.out.println("El avión está aterrizando");
    }
    public void fly(){
        System.out.println("El avión está volando");
    }
}
