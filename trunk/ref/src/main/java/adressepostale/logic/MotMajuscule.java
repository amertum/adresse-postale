package adressepostale.logic;

import java.text.Normalizer;
import java.text.Normalizer.Form;

/**
 *
 */
public class MotMajuscule
        implements Mot {
    
    public MotMajuscule(
            final String texteOrigine)
    {
        this.texteOrigine = texteOrigine;
        
        this.texte = (this.texteOrigine == null)
                ? null
                : removeAccent(this.texteOrigine).toUpperCase();
    }
    

    /**
     * @see adressepostale.logic.Mot#getTexte()
     */
    public String getTexte()
    {
        return this.texte;
    }
    

    /**
     * @see adressepostale.logic.Mot#getTexteOrigine()
     */
    public String getTexteOrigine()
    {
        return this.texteOrigine;
    }
    

    private static String removeAccent(
            final String s)
    {
        final String noAccent = Normalizer.normalize(s, Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return noAccent;
    }
    

    private final String texte;
    
    private final String texteOrigine;
    
}
