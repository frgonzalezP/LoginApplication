/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.Sistema;
import Entidad.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Fredy AGP
 */

public class FramePrincipal extends javax.swing.JFrame {
    
    private FormularioRegistro registro = new FormularioRegistro();
    private FormularioIngreso ingreso = new FormularioIngreso();
    public static Sistema sistema = new Sistema();
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        inicializacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        registrarB = new javax.swing.JButton();
        ingresarB = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");
        setMinimumSize(new java.awt.Dimension(410, 310));

        jToolBar1.setRollover(true);

        registrarB.setText("Registrar");
        registrarB.setFocusable(false);
        registrarB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBActionPerformed(evt);
            }
        });
        jToolBar1.add(registrarB);

        ingresarB.setText("Ingresar");
        ingresarB.setFocusable(false);
        ingresarB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresarB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresarB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(registro);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_registrarBActionPerformed

    private void ingresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingreso);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_ingresarBActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    
    public void inicializacion()
    {
        ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
        
        Usuario a= new Usuario();
        Usuario b= new Usuario();
        Usuario c= new Usuario();
        
        a.setNombre("juan");
        a.setPassword("1234");
        b.setNombre("pedro");
        b.setPassword("123");
        c.setNombre("maria");
        c.setPassword("12345");
        
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        
        sistema.setUsuarios(usuarios);
        
        for(Usuario u: sistema.getUsuarios())
        {
            System.out.println(u.getNombre());
            System.out.println(u.getPassword());
            System.out.println("-------------");
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton registrarB;
    // End of variables declaration//GEN-END:variables
}
