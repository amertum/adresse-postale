package adressepostale;

/**
 *
 */
public interface AdresseBuilder {
    
    AdresseBuilder avecNom(
            String nom);
    

    AdresseBuilder avecDestinataire(
            Destinataire destinataire);
    

    AdresseBuilder avecDistribution(
            Distribution distribution);
    

    AdresseBuilder avecAcheminement(
            Acheminement acheminement);
    

    Adresse build();
    
}
