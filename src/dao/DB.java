package dao;

import entity.Classe;

import java.sql.*;

public class DB {
    private final String server="localhost";
    private final String username="root";
    private final String password="";
    private final String bd="etudiant_app";
    private final String url="" + "jdbc:mysql://" + server + ":3306/" + bd;
    private Connection cnx;
    private PreparedStatement pstm;
    private ResultSet rs;
    private int ok;

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url,username,password);
            System.out.println("Connecte .......");
        }catch (Exception e){
            cnx = null;
            System.out.println("Erreur connexion .......");
        }
        return cnx;
    }
    public void initPrepar(String sql){}
    public ResultSet executeSelect(){
        return null;
    }
    public int executeMaj(){
        return 0;
    }
    public void closeConnection(){}
    public PreparedStatement getPstm(){
        return null;
    }

}
