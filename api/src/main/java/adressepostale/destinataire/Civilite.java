package adressepostale.destinataire;

import adressepostale.util.MotSimple;

/**
 *
 */
public enum Civilite
        implements MotSimple {
    
    NONE(""),
    MONSIEUR("monsieur"),
    MADAME("madame"),
    MADEMOISELLE("mademoiselle");
    
    Civilite(
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
