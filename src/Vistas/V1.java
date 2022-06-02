/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import BD.Conexion;
import BL.gastosBL;
import DAO.gastosDAO;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class V1 extends javax.swing.JFrame {

    private Conexion Conexion = new Conexion();
    Connection conn = Conexion.conectar();
    ArrayList<gastosBL> gastoArr = null;

    /**
     * Creates new form V1
     */
    public V1() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajadeopcion = new javax.swing.JComboBox<>();
        txtvalor = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btneditar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        campofecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajadeopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de gasto", "Transporte", "Comida", "Teléfono" }));

        txtvalor.setText("Valor");
        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor acumulado de gastos:");

        txtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "FECHA", "TIPO DE GASTO", "VALOR"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        campofecha.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("¿Qué día?");

        btnlimpiar.setText("limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajadeopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnlimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnagregar)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(campofecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(btneditar)
                                .addGap(32, 32, 32)
                                .addComponent(btnborrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajadeopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campofecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnlimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnborrar)
                            .addComponent(btneditar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        int indice = tabla.getSelectedRow();
        gastosDAO gDao = new gastosDAO();
        gastosBL gst = this.gastoArr.get(indice);

        try {
            System.out.println("Id: " + tabla.getValueAt(indice, 0).toString());
            gst.setId(Integer.parseInt(tabla.getValueAt(indice, 0).toString()));
            gst.setTipodegasto(tabla.getValueAt(indice, 1).toString());
            gst.setGasto(Integer.parseInt(tabla.getValueAt(indice, 2).toString()));
//            gst.setFecha(tabla.getValueAt(indice, 3).toString());
        

            if (gDao.actualizarDocente(gst)) {
                JOptionPane.showMessageDialog(this, "SE ACTUALIZÓ CORRECTAMENTE");
                this.mostrarDatos();

            } else {
                JOptionPane.showMessageDialog(this, "HA OCURRIDO UN ERROR");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Actualizando: "+e.getMessage());
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        String tipodegasto = cajadeopcion.getSelectedItem().toString();
        int valorGasto = Integer.parseInt(txtvalor.getText());
        String fecha = ((JTextField) campofecha.getDateEditor().getUiComponent()).getText();

        gastosBL gst = new gastosBL(valorGasto, Date.valueOf(fecha), tipodegasto);

        try {
            String sql = "INSERT INTO gastos (tipodegasto, valor, fecha) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, tipodegasto);
            stmt.setInt(2, valorGasto);
            stmt.setDate(3, gst.getFecha());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
                mostrarDatos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR GASTO: " + e.getMessage());
        }


    }//GEN-LAST:event_btnagregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed

        int indice = tabla.getSelectedRow();

        gastosDAO gDao = new gastosDAO();
        gastosBL gst = this.gastoArr.get(indice);

        try {
            int resp = JOptionPane.showConfirmDialog(this, "¿ELIMINARÁS ESTOS DATOS?");

            if (resp == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM gastos WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, gst.getId());

                //validacion corta
                if(ps.executeUpdate() > 0){
                   JOptionPane.showMessageDialog(this, "SE ELIMINÓ CORRECTAMENTE");
                
                }                
                    
            } else if (resp == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "NO SE ELIMINÓ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Borrando: "+e.getMessage());
        }
//        this.mostrarDatos();
//        int fila = tabla.getSelectedRowCount();
//        if(fila < 1){
//            JOptionPane.showMessageDialog(this, "Seleccione un registro de la tabla");
//            
//       }// else{
//            if(gDao.deleteDatos(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())>0);
//            mostrarDatos();
//        }
     
    }//GEN-LAST:event_btnborrarActionPerformed

        /*Funcion limpiar*/
    public void limpiar() {
        cajadeopcion.setSelectedIndex(0);
        txtvalor.setText("");
    }

    /*Funcion mostrar datos*/
    private void mostrarDatos() {
        //Se modela la tabla  especificamente colummnas
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("#");
        modelo.addColumn("FECHA");
        modelo.addColumn("TIPO DE GASTO");
        modelo.addColumn("VALOR");

        tabla.setModel(modelo);

        String[] fila = new String[4];

        try {

            String sql = "SELECT id, tipodegasto, valor, fecha  FROM gastos";
            PreparedStatement pt = conn.prepareStatement(sql);
            ResultSet result = pt.executeQuery();

            while (result.next()) {

                fila[0] = result.getString(1);
                fila[1] = result.getString(4);
                fila[2] = result.getString(2);
                fila[3] = result.getString(3);

                modelo.addRow(fila);

            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la consulta: " + e);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> cajadeopcion;
    private com.toedter.calendar.JDateChooser campofecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtotal;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
