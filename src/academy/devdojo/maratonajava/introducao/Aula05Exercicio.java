package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        System.out.println("Exercicio");

        double salary = 70_000;
        boolean firstCondition = salary > 0 && salary <= 34_712;
        boolean secondCondition = salary >= 34_713 && salary <= 68_507;
        String message;

        if (firstCondition) {
            message = "You will pay 9.70% of Tax";
        } else if (secondCondition) {
            message = "You will pay 37.35% of Tax";
        } else {
            message = "You will pay 49.50% of Tax";
        }

        System.out.println(message);
    }
}
