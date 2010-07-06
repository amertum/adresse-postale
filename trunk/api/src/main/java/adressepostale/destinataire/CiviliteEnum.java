package adressepostale.destinataire;


/**
 *
 */
public enum CiviliteEnum
// TODO implements Mot
{
    
    NONE(""),
    MONSIEUR("monsieur"),
    MADAME("madame"),
    MADEMOISELLE("mademoiselle");
    
    CiviliteEnum(
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
