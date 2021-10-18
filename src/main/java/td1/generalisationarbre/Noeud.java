package td1.generalisationarbre;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T>> implements Arbre<T>{
    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }


    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        if (fils == null || fils.size() == 0)
            return null;
        T val = fils.get(0).somme();
        for (int i = 1; i<fils.size(); i++) {
            val = val.sommer(fils.get(i).somme());
        }
        return val;
    }

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T val = fils.get(0).min();
        for (int i = 1; i<fils.size(); i++) {
            T min = fils.get(i).min();

        }
        return val;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        T val = fils.get(0).max();
        for (int i = 1; i<fils.size(); i++) {
            T max = fils.get(i).max();

        }
        return val;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
