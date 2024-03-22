package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class Car {
    public String name;
    public String model;
    public int manufacturerYear;

    public Car(String name, String model, int manufacturerYear) {
        this.name = name;
        this.model = model;
        this.manufacturerYear = manufacturerYear;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }
}
