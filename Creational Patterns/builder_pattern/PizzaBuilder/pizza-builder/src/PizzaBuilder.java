public class PizzaBuilder implements IBuilder {
    private Pizza pizza = new Pizza();

    public IBuilder setCheese(String value){
        pizza.setCheese(value);
        return this;
    };
    public IBuilder setChicken(boolean value){
        pizza.setChicken(value);
        return this;
    };
    public IBuilder setMeat (boolean value){
        pizza.setMeat(value);
        return this;
    };
    public IBuilder setMushroom (boolean value){
        pizza.setMushroom(value);
        return this;
    };
    public IBuilder setOlive (boolean value){
        pizza.setOlive(value);
        return this;
    };
    public IBuilder setTomato (boolean value){
        pizza.setTomato(value);
        return this; 
    };
    public IBuilder setVegetable (boolean value ){
        pizza.setVegetable(value);
        return this;
    };
    public IBuilder setWhite_Sauce (boolean value){
        pizza.setWhite_Sauce(value);
        return this;
    };
    public IBuilder setAnchovy (boolean value){
        pizza.setAnchovy(value);
        return this;
    };
    public IBuilder setName (String value) {
        pizza.setName(value);
        return this;
    }

    public Pizza build(){
        return pizza;
    };
}
