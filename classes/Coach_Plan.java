package com.mycompany.project;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Coach_Plan extends javax.swing.JFrame {

    DefaultTableModel addPlanTable;

    /**
     * Creates new form Coach_Plan
     */
    public Coach_Plan() {
        initComponents();
        this.setLocationRelativeTo(null);

        addPlanTable = new DefaultTableModel();

        addPlanTable.addColumn("MemID");
        addPlanTable.addColumn("Name");
        addPlanTable.addColumn("Type");
        addPlanTable.addColumn("Days_Plan");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memPlan = new javax.swing.JTable();
        edit_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Member_id_show = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BodyBuilding_Rd_btn = new javax.swing.JRadioButton();
        Cardio_Rd_btn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Show_members = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Home");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Put/Edit plan and schdule");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        memPlan.setBackground(new java.awt.Color(255, 255, 255));
        memPlan.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        memPlan.setForeground(new java.awt.Color(0, 0, 0));
        memPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MemID", "Name", "Type", "Days_Plan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        memPlan.getTableHeader().setReorderingAllowed(false);
        memPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memPlanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memPlan);

        edit_btn.setBackground(new java.awt.Color(255, 255, 255));
        edit_btn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(0, 0, 0));
        edit_btn.setText("Edit Plan");
        edit_btn.setBorder(null);
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member ID:");

        Member_id_show.setBackground(new java.awt.Color(255, 255, 255));
        Member_id_show.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Member_id_show.setForeground(new java.awt.Color(0, 0, 0));
        Member_id_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Member_id_showActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Plan type:");

        BodyBuilding_Rd_btn.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(BodyBuilding_Rd_btn);
        BodyBuilding_Rd_btn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BodyBuilding_Rd_btn.setForeground(new java.awt.Color(255, 255, 255));
        BodyBuilding_Rd_btn.setText("Body building");
        BodyBuilding_Rd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BodyBuilding_Rd_btnActionPerformed(evt);
            }
        });

        Cardio_Rd_btn.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(Cardio_Rd_btn);
        Cardio_Rd_btn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Cardio_Rd_btn.setForeground(new java.awt.Color(255, 255, 255));
        Cardio_Rd_btn.setText("Cardio");
        Cardio_Rd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cardio_Rd_btnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Days_Plan:");

        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Plan_1 : sat, sun, mon.\n\nPlan_2 : mon, tue, wed.\n\nPlan_3 : All Week");
        jScrollPane3.setViewportView(jTextArea2);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Plan_1");
        jRadioButton1.setToolTipText("");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Plan_2");
        jRadioButton2.setToolTipText("");

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Plan_3");
        jRadioButton3.setToolTipText("");

        Show_members.setBackground(new java.awt.Color(255, 255, 255));
        Show_members.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Show_members.setForeground(new java.awt.Color(0, 0, 0));
        Show_members.setText("Show members");
        Show_members.setBorder(null);
        Show_members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_membersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BodyBuilding_Rd_btn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(Member_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Cardio_Rd_btn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Show_members, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(Member_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Cardio_Rd_btn)
                            .addComponent(BodyBuilding_Rd_btn)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Show_members, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Coach_Main CM = new Coach_Main();
        CM.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Member_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Member_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Member_id_showActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        if (!Member_id_show.getText().isEmpty()) {

            int MemID = Integer.parseInt(Member_id_show.getText());
            boolean found = false;
            String d = new String();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                    Statement stnt = con.createStatement();
                    ResultSet rs = stnt.executeQuery("select ID from users where ID > 1");

                    while (rs.next()) {
                        if (rs.getInt(1) == MemID) {
                            found = true;

                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(this, "User Not Found!");
                    }
                }
            } catch (ClassNotFoundException | SQLException a) {

                System.out.println(a);

            }
            boolean coachmem = false;
            if (found) {

                if (Coach.getCoachID(LoginPage.getCoachNameLogin()) == Coach.getMemCoachID(MemID)) {
                    coachmem = true;

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid member ID");
                    return;

                }
                if (coachmem) {
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                        try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                            PreparedStatement prep = con.prepareStatement("Update users set plan_type = ?, days_plan = ? where users.ID = ?");

                            if (Cardio_Rd_btn.isSelected()) {
                                prep.setString(1, "cardio");
                            } else if (BodyBuilding_Rd_btn.isSelected()) {
                                prep.setString(1, "body_building");
                            } else {
                                JOptionPane.showMessageDialog(this, "Please choose a plan");
                                return;
                            }

                            if (jRadioButton1.isSelected()) {
                                d = "plan_1";
                            } else if (jRadioButton2.isSelected()) {
                                d = "plan_2";
                            } else if (jRadioButton3.isSelected()) {
                                d = "plan_3";
                            } else {
                                JOptionPane.showMessageDialog(this, "Please choose a plan");
                                return;
                            }
                            prep.setString(2, d);

                            prep.setInt(3, Integer.parseInt(Member_id_show.getText()));

                            prep.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Updated successfully");

                        }
                    } catch (ClassNotFoundException | SQLException s) {
                        System.out.println(s);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid ID");

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "field cannot be empty");
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void Cardio_Rd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cardio_Rd_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cardio_Rd_btnActionPerformed

    private void memPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memPlanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_memPlanMouseClicked

    private void Show_membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_membersActionPerformed
        // TODO add your handling code here:
        String s = LoginPage.getCoachNameLogin();
        int cID = Coach.getCoachID(s);
        addPlanTable.setRowCount(0);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID, users.coach_id, users.fname, users.lname, plan_type, days_plan from users right join  coaches on coaches.ID = users.coach_id where users.ID > 1 ");
                while (rs.next()) {
                    if (rs.getInt(2) == cID) {
                        String id = String.valueOf(rs.getInt(1));
                        String memberName = rs.getString(3) + " " + rs.getString(4);

                        String plan_type = rs.getString(5);
                        String days_plan = rs.getString(6);
                        String tData[] = {id, memberName, plan_type, days_plan};
                        addPlanTable = (DefaultTableModel) memPlan.getModel();
                        addPlanTable.addRow(tData);
                    }

                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }//GEN-LAST:event_Show_membersActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage lg = new LoginPage();
        lg.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BodyBuilding_Rd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BodyBuilding_Rd_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BodyBuilding_Rd_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Coach_Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coach_Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coach_Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coach_Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coach_Plan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BodyBuilding_Rd_btn;
    private javax.swing.JRadioButton Cardio_Rd_btn;
    private javax.swing.JTextField Member_id_show;
    private javax.swing.JButton Show_members;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable memPlan;
    // End of variables declaration//GEN-END:variables
}