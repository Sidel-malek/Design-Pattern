public class CarBuilder implements IBuilder {

    Car car = new Car();
    public IBuilder setModel(String model){
        car.setModel(model); 
        return this;
    };
    public IBuilder setBrand_name (String name){
        car.setBrand_name(name);
        return this;
    };
    public IBuilder setColor (String color){
        car.setColor(color);
        return this;
    };
    public IBuilder setEngine (String engine){
        car.setEngine(engine);
        return this;
    };

    public Car build(){
        return car;
    };

    
    
}
