package adressepostale;

/**
 *
 */
public class AdresseFactoryUtils {
    
    public static Adresse newAdresse(
            final Destinataire destinataire,
            final Distribution distribution,
            final Acheminement acheminement)
    {
        final Adresse adresse = new SimpleAdresse(destinataire, distribution, acheminement);
        return adresse;
    }
    

    public static Destinataire newDestinataire(
            final String nom)
    {
        final Destinataire destinataire = new SimpleDestinataire(nom);
        return destinataire;
    }
    

    public static Destinataire newDestinataire(
            final String prenom,
            final String nom)
    {
        final Destinataire destinataire = new SimpleDestinataire(prenom, nom);
        return destinataire;
    }
    

    public static Destinataire newDestinataire(
            final String civilite,
            final String prenom,
            final String nom)
    {
        final Destinataire destinataire = new SimpleDestinataire(civilite, prenom, nom);
        return destinataire;
    }
    

    public static Distribution newDistribution(
            final String numero,
            final String typeRue,
            final String rue)
    {
        final Distribution distribution = new SimpleDistribution(numero, typeRue, rue);
        return distribution;
    }
    

    public static Acheminement newAcheminement(
            final String codePostal,
            final String ville)
    {
        final Acheminement acheminement = new SimpleAcheminement(codePostal, ville);
        return acheminement;
    }
    
}
