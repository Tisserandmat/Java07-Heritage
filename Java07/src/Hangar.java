public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 20);
        Boat yatch = new Boat("yatch", 300);

        System.out.println(clio.doStuff());
        System.out.println(yatch.doStuff());
    }
}
