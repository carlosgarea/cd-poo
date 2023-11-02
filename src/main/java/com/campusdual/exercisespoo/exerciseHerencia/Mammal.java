package com.campusdual.exercisespoo.exerciseHerencia;

public class Mammal extends Animal{

    protected String hairColor;
    protected String infraclass;

    public Mammal(int height, int weight, int age, String hairColor, String infraclass) {
        super(height, weight, age);
        this.hairColor = hairColor;
        this.infraclass = infraclass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getInfraclass() {
        return infraclass;
    }

    public void setInfraclass(String infraclass) {
        this.infraclass = infraclass;
    }
}
