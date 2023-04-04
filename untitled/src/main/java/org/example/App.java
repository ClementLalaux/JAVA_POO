package org.example;

import org.example.Exercice1.Chaises;
import org.example.Exercice3.Student;
import org.example.Exercice3.Teacher;
import org.example.Exercice6.Door;
import org.example.Exercice6.House;
import org.example.Exercice6.Person;

/**
 * Hello world!
 *
 */


public class App
{
    public static void main( String[] args )
    {
        Door door = new Door();
        door.setColor("red");

        House house = new House(70,door);

        Person person = new Person("Clement",house);
        person.display();
    }
}
