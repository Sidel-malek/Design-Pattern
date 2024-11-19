public class App {
    public static void main(String[] args) throws Exception {
        IBuilder builder = new CarBuilder();
        Director director = new Director();
        Car car = director.SportCar(builder);
        System.out.println("the Car created is :"+ car);
 
        
        }
}
