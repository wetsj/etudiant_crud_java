package dao;

import entity.Classe;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class ClasseImpl implements IClasse {
    private final Connection cnx;

    public ClasseImpl() {

        this.cnx = cnx;
    }

    @Override
    public int add(Classe classe) {
        Statement stm;
        String sql = "Insert into classe (nom, effectif) values ('"+classe.getNom()+"',"+classe.getEffectif()+"");

        try{
            stm = cnx.createStatement();
            stm.executeUpdate(sql);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int update(Classe classe) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Classe> list() {
        return null;
    }

    @Override
    public Classe get(int id) {
        return null;
    }
}
