package td1.generalisationarbre;

import java.util.Set;

public interface Arbre<T>{
    int taille();
    boolean contient( final T val);
    Set<T> valeurs();
    T somme(); // somme des valeurs
    T min();// à généraliser
    T max(); // à généraliser
    boolean estTrie(); // à généraliser
}
