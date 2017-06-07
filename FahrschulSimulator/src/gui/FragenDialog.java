/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.Antwort;
import bl.Frage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FragenDialog extends javax.swing.JDialog
{
<<<<<<< HEAD
    private Frage frage;
    private boolean isRichtig;
=======
    private String pfad = System.getProperty("user.dir") + File.separator + "src" + File.separator + "bilder" + File.separator + "12.gif";
    private static Frage frage = null;
    /**
     * Creates new form FragenDialog
     */
    public FragenDialog(java.awt.Frame parent, boolean modal, Frage frage)
    {
        super(parent, modal);
        initComponents();
        this.setSize(1900, 1000);
        this.setTitle("FragenDialog");
        
        this.frage = frage;
        
        lbNummer.setOpaque(true);
        lbFrage.setOpaque(true);
        rbtAntwort1.setOpaque(true);
        rbtAntwort2.setOpaque(true);
        rbtAntwort3.setOpaque(true);
        rbtAntwort4.setOpaque(true);
        lbBild.setOpaque(true);
        lbBild.setIcon(new ImageIcon(pfad));
        
        //aufDialogSetzen();
    }
    
    public void aufDialogSetzen()
    {
        if(frage == null)
        {
            JOptionPane.showMessageDialog(null, "Ein Fehler im FragenDialog");
            return;
        }
        
        lbNummer.setText("" + frage.getNummer());
        lbFrage.setText(frage.getFrage());
        ArrayList<Antwort> liste = frage.getAntworten();
     
        lbBild.setIcon(new ImageIcon(frage.getPfadBild()));
        
        rbtAntwort1.setText(liste.get(0).getAntwort());
        rbtAntwort2.setText(liste.get(1).getAntwort());
        rbtAntwort3.setText(liste.get(2).getAntwort());
        rbtAntwort4.setText(liste.get(3).getAntwort());
    }
>>>>>>> origin/master
    
    /**
     * Creates new form FragenDialog
     */
    public FragenDialog(java.awt.Frame parent, boolean modal,Frage f)
    {
        super(parent, modal);
        initComponents();
        frage = f;
    }
    
    public void initFroge()
    {
        
        plMain.setBorder(javax.swing.BorderFactory.createTitledBorder("Frage Nr.: "+frage.getNummer()));
        cbAntwort1.setText(frage.getAntworten().get(0).getAntwort());
        cbAntwort2.setText(frage.getAntworten().get(1).getAntwort());
        cbAntwort3.setText(frage.getAntworten().get(2).getAntwort());
        cbAntwort4.setText(frage.getAntworten().get(3).getAntwort());
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plMain = new javax.swing.JPanel();
        plBild = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbFrage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbAntwort1 = new javax.swing.JCheckBox();
        cbAntwort2 = new javax.swing.JCheckBox();
        cbAntwort3 = new javax.swing.JCheckBox();
        cbAntwort4 = new javax.swing.JCheckBox();
        btWeiter = new javax.swing.JButton();

        jPanel1 = new javax.swing.JPanel();
        plFrageUndBild = new javax.swing.JPanel();
        plNummer = new javax.swing.JPanel();
        lbNummer = new javax.swing.JLabel();
        plFrage = new javax.swing.JPanel();
        lbFrage = new javax.swing.JLabel();
        plBild = new javax.swing.JPanel();
        lbBild = new javax.swing.JLabel();
        plUnten = new javax.swing.JPanel();
        plAntworten = new javax.swing.JPanel();
        rbtAntwort1 = new javax.swing.JRadioButton();
        rbtAntwort2 = new javax.swing.JRadioButton();
        rbtAntwort3 = new javax.swing.JRadioButton();
        rbtAntwort4 = new javax.swing.JRadioButton();
        plButton = new javax.swing.JPanel();
        btnWeiter = new javax.swing.JButton();

<<<<<<< HEAD
        plMain.setBorder(javax.swing.BorderFactory.createTitledBorder("Frage Nr.:"));
        plMain.setLayout(new java.awt.GridLayout(2, 1));

        javax.swing.GroupLayout plBildLayout = new javax.swing.GroupLayout(plBild);
        plBild.setLayout(plBildLayout);
        plBildLayout.setHorizontalGroup(
            plBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        plBildLayout.setVerticalGroup(
            plBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        plMain.add(plBild);

        jPanel3.setLayout(new java.awt.BorderLayout());

        lbFrage.setText("jLabel1");
        lbFrage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(lbFrage, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        cbAntwort1.setText("jCheckBox1");
        jPanel4.add(cbAntwort1);

        cbAntwort2.setText("jCheckBox2");
        jPanel4.add(cbAntwort2);

        cbAntwort3.setText("jCheckBox3");
        jPanel4.add(cbAntwort3);

        cbAntwort4.setText("jCheckBox4");
        jPanel4.add(cbAntwort4);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        plMain.add(jPanel3);

        getContentPane().add(plMain, java.awt.BorderLayout.CENTER);

        btWeiter.setText("Weiter");
        getContentPane().add(btWeiter, java.awt.BorderLayout.SOUTH);
=======
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        plFrageUndBild.setLayout(new java.awt.BorderLayout());

        plNummer.setBackground(new java.awt.Color(0, 0, 153));
        plNummer.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbNummer.setBackground(new java.awt.Color(0, 0, 153));
        lbNummer.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lbNummer.setForeground(new java.awt.Color(255, 255, 255));
        lbNummer.setText("Frage Nr.: 12");
        plNummer.add(lbNummer);

        plFrageUndBild.add(plNummer, java.awt.BorderLayout.PAGE_START);

        plFrage.setBackground(new java.awt.Color(0, 0, 153));
        plFrage.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbFrage.setBackground(new java.awt.Color(0, 0, 153));
        lbFrage.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        lbFrage.setForeground(new java.awt.Color(255, 255, 255));
        lbFrage.setText("Sie nähern sich dieser Kreuzung und wollen links einbiegen. Haben Sie Wartepflicht oder Vorrang?");
        plFrage.add(lbFrage);

        plFrageUndBild.add(plFrage, java.awt.BorderLayout.PAGE_END);

        plBild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        plBild.setLayout(new java.awt.GridLayout(1, 0));

        lbBild.setBackground(new java.awt.Color(255, 255, 255));
        lbBild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plBild.add(lbBild);

        plFrageUndBild.add(plBild, java.awt.BorderLayout.CENTER);

        getContentPane().add(plFrageUndBild, java.awt.BorderLayout.CENTER);

        plUnten.setLayout(new java.awt.BorderLayout());

        plAntworten.setLayout(new java.awt.GridLayout(2, 2));

        rbtAntwort1.setBackground(new java.awt.Color(255, 255, 255));
        rbtAntwort1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtAntwort1.setText("    Ich habe Vorrang gegenüber dem Schienenfahrzeug");
        rbtAntwort1.setPreferredSize(new java.awt.Dimension(615, 120));
        plAntworten.add(rbtAntwort1);

        rbtAntwort2.setBackground(new java.awt.Color(219, 219, 219));
        rbtAntwort2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtAntwort2.setText("    Ich habe Wartepflicht gegenüber einem Rechtskommenden");
        plAntworten.add(rbtAntwort2);

        rbtAntwort3.setBackground(new java.awt.Color(216, 216, 216));
        rbtAntwort3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtAntwort3.setText("    Ich habe Wartepflicht gegenüber einem Linkskommenden");
        plAntworten.add(rbtAntwort3);

        rbtAntwort4.setBackground(new java.awt.Color(255, 255, 255));
        rbtAntwort4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rbtAntwort4.setText("    Ich habe Wartepflicht gegenüber einem Gegenverkehr");
        plAntworten.add(rbtAntwort4);

        plUnten.add(plAntworten, java.awt.BorderLayout.CENTER);

        plButton.setBackground(new java.awt.Color(0, 0, 153));

        btnWeiter.setBackground(new java.awt.Color(255, 255, 255));
        btnWeiter.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnWeiter.setText("Weiter ->");
        plButton.add(btnWeiter);

        plUnten.add(plButton, java.awt.BorderLayout.SOUTH);

        getContentPane().add(plUnten, java.awt.BorderLayout.SOUTH);
>>>>>>> origin/master

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
////            public void run()
////            {
////                FragenDialog dialog = new FragenDialog(new javax.swing.JFrame(), true);
////                dialog.addWindowListener(new java.awt.event.WindowAdapter()
////                {
////                    @Override
////                    public void windowClosing(java.awt.event.WindowEvent e)
////                    {
////                        System.exit(0);
////                    }
////                });
////                dialog.setVisible(true);
////            }
//        });
//    }
=======
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FragenDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                FragenDialog dialog = new FragenDialog(new javax.swing.JFrame(), true, frage);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
>>>>>>> origin/master

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton btWeiter;
    private javax.swing.JCheckBox cbAntwort1;
    private javax.swing.JCheckBox cbAntwort2;
    private javax.swing.JCheckBox cbAntwort3;
    private javax.swing.JCheckBox cbAntwort4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbFrage;
    private javax.swing.JPanel plBild;
    private javax.swing.JPanel plMain;
=======
    private javax.swing.JButton btnWeiter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBild;
    private javax.swing.JLabel lbFrage;
    private javax.swing.JLabel lbNummer;
    private javax.swing.JPanel plAntworten;
    private javax.swing.JPanel plBild;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plFrage;
    private javax.swing.JPanel plFrageUndBild;
    private javax.swing.JPanel plNummer;
    private javax.swing.JPanel plUnten;
    private javax.swing.JRadioButton rbtAntwort1;
    private javax.swing.JRadioButton rbtAntwort2;
    private javax.swing.JRadioButton rbtAntwort3;
    private javax.swing.JRadioButton rbtAntwort4;
>>>>>>> origin/master
    // End of variables declaration//GEN-END:variables
}
