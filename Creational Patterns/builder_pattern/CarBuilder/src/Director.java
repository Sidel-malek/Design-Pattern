public class Director {
    public Car SportCar(IBuilder builder){
        return builder.setBrand_name("BMW M8").setColor("green").setEngine("V8").setModel("sport car").build();  
    }
    public Car Bus(IBuilder builder){
        return builder.setBrand_name("Mercedes-Benz").setColor("gray").setEngine("Diesel").setModel("familliale car").build();  
    }
    public Car BerlineCar(IBuilder builder){
        return builder.setBrand_name("BMW 3").setColor("red").setEngine("six-cylinder").setModel("tourrist car").build();  
    }
}
