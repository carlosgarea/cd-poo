package com.campusdual.exercisespoo.exerciseHerencia;

public class Chicken extends Bird{
    protected String scientificName;
    protected String animalName;
    protected String territory;
    protected String sound;
    public Chicken(int height, int weight, int age, String featherColor, int maxFlightHeight, String scientificName,
                   String animalName, String territory, String sound) {
        super(height, weight, age, featherColor, maxFlightHeight);
        this.scientificName = scientificName;
        this.animalName = animalName;
        this.territory = territory;
        this.sound = sound;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void introduce (){
        System.out.println(getSound() + " (" + getAnimalName() + ")");
    }
}
