package adressepostale;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 *
 */
public class BasicAdresseIT {
    
    @Test
    public void testSimpleAdresse()
    {
        final List<String> lignes = AdresseFactoryUtils.newAdresse(
                AdresseFactoryUtils.newDestinataire("Arsène", "Lupin"),
                AdresseFactoryUtils.newDistribution("5", "rue", "du chat"),
                AdresseFactoryUtils.newAcheminement("75001", "paris")).getLignes();
        assertThat(lignes).containsExactly("ARSENE LUPIN", "5 RUE DU CHAT", "75001 PARIS");
        
        Arrays.asList("Arsène Lupin Baron Raoul de Limézy chef de la Sûreté");
        Arrays.asList("Doe");
        Arrays.asList("John Doe");
        Arrays.asList("Monsieur John Doe");
        Arrays.asList("Monsieur John Doe", "Professeur du lycée Machin");
        Arrays.asList("Docteur John Doe");
        Arrays.asList("Monsieur John Doe", "Médecin psychiatre");
        Arrays.asList("John Doe", "Société Pomme");
        Arrays.asList("John Doe", "Société Pomme Service achats");
        Arrays.asList("Société Pomme", "Service achats");
        Arrays.asList("Monsieur Le directeur", "Société Pomme");
        
        Arrays.asList("le président-directeur général de la société Untel");
        Arrays.asList("le gérant du magasin");
        Arrays.asList("président de la République");
        Arrays.asList("ministre de la Santé");
    }
    

    @Test
    @Ignore
    public void testMakeAdressePourParticulier()
    {
        final Enveloppe enveloppe = mock(Enveloppe.class);
        
        final DestinataireFactory dest = mock(DestinataireFactory.class);
        //enveloppe.aMonsieur("john", "doe").enQualiteDe("docteur").etFonction("psychiatre").build();
        
        enveloppe.pour(dest.monsieur().prenomme("john").nomme("doe").build());
        
        final Adresse adresse = mock(Adresse.class);
        //        final Adresse adresse = adresseFactory.newAdresse(
        //                adresseFactory.newDestinataire("m", "john", "doe"),
        //                adresseFactory.newDistribution("5", "rue", "du chat"),
        //                adresseFactory.newAcheminement("75001", "paris"));
        
        final Destinataire destinataire = adresse.getDestinataire();
        final Distribution distribution = adresse.getDistribution();
        final Acheminement acheminement = adresse.getAcheminement();
        
        for (final String ligne : adresse.getLignes()) {
            System.out.println(ligne);
        }
    }
    
}
