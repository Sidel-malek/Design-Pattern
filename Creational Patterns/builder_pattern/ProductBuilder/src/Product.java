public class Product {
    String name;
    float price;
    String color;

    public void setName(String name) {
        this.name=name;}
    public void setPrice(float price) {
        this.price=price;}
    public void setColor(String color) {
        this.color=color;}  
        
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", color=" + color + "]";
    }
}
