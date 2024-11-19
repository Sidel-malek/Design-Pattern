import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Eemple 01
       Dog dog = new Dog.Builder("Buddy", "Labrador")
                .age(3)
                .toys(List.of("Ball", "Bone"))
                .build();

        // Accessing the Dog properties
        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Type: " + dog.getType());
        System.out.println("Dog Age: " + dog.getAge());
        System.out.println("Dog Toys: " + dog.getToys());

        // Exemple 02

        /*InternetManager internetManager = InternetManager.getInstance();

        internetManager.connect();

        internetManager.connect();

        internetManager.disconnect();

        internetManager.disconnect();*/
    } 

    }

