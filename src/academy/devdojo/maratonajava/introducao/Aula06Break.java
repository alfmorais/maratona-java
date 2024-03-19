package academy.devdojo.maratonajava.introducao;

public class Aula06Break {
    public static void main(String[] args) {
        int maxValue = 50;

        for (int counter = 0; counter <= maxValue; counter++) {
            boolean conditionToStopFor = counter > 25;

            if (conditionToStopFor) {
                break;
            }
            System.out.println(counter);
        }
    }
}
