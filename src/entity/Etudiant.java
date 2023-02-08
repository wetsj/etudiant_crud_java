package entity;

public class Etudiant {
    //Attributs
    private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private double moyenne;
    private Classe classe;

    //methodes sans argument
    public Etudiant() {
    }

    //methodes avec arguments
    public Etudiant(String nom, String prenom, double moyenne, Classe classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
        this.classe = classe;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public Classe getClasse() {
        return classe;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    //methodes qui genere le matricule= ET@+anneemoisjourheureminutesecondes+nom de la classe+#
    public String generateMatricule(){
        return null;
    }
}
