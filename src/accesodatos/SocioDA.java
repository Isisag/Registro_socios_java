/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import accesodatos.DBContext;

public class SocioDA {

    public ResultSet get(String rut) {
        DBContext dbCtx = new DBContext();
        String st = "SELECT rut, numero_socio, nombre, appaterno, apmaterno, correo ,domicilio ,region ,ciudad ,comuna ,telefono FROM socio WHERE rut = ?";
        ResultSet rs;
        try {
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setString(1, rut);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

    public int add(
            String rut,
            int numSocio,
            String nombre,
            String appaterno,
            String apmaterno,
            String correo,
            String domicilio,
            String region,
            String ciudad,
            String comuna,
            String telefono) {
        DBContext dbCtx = new DBContext();
        String st = "INSERT INTO socio (rut, numero_socio, nombre, appaterno, apmaterno, correo ,domicilio ,region ,ciudad ,comuna ,telefono) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        int rs;
        try {
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setString(1, rut);
            pst.setInt(2, numSocio);
            pst.setString(3, nombre);
            pst.setString(4, appaterno);
            pst.setString(5, apmaterno);
            pst.setString(6, correo);
            pst.setString(7, domicilio);
            pst.setString(8, region);
            pst.setString(9, ciudad);
            pst.setString(10, comuna);
            pst.setString(11, telefono);

            rs = pst.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }

}
