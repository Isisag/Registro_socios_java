/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import accesodatos.DBContext;

public class CuentaDA {
    
        public ResultSet get(String rut) {
        DBContext dbCtx = new DBContext();
        String st = "SELECT COALESCE(SUM(valor_cuota), 0) AS total_aportado FROM cuenta WHERE rut = ? GROUP BY rut;";
        
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
    
    public int add(String rut, int numeroSocio, int valorCuota, int cantidadAportada) {
        DBContext dbCtx = new DBContext();
        String st = "INSERT INTO cuenta (rut, numero_socio, valor_cuota, cantidad_aportada) VALUES (?,?,?,?)";

        int rs;
        try {
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setString(1, rut);
            pst.setInt(2, numeroSocio);
            pst.setInt(3, valorCuota);
            pst.setInt(4, cantidadAportada);

 
            rs = pst.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
    
        public int update(String rut, int valor_cuota) {
        DBContext dbCtx = new DBContext();
        String st = "UPDATE cuenta SET valor_cuota = ? WHERE rut = ?";
        int rs;
        try {
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setInt(1, valor_cuota);
            pst.setString(2, rut);
            rs = pst.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
    
}
