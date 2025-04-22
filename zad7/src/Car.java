public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void getNumberOfSeats() {
        System.out.println(numberOfSeats);
    }

    @Override
    public void start() {
        System.out.println("Auto zostało uruchomione");
    }

    @Override
    public void stop() {
        System.out.println("Auto zostało zatrzymane");
    }
}
