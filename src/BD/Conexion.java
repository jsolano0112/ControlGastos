/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class Conexion {
    private Connection Conexion;
    private String host= "localhost";
    private String usuario ="root";
    private String password="";
    private String nombreBD="controldegastos";
    private String url= "jdbc:mysql://"+host+"/"+nombreBD;
    
    public Connection conectar() {
        try{
            this.Conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
        } catch (Exception e){
            System.out.println("Error de conexión BD: "+ e.getMessage());
        }
        return this.Conexion;
    }
}
