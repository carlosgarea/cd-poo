package com.campusdual.exercisespoo.exerciseHerencia;

public abstract class Fish extends Animal{
    protected String waterType;
    protected int depth;
    public Fish(int height, int weight, int age, String waterType, int depth) {
        super(height, weight, age);
        this.waterType = waterType;
        this.depth = depth;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public abstract void introduce();
}
