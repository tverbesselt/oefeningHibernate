/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Infrastructure.DAL.DABase;
import BO.Lokaal;
import DAL.Interfaces.IDaLokaal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 11640
 */
class DaLokaal extends DABase implements IDaLokaal {

    String selectAllSQL = "SELECT * FROM tbl_lokalen";
    String selectByIDSQL = "SELECT * FROM tbl_lokalen WHERE ID=?";
    String deleteByIDSQL = "DELETE FROM tbl_lokalen WHERE ID=?";
    String insertSQL = "INSERT INTO tbl_lokalen (naam,aantalplaatsen) VALUES (?,?)";
    String updateSQL = "UPDATE tbl_lokalen SET naam=?, aantalplaatsen=? WHERE ID=?";
    String GetAantalPLaatsen = "SELECT aantalplaatsen FROM tbl_lokalen WHERE ID=?";

    @Override
    public void opslaan(Lokaal l) {
        try {
            Connection conn = this.GetConnection();
            PreparedStatement s = null;
            if (l.getID() > 0) {
                //update
                s = conn.prepareStatement(updateSQL);
                s.setInt(2, l.getID());

            } else {
                //insert
                s = conn.prepareStatement(insertSQL);

            }
            s.setString(0, l.getNaam());
            s.setInt(1, l.getAantalPersonen());
            s.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void verwijderen(int ID) {
        try {
            Connection conn = this.GetConnection();
            PreparedStatement s = conn.prepareStatement(deleteByIDSQL);
            s.setInt(0, ID);
            s.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Lokaal> allesOphalen() {
        List<Lokaal> result = new ArrayList<>();
        try {
            Connection conn = this.GetConnection();
            PreparedStatement s = conn.prepareStatement(selectAllSQL);

            ResultSet rs = s.executeQuery();

            while (rs.next()) {
                Lokaal l = new Lokaal();
                l.setAantalPersonen(rs.getInt("aantalPlaatsen"));
                l.setID(rs.getInt("Id"));
                l.setNaam(rs.getString("naam"));
                result.add(l);
            }

            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public Lokaal ophalen(int Id) {

        try {
            Connection conn = this.GetConnection();
            PreparedStatement s = conn.prepareStatement(selectByIDSQL);
            s.setInt(0, Id);
            ResultSet rs = s.executeQuery();
            Lokaal l = new Lokaal();
            while (rs.next()) {

                l.setAantalPersonen(rs.getInt("aantalPlaatsen"));
                l.setID(rs.getInt("Id"));
                l.setNaam(rs.getString("naam"));

            }

            conn.close();
            return l;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public int AantalCursistenInLokaalOphalen(int lokaalID) {
        try {
            Connection conn = this.GetConnection();
            PreparedStatement s = conn.prepareStatement(GetAantalPLaatsen);
            s.setInt(0, lokaalID);
            ResultSet rs = s.executeQuery();
            rs.next();
            conn.close();
            return rs.getInt("aantalPlaatsen");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

}
