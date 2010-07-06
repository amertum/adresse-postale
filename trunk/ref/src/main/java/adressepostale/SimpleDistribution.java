package adressepostale;

import static java.util.Arrays.asList;

import java.util.List;

import adressepostale.logic.MotList;
import adressepostale.logic.MotMajuscule;

/**
 *
 */
public class SimpleDistribution
        implements Distribution {
    
    /**
     * Instantiates with ...
     * 
     * @param numero
     * @param typeRue
     * @param rue
     */
    public SimpleDistribution(
            final String numero,
            final String typeRue,
            final String rue)
    {
        this.numero = numero;
        this.typeRue = typeRue;
        this.rue = rue;
    }
    

    /**
     * @see adressepostale.Distribution#getNumero()
     */
    public String getNumero()
    {
        return this.numero;
    }
    

    /**
     * @see adressepostale.Distribution#getTypeRue()
     */
    public String getTypeRue()
    {
        return this.typeRue;
    }
    

    /**
     * @see adressepostale.Distribution#getRue()
     */
    public String getRue()
    {
        return this.rue;
    }
    

    /**
     * @see adressepostale.Ligneable#getLignes()
     */
    public List<String> getLignes()
    {
        final List<String> lignes = asList(new MotList(asList(
                new MotMajuscule(this.numero),
                new MotMajuscule(this.typeRue),
                new MotMajuscule(this.rue))).asLigne());
        
        return lignes;
    }
    

    private final String numero;
    
    private final String typeRue;
    
    private final String rue;
    
}
