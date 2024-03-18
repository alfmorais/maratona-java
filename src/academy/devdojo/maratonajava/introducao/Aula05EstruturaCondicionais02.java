package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && 18 categoria juvenil
        // idade >= 18 categoria aduldo
        int age = 16;
        boolean conditionToPlayInfantil = age < 15;
        boolean conditionToPlayJuvenil = age >= 15 && age < 18;
        String category;

        if (conditionToPlayInfantil) {
            category = "Categoria Infantil";
        } else if (conditionToPlayJuvenil) {
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulto";
        }

        System.out.println(category);

        // condição Ternário: condition ? verdadeiro: falso;
        double salary = 6000;
        String firstMessage = "Eu vou investir em Bitcoin";
        String secondMessage = "Eu não vou investir em Bitcoin";
        String result = salary > 7000 ? firstMessage : secondMessage;
        System.out.println(result);
    }
}
