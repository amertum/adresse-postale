package adressepostale;

/**
 * qualité, titre, fonction.
 */
public interface DestinataireFactory {
    
    /**
     * @return
     */
    DestinataireFactory monsieur();
    

    DestinataireFactory madame();
    

    DestinataireFactory mademoiselle();
    

    DestinataireFactory nomme(
            String nom);
    

    DestinataireFactory prenomme(
            String prenom);
    

    Destinataire build();
    
}
