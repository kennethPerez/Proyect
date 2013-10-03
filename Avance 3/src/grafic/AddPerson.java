/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic;
import logic.*;
import javax.swing.JOptionPane;


public class AddPerson extends javax.swing.JFrame {

    /**
     * Creates new form AddStudents
     */
    public AddPerson() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newname = new javax.swing.JTextField();
        newidentity = new javax.swing.JTextField();
        newcode = new javax.swing.JTextField();
        newpin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PersonType = new javax.swing.JComboBox();
        Semesterlabel = new javax.swing.JLabel();
        newAge = new javax.swing.JSpinner();
        semester = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Add New Person");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Identity:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Code:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Pin:");

        newname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newnameKeyTyped(evt);
            }
        });

        newidentity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newidentityKeyTyped(evt);
            }
        });

        newcode.setEditable(false);
        newcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newcodeKeyTyped(evt);
            }
        });

        newpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpinActionPerformed(evt);
            }
        });
        newpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newpinKeyTyped(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Person type");

        PersonType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Professor", "Coordinator" }));
        PersonType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonTypeActionPerformed(evt);
            }
        });

        Semesterlabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Semesterlabel.setText("Semester:");

        newAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 100, 1));

        semester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(Semesterlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonType, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newname)
                                    .addComponent(newidentity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newcode)
                                    .addComponent(newpin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                .addGap(87, 87, 87)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newidentity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Semesterlabel)
                    .addComponent(jButton2)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(newname.getText().equals("") || newidentity.getText().equals("") || newcode.getText().equals("") || newpin.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Any field most by empty","Message",JOptionPane.WARNING_MESSAGE); 
        }
        else{
            String type = (String) PersonType.getSelectedItem();
            String name = newname.getText();
            String identity = newidentity.getText();
            String code = newcode.getText();
            int age = Integer.parseInt(newAge.getValue().toString());
            int pin = Integer.parseInt(newpin.getText());

            switch (type) {
                 
                case "Professor":
                     Professor professor = new Professor(code, pin, name, identity, age);
                     professor.insert();
                     break;
                 
                 case "Student":
                     String s = (String) semester.getSelectedItem();
                     Students student = new Students(code, pin, s, name, identity, age);
                     student.insert();
                     break;
                 
                 case "Coordinator":
                     Coordinator coordinator = new Coordinator(code, pin, name, identity, age);
                     coordinator.insert();
                     break;
                 
                 default:
                     JOptionPane.showMessageDialog(null, "Error");
             }
            
            JOptionPane.showMessageDialog(null, "Complete Process", "Message", JOptionPane.OK_CANCEL_OPTION);
            main.AddCode();
            this.dispose();
            main.coordinatorW.setVisible(true);
            newname.setText("");
            newidentity.setText("");
            newcode.setText("");
            newpin.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newpinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpinKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(newpin.getText().length()>=4) {
            evt.consume();
        }
        if((car<'0' || car>'9')) {
            evt.consume();
        }
    }//GEN-LAST:event_newpinKeyTyped

    private void newcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newcodeKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(newcode.getText().length()>=9) {
            evt.consume();
        }
        if((car<'0' || car>'9')) {
            evt.consume();
        }
    }//GEN-LAST:event_newcodeKeyTyped

    private void newnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newnameKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if((car<'a' || car>'z')&&(car<'A' || car>'Z')&&(car<' '||car>' ')) {
            evt.consume();
        }
        
    }//GEN-LAST:event_newnameKeyTyped

    private void newidentityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newidentityKeyTyped
        // TODO add your handling code here:
          char car = evt.getKeyChar();
        if(newidentity.getText().length()>=9) {
            evt.consume();
        }
        if((car<'0' || car>'9')&&(car<'-'||car>'-')) {
            evt.consume();
        }
        
    }//GEN-LAST:event_newidentityKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        main.coordinatorW.setVisible(true);
        newname.setText("");
        newidentity.setText("");
        newcode.setText("");
        newpin.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PersonTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonTypeActionPerformed
        String t = (String) PersonType.getSelectedItem();
        if(t.equals("Professor") || t.equals("Coordinator")){
            semester.disable();
        }
        else{
            semester.enable();
        }
    }//GEN-LAST:event_PersonTypeActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

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
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPerson().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox PersonType;
    private javax.swing.JLabel Semesterlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner newAge;
    public static javax.swing.JTextField newcode;
    private javax.swing.JTextField newidentity;
    private javax.swing.JTextField newname;
    private javax.swing.JTextField newpin;
    private javax.swing.JComboBox semester;
    // End of variables declaration//GEN-END:variables
}