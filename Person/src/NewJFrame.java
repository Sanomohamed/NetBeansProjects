import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        
        errorname.setVisible(false);
        errorICno.setVisible(false);
        erroremail.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtICno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        errorname = new javax.swing.JLabel();
        errorICno = new javax.swing.JLabel();
        erroremail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Name :");

        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });

        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("IC NO :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email : ");

        txtICno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtICnoFocusLost(evt);
            }
        });

        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });

        errorname.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        errorname.setForeground(new java.awt.Color(255, 0, 0));
        errorname.setText("jLabel1");

        errorICno.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        errorICno.setForeground(new java.awt.Color(255, 0, 0));
        errorICno.setText("jLabel1");

        erroremail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        erroremail.setForeground(new java.awt.Color(255, 0, 0));
        erroremail.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erroremail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(errorICno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtICno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(errorname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtname))
                                .addGap(70, 70, 70))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Save)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorname)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtICno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorICno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(erroremail, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       
        namePattern = "^([a-zA-Z]+)((\\s[a-zA-Z]+)*)$";                     
        ICnoPattern = "^(\\d{6})-(\\d{2})-(\\d{4})$";
        emailPattern = "^(\\w+)((.\\w+)*)@(\\w+)((\\w+.)*)$";
        valid=true;
        
        
       name = txtname.getText();
       ICno = txtICno.getText();
       email = txtemail.getText();
       
       validname();
       validICno();
       validemail();
       
       
       if(valid){
           person = new Person(name,ICno,email);
           JOptionPane.showMessageDialog(this, "Record Saved!", "Status", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           
       }
        
    }//GEN-LAST:event_SaveActionPerformed

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        name=txtname.getText();
        validname();
    }//GEN-LAST:event_txtnameFocusLost

    private void txtICnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtICnoFocusLost
        ICno = txtICno.getText();
        validICno();
    }//GEN-LAST:event_txtICnoFocusLost

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        email = txtemail.getText();
        validemail();
    }//GEN-LAST:event_txtemailFocusLost
     
     public void validname(){
         
         pattern = Pattern.compile(namePattern);
         matcher = pattern.matcher(name);
         
         if(matcher.matches()){
             
         }
         else{
             
            errorname.setText("Name cannot be blank and must contain aphabet only!");
            errorname.setVisible(true);
            valid = false;
         }
      }
     
      public void validICno(){
         
         pattern = Pattern.compile(ICnoPattern);
         matcher = pattern.matcher(ICno);
         
         if(matcher.matches()){
             
         }
         else{
             
            errorICno.setText("IC must be in the format 123456-12-1234!");
            errorICno.setVisible(true);
            valid = false;
         }
     }
      
       public void validemail(){
         
        pattern = Pattern.compile(emailPattern);
         matcher = pattern.matcher(email);
         
         if(matcher.matches()){
             
         }
         else{
             
            erroremail.setText("Email format abc@def.com!");
            erroremail.setVisible(true);
            valid = false;
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    String name,ICno,email,namePattern,ICnoPattern,emailPattern;
    
    Pattern pattern;
    Matcher matcher;
    Person person;
    boolean valid;
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JLabel errorICno;
    private javax.swing.JLabel erroremail;
    private javax.swing.JLabel errorname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtICno;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
