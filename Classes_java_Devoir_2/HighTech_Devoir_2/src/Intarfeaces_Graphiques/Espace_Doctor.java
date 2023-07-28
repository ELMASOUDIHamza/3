/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intarfeaces_Graphiques;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hamza
 */
public class Espace_Doctor extends javax.swing.JFrame {
    Connection cnx;
    PreparedStatement ps1, ps2, ps_count;
    ResultSet rs1, rs2,rs_count;
    ArrayList<String> date_rdv = new ArrayList<>();
    int i=0, j=0;
    String date, num_fact = null;

    boolean rdv_valide;

    public void connect_to_db(Connection cnx)
    {
            try {
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_hightech_devoir_2","hightech","HIGHTECH2022");
             }
            catch (SQLException ex) {
                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    /**
     * Creates new form Espace_Doctor
     */
    public Espace_Doctor() {
        
            initComponents();
connect_to_db(cnx);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        cb_doctor_valider_rdv = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        cb_doctor_rdvValide = new javax.swing.JComboBox<>();
        label_doctor_ec = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        btn_valider_rdv = new javax.swing.JButton();
        label_login = new javax.swing.JLabel();
        txt_doctor_facture = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setText("RDV à valider :");

        cb_doctor_valider_rdv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cb_doctor_valider_rdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_doctor_valider_rdvActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setText("Liste des RDV validé :");

        cb_doctor_rdvValide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cb_doctor_rdvValide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_doctor_rdvValideActionPerformed(evt);
            }
        });

        label_doctor_ec.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_doctor_ec.setText("          -");

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setText("Employement Code :");

        btn_valider_rdv.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        btn_valider_rdv.setText("Valider");
        btn_valider_rdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valider_rdvActionPerformed(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_login.setText("Montant de la facture:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_doctor_ec, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn_valider_rdv, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_login, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_doctor_facture))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_doctor_valider_rdv, 0, 310, Short.MAX_VALUE)
                                    .addComponent(cb_doctor_rdvValide, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_doctor_ec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_doctor_valider_rdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_login)
                    .addComponent(txt_doctor_facture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_valider_rdv)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_doctor_rdvValide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_doctor_valider_rdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_doctor_valider_rdvActionPerformed

    }//GEN-LAST:event_cb_doctor_valider_rdvActionPerformed

    private void cb_doctor_rdvValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_doctor_rdvValideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_doctor_rdvValideActionPerformed

    private void btn_valider_rdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valider_rdvActionPerformed
        // TODO add your handling code here:
        if(cb_doctor_valider_rdv.getSelectedIndex() != 0 && !txt_doctor_facture.getText().equals(null)){
            try {
                ps_count = cnx.prepareStatement("SELECT num_fact FROM RDV WHERE num_fact is not null");
                rs_count = ps_count.executeQuery();
                j=0;
                do {
                    j++;
                    num_fact="fact/"+j;
                    
                }while (rs_count.next());
                
                ps1 = cnx.prepareStatement("UPDATE RDV SET valide = ? , montant_fact = ? , num_fact=? WHERE date = ?");
         ps1.setBoolean(1,true);        
         ps1.setFloat (2, Float.parseFloat(txt_doctor_facture.getText()));  
         ps1.setString(3, num_fact);   
         ps1.setString(4, cb_doctor_valider_rdv.getSelectedItem().toString());     
  /*        ps2 = cnx.prepareStatement("UPDATE RDV SET montant_fact = ? WHERE date = ? AND valide IS NULL");
         ps2.setFloat(1, Float.parseFloat(txt_doctor_facture.getText()));        
         ps2.setString(2, cb_doctor_valider_rdv.getSelectedItem().toString());      */
                ps1.execute();
                cb_doctor_rdvValide.addItem(cb_doctor_valider_rdv.getSelectedItem().toString());
                cb_doctor_valider_rdv.removeItem(cb_doctor_valider_rdv.getSelectedItem());
                cb_doctor_valider_rdv.setSelectedIndex(0);
                txt_doctor_facture.setText("");
 //       ps2.execute();
                JOptionPane.showMessageDialog(this, "RDV validé avec succès !");
            }
            catch (SQLException ex) {
                Logger.getLogger(Espace_Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Erreur, selectionnez un rdv à valider !");
        }

    }//GEN-LAST:event_btn_valider_rdvActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_valider_rdv;
    public javax.swing.JComboBox<String> cb_doctor_rdvValide;
    public javax.swing.JComboBox<String> cb_doctor_valider_rdv;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel label_doctor_ec;
    public javax.swing.JLabel label_login;
    private javax.swing.JTextField txt_doctor_facture;
    // End of variables declaration//GEN-END:variables
}
