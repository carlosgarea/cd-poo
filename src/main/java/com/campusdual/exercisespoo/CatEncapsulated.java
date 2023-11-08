package com.campusdual.exercisespoo;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "verde";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    // GETTERS Y SETTERS AUTOGENERADOS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

//    public void setColour(String colour) {
//        this.colour = colour;
//    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return this.eyeColour;
    }

    public int getAge() {
        return this.age;
    }

    //METODOS DEL EJERCICIO
    public void setColour(String colour) {
        this.colour = colour;
        System.out.println("Color de pelo cambiado a: " + this.colour);
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
        System.out.println("Color de ojos cambiado a: " + this.eyeColour);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("Edad cambiada a: " + this.age);
        } else {
            System.out.println("No se pudo establecer la edad introducida por ser negativa");
        }
    }

    //    public void castrate(){
//        if (this.castrated) {
//            System.out.println("El gato ya está castrado");
//        } else {
//            this.castrated = true;
//            System.out.println("Se ha castrado al gato");
//        }
//    }
    public Boolean isCastrated() {
        return this.castrated;
    }

    public String getSex() {
        return this.sex;
    }

    public String mensajeCastrated() {
        String mensaje;
        if (this.isCastrated()) {
            mensaje = "Está castrado";
        } else {
            mensaje = "No está castrado";
        }
        return mensaje;
    }

    public void catDetaisls() {
        System.out.println(this.getName() + " es " + this.getSex() + " de la raza " + this.getBreed() + " de " + this.getAge() +
                " meses, tiene el pelo " + this.getHair() + " de color " + this.getColour() + " y los ojos de color " +
                this.getEyeColour() + ". " + this.mensajeCastrated());
    }

    public static void main(String[] args) {
        CatEncapsulated gatoSiames = new CatEncapsulated("Bebeto", "siamesa", "macho", 36, "corto", "blanco", false);
        gatoSiames.catDetaisls();
        gatoSiames.setCastrated(true);
        gatoSiames.setColour("negro");
        gatoSiames.catDetaisls();
        System.out.println();

        CatEncapsulated gatoPersa = new CatEncapsulated("Max", "persa", "macho", 48, "largo", "marrón", false);
        gatoPersa.catDetaisls();
        gatoPersa.setCastrated(true);
        gatoPersa.setColour("naranja");
        gatoPersa.catDetaisls();
        System.out.println();

        CatEncapsulated gatoEsfinge = new CatEncapsulated("Cuca", "esfinge", "hembra", 24, "cortísimo", "gris", false);
        gatoEsfinge.catDetaisls();
        gatoEsfinge.setEyeColour("azul");
        gatoEsfinge.setAge(-1);
        gatoEsfinge.catDetaisls();
    }
    /*
    Crea una clase llamada Cat
    La clase debe tener las siguientes propiedades sin inicializar: nombre (name), raza (breed), sexo (sex),
    edad en meses (age), tamaño del pelo (hair), color del pelo (colour),
    un booleano que indique si está castrado/a o no (castrated)I
    La clase debe tener las siguientes propiedades con los valores inicializados
    - el color de los ojos (eyeColour): "green"
    Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos
    Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque
    Crea un método estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado
    Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)
    Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge (
    Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)
    Cámbiale el color del pelo a los dos primeros gatos
    Cámbiale el color de los ojos al último gato
    Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)
     */
}
