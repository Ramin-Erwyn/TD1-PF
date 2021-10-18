package td1.generalisationarbre;

public class Entier implements Sommable<Entier>{
    private Integer valeur;


    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public int valeur() {
        return valeur;
    }
    @Override
    public Entier sommer(Entier autre) {
        return new Entier(this.valeur() + autre.valeur());
    }
    @Override
    public boolean equals(Object o) { //generer
        if (o == null) return false;
        if (!(o instanceof Entier)) return false;
        return this.valeur == ((Entier)o).valeur;
    }

    @Override
    public int hashCode() { //generer
        return valeur.hashCode();
    }

}
