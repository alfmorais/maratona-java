package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        while (count < 10) {
            System.out.println("while: " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("do-while: " + ++count);
        } while (count < 10);

        for (int index = 1; index <= 10; index++) {
            System.out.println("For: " + index);
        }
    }
}