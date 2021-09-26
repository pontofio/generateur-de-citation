
/**
 * Décrivez votre classe Marchandise ici.
 *
 * @author  Fiona Pontoparia
 */
public class Marchandise
{
    // variables d'instance 
    private double price;
    private String name;

    /**
     * Constructeur d'objets de classe Marchandise
     */
    public Marchandise()
    {
        // initialisation des variables d'instance
        this.price = price;
        this.name = name;
    }
     
    /**
     * Initialise le nom de la marchandise et le prix à 0.
     * 
     * @param name le nom de la marchandise
     */
    public void getName(String name){
        this.name = name;
        this.price = 0;
    }
    
    /**
     * Initialise le nom de la marchandise et son prix.
     * 
     * @param name le nom de la marchandise
     * @param price le prix de la marchandise
     */
    public void getPriceName (String name , double price){
        this.name = name;
        this.price = price;
    }
    
    /**
     * Donne le prix de la marchandise
     * 
     */
    public String getPrice (){
        return "Le prix de la marchandise est de "+ price +" .";
    }
    /**
     * Initialise le nom de la marchandise et le prix à 0.
     * 
     * @param name le nom de la marchandise
     */
    public void setPrice(float newPrice){
        this.price = newPrice;
    }
    /**
     * Donne le nom de la marchandise
     * 
     */
    public String getName (){
        return "Le nom de la marchandise est"+ name +" .";
    }
    /**
     * Donne le nom et le prix de la marchandise
     * 
     */
    public String toString (){
        return "the good " +name+ " cost " + price +" .";
    }
    
    /**
     * Donne le nom de la marchandise
     * 
     */
    public String tva (){
        this.price = price *0.8;
        return "prix avec tva " + price;
    }
}
