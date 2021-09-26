 /**
 * Décrivez votre classe Stock ici.
 *
 * @author Fiona Pontoparia
 * @version (un numéro de version ou une date)
 */
public class Stock
{
    //Les attributs de la classe Stock
    private int quantity;
    private QuantityIni quantityini;
    
    
    /**
     * @param quantité initiale
     */public Stock () {
        this.quantity = quantity ;
        this.quantityini = quantityini;
    }
    
    /**
     * Augmente la quantité d'un nombre demandé
     * 
     * @param NumAdd le nombre ajouté
     */public void add(int NumAdd) {
        this.quantity = NumAdd + quantity;
        System.out.println("La quantité retiré est de" + quantity + ".");
    }
    
    /**
     * Retire la quantité d'un nombre demandé
     * 
     * @param NumRemove le nombre retiré.
     */public void remove(int NumRemove) {
        if ( NumRemove <= quantity){
             this.quantity = quantity - NumRemove;
            System.out.println("La quantité retiré est de" + NumRemove + ".");

            }
        else {
            System.out.println("La quantité retiré est de " + quantity + ".");
            this.quantity = 0 ;
        }

            }
    /**
     * Retire la quantité d'un nombre demandé
     * 
     * @param NumRemove le nombre retiré.
     */
        public String toString() {
         return "the stock's quantity is " + quantity + " .";
      }

    /**
    * Recuperer la quantité initiale
    */
      public QuantityIni getQuantityIni(){
          return this.quantityini;
      }
}

