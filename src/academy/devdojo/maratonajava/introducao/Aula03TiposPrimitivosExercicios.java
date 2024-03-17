package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicios {
    // Pratica:
    // Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    // Eu <nome> morando no endereço <endereço>,
    // confirmo que recebi o salário de <salário>, na data <data>
    public static void main(String[] args) {
        String name = "Alfredo";
        String address = "Avenida São Jerônimo, 2750. Morada do Sol, Americana-SP";
        double salary = 6000.50F;
        String date = "17/03/2024";

        String report = "Eu " + name + " morando no endereço " + address + ",";
        String secondReport = "confirmo que recebi o salário de " + salary + ", na data " + date;

        System.out.println(report);
        System.out.println(secondReport);
    }
}
