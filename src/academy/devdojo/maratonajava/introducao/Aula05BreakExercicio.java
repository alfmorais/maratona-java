package academy.devdojo.maratonajava.introducao;

public class Aula05BreakExercicio {
    public static void main(String[] args) {
        double totalAmount = 30_000;

        for (int installment = 1; installment <= totalAmount; installment++) {
            double installmentAmount = totalAmount / installment;
            boolean conditionToStop = installmentAmount >= 1000;

            if (conditionToStop) {
                System.out.println("Parcela " + installment + " R$ " + installmentAmount);
            } else {
                break;
            }
        }
    }
}
