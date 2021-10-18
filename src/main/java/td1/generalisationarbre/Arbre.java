package td1.generalisationarbre;

import java.util.Set;

public interface Arbre<T>{
    int taille();
    boolean contient( final T val);
    Set<T> valeurs();
}
