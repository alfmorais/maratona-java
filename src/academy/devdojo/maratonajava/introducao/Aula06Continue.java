package academy.devdojo.maratonajava.introducao;

public class Aula06Continue {
    public static void main(String[] args) {
        double totalAmount = 30_000;

        for (int installment = (int) totalAmount; installment >= 1; installment--) {
            double installmentAmount = totalAmount / installment;
            boolean conditionToStop = installmentAmount < 1000;

            if (conditionToStop) {
                continue;
            }
            System.out.println("Parcela " + installment + " R$ " + installmentAmount);
        }
    }
}