public interface IBuilder {

    public IBuilder setModel(String model);
    public IBuilder setBrand_name (String name);
    public IBuilder setColor (String color);
    public IBuilder setEngine (String engine);

    Car build();
    
}
