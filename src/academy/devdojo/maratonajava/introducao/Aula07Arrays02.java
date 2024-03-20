package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Padrão de inicialização de um objeto array
        // byte, short, int, long, float and double == 0
        // char "\u0000" == ' '
        // boolean == false
        // String == null
        String[] names = new String[3];

        names[0] = "Alfredo";
        names[1] = "Denise";
        names[2] = "Joaquim";

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
