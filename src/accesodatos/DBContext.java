/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {

    private Connection conexion;

    public DBContext() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri = "jdbc:mysql://localhost:3306/dulce_hogar";
            String user = "root";
            String pass = "ProgramacionAlgoritmos2024_";
            conexion = DriverManager.getConnection(uri, user, pass);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}
