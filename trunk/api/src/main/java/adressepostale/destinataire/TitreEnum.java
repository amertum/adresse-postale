package adressepostale.destinataire;


/**
 * @see "http://fr.wikipedia.org/wiki/Titre_de_civilité"
 */
public enum TitreEnum
// TODO implements Mot 
{
    
    NONE(""),
    VEUVE("veuve"),
    DOCTEUR("docteur"),
    MAITRE("maitre"),
    PROFESSEUR("professeur");
    
    TitreEnum(
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
