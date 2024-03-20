package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1° Array -> Meses
        // 2° Array -> Dias

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 30;
        days[0][2] = 29;

        for (int index = 0; index < days.length; index++) {
            for (int axis = 0; axis < days[index].length; axis++) {
                System.out.println(days[index][axis]);
            }
        }

        for (int[] arrayBase : days) {
            for (int number : arrayBase) {
                System.out.println(number);
            }
        }

    }
}
