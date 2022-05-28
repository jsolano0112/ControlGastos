/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BL;


import java.sql.Date;

/**
 *
 * @author HP
 */
public class gastosBL {
    int id, gasto;
    Date fecha;
    String tipodegasto;

    public gastosBL() {
    }

   

    public gastosBL(int gasto, Date fecha, String tipodegasto) {
        this.gasto = gasto;
        this.fecha = fecha;
        this.tipodegasto = tipodegasto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipodegasto() {
        return tipodegasto;
    }

    public void setTipodegasto(String tipodegasto) {
        this.tipodegasto = tipodegasto;
    }
}
