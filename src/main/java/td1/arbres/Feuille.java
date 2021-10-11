package td1.arbres;
import java.util.Set;

public class Feuille implements Arbre {

    private final int val;

    public Feuille(final int val) {
        this.val = val;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final Integer val) {
        return val.equals(val);
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(val);
    }

    @Override
    public Integer somme() {
        return val;
    }

    @Override
    public Integer min() {
        return val;
    }

    @Override
    public Integer max() {
        return val;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}