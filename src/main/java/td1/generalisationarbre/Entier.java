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

}
