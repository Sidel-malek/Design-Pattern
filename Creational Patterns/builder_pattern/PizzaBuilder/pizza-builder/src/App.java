public class App {
    public static void main(String[] args) throws Exception {
        IBuilder builder = new PizzaBuilder();
        Manufactor manufactor = new Manufactor();
        Pizza pizza = manufactor.Cheesy(builder);
        System.out.println("You passed command about :"+pizza);
    }
}
