package td1.arbres;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Noeud implements Arbre{

    private final List<Arbre> fils;

    public Noeud(final List<Arbre> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int val = 0;
        for (final Arbre a : fils) {
            val = val+ a.taille();
        }
        return val;
    }

    @Override
    public boolean contient(Integer val) {
        boolean rtr = false;
        for (final Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> val = new TreeSet<>();
        for (final Arbre a : fils) {
            val.addAll(a.valeurs());
        }
        return val;
    }

    @Override
    public Integer somme() {
        int sum = 0;
        for (final Arbre a : fils) {
            sum+=  a.somme();
        }
        return sum;
    }

    @Override
    public Integer min() {
        TreeSet<Integer> val = new TreeSet<>();
        for (final Arbre a : fils) {
            val.add(a.min());
        }
        return val.first();
    }


    @Override
    public Integer max() {
        TreeSet<Integer> val = new TreeSet<>();
        for (final Arbre a : fils) {
            val.add(a.max());
        }
        return val.last();
    }

    @Override
    public boolean estTrie() {}
}
