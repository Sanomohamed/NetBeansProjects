
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        
        File path = new File("C:\\Users\\Hp\\Desktop");
        File file = new File(path,"Letter of Undertaking.docx");
        
        String canRead = file.canRead()?"can read":"cannot read";
        
        long d = file.lastModified();
        Date date = new Date(d);
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy HH:mm:ss");
        
        boolean gender=false;
        
        String genderStr = gender?"male":"female";
        int age = 25;
        String legal = (age>21)?"Legal to drive":"Illegal to drive";
        
        output.setText(String.valueOf(d));
        output.setText(file.getAbsolutePath()+" "+canRead);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsave = new javax.swing.JButton();
        btnload = new javax.swing.JButton();
        txfilename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnload.setText("Load");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });

        txfilename.setText("Text.txt");

        jLabel1.setText("File Name:");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfilename, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addGap(163, 163, 163)
                        .addComponent(btnload)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnload))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        file = new File(path,txfilename.getText());
       try{
        FileWriter fw = new FileWriter(file);
        fw.write(output.getText());
        fw.flush();
        fw.close();
        output.setText("");
       }catch(IOException ex){
           ex.printStackTrace(); 
       }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
        file = new File(path,txfilename.getText());
        try {
            FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader (fr);
            String data,message="";
          while((data=br.readLine())!=null){
              message+=data+"\n";
          }
          output.setText(message);
          fr.close();
     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnloadActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    File path = new File("C:\\Users\\Hp\\Desktop");
    File file;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField txfilename;
    // End of variables declaration//GEN-END:variables
}
