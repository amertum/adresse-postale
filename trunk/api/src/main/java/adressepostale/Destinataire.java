package adressepostale;

/**
 * L'identification du destinataire (nom, prénom, raison sociale, direction, service, numéro de
 * bureau ou d'appartement...)
 */
public interface Destinataire
        extends Ligneable {
    
    String getCivilite();
    

    String getPrenom();
    

    String getNom();
    
}
