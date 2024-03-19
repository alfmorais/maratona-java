package academy.devdojo.maratonajava.introducao;

public class Aula05SwithExercicio {
    public static void main(String[] args) {
        byte day = 1;
        // TODO: Refactory me Plz :(

        switch (day) {
            case 1:
                System.out.println("Domingo - Final de Semana");
                break;
            case 2:
                System.out.println("Segunda-Feira - Útil");
                break;
            case 3:
                System.out.println("Terça-Feira - Útil");
                break;
            case 4:
                System.out.println("Quarta-Feira - Útil");
                break;
            case 5:
                System.out.println("Quinta-Feira - Útil");
                break;
            case 6:
                System.out.println("Sexta-Feira - Útil");
                break;
            case 7:
                System.out.println("Sábado - Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
