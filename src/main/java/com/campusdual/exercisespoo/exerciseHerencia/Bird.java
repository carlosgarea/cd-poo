package com.campusdual.exercisespoo.exerciseHerencia;

public class Bird extends Animal{
    protected String featherColor;
    protected int maxFlightHeight;
    public Bird(int height, int weight, int age, String featherColor, int maxFlightHeight) {
        super(height, weight, age);
        this.featherColor = featherColor;
        this.maxFlightHeight = maxFlightHeight;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public int getMaxFlightHeight() {
        return maxFlightHeight;
    }

    public void setMaxFlightHeight(int maxFlightHeight) {
        this.maxFlightHeight = maxFlightHeight;
    }
}
