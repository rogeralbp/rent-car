/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admie21
 */
public class modificar_Modelo extends javax.swing.JFrame {

    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;
    
    /**
     * Creates new form modificar_Modelo
     */
    public modificar_Modelo() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void conexionDBRoger() {
        if (connection != null) {
            return;
        }

        String nombreBaseDatos="renta_vehiculos";//aqui va el nombre de la base de datos 
        String url = "jdbc:postgresql://localhost:5433/"+nombreBaseDatos;//este es el nombre de la base de datos
        String password = "Saborio17";//esta es la contraseña del postgrade deñ usuario
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,"postgres", password);//este es el nombre sel server
            if (connection != null) {
                System.out.println("Connecting to database... Base Datos Conectada "+nombreBaseDatos);
            }
        } catch (Exception e) {
            System.out.println("Problem when connecting to the database... No se Puede conectar la Base Datos "+nombreBaseDatos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textIdModelo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        modeloActual = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNuevoModelo = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificador Modelo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo Actual");

        jLabel4.setText("Nuevo Modelo");

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textIdModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(modeloActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(jButton1))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnGuardarCambios)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textIdModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modeloActual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnGuardarCambios)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu_Admnistrador ventanaRegresar = new Menu_Admnistrador();
        ventanaRegresar.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        String modeloBuscar=textIdModelo.getText();
        
        conexionDBRoger();
        try {

            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM modelo WHERE id_modelo='" +modeloBuscar+ "'");
            
            while (rs.next()) {
                
            String nombreModelo=rs.getString("nombre_modelo");
            modeloActual.setText(nombreModelo);
            }
            
        } catch (Exception e) {
            System.out.println("Problemas " + e);

        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        // TODO add your handling code here:
        conexionDBRoger();
        
        System.out.println("estamos en modificar modelo");
        
        try {
            
            String nuevoMarca=textNuevoModelo.getText();
            while(!(textNuevoModelo.getText().length()==0)){
            
            s = connection.createStatement();
            int z = s.executeUpdate("UPDATE modelo SET nombre_modelo = '"+nuevoMarca+"'  WHERE id_modelo = ' "+textIdModelo.getText()+" ' ");
            
            if (z == 1) {
            
                System.out.println("Se módificó el registro el modelo numero : "+textIdModelo.getText());
                JOptionPane.showMessageDialog(null,"Se módificó el registro de manera exitosa del modelo");
                textIdModelo.setText("");
                modeloActual.setText("");
                textNuevoModelo.setText("");
                
            }else {
                System.out.println("Error al modificar el registro");
                JOptionPane.showMessageDialog(null,"Error al modificar el registro");
            }
            
            }
            
        } catch (Exception e) {
            System.out.println("Problemas "+e);
        }
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(modificar_Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_Modelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel modeloActual;
    private javax.swing.JTextField textIdModelo;
    private javax.swing.JTextField textNuevoModelo;
    // End of variables declaration//GEN-END:variables
}
