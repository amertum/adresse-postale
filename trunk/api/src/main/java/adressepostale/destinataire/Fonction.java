package adressepostale.destinataire;

import adressepostale.util.MotSimple;

/**
 *
 */
public enum Fonction
        implements MotSimple {
    
    NONE(""),
    SECRETAIRE("secretaire"),
    PRESIDENT("president"),
    DIRECTEUR("directeur");
    
    Fonction(
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
