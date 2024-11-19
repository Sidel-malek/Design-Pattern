public class UniversalRemote extends RemoteControl{

  private static int currentChannel = 1;

  public UniversalRemote(Device device) {
    super(device);
    device.turnOn();
  }
  
  @Override
  public void nextChannel() {
    if (currentChannel < 100) {
        currentChannel++;
    } else {
        currentChannel = 1; // Wrap around to the first channel if reaching the maximum
    }
    device.setChannel(currentChannel);
   }
   @Override
  public void precedentChannel() {
    if (currentChannel > 1) {
        currentChannel--;
    } else {
        currentChannel = 100; // Wrap around to the first channel if reaching the maximum
    }
    device.setChannel(currentChannel);
   }


}
