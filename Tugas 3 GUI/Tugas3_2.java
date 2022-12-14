 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fatiya Humaira Yunaz 2108107010063
 */
import java.awt.*;    
import javax.swing.*;
public class Tugas3_2 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas3_2
     */
    public Tugas3_2() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        IntFrame = new javax.swing.JInternalFrame();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnBorderLayout = new javax.swing.JButton();
        btnFlowLayout = new javax.swing.JButton();
        btnGridLayout = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IntFrame.setTitle("Layout Tester");
        IntFrame.setFocusCycleRoot(false);
        IntFrame.setVisible(true);
        IntFrame.getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        btnOne.setText("One");
        IntFrame.getContentPane().add(btnOne);

        btnTwo.setText("Two");
        IntFrame.getContentPane().add(btnTwo);

        btnThree.setText("Three");
        IntFrame.getContentPane().add(btnThree);

        btnFour.setText("Four");
        IntFrame.getContentPane().add(btnFour);

        btnFive.setText("Five");
        IntFrame.getContentPane().add(btnFive);

        btnBorderLayout.setText("setBorderLayout");
        btnBorderLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorderLayoutActionPerformed(evt);
            }
        });

        btnFlowLayout.setText("setFlowLayout");
        btnFlowLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowLayoutActionPerformed(evt);
            }
        });

        btnGridLayout.setText("setGridLayout");
        btnGridLayout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGridLayoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnBorderLayout)
                .addGap(42, 42, 42)
                .addComponent(btnFlowLayout)
                .addGap(42, 42, 42)
                .addComponent(btnGridLayout)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IntFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(IntFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorderLayout)
                    .addComponent(btnFlowLayout)
                    .addComponent(btnGridLayout))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnBorderLayoutActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        IntFrame.setLayout(new BorderLayout());
        IntFrame.add(btnOne, BorderLayout.NORTH);
        IntFrame.add(btnTwo, BorderLayout.WEST);
        IntFrame.add(btnThree, BorderLayout.CENTER);
        IntFrame.add(btnFour, BorderLayout.EAST);
        IntFrame.add(btnFive, BorderLayout.SOUTH);
        
        setVisible(true);
    }                                               

    private void btnFlowLayoutActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        IntFrame.setLayout(new FlowLayout());
        setVisible(true);
    }                                             

    private void btnGridLayoutActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        IntFrame.setLayout(new GridLayout(3,2));
        setVisible(true);
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
            java.util.logging.Logger.getLogger(Tugas3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas3_2().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JInternalFrame IntFrame;
    private javax.swing.JButton btnBorderLayout;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFlowLayout;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnGridLayout;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration                   

    class MainFrame2{
    public void main(String[] args){
        new Tugas3_2();
    }
}
}
