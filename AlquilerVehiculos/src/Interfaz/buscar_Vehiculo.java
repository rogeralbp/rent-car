/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Anthonny
 */
public class buscar_Vehiculo extends javax.swing.JFrame {

    private DefaultListModel modelo;
    /**
     * Creates new form buscar_Vehiculo
     */
    public buscar_Vehiculo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("TIENDA DE VEHICULOS   ");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Azul.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Azul.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
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
        optMarca = new javax.swing.JRadioButton();
        optModelo = new javax.swing.JRadioButton();
        optEstilo = new javax.swing.JRadioButton();
        optTransmision = new javax.swing.JRadioButton();
        optAño = new javax.swing.JRadioButton();
        optPrecio = new javax.swing.JRadioButton();
        optTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaResultadosConsultas = new javax.swing.JList();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Vehiculo");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        optMarca.setText("Marca");
        optMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMarcaActionPerformed(evt);
            }
        });

        optModelo.setText("Modelo");
        optModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optModeloActionPerformed(evt);
            }
        });

        optEstilo.setText("Estilo");
        optEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optEstiloActionPerformed(evt);
            }
        });

        optTransmision.setText("Transmision");
        optTransmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTransmisionActionPerformed(evt);
            }
        });

        optAño.setText("Año");
        optAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAñoActionPerformed(evt);
            }
        });

        optPrecio.setText("Precio");
        optPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPrecioActionPerformed(evt);
            }
        });

        optTodos.setText("Todos");

        jScrollPane1.setViewportView(listaResultadosConsultas);

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(optTodos)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLimpiar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(optMarca)
                                    .addGap(18, 18, 18)
                                    .addComponent(optTransmision)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optModelo)
                                    .addComponent(optEstilo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optPrecio)
                                    .addComponent(optAño))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(850, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optMarca)
                            .addComponent(optTransmision))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optModelo)
                            .addComponent(optAño))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optEstilo)
                            .addComponent(optPrecio))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optTodos)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Menu_Usuarios ventanaRegresar = new Menu_Usuarios();
        ventanaRegresar.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void optTransmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTransmisionActionPerformed
        // TODO add your handling code here:
        consulta_Transmision v = new consulta_Transmision();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optTransmisionActionPerformed

    private void optMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMarcaActionPerformed
        // TODO add your handling code here:
         consulta_Marca v = new consulta_Marca();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optMarcaActionPerformed

    private void optModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optModeloActionPerformed
        // TODO add your handling code here:
        consulta_Modelo v = new consulta_Modelo();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optModeloActionPerformed

    private void optAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAñoActionPerformed
        // TODO add your handling code here:
        consulta_Año v = new consulta_Año();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optAñoActionPerformed

    private void optEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optEstiloActionPerformed
        // TODO add your handling code here:
        consulta_Estilo v = new consulta_Estilo();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optEstiloActionPerformed

    private void optPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPrecioActionPerformed
        // TODO add your handling code here:
        consulta_Precio v = new consulta_Precio();
         v.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_optPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(buscar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaResultadosConsultas;
    private javax.swing.JRadioButton optAño;
    private javax.swing.JRadioButton optEstilo;
    private javax.swing.JRadioButton optMarca;
    private javax.swing.JRadioButton optModelo;
    private javax.swing.JRadioButton optPrecio;
    private javax.swing.JRadioButton optTodos;
    private javax.swing.JRadioButton optTransmision;
    // End of variables declaration//GEN-END:variables
}
