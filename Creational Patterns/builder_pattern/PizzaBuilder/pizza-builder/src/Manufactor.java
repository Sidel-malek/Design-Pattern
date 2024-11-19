public class Manufactor {
    public Pizza Napoletana(IBuilder build){
            return build.setName("Napoletana").setTomato(true).setOlive(true).setAnchovy(true).build();
    }
    public Pizza  White(IBuilder build){
            return build.setName("White").setWhite_Sauce(true).setCheese("cheese").setChicken(true).build();

    };
    public Pizza  Chicken(IBuilder build){
            return build.setName("Chicken").setTomato(true).setOlive(true).setChicken(true).build();

    };
    public Pizza  Meaty(IBuilder build){
            return build.setName("Meaty").setTomato(true).setMeat(true).setChicken(true).build();

    };
    public Pizza  Forest(IBuilder build){
            return build.setName("Forest").setTomato(true).setCheese("cheese").setMushroom(true).setOlive(true).build();

    };
    public Pizza  Vegetarian(IBuilder build){   
             return build.setName("Vegetarian").setTomato(true).setVegetable(true).build();
    };
    public Pizza  Cheesy(IBuilder build){
            return build.setName("Cheesy").setWhite_Sauce(true).setCheese("chees1, cheese2, cheese3, cheese4").build();

    };
    
}
