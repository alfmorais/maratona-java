package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores: + - * /
        // Relacionais: % > < >= <= == !=
        // Lógico: && || !
        // Atribuição: = += -= *= /= %=
        int numberOne = 10;
        int numberTwo = 20;

        int sum = numberOne + numberTwo;
        int sub = numberOne - numberTwo;
        double mul = numberOne * numberTwo;
        double div = numberOne / (double) numberTwo;
        double res = numberOne % numberTwo;
        boolean biggerThan = numberTwo > numberOne;
        boolean lessThan = numberOne < numberTwo;
        boolean biggerOrEqualThan = numberTwo >= numberOne;
        boolean lessOrEqualThan = numberOne <= numberTwo;
        boolean isEqual = numberOne == numberTwo;
        boolean isDifferent = numberOne != numberTwo;
        boolean andOperation = true && true;
        boolean orOperation = true || false;
        boolean notOperation = !true;
        double bonus = 1800;
        double additionalBonus = 500;
        bonus += additionalBonus;
        bonus -= additionalBonus;
        bonus *= additionalBonus;
        bonus /= additionalBonus;

        int contador = 0;
        contador += 1;
        contador++;
        contador--;

        System.out.println("Soma: 10 + 20 = " + sum);
        System.out.println("Subtração: 10 - 20 = " + sub);
        System.out.println("Multiplicação: 10 * 20 = " + mul);
        System.out.println("Divisão: 10 / 20 = " + div);
        System.out.println("Resto: 10 % 20 = " + res);
        System.out.println("Maior que: 20 > 10 = " + biggerThan);
        System.out.println("Menor que: 10 < 20 = " + lessThan);
        System.out.println("Maior ou Igual a: 20 >= 10 = " + biggerOrEqualThan);
        System.out.println("Menor ou Igual a: 10 <= 20 = " + lessOrEqualThan);
        System.out.println("Igual: 10 == 20 = " + isEqual);
        System.out.println("Diferente de: 10 != 20 = " + isDifferent);
        System.out.println("And: true && true = " + andOperation);
        System.out.println("Or: true || false = " + orOperation);
        System.out.println("Not: !true = " + notOperation);
    }
}