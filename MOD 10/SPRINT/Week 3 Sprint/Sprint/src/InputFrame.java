package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aidan
 */
public class InputFrame extends javax.swing.JFrame {

    /**
     * Creates new form InputFrame
     */
    public InputFrame() {
        initComponents();
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
        btnLearnerUpdate = new javax.swing.JButton();
        btnLearnerInsert = new javax.swing.JButton();
        tfLearnerName = new javax.swing.JTextField();
        tfLearnerSurname = new javax.swing.JTextField();
        tfLearnerID = new javax.swing.JTextField();
        tfLearnerDOB = new javax.swing.JTextField();
        tfLearnerGender = new javax.swing.JTextField();
        tfLearnerGrade = new javax.swing.JTextField();
        tfLearnerParentID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblLearnerID = new javax.swing.JLabel();
        lblParentID = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        cmbHomeLang = new javax.swing.JComboBox<>();
        cmbFirstAddLang = new javax.swing.JComboBox<>();
        lblHomeLang = new javax.swing.JLabel();
        lblFirstAddLang = new javax.swing.JLabel();
        lblMath = new javax.swing.JLabel();
        cmbMath = new javax.swing.JComboBox<>();
        lblForcedSubject = new javax.swing.JLabel();
        tfForcedSub = new javax.swing.JTextField();
        tfChoiceSub1 = new javax.swing.JTextField();
        tfChoiceSub2 = new javax.swing.JTextField();
        tfChoiceSub3 = new javax.swing.JTextField();
        lblChoiceSub1 = new javax.swing.JLabel();
        lblChoiceSub2 = new javax.swing.JLabel();
        lblChoiceSub3 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLearnerUpdate.setText("Update");
        btnLearnerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerUpdateActionPerformed(evt);
            }
        });

        btnLearnerInsert.setText("Insert");
        btnLearnerInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerInsertActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        lblSurname.setText("Surname");

        lblLearnerID.setText("Learner ID");

        lblParentID.setText("Parent ID");

        lblDateOfBirth.setText("Date Of Birth");

        lblGender.setText("Gender");

        lblGrade.setText("Grade");

        cmbHomeLang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English HL", "Afrikaans HL" }));
        cmbHomeLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHomeLangActionPerformed(evt);
            }
        });

        cmbFirstAddLang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English FAL", "Afrikaans FAL" }));
        cmbFirstAddLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFirstAddLangActionPerformed(evt);
            }
        });

        lblHomeLang.setText("Home Language");

        lblFirstAddLang.setText("FAL");

        lblMath.setText("Math");

        cmbMath.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mathematics", "Math Literacy" }));
        cmbMath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMathActionPerformed(evt);
            }
        });

        lblForcedSubject.setText("Forced Subject");

        tfForcedSub.setEditable(false);
        tfForcedSub.setText("Life Orientation");

        lblChoiceSub1.setText("First Choice Subject");

        lblChoiceSub2.setText("Second Choice Subject");

        lblChoiceSub3.setText("Third Choice Subject");

        lblAge.setText("Age");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLearnerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLearnerID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLearnerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSurname)
                                            .addComponent(lblLearnerID)))
                                    .addComponent(tfLearnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfLearnerParentID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblParentID))
                                        .addGap(17, 17, 17))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfAge)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblAge)
                                                .addGap(14, 14, 14)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblGender)
                                                    .addComponent(lblGrade))
                                                .addGap(34, 34, 34))
                                            .addComponent(tfLearnerDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfLearnerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLearnerGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLearnerInsert))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfForcedSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbHomeLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfChoiceSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(tfChoiceSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbFirstAddLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblForcedSubject))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblChoiceSub1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblChoiceSub2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHomeLang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFirstAddLang)
                                        .addGap(52, 52, 52))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblName)
                                .addGap(139, 139, 139)
                                .addComponent(lblDateOfBirth)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblChoiceSub3)
                                    .addGap(73, 73, 73))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(tfChoiceSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cmbMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(86, 86, 86)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMath)
                                .addGap(134, 134, 134))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblHomeLang)
                    .addComponent(lblFirstAddLang)
                    .addComponent(lblMath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfLearnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSurname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLearnerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLearnerID)
                            .addComponent(lblParentID)
                            .addComponent(lblGrade))
                        .addGap(44, 44, 44)
                        .addComponent(btnLearnerUpdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfLearnerDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbHomeLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFirstAddLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGender)
                                    .addComponent(lblForcedSubject))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLearnerGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfForcedSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChoiceSub1)
                            .addComponent(lblChoiceSub2)
                            .addComponent(lblChoiceSub3))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLearnerGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfChoiceSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfChoiceSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfChoiceSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLearnerParentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLearnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLearnerInsert)))
                .addContainerGap(17, Short.MAX_VALUE))
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



        btnLearnerUpdate.setVisible(false);
        btnLearnerInsert.setVisible(true);
        
        cmbHomeLang.setSelectedIndex(0);
        cmbFirstAddLang.setSelectedIndex(1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLearnerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerUpdateActionPerformed
        
    }//GEN-LAST:event_btnLearnerUpdateActionPerformed

    private void btnLearnerInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerInsertActionPerformed
       
        NewJFrame.readInLearner(tfLearnerID.getText(), tfLearnerName.getText(), tfLearnerSurname.getText(), tfLearnerDOB.getText(), tfLearnerGender.getText(), 
        tfLearnerGrade.getText(), tfLearnerParentID.getText(), tfAge.getText(), cmbHomeLang.getItemAt(cmbHomeLang.getSelectedIndex()),
        cmbFirstAddLang.getItemAt(cmbFirstAddLang.getSelectedIndex()), cmbMath.getItemAt(cmbMath.getSelectedIndex()), tfForcedSub.getText(),
        tfChoiceSub1.getText(), tfChoiceSub2.getText(), tfChoiceSub3.getText());
    }//GEN-LAST:event_btnLearnerInsertActionPerformed

    private void cmbHomeLangActionPerformed(java.awt.event.ActionEvent evt) { 
        if(cmbHomeLang.getSelectedIndex() == 1){
            cmbFirstAddLang.setSelectedIndex(0);
        }   
        else if(cmbHomeLang.getSelectedIndex() == 0){
            cmbFirstAddLang.setSelectedIndex(1);
        }                                        
        
    }                                           

    private void cmbFirstAddLangActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(cmbFirstAddLang.getSelectedIndex() == 1){
            cmbHomeLang.setSelectedIndex(0);
        }   
        else if(cmbFirstAddLang.getSelectedIndex() == 0){
            cmbHomeLang.setSelectedIndex(1);
        } 
    }                                               

    private void cmbMathActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
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
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLearnerInsert;
    private javax.swing.JButton btnLearnerUpdate;
    private static javax.swing.JComboBox<String> cmbFirstAddLang;
    private static javax.swing.JComboBox<String> cmbHomeLang;
    private static javax.swing.JComboBox<String> cmbMath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblChoiceSub1;
    private javax.swing.JLabel lblChoiceSub2;
    private javax.swing.JLabel lblChoiceSub3;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstAddLang;
    private javax.swing.JLabel lblForcedSubject;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblHomeLang;
    private javax.swing.JLabel lblLearnerID;
    private javax.swing.JLabel lblMath;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParentID;
    private javax.swing.JLabel lblSurname;
    private static javax.swing.JTextField tfAge;
    private static javax.swing.JTextField tfChoiceSub1;
    private static javax.swing.JTextField tfChoiceSub2;
    private static javax.swing.JTextField tfChoiceSub3;
    private static javax.swing.JTextField tfForcedSub;
    private static javax.swing.JTextField tfLearnerDOB;
    private static javax.swing.JTextField tfLearnerGender;
    private static javax.swing.JTextField tfLearnerGrade;
    private static javax.swing.JTextField tfLearnerID;
    private static javax.swing.JTextField tfLearnerName;
    private static javax.swing.JTextField tfLearnerParentID;
    private static javax.swing.JTextField tfLearnerSurname;
    // End of variables declaration//GEN-END:variables
}