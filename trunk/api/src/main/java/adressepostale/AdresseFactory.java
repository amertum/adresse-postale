package adressepostale;

/**
 *
 */
public interface AdresseFactory {
    
    Adresse newAdresse(
            Destinataire destinataire,
            Distribution distribution,
            Acheminement acheminement);
    
}
