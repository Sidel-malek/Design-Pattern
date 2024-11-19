public class App {
    public static void main(String[] args) throws Exception {
        Device tv = new TVDevice();
        Device radio = new RadioDevice();
        Device dvd = new DVDDevice();

        RemoteControl remote = new UniversalRemote(tv);
        remote.mute();
        remote.nextChannel();
       

        remote = new UniversalRemote(radio);
        remote.mute();
        remote.nextChannel();
        

        remote = new UniversalRemote(dvd);
        remote.mute();
        remote.nextChannel();
       
    }
}
