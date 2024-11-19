public class ConcreteBuilder implements builder{
    private Product pro = new Product();

    public void setName (String name){
        pro.setName(name);
    }
    public void setPrice (float price){
        pro.setPrice(price);
    }
    public void setColor (String color){
        pro.setColor(color);
    }
    
    public Product build(){
        return pro;
    }
    
    
}
