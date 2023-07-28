/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intarfeaces_Graphiques;

import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza
 */
public class Espace_Admin extends javax.swing.JFrame {
       Connection cnx;
        PreparedStatement ps ;
        ResultSet rs;
        
        static int  cmpt_adm=0 , cmpt_pat=0 , cmpt_recept=0 , cmpt_doct=0 , cmpt_pharm=0 , cmpt_lab_ass=0;
        static PreparedStatement ps_pat , ps_adm , ps_doct , ps_pharm , ps_recept , ps_lab_ass, ps3;
        static ResultSet rs_pat , rs_adm , rs_doct , rs_pharm , rs_recept , rs_lab_ass;
    /**
     * Creates new form Espace_Admin
     */
        
    public Espace_Admin() {
        
        initComponents();
        panel_ajouter_personne.setVisible(true);
        panel_ajouter_admin.setVisible(false);
        
        txt_modifier_cin.setEnabled(false);
        btn_modifier.setEnabled(false);
        btn_annuler.setEnabled(false);
        btn_ajouter.setEnabled(false);
    //////////////////////////////////////////////////////////////////////
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(false);
        
    ///////////////////////////////////////////////////////////////////////
        panel_modifier_admin.setVisible(false);
        panel_modifier_patient.setVisible(false);
        panel_modifier_staff.setVisible(false);
        panel_modifier_doctor.setVisible(false);
        
            try {
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_hightech_devoir_2","hightech","HIGHTECH2022");
     //           JOptionPane.showMessageDialog(this, "Database est correctement connéctée !");
            } catch (SQLException ex) {
                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panel_ajouter_patient = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_ajouter_pat_mcn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cb_ajouter_pat_gender = new javax.swing.JComboBox<>();
        txt_ajouter_pat_age = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        panel_ajouter_receptionist = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cb_ajouter_recept_dept = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txt_ajouter_recept_ec = new javax.swing.JTextField();
        panel_ajouter_personne = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_ajouter_cin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ajouter_nom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ajouter_prenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_ajouter_adresse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ajouter_tel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_ajouter_email = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cb_ajouter_type = new javax.swing.JComboBox<>();
        btn_ajouter = new javax.swing.JButton();
        panel_ajouter_admin = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_ajouter_admin_resp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_ajouter_admin_code = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cb_ajouter_admin_dept = new javax.swing.JComboBox<>();
        panel_ajouter_doctor = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cb_ajouter_doctor_dept = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txt_ajouter_doct_ec = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_ajouter_doct_spec = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_ajouter_doct_qualif = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_ajouter_doct_fc = new javax.swing.JTextField();
        panel_ajouter_pharm = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cb_ajouter_pharm_dept = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_ajouter_pharm_ec = new javax.swing.JTextField();
        panel_ajouter_lab_ass = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cb_ajouter_lab_ass_dept = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txt_ajouter_lab_ass_ec = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        cb_modifier_profile = new javax.swing.JComboBox<>();
        txt_modifier_cin = new javax.swing.JTextField();
        btn_modifier = new javax.swing.JButton();
        btn_annuler = new javax.swing.JButton();
        txt_modifier_valeur = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        panel_modifier_patient = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        cb_modifier_patient = new javax.swing.JComboBox<>();
        panel_modifier_staff = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        cb_modifier_staff = new javax.swing.JComboBox<>();
        btn_valider = new javax.swing.JButton();
        panel_modifier_admin = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        cb_modifier_admin = new javax.swing.JComboBox<>();
        panel_modifier_doctor = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        cb_modifier_doctor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txt_supprimer_cin = new javax.swing.JTextField();
        btn_supprimer_cin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Espace Administrateur");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        panel_ajouter_patient.setBackground(new java.awt.Color(255, 255, 204));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Medical Card N°");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Gender");

        cb_ajouter_pat_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Female", "Male" }));

        txt_ajouter_pat_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ajouter_pat_ageActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Age");

        javax.swing.GroupLayout panel_ajouter_patientLayout = new javax.swing.GroupLayout(panel_ajouter_patient);
        panel_ajouter_patient.setLayout(panel_ajouter_patientLayout);
        panel_ajouter_patientLayout.setHorizontalGroup(
            panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_patientLayout.createSequentialGroup()
                .addGroup(panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ajouter_pat_gender, 0, 112, Short.MAX_VALUE)
                    .addComponent(txt_ajouter_pat_mcn)
                    .addComponent(txt_ajouter_pat_age)))
        );
        panel_ajouter_patientLayout.setVerticalGroup(
            panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_patientLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_ajouter_pat_mcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_ajouter_pat_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel_ajouter_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_ajouter_pat_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ajouter_receptionist.setBackground(new java.awt.Color(255, 204, 204));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Department");

        cb_ajouter_recept_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Doctors", "Reception", "Laboratoire", "Pharmacie", "Administration" }));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Employement code");

        javax.swing.GroupLayout panel_ajouter_receptionistLayout = new javax.swing.GroupLayout(panel_ajouter_receptionist);
        panel_ajouter_receptionist.setLayout(panel_ajouter_receptionistLayout);
        panel_ajouter_receptionistLayout.setHorizontalGroup(
            panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_receptionistLayout.createSequentialGroup()
                .addGroup(panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ajouter_receptionistLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ajouter_receptionistLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ajouter_recept_ec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ajouter_recept_dept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_ajouter_receptionistLayout.setVerticalGroup(
            panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_receptionistLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_recept_ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_receptionistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_ajouter_recept_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("CIN");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nom");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Prénom");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Adresse");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Téléphone");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Type");

        cb_ajouter_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Patient", "Doctor", "Receptionist", "Lab Assistant", "Pharmacist", "Admin" }));
        cb_ajouter_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ajouter_typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ajouter_personneLayout = new javax.swing.GroupLayout(panel_ajouter_personne);
        panel_ajouter_personne.setLayout(panel_ajouter_personneLayout);
        panel_ajouter_personneLayout.setHorizontalGroup(
            panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_personneLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ajouter_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_ajouter_personneLayout.createSequentialGroup()
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ajouter_type, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ajouter_email, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel_ajouter_personneLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txt_ajouter_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_ajouter_personneLayout.createSequentialGroup()
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ajouter_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel_ajouter_personneLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ajouter_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_ajouter_personneLayout.setVerticalGroup(
            panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ajouter_personneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ajouter_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ajouter_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ajouter_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_ajouter_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel_ajouter_personneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_ajouter_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btn_ajouter.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_ajouter.setText("AJOUTER");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });

        panel_ajouter_admin.setBackground(new java.awt.Color(204, 204, 255));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Responsabilité");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Code");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Department");

        cb_ajouter_admin_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Doctors", "Reception", "Laboratoire", "Pharmacie", "Administration" }));

        javax.swing.GroupLayout panel_ajouter_adminLayout = new javax.swing.GroupLayout(panel_ajouter_admin);
        panel_ajouter_admin.setLayout(panel_ajouter_adminLayout);
        panel_ajouter_adminLayout.setHorizontalGroup(
            panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_adminLayout.createSequentialGroup()
                .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ajouter_adminLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_ajouter_admin_dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_ajouter_adminLayout.createSequentialGroup()
                        .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ajouter_admin_code, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ajouter_admin_resp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_ajouter_adminLayout.setVerticalGroup(
            panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_adminLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_admin_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_admin_resp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cb_ajouter_admin_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ajouter_doctor.setBackground(new java.awt.Color(255, 204, 204));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("Department");

        cb_ajouter_doctor_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Doctors", "Reception", "Laboratoire", "Pharmacie", "Administration" }));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("Employement code");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setText("Speciality");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setText("Qualification");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setText("Function code");

        javax.swing.GroupLayout panel_ajouter_doctorLayout = new javax.swing.GroupLayout(panel_ajouter_doctor);
        panel_ajouter_doctor.setLayout(panel_ajouter_doctorLayout);
        panel_ajouter_doctorLayout.setHorizontalGroup(
            panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_doctorLayout.createSequentialGroup()
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ajouter_doct_ec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_ajouter_doct_qualif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_ajouter_doctor_dept, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ajouter_doct_spec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ajouter_doct_fc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_ajouter_doctorLayout.setVerticalGroup(
            panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_doctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_ajouter_doctorLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_ajouter_doct_ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txt_ajouter_doct_fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_doct_qualif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_doct_spec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cb_ajouter_doctor_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ajouter_pharm.setBackground(new java.awt.Color(255, 204, 204));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Department");

        cb_ajouter_pharm_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Doctors", "Reception", "Laboratoire", "Pharmacie", "Administration" }));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Employement code");

        javax.swing.GroupLayout panel_ajouter_pharmLayout = new javax.swing.GroupLayout(panel_ajouter_pharm);
        panel_ajouter_pharm.setLayout(panel_ajouter_pharmLayout);
        panel_ajouter_pharmLayout.setHorizontalGroup(
            panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_pharmLayout.createSequentialGroup()
                .addGroup(panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ajouter_pharmLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ajouter_pharmLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ajouter_pharm_ec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ajouter_pharm_dept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_ajouter_pharmLayout.setVerticalGroup(
            panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_pharmLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_pharm_ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_pharmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_ajouter_pharm_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_ajouter_lab_ass.setBackground(new java.awt.Color(255, 204, 204));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("Department");

        cb_ajouter_lab_ass_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Doctors", "Reception", "Laboratoire", "Pharmacie", "Administration" }));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("Employement code");

        javax.swing.GroupLayout panel_ajouter_lab_assLayout = new javax.swing.GroupLayout(panel_ajouter_lab_ass);
        panel_ajouter_lab_ass.setLayout(panel_ajouter_lab_assLayout);
        panel_ajouter_lab_assLayout.setHorizontalGroup(
            panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_lab_assLayout.createSequentialGroup()
                .addGroup(panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ajouter_lab_assLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ajouter_lab_assLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ajouter_lab_ass_ec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ajouter_lab_ass_dept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_ajouter_lab_assLayout.setVerticalGroup(
            panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ajouter_lab_assLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ajouter_lab_ass_ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_ajouter_lab_assLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cb_ajouter_lab_ass_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel_ajouter_personne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_ajouter_patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_ajouter_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_ajouter_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_ajouter_receptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_ajouter_pharm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_ajouter_lab_ass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_ajouter_receptionist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_pharm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_lab_ass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_ajouter_personne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_ajouter)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ajouter", jPanel1);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setText("Profile");

        cb_modifier_profile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ...", "Admin", "Patient", "Doctor", "Receptionist", "Lab Assistant", "Pharmacist" }));
        cb_modifier_profile.setMinimumSize(new java.awt.Dimension(300, 20));
        cb_modifier_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modifier_profileActionPerformed(evt);
            }
        });

        txt_modifier_cin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_modifier_cinAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txt_modifier_cin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_modifier_cinMouseClicked(evt);
            }
        });
        txt_modifier_cin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txt_modifier_cinComponentShown(evt);
            }
        });
        txt_modifier_cin.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_modifier_cinInputMethodTextChanged(evt);
            }
        });
        txt_modifier_cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modifier_cinActionPerformed(evt);
            }
        });
        txt_modifier_cin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_modifier_cinPropertyChange(evt);
            }
        });

        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        btn_annuler.setText("Annuler");
        btn_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annulerActionPerformed(evt);
            }
        });

        txt_modifier_valeur.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_modifier_valeurAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txt_modifier_valeur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_modifier_valeurMouseClicked(evt);
            }
        });
        txt_modifier_valeur.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txt_modifier_valeurComponentShown(evt);
            }
        });
        txt_modifier_valeur.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_modifier_valeurInputMethodTextChanged(evt);
            }
        });
        txt_modifier_valeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modifier_valeurActionPerformed(evt);
            }
        });
        txt_modifier_valeur.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_modifier_valeurPropertyChange(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setText("CIN");

        panel_modifier_patient.setBackground(new java.awt.Color(153, 255, 255));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setText("Propriété");

        cb_modifier_patient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ...", "Last name", "First name", "Adresse", "Phone number", "Email", "Type", "Password", "Age", "Gender" }));
        cb_modifier_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modifier_patientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_modifier_patientLayout = new javax.swing.GroupLayout(panel_modifier_patient);
        panel_modifier_patient.setLayout(panel_modifier_patientLayout);
        panel_modifier_patientLayout.setHorizontalGroup(
            panel_modifier_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_patientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_modifier_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_modifier_patientLayout.setVerticalGroup(
            panel_modifier_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_patientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modifier_patientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cb_modifier_patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_modifier_staff.setBackground(new java.awt.Color(204, 255, 204));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setText("Propriété");

        cb_modifier_staff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ...", "Last name", "First name", "Adresse", "Phone number", "Email", "Type", "Password", "Employment code", "Department" }));
        cb_modifier_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modifier_staffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_modifier_staffLayout = new javax.swing.GroupLayout(panel_modifier_staff);
        panel_modifier_staff.setLayout(panel_modifier_staffLayout);
        panel_modifier_staffLayout.setHorizontalGroup(
            panel_modifier_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_staffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_modifier_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panel_modifier_staffLayout.setVerticalGroup(
            panel_modifier_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_staffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modifier_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cb_modifier_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        btn_valider.setText("Valider");
        btn_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validerActionPerformed(evt);
            }
        });

        panel_modifier_admin.setBackground(new java.awt.Color(255, 204, 204));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setText("Propriété");

        cb_modifier_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ...", "Last name", "First name", "Adresse", "Phone number", "Email", "Type", "Password", "Responsability", "Department" }));
        cb_modifier_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modifier_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_modifier_adminLayout = new javax.swing.GroupLayout(panel_modifier_admin);
        panel_modifier_admin.setLayout(panel_modifier_adminLayout);
        panel_modifier_adminLayout.setHorizontalGroup(
            panel_modifier_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_modifier_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panel_modifier_adminLayout.setVerticalGroup(
            panel_modifier_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_adminLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_modifier_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(cb_modifier_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        panel_modifier_doctor.setBackground(new java.awt.Color(255, 255, 153));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setText("Propriété");

        cb_modifier_doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ...", "Last name", "First name", "Adresse", "Phone number", "Email", "Type", "Password", "Employment code", "Department", "Qualification", "Speciality" }));
        cb_modifier_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modifier_doctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_modifier_doctorLayout = new javax.swing.GroupLayout(panel_modifier_doctor);
        panel_modifier_doctor.setLayout(panel_modifier_doctorLayout);
        panel_modifier_doctorLayout.setHorizontalGroup(
            panel_modifier_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_doctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_modifier_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        panel_modifier_doctorLayout.setVerticalGroup(
            panel_modifier_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modifier_doctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modifier_doctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(cb_modifier_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))
                    .addComponent(txt_modifier_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cb_modifier_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(panel_modifier_patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_modifier_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_modifier_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_modifier_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btn_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_modifier_valeur, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cb_modifier_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txt_modifier_cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel_modifier_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_modifier_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_modifier_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_modifier_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(txt_modifier_valeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifier)
                    .addComponent(btn_annuler))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Modifier", jPanel7);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("CIN");

        txt_supprimer_cin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_supprimer_cinAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txt_supprimer_cin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_supprimer_cinMouseClicked(evt);
            }
        });
        txt_supprimer_cin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txt_supprimer_cinComponentShown(evt);
            }
        });
        txt_supprimer_cin.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_supprimer_cinInputMethodTextChanged(evt);
            }
        });
        txt_supprimer_cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supprimer_cinActionPerformed(evt);
            }
        });
        txt_supprimer_cin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_supprimer_cinPropertyChange(evt);
            }
        });

        btn_supprimer_cin.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_supprimer_cin.setText("SUPPRIMER");
        btn_supprimer_cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimer_cinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_supprimer_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(782, 782, 782))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(btn_supprimer_cin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_supprimer_cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btn_supprimer_cin)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Supprimer", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_modifier_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modifier_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_modifier_doctorActionPerformed

    private void cb_modifier_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modifier_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_modifier_adminActionPerformed

    public static ResultSet getRs_pat() {
        return rs_pat;
    }
    
 

    private void btn_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validerActionPerformed

            
        try {
                // TODO add your handling code here:
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_hightech_devoir_2","hightech","HIGHTECH2022");
                ps_adm = cnx.prepareStatement("select *  from user u , admin a where u.national_code = ? and a.national_code=u.national_code ");
                ps_adm.setString(1, txt_modifier_cin.getText());
                rs_adm = ps_adm.executeQuery();
                while(rs_adm.next()) cmpt_adm++;
                
                ps_pat = cnx.prepareStatement("select *  from user u , patient p where u.national_code = ? and p.national_code=u.national_code ");
                ps_pat.setString(1, txt_modifier_cin.getText());
                rs_pat = ps_pat.executeQuery();
                while(rs_pat.next()) cmpt_pat++;
                
                ps_doct = cnx.prepareStatement("select *  from user u , doctor d where u.national_code = ? and d.national_code=u.national_code ");
                ps_doct.setString(1, txt_modifier_cin.getText());
                rs_doct = ps_doct.executeQuery();
                while(rs_doct.next()) cmpt_doct++;
                
                ps_recept = cnx.prepareStatement("select *  from user u , receptionist r where u.national_code = ? and r.national_code=u.national_code ");
                ps_recept.setString(1, txt_modifier_cin.getText());
                rs_recept = ps_recept.executeQuery();
                while(rs_recept.next()) cmpt_recept++;
                
                ps_lab_ass = cnx.prepareStatement("select *  from user u , lab_assistant l where u.national_code = ? and l.national_code=u.national_code ");
                ps_lab_ass.setString(1, txt_modifier_cin.getText());
                rs_lab_ass = ps_lab_ass.executeQuery();
                while(rs_lab_ass.next()) cmpt_lab_ass++;
                
                ps_pharm = cnx.prepareStatement("select *  from user u , pharmacist p where u.national_code = ? and p.national_code=u.national_code ");
                ps_pharm.setString(1, txt_modifier_cin.getText());
                rs_pharm = ps_pharm.executeQuery();
                while(rs_pharm.next()) cmpt_pharm++;
                
                if(cmpt_adm == 1){
                    panel_modifier_admin.setVisible(true);
                    panel_modifier_patient.setVisible(false);
                    panel_modifier_staff.setVisible(false);
                    panel_modifier_doctor.setVisible(false);
        //////////////////////////////////////////////////////////////////////////
                }
                else if(cmpt_pat == 1){
                    panel_modifier_admin.setVisible(false);
                    panel_modifier_patient.setVisible(true);
                    panel_modifier_staff.setVisible(false);
                    panel_modifier_doctor.setVisible(false);
        //////////////////////////////////////////////////////////////////////////
                }
                else if(cmpt_doct == 1 ){
                    panel_modifier_admin.setVisible(false);
                    panel_modifier_patient.setVisible(false);
                    panel_modifier_staff.setVisible(false);
                    panel_modifier_doctor.setVisible(true);
        //////////////////////////////////////////////////////////////////////////
                }
                else if(cmpt_recept == 1 ){
                    panel_modifier_admin.setVisible(false);
                    panel_modifier_patient.setVisible(false);
                    panel_modifier_staff.setVisible(true);
                    panel_modifier_doctor.setVisible(false);
        //////////////////////////////////////////////////////////////////////////
                    
                }
                else if(cmpt_lab_ass == 1 ){
                    panel_modifier_admin.setVisible(false);
                    panel_modifier_patient.setVisible(false);
                    panel_modifier_staff.setVisible(true);
                     panel_modifier_doctor.setVisible(false);
        //////////////////////////////////////////////////////////////////////////
                    
                }
                else if(cmpt_pharm == 1 ){
                    panel_modifier_admin.setVisible(false);
                    panel_modifier_patient.setVisible(false);
                    panel_modifier_staff.setVisible(true);
                     panel_modifier_doctor.setVisible(false);
        //////////////////////////////////////////////////////////////////////////
                    
                }
                else {
                    JOptionPane.showMessageDialog(this, "Ntaional code number not found !");
                }
            } 
        catch (SQLException ex) {
                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Ntaional code number not found !");
            }

    }//GEN-LAST:event_btn_validerActionPerformed

    private void cb_modifier_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modifier_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_modifier_staffActionPerformed

    private void cb_modifier_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modifier_patientActionPerformed
        // TODO add your handling code here:

        // cb_mod_prof.setSize(50, 5);
    }//GEN-LAST:event_cb_modifier_patientActionPerformed

    private void txt_modifier_valeurPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_modifier_valeurPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_valeurPropertyChange

    private void txt_modifier_valeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modifier_valeurActionPerformed
        // TODO add your handling code here:
        if(txt_modifier_valeur.isCursorSet()==true){
            btn_modifier.setEnabled(true);
            btn_annuler.setEnabled(true);
        }
    }//GEN-LAST:event_txt_modifier_valeurActionPerformed

    private void txt_modifier_valeurInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_modifier_valeurInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_valeurInputMethodTextChanged

    private void txt_modifier_valeurComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txt_modifier_valeurComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_valeurComponentShown

    private void txt_modifier_valeurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_modifier_valeurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_valeurMouseClicked

    private void txt_modifier_valeurAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_modifier_valeurAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_valeurAncestorAdded

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        // TODO add your handling code here:
        if(!txt_modifier_cin.getText().equals(null)){

            try
            {

                if(cmpt_adm == 1) {
                    switch(cb_modifier_admin.getSelectedIndex()){
                        case 1 :
                        ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 2 :
                        ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 3 :
                        ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 4 :
                        ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 5 :
                        ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 6 :
                        ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 7 :
                        ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 8 :
                        ps3 = cnx.prepareStatement("UPDATE admin SET responsability = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;
                        case 9 :
                        ps3 = cnx.prepareStatement("UPDATE admin SET department = ? WHERE national_code = ?");
                        modifier_valeur(ps3);
                        annuler_selection();
                        break;

                    }
                }
                if(cmpt_doct == 1) {
                    switch(cb_modifier_doctor.getSelectedIndex()){
                        case 1 :
                            ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 2 :
                            ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 3 :
                            ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 4 :
                            ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 5 :
                            ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 6 :
                            ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 7 :
                            ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 8 :
                            ps3 = cnx.prepareStatement("UPDATE doctor SET employment_code = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 9 :
                            ps3 = cnx.prepareStatement("UPDATE doctor SET department = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 10 :
                            ps3 = cnx.prepareStatement("UPDATE doctor SET qualification = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 11 :
                            ps3 = cnx.prepareStatement("UPDATE doctor SET speciality = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;

                    }
                }
                if(cmpt_pat == 1){
                    switch(cb_modifier_patient.getSelectedIndex()){
                        case 1 :
                            ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 2 :
                            ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 3 :
                            ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 4 :
                            ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 5 :
                            ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 6 :
                            ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 7 :
                            ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 8 :
                            ps3 = cnx.prepareStatement("UPDATE patient SET age = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 9 :
                            ps3 = cnx.prepareStatement("UPDATE patient SET gender = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         

                    }
                }
                if(cmpt_lab_ass == 1){
                    switch(cb_modifier_staff.getSelectedIndex()){
                        case 1 :
                            ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 2 :
                            ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 3 :
                            ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 4 :
                            ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 5 :
                            ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 6 :
                            ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 7 :
                            ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 8 :
                            ps3 = cnx.prepareStatement("UPDATE lab_assistant SET employment_code = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 9 :
                            ps3 = cnx.prepareStatement("UPDATE lab_assistant SET department = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;

                    }
                }
                if(cmpt_pharm == 1){
                    switch(cb_modifier_staff.getSelectedIndex()){
                        case 1 :
                            ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 2 :
                            ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 3 :
                            ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 4 :
                            ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 5 :
                            ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 6 :
                            ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 7 :
                            ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 8 :
                            ps3 = cnx.prepareStatement("UPDATE pharmacist SET employment_code = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 9 :
                            ps3 = cnx.prepareStatement("UPDATE pharmacist SET department = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;

                    }
                }
                if(cmpt_recept == 1){
                    switch(cb_modifier_staff.getSelectedIndex()){
                        case 1 :
                            ps3 = cnx.prepareStatement("UPDATE user SET last_name = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 2 :
                            ps3 = cnx.prepareStatement("UPDATE user SET first_name = ? national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 3 :
                            ps3 = cnx.prepareStatement("UPDATE user SET adress = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 4 :
                            ps3 = cnx.prepareStatement("UPDATE user SET mobile_no = ? where national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 5 :
                            ps3 = cnx.prepareStatement("UPDATE user SET email = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 6 :
                            ps3 = cnx.prepareStatement("UPDATE user SET type = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 7 :
                            ps3 = cnx.prepareStatement("UPDATE user SET password = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                         case 8 :
                            ps3 = cnx.prepareStatement("UPDATE receptionist SET employment_code = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;
                        case 9 :
                            ps3 = cnx.prepareStatement("UPDATE receptionist SET department = ? WHERE national_code = ?");
                            modifier_valeur(ps3);
                            annuler_selection();
                            break;

                    }
                }

            }
            catch (SQLException ex)
            {
                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void txt_modifier_cinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_modifier_cinPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_cinPropertyChange

    private void txt_modifier_cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modifier_cinActionPerformed
          if( !txt_modifier_cin.getText().equals(null) ) btn_valider.setEnabled(true);
    }//GEN-LAST:event_txt_modifier_cinActionPerformed

    private void txt_modifier_cinInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_modifier_cinInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_cinInputMethodTextChanged

    private void txt_modifier_cinComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txt_modifier_cinComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_cinComponentShown

    private void txt_modifier_cinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_modifier_cinMouseClicked
        // TODO add your handling code here:
        if(txt_modifier_cin.getText()!= null){
            btn_modifier.setEnabled(true);
            btn_annuler.setEnabled(true);

        }
    }//GEN-LAST:event_txt_modifier_cinMouseClicked

    private void txt_modifier_cinAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_modifier_cinAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modifier_cinAncestorAdded

    private void cb_modifier_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modifier_profileActionPerformed
        // TODO add your handling code here:
        
            if(cb_modifier_profile.getSelectedIndex() != 0) { 
                txt_modifier_cin.setEnabled(true);
               
            }
            else {
                txt_modifier_cin.setEditable(true);
                txt_modifier_valeur.setEditable(true);
                btn_modifier.setEnabled(false);
                btn_annuler.setEnabled(false);
            }
    }//GEN-LAST:event_cb_modifier_profileActionPerformed

    private void btn_supprimer_cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimer_cinActionPerformed

        try {
            PreparedStatement ps4 = cnx.prepareStatement("SELECT * FROM user WHERE national_code = ?");
            ps4.setString(1, txt_supprimer_cin.getText());
            rs = ps4.executeQuery();
            int compteur = 0;
            while(rs.next()) compteur++;
            //////////////////////////////////////////////////////////////////
            PreparedStatement ps5 = cnx.prepareStatement("SELECT * FROM ADMIN WHERE national_code = ?");
            ps5.setString(1, txt_supprimer_cin.getText());
            rs = ps5.executeQuery();
            int c1 = 0;
            while(rs.next()) c1++;
            //////////////////////////////////////////////////////////////////////
            PreparedStatement ps7 = cnx.prepareStatement("SELECT * FROM receptionist WHERE national_code = ?");
            ps7.setString(1, txt_supprimer_cin.getText());
            rs = ps7.executeQuery();
            int c3 = 0;
            while(rs.next()) c3++;
            ////////////////////////////////////////////////////////////////////
            PreparedStatement ps6 = cnx.prepareStatement("SELECT * FROM patient WHERE national_code = ?");
            ps6.setString(1, txt_supprimer_cin.getText());
            rs = ps6.executeQuery();
            int c2 = 0;
            while(rs.next()) c2++;
            ////////////////////////////////////////////////////////////////////
            PreparedStatement ps8 = cnx.prepareStatement("SELECT * FROM doctor WHERE national_code = ?");
            ps8.setString(1, txt_supprimer_cin.getText());
            rs = ps8.executeQuery();
            int c4 = 0;
            while(rs.next()) c4++;
            ////////////////////////////////////////////////////////////////////
            PreparedStatement ps9 = cnx.prepareStatement("SELECT * FROM pharmacist WHERE national_code = ?");
            ps9.setString(1, txt_supprimer_cin.getText());
            rs = ps9.executeQuery();
            int c5 = 0;
            while(rs.next()) c5++;
            ////////////////////////////////////////////////////////////////////
            PreparedStatement ps10 = cnx.prepareStatement("SELECT * FROM lab_assistant WHERE national_code = ?");
            ps10.setString(1, txt_supprimer_cin.getText());
            rs = ps10.executeQuery();
            int c6 = 0;
            while(rs.next()) c6++;

            ////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////

            if(compteur ==1 && c1 == 1){
                ps = cnx.prepareStatement("delete from ADMIN where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                //////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Admin supprimé avec succés !");
            }

            else if(compteur ==1 && c2 == 1){
                ps = cnx.prepareStatement("delete from patient where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                /////////////////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Patient supprimé avec succés !");
            }
            //else JOptionPane.showMessageDialog(this, "Le CIN supprimé ne concerne pas un admin !");

            else if(compteur ==1 && c3 == 1){
                ps = cnx.prepareStatement("delete from receptionist where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                /////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Receptioniste supprimé avec succés !");
            }
            else if(compteur ==1 && c4 == 1){
                ps = cnx.prepareStatement("delete from doctor where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                /////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Docteur supprimé avec succés !");
            }
            else if(compteur ==1 && c6 == 1){
                ps = cnx.prepareStatement("delete from lab_assistant where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                /////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Assistant de laboratoire supprimé avec succés !");
            }
            else if(compteur ==1 && c5 == 1){
                ps = cnx.prepareStatement("delete from pharmacist where national_code = ?");
                ps.setString(1, txt_supprimer_cin.getText());
                ps.execute();
                /////////////////////////////////////////////////////////////////////////////
                PreparedStatement psz = cnx.prepareStatement("delete from user where national_code = ?");
                psz.setString(1, txt_supprimer_cin.getText());
                psz.execute();
                txt_supprimer_cin.setText("");
                JOptionPane.showMessageDialog(this, "Pharmatiste supprimé avec succés !");
            }

            else JOptionPane.showMessageDialog(this, "CIN introuvable !");
            //else JOptionPane.showMessageDialog(this, "Le CIN supprimé ne concerne pas un admin !");

        }
        catch (SQLException ex) {
            Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "CIN introuvable !");
        }

    }//GEN-LAST:event_btn_supprimer_cinActionPerformed

    private void txt_supprimer_cinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_supprimer_cinPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinPropertyChange

    private void txt_supprimer_cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supprimer_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinActionPerformed

    private void txt_supprimer_cinInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_supprimer_cinInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinInputMethodTextChanged

    private void txt_supprimer_cinComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txt_supprimer_cinComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinComponentShown

    private void txt_supprimer_cinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_supprimer_cinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinMouseClicked

    private void txt_supprimer_cinAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_supprimer_cinAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supprimer_cinAncestorAdded

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        // TODO add your handling code here:
        try {
            if(!txt_ajouter_cin.getText().equals(null) && !txt_ajouter_nom.getText().equals(null) && !txt_ajouter_prenom.getText().equals(null)
                && !txt_ajouter_tel.getText().equals(null) && !txt_ajouter_email.getText().equals(null)
                && !txt_ajouter_adresse.getText().equals(null) && cb_ajouter_type.getSelectedIndex() !=0) {
                type = (String) cb_ajouter_type.getSelectedItem();

                String gender;
                String department;
                switch(cb_ajouter_type.getSelectedIndex()){
                    case 1 :
                    {
                        if( !txt_ajouter_pat_mcn.getText().equals(null) && !txt_ajouter_pat_age.getText().equals(null)
                            && cb_ajouter_pat_gender.getSelectedIndex() !=0 )
                        {
                            gender = (String) cb_ajouter_pat_gender.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO patient VALUES (? ,? , ? ,?)");

                            ps2.setString(1, txt_ajouter_pat_mcn.getText());
                            ps2.setString(2, txt_ajouter_pat_age.getText());
                            ps2.setString(3, gender);
                            ps2.setString(4, txt_ajouter_cin.getText());
                            ps2.execute();
                            JOptionPane.showMessageDialog(this, "Patient ajouté avec succés !");
                            insertIntoUser();
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_pat_gender.setSelectedIndex(0);
                            txt_ajouter_pat_mcn.setText("");
                            txt_ajouter_pat_age.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }

                    case 2 :
                    {
                        if( !txt_ajouter_doct_ec.equals(null) && !txt_ajouter_doct_fc.getText().equals(null)
                            && !txt_ajouter_doct_qualif.equals(null) && !txt_ajouter_doct_spec.getText().equals(null)
                            && cb_ajouter_doctor_dept.getSelectedIndex() !=0 )
                        {department = (String) cb_ajouter_doctor_dept.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO doctor VALUES (? ,? , ? ,? , ? , ?)");

                            ps2.setString(1, txt_ajouter_doct_fc.getText());
                            ps2.setString(2, txt_ajouter_doct_qualif.getText());
                            ps2.setString(3, txt_ajouter_doct_spec.getText());
                            ps2.setString(4, txt_ajouter_cin.getText());
                            ps2.setString(5, department);
                            ps2.setString(6, txt_ajouter_doct_ec.getText());
                            ps2.execute();
                            insertIntoUser();
                            JOptionPane.showMessageDialog(this, "Docteur ajouté avec succés !");
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_doctor_dept.setSelectedIndex(0);
                            txt_ajouter_doct_qualif.setText("");
                            txt_ajouter_doct_fc.setText("");
                            txt_ajouter_doct_spec.setText("");
                            txt_ajouter_doct_ec.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }
                    case 3 :
                    {
                        if( !txt_ajouter_recept_ec.equals(null) && cb_ajouter_recept_dept.getSelectedIndex() !=0 )
                        {
                            department = (String) cb_ajouter_recept_dept.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO receptionist VALUES (? ,? , ? )");

                            ps2.setString(1, txt_ajouter_cin.getText());
                            ps2.setString(2, txt_ajouter_recept_ec.getText());
                            ps2.setString(3, department);
                            ps2.execute();
                            insertIntoUser();
                            JOptionPane.showMessageDialog(this, "Receptioniste ajouté avec succés !");
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_recept_dept.setSelectedIndex(0);
                            txt_ajouter_recept_ec.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }
                    case 4 :
                    {
                        if( !txt_ajouter_lab_ass_ec.equals(null) && cb_ajouter_lab_ass_dept.getSelectedIndex() !=0 )
                        {
                            department = (String) cb_ajouter_lab_ass_dept.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO lab_assistant VALUES (? ,? , ? )");

                            ps2.setString(1, txt_ajouter_cin.getText());
                            ps2.setString(2, txt_ajouter_lab_ass_ec.getText());
                            ps2.setString(3, department);
                            ps2.execute();
                            insertIntoUser();
                            JOptionPane.showMessageDialog(this, "Assistant laboratoire ajouté avec succés !");
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_lab_ass_dept.setSelectedIndex(0);
                            txt_ajouter_lab_ass_ec.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }
                    case 5 :
                    {
                        if( !txt_ajouter_pharm_ec.equals(null) && cb_ajouter_pharm_dept.getSelectedIndex() !=0 )
                        {
                            department = (String) cb_ajouter_pharm_dept.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO pharmacist VALUES (? ,? , ? )");

                            ps2.setString(1, txt_ajouter_cin.getText());
                            ps2.setString(2, txt_ajouter_pharm_ec.getText());
                            ps2.setString(3, department);
                            ps2.execute();
                            insertIntoUser();
                            JOptionPane.showMessageDialog(this, "Pharmaciste ajouté avec succés !");
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_pharm_dept.setSelectedIndex(0);
                            txt_ajouter_pharm_ec.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }
                    case 6 :
                    {
                        if( !txt_ajouter_admin_code.equals(null) && !txt_ajouter_admin_resp.equals(null)
                            && cb_ajouter_admin_dept.getSelectedIndex() !=0 )
                        {
                            department = (String) cb_ajouter_admin_dept.getSelectedItem();
                            PreparedStatement ps2 = cnx.prepareStatement("INSERT INTO Admin VALUES (? ,? , ? , ?)");

                            ps2.setString(1, txt_ajouter_cin.getText());
                            ps2.setString(2, txt_ajouter_admin_code.getText());
                            ps2.setString(3, txt_ajouter_admin_resp.getText());
                            ps2.setString(4, department);
                            ps2.execute();
                            insertIntoUser();
                            JOptionPane.showMessageDialog(this, "Admin ajouté avec succés !");
                            txt_ajouter_cin.setText("");
                            txt_ajouter_nom.setText("");
                            txt_ajouter_prenom.setText("");
                            txt_ajouter_tel.setText("");
                            txt_ajouter_adresse.setText("");
                            txt_ajouter_email.setText("");
                            cb_ajouter_type.setSelectedIndex(0);
                            cb_ajouter_admin_dept.setSelectedIndex(0);
                            txt_ajouter_admin_code.setText("");
                            txt_ajouter_admin_resp.setText("");
                        }

                        else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");
                        break;
                    }

                }
            }
            else JOptionPane.showMessageDialog(this, "Avant de ressayer, remplir tous les champs svp !");

        }
        catch (SQLException ex) {
            Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erreur !");
        }

        //ps = cnx.prepareStatement("insert into ")

        //ps = cnx.prepareStatement("insert into ")
    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void cb_ajouter_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ajouter_typeActionPerformed
        // TODO add your handling code here:
        //String type = (String) cb_ajouter_type.getSelectedItem();
        switch(cb_ajouter_type.getSelectedIndex()){
            case 1 :
            panel_ajouter_patient.setVisible(true);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(false);
            btn_ajouter.setEnabled(true);
            break;
            case 2 :
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(true);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(false);
            btn_ajouter.setEnabled(true);
            break;
            case 5 :
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(true);
            btn_ajouter.setEnabled(true);
            break;
            case 4 :
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(true);
            panel_ajouter_pharm.setVisible(false);
            btn_ajouter.setEnabled(true);
            break;
            case 3 :
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(false);
            panel_ajouter_receptionist.setVisible(true);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(false);
            btn_ajouter.setEnabled(true);
            break;
            case 6 :
            panel_ajouter_patient.setVisible(false);
            panel_ajouter_admin.setVisible(true);
            panel_ajouter_receptionist.setVisible(false);
            panel_ajouter_doctor.setVisible(false);
            panel_ajouter_lab_ass.setVisible(false);
            panel_ajouter_pharm.setVisible(false);
            btn_ajouter.setEnabled(true);
            break;
            
            default : 
                panel_ajouter_patient.setVisible(false);
                panel_ajouter_admin.setVisible(false);
                panel_ajouter_receptionist.setVisible(false);
                panel_ajouter_doctor.setVisible(false);
                panel_ajouter_lab_ass.setVisible(false);
                panel_ajouter_pharm.setVisible(false);
                btn_ajouter.setEnabled(false);
        }
    }//GEN-LAST:event_cb_ajouter_typeActionPerformed

    private void txt_ajouter_pat_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ajouter_pat_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ajouter_pat_ageActionPerformed

    private void btn_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annulerActionPerformed
        // TODO add your handling code here:
        annuler_selection();
    }//GEN-LAST:event_btn_annulerActionPerformed
//--------------------------------------------------------------------------------------------------------------
    public void annuler_selection(){
 /*   cb_mod_prof.setEnabled(false);
                cb_mod_etud.setEnabled(false);
                cb_mod_admin.setEnabled(false);
                cb_mod_etud.setSelectedIndex(0);*/
                cb_modifier_admin.setSelectedIndex(0);
                cb_modifier_profile.setSelectedIndex(0);   
                txt_modifier_cin.setEnabled(false);
                txt_modifier_cin.setText("");
                txt_modifier_valeur.setText("");
                cmpt_adm=0 ; cmpt_pat=0 ; cmpt_recept=0 ; cmpt_doct=0 ; cmpt_pharm=0 ; cmpt_lab_ass=0;
                panel_modifier_admin.setVisible(false);
                panel_modifier_doctor.setVisible(false);
                panel_modifier_patient.setVisible(false);
                panel_modifier_staff.setVisible(false);
                
}
    public void modifier_valeur(PreparedStatement psx){
            try {
                psx.setString(1, txt_modifier_valeur.getText());
                psx.setString(2, txt_modifier_cin.getText());
                psx.execute();
                JOptionPane.showMessageDialog(this, "Modification successful !");
            } catch (SQLException ex) {
                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }                
    }
    ///////////////////////////////////////////////////////////////////
    String type;
    Object pw = new Object();
    public static String generateRandomPW(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
          +"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
    
 ////////////////////////////////////////////////////////////////   
    public void insertIntoUser(){ 
        try{
        pw = generateRandomPW(10);
                
            PreparedStatement ps1 = cnx.prepareStatement("INSERT INTO user VALUES (? , ? , ? , ? , ? , ? , ?, ?)");
                                ps1.setString(1, txt_ajouter_cin.getText());
                                ps1.setString(2, txt_ajouter_prenom.getText());
                                ps1.setString(3, txt_ajouter_nom.getText());
                                ps1.setString(4, txt_ajouter_adresse.getText());
                                ps1.setString(5, txt_ajouter_tel.getText());
                                ps1.setString(6, txt_ajouter_email.getText());
                                ps1.setString(7, pw.toString());
                                ps1.setString(8, type);
                                ps1.execute();
        }
        catch (SQLException ex) {
                                Logger.getLogger(Espace_Admin.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(this, "Erreur !");
                            }
    }/////////////////////////////////////////////////////////////////////

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
            java.util.logging.Logger.getLogger(Espace_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Espace_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Espace_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Espace_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Espace_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_supprimer_cin;
    private javax.swing.JButton btn_valider;
    private javax.swing.JComboBox<String> cb_ajouter_admin_dept;
    private javax.swing.JComboBox<String> cb_ajouter_doctor_dept;
    private javax.swing.JComboBox<String> cb_ajouter_lab_ass_dept;
    private javax.swing.JComboBox<String> cb_ajouter_pat_gender;
    private javax.swing.JComboBox<String> cb_ajouter_pharm_dept;
    private javax.swing.JComboBox<String> cb_ajouter_recept_dept;
    private javax.swing.JComboBox<String> cb_ajouter_type;
    private javax.swing.JComboBox<String> cb_modifier_admin;
    private javax.swing.JComboBox<String> cb_modifier_doctor;
    private javax.swing.JComboBox<String> cb_modifier_patient;
    private javax.swing.JComboBox<String> cb_modifier_profile;
    private javax.swing.JComboBox<String> cb_modifier_staff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panel_ajouter_admin;
    private javax.swing.JPanel panel_ajouter_doctor;
    private javax.swing.JPanel panel_ajouter_lab_ass;
    private javax.swing.JPanel panel_ajouter_patient;
    private javax.swing.JPanel panel_ajouter_personne;
    private javax.swing.JPanel panel_ajouter_pharm;
    private javax.swing.JPanel panel_ajouter_receptionist;
    private javax.swing.JPanel panel_modifier_admin;
    private javax.swing.JPanel panel_modifier_doctor;
    private javax.swing.JPanel panel_modifier_patient;
    private javax.swing.JPanel panel_modifier_staff;
    private javax.swing.JTextField txt_ajouter_admin_code;
    private javax.swing.JTextField txt_ajouter_admin_resp;
    private javax.swing.JTextField txt_ajouter_adresse;
    private javax.swing.JTextField txt_ajouter_cin;
    private javax.swing.JTextField txt_ajouter_doct_ec;
    private javax.swing.JTextField txt_ajouter_doct_fc;
    private javax.swing.JTextField txt_ajouter_doct_qualif;
    private javax.swing.JTextField txt_ajouter_doct_spec;
    private javax.swing.JTextField txt_ajouter_email;
    private javax.swing.JTextField txt_ajouter_lab_ass_ec;
    private javax.swing.JTextField txt_ajouter_nom;
    private javax.swing.JTextField txt_ajouter_pat_age;
    private javax.swing.JTextField txt_ajouter_pat_mcn;
    private javax.swing.JTextField txt_ajouter_pharm_ec;
    private javax.swing.JTextField txt_ajouter_prenom;
    private javax.swing.JTextField txt_ajouter_recept_ec;
    private javax.swing.JTextField txt_ajouter_tel;
    private javax.swing.JTextField txt_modifier_cin;
    private javax.swing.JTextField txt_modifier_valeur;
    private javax.swing.JTextField txt_supprimer_cin;
    // End of variables declaration//GEN-END:variables
}
