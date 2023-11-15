package com.campusdual.exercisespoo;

import org.json.simple.JSONObject;

public class Perro {
    int altura;
    boolean esDePeloLargo;
    String raza;
    String nombre;
    String color;
    int peso;
    boolean estaDormido = false;

    public Perro(int altura, boolean esDePeloLargo, String raza, String nombre, String color, int peso) {
        this.altura = altura;
        this.esDePeloLargo = esDePeloLargo;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }

    public Perro(JSONObject obj){
        this.altura = Math.toIntExact((long) obj.get("altura"));
        this.esDePeloLargo = (boolean) obj.get("esDePeloLargo");
        this.raza = (String) obj.get("raza");
        this.nombre = (String) obj.get("nombre");
        this.color = (String) obj.get("color");
        this.peso = Math.toIntExact((long) obj.get("peso"));
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isEsDePeloLargo() {
        return esDePeloLargo;
    }

    public void setEsDePeloLargo(boolean esDePeloLargo) {
        this.esDePeloLargo = esDePeloLargo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEstaDormido() {
        return estaDormido;
    }

    public void setEstaDormido(boolean estaDormido) {
        this.estaDormido = estaDormido;
    }

    public void ladrar(){
        if (!this.estaDormido) {
            System.out.println(this.nombre + ": Guau! Guau!");
        } else {
            System.out.println(this.nombre + "está durmiendo...");
        }
    }

    public String tengoPeloLargo(){
        String mensaje;
        if (this.esDePeloLargo){
            mensaje = " y tengo el pelo largo";
        } else {
            mensaje = " y tengo el pelo corto";
        }
        return mensaje;
    }

    public void presentarse(){
        if (!this.estaDormido) {
            System.out.println(this.nombre + ": Me llamo " + this.nombre + ", soy un perro de la raza " + this.raza.toLowerCase() + ", mido " + this.altura + " cm de alto" + ", peso " + this.peso + " kg" + tengoPeloLargo() + " de color " + this.color.toLowerCase() + ".");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void grunhir(){
        if (!this.estaDormido){
            System.out.println("Grrr");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void levantarPatita(){
        if (!this.estaDormido){
            System.out.println(this.nombre + " ha levantado la patita");
        } else {
            System.out.println(this.nombre + " está durmiendo...");
        }
    }

    public void dormirse(){
        if (this.estaDormido){
            System.out.println(this.nombre + " ya está durmiendo");
        } else {
            this.estaDormido = true;
            System.out.println(this.nombre + " se ha puesto a dormir");
        }
    }

    public void despertarse(){
        if (this.estaDormido){
            this.estaDormido = false;
            System.out.println(this.nombre + " se despertó");
        } else {
            System.out.println(this.nombre + " ya está despierto");
        }
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("altura", this.getAltura());
        jsonObject.put("esDePeloLargo", this.isEsDePeloLargo());
        jsonObject.put("raza", this.getRaza());
        jsonObject.put("nombre", this.getNombre());
        jsonObject.put("color", this.getColor());
        jsonObject.put("peso", this.getPeso());
        return jsonObject;
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro(90,false,"Husky","Balto","Blanco", 30);
        perro1.ladrar();
        perro1.presentarse();
        perro1.despertarse();

        System.out.println();

        Perro perro2 = new Perro(40, true, "Caniche", "Bobby", "Gris", 15);
        perro2.grunhir();
        perro2.presentarse();
        perro2.dormirse();
        perro2.levantarPatita();
        perro2.despertarse();
        perro2.levantarPatita();
    }
}
