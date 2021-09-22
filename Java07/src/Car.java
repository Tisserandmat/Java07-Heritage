public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    String doStuff() {
        return "je suis " + this.getBrand() + " et fait vroum vroum !";
    }
}
