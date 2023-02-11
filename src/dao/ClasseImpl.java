package dao;

import entity.Classe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClasseImpl implements IClasse {
    private final Connection con;

    public ClasseImpl() {
        DB db = new DB();

        this.con = db.getConnection();
    }

    @Override
    public int add(Classe classe) {
        Statement p;
        String sql = "Insert into classe (nom, effectif) values ('"+classe.getNom()+"',"+classe.getEffectif()+")";
        try{
            p = con.createStatement();
            p.executeUpdate(sql);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int update(Classe classe) {
        Statement p;
        String sql = "UPDATE classe SET nom = '"+classe.getNom()+"', effectif = "+classe.getEffectif()+" WHERE  idc = "+classe.getId()+"";
        try{
            p = con.createStatement();
            p.executeUpdate(sql);
            return 1;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(int id) {
        Statement p;
        String sql = "Delete from classe where idc="+id+"";
        try{
            p = con.createStatement();
            p.executeUpdate(sql);
            return 1;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        //return 0;
    }

    @Override
    public List<Classe> list() {
        Statement p;
        List<Classe> listClasse = new ArrayList<>();
        String sql = "SELECT * FROM classe";
        try{
            p = con.createStatement();
            ResultSet tab = p.executeQuery(sql);
            while(tab.next())
            {
                Classe cl = new Classe();
                cl.setId(tab.getInt("idc"));
                cl.setNom(tab.getString("nom"));
                cl.setEffectif(tab.getInt("effectif"));
                listClasse.add(cl);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return listClasse;
    }

    @Override
    public Classe get(int id) {
        return null;
    }
}
