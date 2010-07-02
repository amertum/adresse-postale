package adressepostale;

/**
 *
 */
public interface ComplexeAdresse
        extends Adresse {
    
    Destinataire getDestinataire();
    

    Distribution getDistribution();
    

    Acheminement getAcheminement();
    
}
