public class AccelerateMotocycle implements Command {
    private Motorcycle motorcycle;

    public AccelerateMotocycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void execute() {
        motorcycle.accelerateMotorcycle();
    }

    public void revert() {
        motorcycle.decelerate();
    }
}
