/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BD.Conexion;
import BL.gastosBL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        setTitle("CONTROL DE GASTOS"); //titulo de la ventana
//        this.getContentPane().setBackground(new Color(0,0,0)); color negro
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos();
        totalSuma();

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
        verMes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajadeopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de gasto", "Transporte", "Comida", "Teléfono" }));
        cajadeopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajadeopcionActionPerformed(evt);
            }
        });

        txtvalor.setText("Valor");
        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor acumulado de gastos:");

        txtotal.setEditable(false);
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

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        campofecha.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("¿Qué día?");

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        verMes.setText("Ver por tipo");
        verMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMesActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajadeopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campofecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verMes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnborrar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verMes)))
                    .addComponent(btnborrar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void txtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalActionPerformed


    }//GEN-LAST:event_txtotalActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        try {

            String sql = "UPDATE gastos SET tipodegasto=?,valor=?,fecha=? WHERE id=?";
            int filaSeleccionada = tabla.getSelectedRow();
            String dao = (String) tabla.getValueAt(filaSeleccionada, 0);
            PreparedStatement stmt = conn.prepareStatement(sql);

            int selecciona = cajadeopcion.getSelectedIndex();
            stmt.setString(1, cajadeopcion.getItemAt(selecciona));
            stmt.setString(2, txtvalor.getText());
            stmt.setString(3, ((JTextField) campofecha.getDateEditor().getUiComponent()).getText());
            stmt.setString(4, dao);

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrarDatos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR GASTO: " + e.getMessage());
        }

    }//GEN-LAST:event_btneditarActionPerformed


    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        try {
            String sql = "INSERT INTO gastos (tipodegasto, valor, fecha) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
//            do{
                  int selecciona = cajadeopcion.getSelectedIndex();
                  stmt.setString(1, cajadeopcion.getItemAt(selecciona));
//            }while(cajadeopcion!="Tipo de gasto");
          
            stmt.setString(2, txtvalor.getText());
            stmt.setString(3, ((JTextField) campofecha.getDateEditor().getUiComponent()).getText());

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
        int filaSeleccionada = tabla.rowAtPoint(evt.getPoint());
        cajadeopcion.setSelectedItem(tabla.getValueAt(filaSeleccionada, 2).toString());

        txtvalor.setText(tabla.getValueAt(filaSeleccionada, 3).toString());

//        String b =  ((JTextField) campofecha.getDateEditor().getUiComponent()).getText();
//        campofecha.setDate(tabla.getValueAt(filaSeleccionada, 1));
    }//GEN-LAST:event_tablaMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
        gastosBL enti = new gastosBL();
        try {
            int resp = JOptionPane.showConfirmDialog(this, "Desea eliminar el registro: " + enti.getId() + "?");
            if (resp == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM gastos WHERE id = " + tabla.getValueAt(filaSeleccionada, 0);
                PreparedStatement stmt = conn.prepareStatement(sql);

                int cantidad = stmt.executeUpdate();

                if (cantidad > 0) {
                    JOptionPane.showMessageDialog(this, "DATOS ELIMINADOS CORRECTAMENTE");
                    mostrarDatos();
                }
            } else {
                JOptionPane.showMessageDialog(this, "CANCELADO CORRECTAMENTE");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR GASTO: " + e.getMessage());
        }

    }//GEN-LAST:event_btnborrarActionPerformed

    private void verMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMesActionPerformed
        V2 segundaVentana = new V2();
        segundaVentana.setVisible(true);
    }//GEN-LAST:event_verMesActionPerformed

    private void cajadeopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajadeopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajadeopcionActionPerformed

    /*Funcion limpiar*/
    public void limpiar() {
        cajadeopcion.setSelectedIndex(0);
        txtvalor.setText("");
//        campofecha.setText("//");

    }

    /*Funcion mostrar total*/
    public void totalSuma() {
        try {
            String sql = "SELECT sum(valor) AS sumaTotal FROM gastos;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            String resultado = "sumaTotal";
            
            if(rs.next()){
                txtotal.setText(rs.getString(1));
            }
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR VALOR TOTAL: " + e.getMessage());
        }

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
            totalSuma();
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
    private javax.swing.JButton verMes;
    // End of variables declaration//GEN-END:variables
}
