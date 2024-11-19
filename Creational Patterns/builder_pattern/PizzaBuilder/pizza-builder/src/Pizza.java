import java.util.ArrayList;
import java.util.List;
public class Pizza {
    private boolean tomato; 
    private boolean  olive;
    private boolean white_Sauce;
    private boolean  chicken;
    private boolean  meat;
    private boolean mushroom;
    private boolean vegetable;
    private String cheese;
    private boolean anchovy;
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAnchovy(boolean anchovy) {
        this.anchovy = anchovy;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public void setOlive(boolean olive) {
        this.olive = olive;
    }
    public void setWhite_Sauce(boolean white_Sauce) {
        this.white_Sauce = white_Sauce;
    }
    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }
    public void setMeat(boolean meat) {
        this.meat = meat;
    }
    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }
    public void setVegetable(boolean vegetable) {
        this.vegetable = vegetable;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }


    
    public String toString(){
        List <String> menu = new ArrayList<>();
        if (tomato==true){
            menu.add("tomato");
        }
        if (olive==true){
            menu.add("olive");
        }
        if (chicken==true){
            menu.add("chicken");
        }
        if (cheese!=null ){
            menu.add(cheese);
        }
        if (anchovy==true){
            menu.add("anchovy");
        }
        if (vegetable==true){
            menu.add("vegetable");
        }
        if (meat==true){
            menu.add("meat");
        }
        if (mushroom==true){
            menu.add("muchroom");
        }
        if (white_Sauce==true){
            menu.add("white_sauce");
        }
       
        

        return " Pizza "+name+" " + menu+" .";
    }
} 