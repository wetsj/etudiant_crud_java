package Main;

import dao.*;
import entity.Classe;

public class Main {
    public static void main(String[] args) {
        //Connection a la base de donnee
        /*DB db = new DB();
        db.getConnection();*/

        //Ajouter une classe a la base de donnee
        /*ClasseImpl clI = new ClasseImpl();
        Classe cl = new Classe();
        cl.setNom("L1gl");
        cl.setEffectif(0);
        clI.add(cl);*/

        //Supprimer une classe dans la base de donnee par l'id
        /*ClasseImpl clI = new ClasseImpl();
        Classe cl = new Classe();
        clI.delete(3);*/

        //Modifier une classe dans la base de donnee
        ClasseImpl clI = new ClasseImpl();
        Classe cl = new Classe();
        cl.setId(1);
        cl.setNom("LpGL");
        cl.setEffectif(22);
        clI.update(cl);
    }
}