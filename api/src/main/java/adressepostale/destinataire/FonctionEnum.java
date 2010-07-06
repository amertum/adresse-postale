package adressepostale.destinataire;


/**
 *
 */
public enum FonctionEnum
// TODO implements Mot
{
    
    NONE(""),
    SECRETAIRE("secretaire"),
    PRESIDENT("president"),
    DIRECTEUR("directeur");
    
    FonctionEnum(
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
