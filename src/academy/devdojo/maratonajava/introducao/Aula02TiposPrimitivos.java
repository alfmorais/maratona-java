package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos Primitivos:
            1) int
            2) double
            3) float
            4) char
            5) byte
            6) short
            7) long
            8) boolean
         */
        int age = 31;
        double salaryDouble = 2000;
        float salaryFloat = 2500.0f;
        char caracter = '\u0041';
        byte ageByte = 127;
        short ageShort = 32_000;
        long bigNumber = 10_000_000L;
        boolean isMoreThanEighteen = false;
        String name = "Alfredo";

        System.out.println("Idade (int): " + age);
        System.out.println("Salario (double): " + salaryDouble);
        System.out.println("Salario (float): " + salaryFloat);
        System.out.println("Letra (char): " + caracter);
        System.out.println("Idade (byte): " + ageByte);
        System.out.println("Idade (short): " + ageShort);
        System.out.println("Grande Número (long): " + bigNumber);
        System.out.println("Maior de 18 (boolean): " + isMoreThanEighteen);
        System.out.println("Nome (String): " + name);
    }
}
