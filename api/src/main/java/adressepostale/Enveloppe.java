package adressepostale;

/**
 *
 */
public interface Enveloppe {
    
    Adresse newAdresse(
            Destinataire destinataire,
            Distribution distribution,
            Acheminement acheminement);
    

    Destinataire newDestinataire();
    

    Distribution newDistribution();
    

    Acheminement newAcheminement();
    

    /**
     * @param build
     */
    Enveloppe pour(
            Destinataire build);
    
}
