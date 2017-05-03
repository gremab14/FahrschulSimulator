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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
