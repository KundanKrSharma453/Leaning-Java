package Introduction_And_Setup_01.Features_02;

public class ObjectOrientedDemo_02 {

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        car.display();
    }
}

class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Vehicle type: " + type);
    }
}
