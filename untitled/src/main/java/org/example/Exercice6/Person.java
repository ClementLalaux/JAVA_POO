package org.example.Exercice6;

public class Person {

    public String nom;
    public House house;

    public Person(String nom, House house) {
        this.nom = nom;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", house=" + house +
                '}';
    }
}
