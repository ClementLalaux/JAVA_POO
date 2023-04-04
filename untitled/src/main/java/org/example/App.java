package org.example;

import org.example.Exercice1.Chaises;
import org.example.Exercice3.Person;
import org.example.Exercice3.Student;
import org.example.Exercice3.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main()
    {

        Person personne = new Person();
        personne.hello();

        Student etudiant = new Student();
        etudiant.setAge(15);
        etudiant.hello();
        etudiant.DisplayAge();
        etudiant.goToClasses();

        Teacher prof = new Teacher();
        prof.setAge(40);
        prof.explain();
    }
}
