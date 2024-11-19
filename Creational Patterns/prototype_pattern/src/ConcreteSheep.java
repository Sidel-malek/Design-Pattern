public class ConcreteSheep implements Sheep {
   String name;
   String modele ;
   
   public ConcreteSheep( String name ,String modele ) {
    
       this.name = name;
       this.modele = modele;
   }  
   
   public Sheep clone() {

       Sheep sheep = new ConcreteSheep( name, modele);
       return sheep;

   }

}
