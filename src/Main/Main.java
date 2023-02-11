package Main;

import dao.*;
import entity.Classe;

public class Main {
    public static void main(String[] args) {
        /*DB db = new DB();
        db.getConnection();*/
        ClasseImpl clI = new ClasseImpl();
        Classe cl = new Classe();
        cl.setNom("L3gl");
        cl.setEffectif(0);
        clI.add(cl);
    }
}