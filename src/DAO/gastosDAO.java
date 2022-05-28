/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BD.Conexion;
import BL.gastosBL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class gastosDAO {
  private Conexion conexion = new Conexion();
//     //UPDATE
    
    public  boolean actualizarDocente(gastosBL gasto) throws SQLException{
        boolean fueEditado = false;
        
        Connection conn = conexion.conectar();
        try{
           String sql = "UPDATE gastos SET tipodegasto='?',valor='?',fecha='?' WHERE id='?'";
           PreparedStatement stmt = conn.prepareStatement(sql);
         
            stmt.setString(1, gasto.getTipodegasto());
            stmt.setInt(2, gasto.getGasto());
            stmt.setDate(3, gasto.getFecha());
           
           System.out.println(stmt);
           
           int cantidad = stmt.executeUpdate();
           
           fueEditado = (cantidad > 0);
           
        } catch (Exception e){
            System.out.println("ERROR AL ACTUALIZAR: " + e.getMessage());
        }finally{
            conn.close();
        }
        return fueEditado;
        
        
    }
    
    //DELETE
    
     public boolean eliminarG(int id) throws SQLException{
         
        boolean fueEliminado = false;
        
        Connection conn = conexion.conectar();
        
        try {
            String sql = "DELETE FROM gastos WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            //validacion corta
            fueEliminado = (ps.executeUpdate()>0);
                    
        } catch (Exception e) {
            System.out.println("ERROR AL ELIMINAR: "+e.getMessage());
        } finally {
            conn.close();
        }
        return fueEliminado;
    }
}
