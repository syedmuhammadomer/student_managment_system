
package Student_mamagment_System;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Add_Grades extends javax.swing.JFrame {


    public Add_Grades() {
        initComponents();
        display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Field6 = new javax.swing.JTextField();
        Field9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        Field2 = new javax.swing.JTextField();
        Field3 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        Field4 = new javax.swing.JTextField();
        f4 = new javax.swing.JTextField();
        f5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Field6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Field6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field6ActionPerformed(evt);
            }
        });
        Field6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field6KeyReleased(evt);
            }
        });
        jPanel6.add(Field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 220, 40));

        Field9.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Field9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field9ActionPerformed(evt);
            }
        });
        jPanel6.add(Field9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 220, 40));

        jTextField13.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 160, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel7.setText("ROLL NO:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 110, 40));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, 40));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 50, 540));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("UPDATE MARKS ");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 340, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jButton2.setText("UPLOAD");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 180, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("Semester ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 50));

        f1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        f1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel6.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 220, 40));

        f2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        f2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel6.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, 40));

        Field2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Field2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field2ActionPerformed(evt);
            }
        });
        jPanel6.add(Field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 220, 40));

        Field3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Field3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field3ActionPerformed(evt);
            }
        });
        jPanel6.add(Field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 220, 40));

        f3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        f3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        jPanel6.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 40));

        Field4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Field4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field4ActionPerformed(evt);
            }
        });
        jPanel6.add(Field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 220, 40));

        f4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        f4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });
        jPanel6.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 220, 40));

        f5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        f5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });
        jPanel6.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 220, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("COURSE MARKS ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 210, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COURSE NAME ");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 110, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
       
    }//GEN-LAST:event_f3ActionPerformed

    private void Field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field4ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field2ActionPerformed

    private void Field6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Field6KeyReleased

    private void Field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String Roll = jTextField13.getText();
     String GradeA = Field6.getText();
     String GradeB = Field2.getText();
     String GradeC = Field3.getText();
     String GradeD = Field4.getText();
     String GradeE = Field9.getText();
     insert(Roll,GradeA,GradeB,GradeC,GradeD,GradeE);
    }
    public void insert(String Roll_Number,String GradeA ,String GradeB ,String GradeC ,String GradeD ,String GradeE){
        
        try{
        
        java.sql.Connection conn=  connection.connect();
        PreparedStatement ps=null ;
        
        String sql = "INSERT INTO Grades(Roll_Number,GradeA,GradeB,GradeC,GradeD,GradeE) VALUES(?,?,?,?,?,?)";  
        ps = conn.prepareStatement(sql);
        ps.setString(1,Roll_Number );
        ps.setString(2, GradeA);
        ps.setString(3, GradeB);
        ps.setString(4, GradeC);
        ps.setString(5, GradeD);
        ps.setString(6, GradeE);

        ps.execute();
        ps.close();
        conn.close();
        
        JOptionPane.showMessageDialog(null, "Record has Been Updeted new Student");
        }
        catch(SQLException e){
            System.out.println(e.toString()); 
        } 
                
            
        
       
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f5ActionPerformed
    public void check(){
        Connection conn= connection.connect();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
               String sql="SELECT * From Student Where Roll_Number=?;";
               try {
                   ps=conn.prepareStatement(sql);
                   ps.setString(1, jTextField13.getText());
                    rs=ps.executeQuery();
                   if(rs.next()){
                      
                    }
                   else{
                        JOptionPane.showMessageDialog(null, "Roll Number Not Found");
                   }
                   
               } catch (SQLException ex) {
                   Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
               }
               ps.close();
               conn.close();
           } catch (SQLException ex) {
               Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
       check();
    }//GEN-LAST:event_jTextField13ActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      display();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field6ActionPerformed

    private void Field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          Add_Grades SR;
                   SR = new  Add_Grades();
                   SR.setVisible(false);
                        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void display(){
        java.sql.Connection conn= connection.connect();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            String S = (String)jComboBox1.getSelectedItem();
            System.out.println(S);
            String sql = "select * from Course where Semester = ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,S );
            rs=ps.executeQuery();
            if(rs.next()){
                String C1= rs.getString(2);
                f1.setText(C1);
                String C2= rs.getString(4);
                f2.setText(C2);
                String C3= rs.getString(6);
                f3.setText(C3);
                String C4= rs.getString(8);
                f4.setText(C4);
                String C5= rs.getString("CourseE");
                f5.setText(C5);
                System.out.println(C1);
               
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_Grades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Grades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Field2;
    private javax.swing.JTextField Field3;
    private javax.swing.JTextField Field4;
    private javax.swing.JTextField Field6;
    private javax.swing.JTextField Field9;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField13;
    // End of variables declaration//GEN-END:variables

}
