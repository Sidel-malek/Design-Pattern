public class RadioDevice implements Device {

    @Override
    public void turnOn() {
        System.out.println("radio turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("radio turned off");
    }

    @Override
    public void setChannel(int channel) {
       System.out.println("Radio Channel changed to: \" " + channel);
    }
    public void mute() {
        System.out.println("radio muted" );
     }
    
}
