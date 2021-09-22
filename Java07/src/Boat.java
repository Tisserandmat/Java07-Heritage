public class Boat extends Vehicle{

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    String doStuff() {
        return "je suis " + this.getBrand() + " et fait glou glou !";
    }


}
