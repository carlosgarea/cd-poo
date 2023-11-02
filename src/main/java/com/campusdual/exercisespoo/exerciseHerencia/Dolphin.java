package com.campusdual.exercisespoo.exerciseHerencia;

public class Dolphin extends Fish{
    protected String scientificName;
    protected String animalName;
    protected String territory;
    protected String sound;
    public Dolphin(int height, int weight, int age, String waterType, int depth, String scientificName,
                   String animalName, String territory, String sound) {
        super(height, weight, age, waterType, depth);
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
