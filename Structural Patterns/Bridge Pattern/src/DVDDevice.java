public class DVDDevice implements Device{

    @Override
    public void turnOn() {
        System.out.println("DVD turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("DVD turned off");
    }

    @Override
    public void setChannel(int channel) {
       System.out.println("DVD player changed to: \" " + channel);
    }
    @Override
    public void mute() {
       System.out.println("DVD muted" );
    }
    
}
