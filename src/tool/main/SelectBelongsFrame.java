/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ac.doshisha.bil0167.tool.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author katsuya
 */
public class SelectBelongsFrame extends javax.swing.JFrame {

    public static int belongsnumber = 3;
    private static DefaultMutableTreeNode root = new DefaultMutableTreeNode("属性");
    public static DefaultTreeModel model;

    private static DefaultListModel listModel;
    public static String ForR;
    public static ArrayList dataarray;
    public static ArrayList<TreeSet<String>>tree;
    public static Vector<String>columnnames;
    public static boolean isColumnname = false;
    public static String outputpath;
    public static String outputFilename;

    public static String getOutputFilename() {
        return outputFilename;
    }

    public static void setOutputFilename(String outputFilename) {
        SelectBelongsFrame.outputFilename = outputFilename;
    }
    

    public static void setOutputpath(String outputpath) {
        SelectBelongsFrame.outputpath = outputpath;
    }

    public static String getOutputpath() {
        return outputpath;
    }
    
    
    

    public static void setTree(ArrayList<TreeSet<String>> tree) {
        SelectBelongsFrame.tree = tree;
    }

    public static void setColumnnames(Vector<String> columnnames) {
        SelectBelongsFrame.columnnames = columnnames;
    }
    
    

    public static void setDataarray(ArrayList dataarray) {
        SelectBelongsFrame.dataarray = dataarray;
    }

    public static String getForR() {
        return ForR;
    }

    /**
     * Creates new form SelectBelongsFrame
     */
    
    public SelectBelongsFrame() {
        initComponents();
//        for(int i = 0;i<belongsnumber;i++){
//            SelectBelongFrame sbf = new SelectBelongFrame();
//            sbf.setVisible(true);
//            while(sbf.isEnabled()){
//                
//            }
//        }
//        SelectBelongFrame sbf = new SelectBelongFrame();
//        sbf.setVisible(true);
//        while(sbf.isDisplayable()){
//            
//        }
        listModel = new DefaultListModel();
        jList1.setModel(listModel);
        root = new DefaultMutableTreeNode("属性");
       // System.out.println("a");
    //    root = setNode(dataarray, root);
setNode();
        model = new DefaultTreeModel(root);
        jTree1.setModel(model);

    }
        public SelectBelongsFrame(ArrayList<TreeSet<String>> tree,Vector<String> columnnames,boolean isColumnname) {
        initComponents();
   // SelectBelongsFrame.tree = new   ArrayList<TreeSet<String>>();
    //SelectBelongsFrame.columnnames = new Vector<String>();
        
     root = new DefaultMutableTreeNode("属性");
SelectBelongsFrame.tree = tree;
SelectBelongsFrame.columnnames = columnnames;
SelectBelongsFrame.isColumnname = isColumnname;
        listModel = new DefaultListModel();
        jList1.setModel(listModel);
      setNode();
        model = new DefaultTreeModel(root);
        jTree1.setModel(model);
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
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("キャンセル");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 222, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jButton4)
                .addGap(65, 65, 65))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        jButton3.setText("実行");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButton3)
                        .addGap(77, 77, 77)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(29, 29, 29))
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
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        root.remove(1);
//        model.reload();
//        repaint();
listModel.removeAllElements();
        ArrayList<String> array = new ArrayList<String>();
        TreePath[] path = jTree1.getSelectionPaths();
        for (int i = 0; i < path.length; i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) path[i].getLastPathComponent();
            if(node.isRoot()){
                array.add("指定なし");
                break;
            }

            String data = (String) node.getUserObject();
            int childcount = node.getChildCount();
              if(childcount==0){
                array.add(data);
            }else
            if(childcount!=0){
                for(int j=0;j<childcount;j++){
                    DefaultMutableTreeNode child = (DefaultMutableTreeNode) node.getChildAt(j);
                      String childdata = (String) child.getUserObject();
                      array.add(childdata);
                }
                break;
            }
            
          
             
          

//            DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
//            String parentdata = (String) parent.getUserObject();

            
        }
        for (String temp : array) {
            listModel.addElement(temp);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Object[] selectedValues = jList1.getSelectedValues();

        for (Object value : selectedValues) {
            listModel.removeElement(value);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

 
        ArrayList<String> allElements = getAllElements();
      //  System.out.println(allElements);
        String outputfilename = MecabBasicProcessing.ExMecab(Tool_Main.getPath(), Tool_Main.getFilename(),isColumnname);
        ArrayList<String> selectbelongs =getAllElements();
        ArrayList<String> selecttags = Tool_Main.getSelectedtags();
        if(selecttags.isEmpty()){
            selecttags.add("名詞");
        }
     //   System.out.println("outputfilename:"+outputfilename);
     //   System.out.println(outputfilename);
        ThreadTextProcessing stp = new ThreadTextProcessing(outputfilename, selectbelongs, selecttags);
        stp.run();
        
//f.dispose();
        // dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    public static ArrayList getAllElements() {
        ArrayList array = new ArrayList();
        for (int i = 0; i < listModel.size(); i++) {
            //  System.out.println(model2.getElementAt(i));
            array.add(listModel.getElementAt(i));
        }
        return array;
    }

 public static ArrayList<String> formatBelongs(ArrayList<String> allelements){
     ArrayList<String> result = new ArrayList<String>();
     
     
     
     return result;
 }
    
        public static DefaultMutableTreeNode setNode(ArrayList<TreeSet<String>>tree, Vector<String>columnnames, DefaultMutableTreeNode dmt) {
         for(int i=0;i<tree.size();i++){
             DefaultMutableTreeNode parent = new DefaultMutableTreeNode(columnnames.get(i));
             for(String temp:tree.get(i)){
                 DefaultMutableTreeNode child = new DefaultMutableTreeNode(temp);
                 parent.add(child);
             }
             dmt.add(parent);
             
         }
        return dmt;

    }
        
        
                public static void setNode() {
         for(int i=0;i<tree.size();i++){
             DefaultMutableTreeNode parent = new DefaultMutableTreeNode(columnnames.get(i));
             for(String temp:tree.get(i)){
                 DefaultMutableTreeNode child = new DefaultMutableTreeNode(temp);
                 parent.add(child);
             }
             root.add(parent);
             
         }


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
            java.util.logging.Logger.getLogger(SelectBelongsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectBelongsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectBelongsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectBelongsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectBelongsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}