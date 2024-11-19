public class GiftBuilder implements Builder {
    private Giftt gift = new Giftt() ;

    public void setRibonRed(Boolean ribonRed) {
        this.gift.setRibbonRed(ribonRed);
    }
    public void setRibonBlue(Boolean ribonBlue) {
        this.gift.setRibbonBlue(ribonBlue);
    }
    public void setWrapGreen(Boolean wrapGreen) {
        this.gift.setWrapGreen(wrapGreen);
    }
    public void setWrapPurple(Boolean wrapPurple) {
        this.gift.setWrapPurple(wrapPurple);
    }

    public Giftt build(){
        System.out.println("the ghift has decorated by " +gift.getRibbonBlue()+" "+ gift.getRibbonRed()+" "+ gift.getWrapGreen()+ " "+gift.getWrapPurple());
        return this.gift ;
    }
}
