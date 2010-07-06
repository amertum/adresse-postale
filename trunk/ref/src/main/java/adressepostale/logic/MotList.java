package adressepostale.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class MotList {
    
    public MotList(
            final List<? extends Mot> mots)
    {
        this.motList = mots;
    }
    

    public List<String> getMots()
    {
        final List<String> list = new ArrayList<String>();
        
        for (final Mot mot : this.motList) {
            if ((mot.getTexte() != null) && !mot.getTexte().isEmpty()) {
                list.add(mot.getTexte());
            }
        }
        
        return list;
    }
    

    public String asLigne()
    {
        String ligne = "";
        
        final Iterator<String> motIter = this.getMots().iterator();
        while (motIter.hasNext()) {
            final String mot = motIter.next();
            
            final String space = motIter.hasNext()
                    ? " "
                    : "";
            ligne += (mot + space);
        }
        
        return ligne;
    }
    

    private final List<? extends Mot> motList;
    
}
