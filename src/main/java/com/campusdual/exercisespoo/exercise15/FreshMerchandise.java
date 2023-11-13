package com.campusdual.exercisespoo.exercise15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise{

    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat();
    public FreshMerchandise(String name, String uniqueID, String responsibleID) {
        super(name, uniqueID, responsibleID);
    }

    public FreshMerchandise(String name, String uniqueID, String responsibleID, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueID, responsibleID, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidade: ");
        builder.append(sdf.format(this.getExpirationDate()));
        return builder.toString();
    }
    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }

    public static void main(String[] args) {
        FreshMerchandise fM = new FreshMerchandise("Mazás", "001-9", "Froitería de Onte S.L.",
                8, "C", "114D", 53, Calendar.getInstance().getTime());
        fM.printSpecificData();
    }
}
