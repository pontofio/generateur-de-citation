
/**
 * Décrivez votre classe QuantityIni ici.
 *
 * @author Fiona Pontoparia
 * @version (un numéro de version ou une date)
 */
public class QuantityIni
{
     private int quantityinitial;

    /**
     * a ConveyrBelt is defined by a maximal authorized  weight
     * @param maxWeight maximal authorized  weight
     */
    public QuantityIni(int quantityinitial) {
        this.quantityinitial = quantityinitial;
    }
    
    public int getQuantity(){
        return this.quantityinitial;
    }

}
