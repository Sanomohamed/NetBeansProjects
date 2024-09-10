import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        fileChooser.setCurrentDirectory(new File("D:\\"));
        
        MyFileFilter myFileFilter = new MyFileFilter("Text Files",".txt");
        MyFileFilter pdfFilter = new MyFileFilter("Text pdf",".pdf"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mmnew = new javax.swing.JMenuItem();
        mmopen = new javax.swing.JMenuItem();
        mmsave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmexit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mmabout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("notepad");

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        jMenu1.setText("File");

        mmnew.setText("New");
        mmnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmnewActionPerformed(evt);
            }
        });
        jMenu1.add(mmnew);

        mmopen.setText("Open");
        mmopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmopenActionPerformed(evt);
            }
        });
        jMenu1.add(mmopen);

        mmsave.setText("Save");
        mmsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmsaveActionPerformed(evt);
            }
        });
        jMenu1.add(mmsave);
        jMenu1.add(jSeparator1);

        mmexit.setText("Exit");
        mmexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmexitActionPerformed(evt);
            }
        });
        jMenu1.add(mmexit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");

        mmabout.setText("About Us");
        jMenu3.add(mmabout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmopenActionPerformed
        int option = fileChooser.showOpenDialog(this);
        
        if(option==JFileChooser.APPROVE_OPTION){
            
            file=fileChooser.getSelectedFile();
            try {
                
                FileReader fr =new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String line,message="";
                
                while((line = br.readLine()) != null){
                message+=line+"\n";
            }
                txtoutput.setText(message);
                br.close();
                fr.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mmopenActionPerformed

    private void mmnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmnewActionPerformed
     txtoutput.setText("");
     file=null;
    }//GEN-LAST:event_mmnewActionPerformed

    private void mmsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmsaveActionPerformed
       int option = fileChooser.showSaveDialog(this);
       
       if(option==JFileChooser.APPROVE_OPTION){
           file = fileChooser.getSelectedFile();
           if(!file.getName().endsWith(".txt"))
           file = new File(file.getAbsoluteFile()+".txt");
           //System.out.println(file.getAbsoluteFile());
           
           try{
               FileWriter fw = new FileWriter(file);
               fw.write(txtoutput.getText());
               fw.flush();
               fw.close();
           } catch (IOException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_mmsaveActionPerformed

    private void mmexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmexitActionPerformed
       
    }//GEN-LAST:event_mmexitActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public class MyFileFilter extends FileFilter{
        
        private String description,extention;

        public MyFileFilter(String description, String extention) {
            this.description = description;
            this.extention = extention;
        }
        @Override
        public boolean accept(File f) {
            return f.getName().endsWith(extention);
        }

        @Override
        public String getDescription() {
            return description+String.format("(*%s)",extention);
        }
        
    }

    File file;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mmabout;
    private javax.swing.JMenuItem mmexit;
    private javax.swing.JMenuItem mmnew;
    private javax.swing.JMenuItem mmopen;
    private javax.swing.JMenuItem mmsave;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
