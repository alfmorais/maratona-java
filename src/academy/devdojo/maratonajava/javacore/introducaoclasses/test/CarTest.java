package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car civic = new Car("Civic", "lxs 1.8 MT", 2011);
        Car palio = new Car("Palio", "1.0 MT Fire", 2002);

        System.out.println(civic.name);
        System.out.println(civic.model);
        System.out.println(civic.manufacturerYear);
        System.out.println(palio.name);
        System.out.println(palio.model);
        System.out.println(palio.manufacturerYear);
    }
}
