package com.campusdual.exercisespoo.exercise15;

public abstract class Merchandise {

    protected String name;
    protected String uniqueID;
    protected String responsibleID;
    protected int zone;
    protected String area;
    protected String shelf;
    protected int quantity;

    public Merchandise(String name, String uniqueID, String responsibleID){
        this.name = name;
        this.uniqueID = uniqueID;
        this.responsibleID = responsibleID;
    }

    public Merchandise(String name, String uniqueID, String responsibleID, int zone, String area, String shelf, int quantity) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.responsibleID = responsibleID;
        this.zone = zone;
        this.area = area;
        this.shelf = shelf;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getResponsibleID() {
        return this.responsibleID;
    }

    public void setResponsibleID(String responsibleID) {
        this.responsibleID = responsibleID;
    }

    public int getZone() {
        return this.zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getLocation(){
        StringBuilder builder = new StringBuilder();
        builder.append("Z - ");
        builder.append(this.getZone());
        builder.append(" A - ");
        builder.append(this.getArea());
        builder.append(" E - ");
        builder.append(this.getShelf());
        return builder.toString();
    }
    public abstract Object getSpecificData();
}
