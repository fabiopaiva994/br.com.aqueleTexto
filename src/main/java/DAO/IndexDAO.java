/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Index;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fabio
 */
public class IndexDAO {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/br.com.aqueletexto", "postgres", "ju1nior2");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public static int save(Index i) {
        int status = 0;
        try {
            Connection con = IndexDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO index (txtPrincipal, cabecalho) VALUES (?,?)");
            
            ps.setString(1, i.getTextoPrincipal());
            ps.setString(2, i.getCabecalho());
            

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }   
    
    public static Index BuscarTodos() {
        Index i = null;

        try {
            Connection con = IndexDAO.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from index");
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                i = new Index(rs.getInt(1), rs.getString(2), rs.getString(3));
                
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return i;
    }
}
