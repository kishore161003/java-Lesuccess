import java.util.Scanner;

class Vechicle {
    protected String type;

    Vechicle(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Type : " + this.type);
    }
}

class Car extends Vechicle {
    private String brand;

    Car(String type, String brand) {
        super(type);
        this.type = type;
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand : " + this.brand);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String brand = sc.next();
        Car car = new Car(type, brand);
        car.displayType();
        car.displayBrand();
    }

}
