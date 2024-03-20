package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alfredo";
        person.age = 31;
        person.sex = 'M';

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
    }
}
