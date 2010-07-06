package adressepostale;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SimpleAdresse
        implements Adresse {
    
    public SimpleAdresse(
            final Destinataire destinataire,
            final Distribution distribution,
            final Acheminement acheminement)
    {
        this.destinataire = destinataire;
        this.distribution = distribution;
        this.acheminement = acheminement;
    }
    

    /**
     * @see adressepostale.Adresse#getDestinataire()
     */
    public Destinataire getDestinataire()
    {
        return this.destinataire;
    }
    

    /**
     * @see adressepostale.Adresse#getDistribution()
     */
    public Distribution getDistribution()
    {
        return this.distribution;
    }
    

    /**
     * @see adressepostale.Adresse#getAcheminement()
     */
    public Acheminement getAcheminement()
    {
        return this.acheminement;
    }
    

    /**
     * @see adressepostale.Adresse#getLignes()
     */
    public List<String> getLignes()
    {
        final List<String> lignes = new ArrayList<String>();
        
        lignes.addAll(this.destinataire.getLignes());
        lignes.addAll(this.distribution.getLignes());
        lignes.addAll(this.acheminement.getLignes());
        
        return lignes;
    }
    

    private final Destinataire destinataire;
    
    private final Distribution distribution;
    
    private final Acheminement acheminement;
    
}
