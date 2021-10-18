package td1.generalisationarbre;

public class Chaine implements Sommable<Chaine>{
    private String valeur;


    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    public String valeur() {
        return valeur;
    }

    @Override
    public Chaine sommer(Chaine autre) {
        return new Chaine(String.format("%s%s", this.valeur(), autre.valeur()));    }

}
