package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Alfredo";
        teacher.age = 41;
        teacher.sex = 'M';

        System.out.println("Name: " + teacher.name);
        System.out.println("Age: " + teacher.age);
        System.out.println("Sex: " + teacher.sex);
    }
}
