package com.campusdual.exercisespoo.exerciseHerencia;

public class Animal {
    protected int height;
    protected int weight;
    protected int age;
    public Animal(int height, int weight, int age){
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("¡La altura no puede ser negativa! Introduce un número mayor que 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("¡El peso no puede ser negativo! Introduce un número mayor que 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("¡La edad no puede ser negativa! Introduce un número mayor que 0");
        }
    }
    // Animal: Altura Peso Edad
    // Mamíferos, aves y peces: 2 características únicas de estos animales [colorPelaje, infraclase] [colorPlumaje, alturaVueloMax] [tipoAgua, profundidad]
    // Perro, Caballo, Halcón, Pollo, Delfín, Orca: nombre científico, nombre del animal, territorio donde viven, sonido del animal
    // Todos los animales pueden presentarse: ONOMATOPEYA DEL SONIDO (NOMBRE DEL ANIMAL)
}
