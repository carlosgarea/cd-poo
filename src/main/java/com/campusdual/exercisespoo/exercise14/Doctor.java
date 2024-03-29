package com.campusdual.exercisespoo.exercise14;

public class Doctor extends Person{
    private String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        System.out.println(this.getName() + " " + this.getSurname() + ", especialista en " + this.getSpecialization().toLowerCase());
    }
}
