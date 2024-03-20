package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10, 25};
        int[] houseNumbers = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10, 25};

        // Foreach Example
        for (int index : numbers) {
            System.out.println(index);
        }

        for (int number : numbers) {
            for (int houseNumber : houseNumbers) {
                System.out.println("number: " + number + " house number: " + houseNumber);
            }
        }
    }
}
