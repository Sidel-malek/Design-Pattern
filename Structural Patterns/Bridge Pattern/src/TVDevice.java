public class TVDevice implements Device {

    @Override
    public void turnOn() {
        System.out.println("television turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("television turned off");
    }

    @Override
    public void setChannel(int channel) {
       System.out.println("TV Channel changed to: \" " + channel);
    }
    public void mute() {
        System.out.println("tv muted" );
     }
    
}
