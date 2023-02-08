package Main;

import dao.ClasseImpl;
import entity.Classe;

public class Main {
    public static void main(String[] args) {
        /*DB db = new DB();
        db.getConnection();*/
        ClasseImpl clI = new ClasseImpl(cnx);
        Classe cl = new Classe();
        cl.setNom("L5gl");
        cl.getEffectif(0);
        clI.add(cl);
    }
}