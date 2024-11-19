public interface IBuilder {
    public IBuilder setCheese(String value);
    public IBuilder setChicken(boolean value);
    public IBuilder setMeat (boolean value);
    public IBuilder setMushroom (boolean value);
    public IBuilder setOlive (boolean value);
    public IBuilder setTomato (boolean value);
    public IBuilder setVegetable (boolean value );
    public IBuilder setWhite_Sauce (boolean value);
    public IBuilder setAnchovy(boolean value);
    public IBuilder setName (String value);


  
    Pizza build();
}
