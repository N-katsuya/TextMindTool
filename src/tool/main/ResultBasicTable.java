/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ac.doshisha.bil0167.tool.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import jp.ac.doshisha.bil0167.tool.R.RFrame;

/**
 *
 * @author katsuya
 */
public class ResultBasicTable extends javax.swing.JFrame {
    private static  DefaultTableModel model;
    private static Vector<Vector<String>> tabledata;
    private static String path = "";
    private static Vector<String> columnnames = new Vector<String>();

    public static void setColumnnames(Vector<String> columnnames) {
        ResultBasicTable.columnnames = columnnames;
    }
    
    

    public static void setModel(DefaultTableModel model) {
        ResultBasicTable.model = model;
    }

    public static void setTabledata(Vector<Vector<String>> tabledata) {
        ResultBasicTable.tabledata = tabledata;
    }
    
    
    

    /**
     * Creates new form ResultBasicTable
     */
    public ResultBasicTable() {
        initComponents();
              this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
              
            }
        });  
    }
    
        public ResultBasicTable(DefaultTableModel model) {
        initComponents();
          ResultBasicTable.model = model;
          jTable1.setModel(model);
              this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
              
            }
        });  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("閉じる");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("保存");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Rで解析");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(67, 67, 67)
                .addComponent(jButton3)
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String outputpath = SelectBelongsFrame.getOutputpath();
        String outputfilename = SelectBelongsFrame.getOutputFilename();
        outputfilename = outputfilename.replaceAll(".txt", "");
        outputfilename = outputfilename.replaceAll(".csv", "");
        if(!outputpath.equals("出力先を指定して下さい。")){
             path = outputpath+"/result_"+outputfilename+".csv";
        }else{
            path = "./output/result_"+outputfilename+".csv";
        }
        StringBuilder stb = new StringBuilder();
        for(int i=0;i<columnnames.size();i++){
               if(i==columnnames.size()-1){
                    stb.append(columnnames.get(i)+"\n");
                }else{
                stb.append(columnnames.get(i)+",");
                }
           
        }
        for(Vector<String> temp:tabledata){
            for(int i =0;i<temp.size();i++){
                if(i==temp.size()-1){
                    stb.append(temp.get(i)+"\n");
                }else{
                stb.append(temp.get(i)+",");
                }
            }
            
        }
       // System.out.println(stb);
        try{
                 File outputFile = new File(path);
            //outputFile.createNewFile();

            FileOutputStream fos = new FileOutputStream(outputFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "Shift_JIS");
            PrintWriter pw = new PrintWriter(osw);
            pw.write(stb.toString());
            pw.close();
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            //  rb.checkR();
            if (Tool_Main.isFirstRF()) {

                RFrame rf = new RFrame(false, false);
                rf.setVisible(true);
                Tool_Main.setFirstRF(false);
            } else if (!Tool_Main.isIsRF()) {
                RFrame rf = new RFrame(false, false);
                rf.setVisible(true);
            }
            if (GuiRConsole.isInterrupt()) {
                GuiRConsole.getFrame().setVisible(true);
            } else 
                if (Tool_Main.isFirstGuiR()) {
                GuiRConsole.StartGUIRConsole();
                Tool_Main.setFirstGuiR(false);
            }
            StringBuilder stb2 = new StringBuilder();
//        for(int i=0;i<columnnames.size();i++){
//               if(i==columnnames.size()-1){
//                    stb2.append(columnnames.get(i)+"\n");
//                }else{
//                stb2.append(columnnames.get(i)+",");
//                }
//           
//        }
          //  stb2.append(",");
           for(int i =0;i<columnnames.size();i++){
                if(i==columnnames.size()-1){
                    stb2.append(columnnames.get(i)+"\n");
                }else{
                stb2.append(columnnames.get(i)+",");
                }
            }
     //       System.out.println(columnnames);
       //     System.out.println(stb2);
        for(Vector<String> temp:tabledata){
            for(int i =0;i<temp.size();i++){
                if(i==temp.size()-1){
                    stb2.append(temp.get(i)+"\n");
                }else{
                stb2.append(temp.get(i)+",");
                }
            }
            
        }
        
    //    Thread.sleep(3000);
                NameForm nm = new NameForm(stb2, ",");
                nm.setColumnnames(columnnames);

        nm.setVisible(true);
          //  JRIEngine engine = GuiRConsole.getRengine();

            //  RUtility.readInVector(engine.getRni(), FormatR.toString(), "\t", "temp");
            //GuiRConsole.setDefalutdataframe(true);

        } catch (Exception ex) {
            Logger.getLogger(Tool_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ResultBasicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultBasicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultBasicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultBasicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultBasicTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
