package adressepostale;

/**
 * Les informations de distribution postale (bâtiment, escalier, entrée, tour, numéro dans la voie,
 * type, nom de voie...)
 */
public interface Distribution
        extends Ligneable {
    
    String getNumero();
    

    String getTypeRue();
    

    String getRue();
    
}
