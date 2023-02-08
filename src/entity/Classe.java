package entity;

public class Classe {
    //Attributs
    private int id;
    private String nom;
    private int effectif;

    //methodes sans argument
    public Classe() {
    }

    //methodes avec argument
    public Classe(String nom) {
        this.nom = nom;
    }

    //getters


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getEffectif() {
        return effectif;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }
}
