import java.util.ArrayList;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncalculateBMI = new javax.swing.JButton();
        txtstatus = new javax.swing.JTextField();
        output = new javax.swing.JTextField();
        txtBMI = new javax.swing.JTextField();
        btnd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtAge1 = new javax.swing.JTextField();
        txtWeight1 = new javax.swing.JTextField();
        txtHeight1 = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAge2 = new javax.swing.JTextField();
        txtWeight2 = new javax.swing.JTextField();
        txtHeight2 = new javax.swing.JTextField();
        btnu = new javax.swing.JButton();
        txtup = new javax.swing.JTextField();
        cbName = new javax.swing.JComboBox<>();
        btnr = new javax.swing.JButton();
        btnd1 = new javax.swing.JButton();
        output1 = new javax.swing.JTextField();
        txtName4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnde1 = new javax.swing.JButton();
        txtde1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 2147));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 3276));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Weight");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Height");

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncalculateBMI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncalculateBMI.setText("Calculate BMI");
        btncalculateBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateBMIActionPerformed(evt);
            }
        });

        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        txtBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBMIActionPerformed(evt);
            }
        });

        btnd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnd.setText("Display Record");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        jLabel9.setText("M");

        jLabel14.setText("KG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txtstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnd)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(btncalculateBMI))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(205, 205, 205))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(49, 49, 49)
                        .addComponent(btncalculateBMI)
                        .addGap(28, 28, 28)
                        .addComponent(btnsave)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtWeight)
                            .addComponent(jLabel14))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnd))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("New", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(619, 600));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Age");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Weight");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Height");

        txtWeight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeight1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("To");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("To");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("To");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("To");

        btnu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnu.setText("Update");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        cbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNameActionPerformed(evt);
            }
        });

        btnr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnr.setText("Refresh");
        btnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrActionPerformed(evt);
            }
        });

        btnd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnd1.setText("Display Records");
        btnd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd1ActionPerformed(evt);
            }
        });

        output1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output1ActionPerformed(evt);
            }
        });

        txtName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("To");

        btnde1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnde1.setText("Delete");
        btnde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnde1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtAge1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                .addComponent(txtWeight1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addComponent(jLabel13))
                                    .addComponent(txtHeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtde1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtup, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnde1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnr))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 42, Short.MAX_VALUE)
                                .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAge2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtHeight2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnd1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(cbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnu)))))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtWeight1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtHeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtHeight2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(btnde1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtup, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtde1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnde1ActionPerformed
        String nameToDelete = txtName4.getText();
        boolean recordDeleted = false;

        for (int i = 0; i < Users.size(); i++) {
            Person person = Users.get(i);
            if (person.getName().equals(nameToDelete)) {
                Users.remove(i); // Remove the record from the list
                recordDeleted = true;
                break;
            }
        }

        if (recordDeleted) {
            txtde1.setText("Record deleted!");
        } else {
            txtde1.setText("Record not found!");
        }
    }//GEN-LAST:event_btnde1ActionPerformed

    private void txtName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName4ActionPerformed

    private void output1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_output1ActionPerformed

    private void btnd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd1ActionPerformed
        String msg="";

        for(Person p: Users){
            msg+=p.toString()+"\n";
            output1.setText(msg);
        }
    }//GEN-LAST:event_btnd1ActionPerformed

    private void btnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrActionPerformed
        cbName.removeAllItems();

        for(Person P : Users){
            cbName.addItem(P.getName());
        }

        if (Users.size()>0){
            Person p = Users.get(0);
            txtName1.setText(p.getName());
            txtAge1.setText(String.valueOf(p.getAge()));
            txtWeight1.setText(String.valueOf(p.getWeight()));
            txtHeight1.setText(String.valueOf(p.getHeight()));
            txtBMI.setText(String.valueOf(p.getBMI()));
        }
    }//GEN-LAST:event_btnrActionPerformed

    private void cbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNameActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        String nameToUpdate = txtName1.getText();
        String name = txtName2.getText();
        int age = Integer.parseInt(txtAge2.getText());
        double weight = Double.parseDouble(txtWeight2.getText());
        double height = Double.parseDouble(txtHeight2.getText());

        double BMI;

        BMI = weight / (height * height);
        txtBMI.setText(String.format("%.2f", BMI));

        boolean recordUpdated = false;

        for (Person person : Users) {
            if (person.getName().equals(nameToUpdate)) {

                person.setName(name);
                person.setAge(age);
                person.setWeight(weight);
                person.setHeight(height);
                person.setBMI(BMI);
                //need to add BMI update calculation.

                recordUpdated = true;
                break;
            }
        }

        if (recordUpdated) {
            txtup.setText("Record updated!");
        } else {
            txtup.setText("Record not found!"); // Record with the given name was not found
        }

        Users.add(new Person(name, age, weight, height,BMI));
        txtName2.setText("");
        txtName1.setText("");
        txtAge2.setText("");
        txtAge1.setText("");
        txtWeight2.setText("");
        txtWeight1.setText("");
        txtHeight2.setText("");
        txtHeight1.setText("");
        
    }//GEN-LAST:event_btnuActionPerformed

    private void txtWeight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeight1ActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        String msg="";

        for(Person p: Users){
            msg+=p.toString()+"\n";
            output.setText(msg);
        }
    }//GEN-LAST:event_btndActionPerformed

    private void txtBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBMIActionPerformed

    }//GEN-LAST:event_txtBMIActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

    private void btncalculateBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateBMIActionPerformed
        double weight = Double.parseDouble(txtWeight.getText());
        double height = Double.parseDouble(txtHeight.getText());
        double BMI;

        BMI = weight / (height * height);
        txtBMI.setText(String.format("%.2f", BMI).trim());

    }//GEN-LAST:event_btncalculateBMIActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        double height = Double.parseDouble(txtHeight.getText());
        double BMI = Double.parseDouble(txtBMI.getText());

        Users.add(new Person(name, age, weight, height,BMI));
        txtName.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        txtHeight.setText("");
        txtBMI.setText(" ");

        txtstatus.setText("Record added!");

    }//GEN-LAST:event_btnsaveActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
      ArrayList<Person>Users = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculateBMI;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnd1;
    private javax.swing.JButton btnde1;
    private javax.swing.JButton btnr;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnu;
    private javax.swing.JComboBox<String> cbName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField output;
    private javax.swing.JTextField output1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtAge2;
    private javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHeight1;
    private javax.swing.JTextField txtHeight2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtName4;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWeight1;
    private javax.swing.JTextField txtWeight2;
    private javax.swing.JTextField txtde1;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtup;
    // End of variables declaration//GEN-END:variables
}
