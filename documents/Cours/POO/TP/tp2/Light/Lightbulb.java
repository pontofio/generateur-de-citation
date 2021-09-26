
/**
 * Décrivez votre classe Lightbulb ici.
 *
 * @author Fiona Pontoparia
 * @version (un numéro de version ou une date)
 */
public class Lightbulb
{
    // variables d'instance
    private int power;
    private String color;
    private String etat;
    private boolean on;
    private boolean off;

    /**
     * Variation de la puissance de l'ampoule
     * @param power la puissance voulu
     */
    public int getPower(int power)
    {
        return this.power = power;
    }

    /**
     * Méthode de changement de couleur
     *
     * @param  color la couleur voulue
     *
     */
    public String getColor(String color)
    {
        return this.color = color;
    }
    
    /**
     * Méthode pour savoir l'état de l'ampoule
     *
     *
     */
    public String isOn(){
        return "L'ampoule est " + etat;
    }
    
    /**
     * Méthode pour allumer l'ampoule
     *
     *
     */
    public void on(){
        this.on = true;
        this.off = false;
        this.etat = "allumée";
    }
    /**
     * Méthode pour éteindre l'ampoule
     *
     *
     */
    public void off(){
        this.on = false;
        this.off = true;
        this.etat = "éteinte";
    }
    
    /**
     * Méthode pour savoir l'état complet de l'ampoule
     *
     *
     */public String toString(){
        if (etat == "allumée"){
            return "L'ampule est " + etat + " la puissance est de" +power +" et la couleur est" +color;
        }
        else 
        {
            return "L'ampoule est " + etat;
        }
    }
    
}
