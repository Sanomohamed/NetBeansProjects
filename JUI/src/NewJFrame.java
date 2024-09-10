import javax.swing.ImageIcon;
import mylib.Validator;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        output = new java.awt.TextArea();
        rbf = new javax.swing.JRadioButton();
        rbm = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("     IC:");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setEnabled(false);

        bg.add(rbf);
        rbf.setSelected(true);
        rbf.setText("Female");
        rbf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfActionPerformed(evt);
            }
        });

        bg.add(rbm);
        rbm.setText("Male");
        rbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmActionPerformed(evt);
            }
        });

        jLabel3.setText("Gender");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/female.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rbf)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(rbm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtIC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(save)
                        .addGap(79, 79, 79)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(icon)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbf)
                    .addComponent(rbm)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        String name, ic , errName, errIC,err="";
        
        name = txtName.getText();
        ic = txtIC.getText();
        
        Validator v = new Validator(name);
        errName = v.validation(Validator.NAME_TYPE);
        
        v.setInput(ic);
        errIC = v.validation(Validator.IC_TYPE);
        
        if (!errName.isEmpty()){
            err+=errName+"\n";
        }
        if (!errIC.isEmpty()){
            err+=errIC+"\n";
        }
        if (errName.isEmpty()&& errIC.isEmpty()){
            output.setText("Record Save");
        }
        else
            output.setText(err);  
    }//GEN-LAST:event_saveActionPerformed

      
     
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void rbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmActionPerformed
       if(rbm.isSelected()){
           icon.setIcon(new ImageIcon(getClass().getResource("image/male.png")));
       }
        if(rbf.isSelected()){
           icon.setIcon(new ImageIcon(getClass().getResource("image/female.png")));
       }   
    }//GEN-LAST:event_rbmActionPerformed

    private void rbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbfActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextArea output;
    private javax.swing.JRadioButton rbf;
    private javax.swing.JRadioButton rbm;
    private javax.swing.JButton save;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
