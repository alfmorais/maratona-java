package academy.devdojo.maratonajava.introducao;

public class Aula05ForExercicio {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 1_000_000; counter++){
            boolean conditionToPrintNumber = counter % 2 == 0;

            if (conditionToPrintNumber){
                System.out.println(counter);
            }
        }
    }
}
