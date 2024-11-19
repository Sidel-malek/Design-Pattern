public class InternetManager {
    private static InternetManager instance;
    public static boolean Isconnected ;

    private InternetManager() {   
    }
   
    public static synchronized InternetManager getInstance() {
        if (instance == null) {
            instance = new InternetManager();

        }
        return instance;
    }

    public void connect() {
        if (Isconnected) {
            System.out.println("vous avez déja connecter ");
        }

        else{

             Isconnected= true;
             System.out.println("connecting... ");
        }
       

    }

     public void disconnect() {
        if (Isconnected) {
            System.out.println("disconnecting ");
            Isconnected= false;
        }

        else{
           System.out.println("vous avez déja disconnecter"); 
        }
        

    }

}
