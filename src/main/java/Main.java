public class Main {
    public static void main(String[] args) {
        Flyable toyCopter = new Helicopter(5, "toy");
        toyCopter.fly();
    }

    interface Flyable {
        void fly();
    }

    static abstract class Copter implements Flyable{
        int weight;
    }

    private static class Helicopter extends Copter {

        private final String model;

        public Helicopter(int weight, String model) {
            this.weight = weight;
            this.model = model;
            System.out.println("Created Helicopter with weight " + weight + ", model: " + model);
        }

        public void fly() {
            System.out.println("Helicopter is flying!");
        }
    }
}
