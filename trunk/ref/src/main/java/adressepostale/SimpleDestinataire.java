package adressepostale;

import static java.util.Arrays.asList;

import java.util.List;

import adressepostale.logic.MotList;
import adressepostale.logic.MotMajuscule;

/**
 *
 */
public class SimpleDestinataire
        implements Destinataire {
    
    /**
     * Instantiates with ...
     * 
     * @param civilite
     * @param prenom
     * @param nom
     */
    public SimpleDestinataire(
            final String civilite,
            final String prenom,
            final String nom)
    {
        this.civilite = civilite;
        this.prenom = prenom;
        this.nom = nom;
    }
    

    /**
     * Instantiates with ...
     * 
     * @param prenom
     * @param nom
     */
    public SimpleDestinataire(
            final String prenom,
            final String nom)
    {
        this(null, prenom, nom);
    }
    

    /**
     * Instantiates with ...
     * 
     * @param nom
     */
    public SimpleDestinataire(
            final String nom)
    {
        this(null, nom);
    }
    

    /**
     * @see adressepostale.Destinataire#getCivilite()
     */
    public String getCivilite()
    {
        return this.civilite;
    }
    

    /**
     * @see adressepostale.Destinataire#getPrenom()
     */
    public String getPrenom()
    {
        return this.prenom;
    }
    

    /**
     * @see adressepostale.Destinataire#getNom()
     */
    public String getNom()
    {
        return this.nom;
    }
    

    /**
     * @see adressepostale.Ligneable#getLignes()
     */
    public List<String> getLignes()
    {
        final List<String> lignes = asList(new MotList(asList(
                new MotMajuscule(this.civilite),
                new MotMajuscule(this.prenom),
                new MotMajuscule(this.nom))).asLigne());
        
        return lignes;
    }
    

    private final String civilite;
    
    private final String prenom;
    
    private final String nom;
    
}
