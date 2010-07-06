package adressepostale;

import static java.util.Arrays.asList;

import java.util.List;

import adressepostale.logic.MotList;
import adressepostale.logic.MotMajuscule;

/**
 *
 */
public class SimpleAcheminement
        implements Acheminement {
    
    /**
     * Instantiates with ...
     * 
     * @param codePostal
     * @param ville
     */
    public SimpleAcheminement(
            final String codePostal,
            final String ville)
    {
        this.codePostal = codePostal;
        this.ville = ville;
    }
    

    /**
     * @see adressepostale.Acheminement#getCodePostal()
     */
    public String getCodePostal()
    {
        return this.codePostal;
    }
    

    /**
     * @see adressepostale.Acheminement#getVille()
     */
    public String getVille()
    {
        return this.ville;
    }
    

    /**
     * @see adressepostale.Ligneable#getLignes()
     */
    public List<String> getLignes()
    {
        final List<String> lignes = asList(new MotList(asList(
                new MotMajuscule(this.codePostal),
                new MotMajuscule(this.ville))).asLigne());
        
        return lignes;
    }
    

    private final String codePostal;
    
    private final String ville;
    
}
