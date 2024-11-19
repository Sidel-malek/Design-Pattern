public class App {
    public static void main(String[] args) throws Exception {
        builder builder = new ConcreteBuilder();
        Director dir = new Director();
        Product car = dir.construct(builder);
        System.out.println("Car created: " +car);
    }
}
