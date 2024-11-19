public class Car {
    private String color ;
    private String brand_name ;
    private String engine ;
    private String model ;

   
   
    public void setColor (String color){
        this.color = color;
    };
    public void setBrand_name (String name){
        this.brand_name = name;
    };
    public void setEngine (String engine){
        this.engine = engine;
    };
    public void setModel(String model){
        this.model = model;
    };
    public String toString() { 
        return "Car [Model: " + model + ", Engine: " + engine + ", Color: " + color + ", Brand name: "+brand_name+"]";
    }


}
