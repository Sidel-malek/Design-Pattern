public class App {
   
        public static void main(String[] args) {
            Motorcycle motorcycle = new Motorcycle();
            GostRider gostRider = new GostRider();
    
            Command accelerateCommand = new AccelerateMotocycle(motorcycle);
            gostRider.takeAction(accelerateCommand);
    
            // ... other actions
    
            gostRider.revertAction(); // Undo acceleration
        }
    
}
