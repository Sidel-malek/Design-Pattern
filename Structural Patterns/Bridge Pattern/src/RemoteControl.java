public abstract class RemoteControl {
    protected Device device ;
    

    public RemoteControl (Device device) {
        this.device = device;
    }

    public void powerOn () {
        this.device.turnOn();
    }
    public void powerOff () {
        this.device.turnOff();
    }
    public void mute () {
        this.device.mute();
    }

    public abstract void nextChannel();
    public abstract void precedentChannel();


}