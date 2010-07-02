package adressepostale.destinataire;

import adressepostale.util.MotSimple;

/**
 * @see "http://fr.wikipedia.org/wiki/Titre_de_civilité"
 */
public enum Titre
        implements MotSimple {
    
    NONE(""),
    VEUVE("veuve"),
    DOCTEUR("docteur"),
    MAITRE("maitre"),
    PROFESSEUR("professeur");
    
    Titre(
            final String mot)
    {
        this.mot = mot;
    }
    

    public String getSingulier()
    {
        return this.mot;
    }
    

    private final String mot;
    
}
