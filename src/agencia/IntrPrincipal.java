/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class IntrPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form IntrPrincipal
     */
    private static ArrayList<String> suc = new ArrayList<String>();
    private static ArrayList<ArrayList> aut = new ArrayList<ArrayList>();

    public static int p = 6;
    private Timer t = new Timer(0, null);
    public static int y = 350;
    private JLabel rep;

    public IntrPrincipal()
    {
        
        initComponents();
        t.start();
        t.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                barraAdorno.setLocation(0, y);
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
        barraAdorno = new javax.swing.JLabel();
        pnlMen = new javax.swing.JPanel();
        pnlMuest = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agencia de autos");
        setPreferredSize(new java.awt.Dimension(800, 690));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraAdorno.setBackground(new java.awt.Color(78, 82, 85));
        barraAdorno.setOpaque(true);
        jPanel1.add(barraAdorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 4, 45));

        pnlMen.setBackground(new java.awt.Color(195, 36, 58));

        javax.swing.GroupLayout pnlMenLayout = new javax.swing.GroupLayout(pnlMen);
        pnlMen.setLayout(pnlMenLayout);
        pnlMenLayout.setHorizontalGroup(
            pnlMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlMenLayout.setVerticalGroup(
            pnlMenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(pnlMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 650));

        pnlMuest.setBackground(new java.awt.Color(78, 82, 85));

        javax.swing.GroupLayout pnlMuestLayout = new javax.swing.GroupLayout(pnlMuest);
        pnlMuest.setLayout(pnlMuestLayout);
        pnlMuestLayout.setHorizontalGroup(
            pnlMuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlMuestLayout.setVerticalGroup(
            pnlMuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(pnlMuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 740, 540));

        jPanel2.setBackground(new java.awt.Color(78, 82, 85));

        textTitulo.setBackground(new java.awt.Color(78, 82, 85));
        textTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 740, 110));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        if (Carga.getIniciarT())
        {
            this.dispose();
            new Carga().setVisible(true);
            
        }
//pnlMen.setLocation(-150, pnlMen.getY());
        //rep = icnMuesTod;
        suc = (ArrayList<String>) ManipulaArchivos.carga(true, this, "Sucursales.dat");
        if (suc == null)
        {
            suc = new ArrayList<String>();
        }
        aut = (ArrayList<ArrayList>) ManipulaArchivos.carga(true, this, "Autos.dat");
        if (aut == null)
        {
            aut = new ArrayList<ArrayList>();
        }
        PnlIcnMen jp=new PnlIcnMen();
        jp.setSize(60, 650);
        jp.setLocation(0, 0);
        pnlMen.removeAll();
        pnlMen.add(jp, BorderLayout.CENTER);
        pnlMen.revalidate();
        pnlMen.repaint();
        ponPnl(new PnlMosT(),"Mostrar Todos los Datos");
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulaArchivos.guardo(suc, "Sucursales.dat");
        ManipulaArchivos.guardo(aut, "Autos.dat");
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(IntrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(IntrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(IntrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(IntrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new IntrPrincipal().setVisible(true);
            }
        });
    }

    /*
    
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barraAdorno;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel pnlMen;
    private static javax.swing.JPanel pnlMuest;
    private static javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the suc
     */
    public static ArrayList<String> getSuc()
    {
        return suc;
    }

    /**
     * @param aSuc the suc to set
     */
    public static void setSuc(ArrayList<String> aSuc)
    {
        suc = aSuc;
    }

    /**
     * @return the aut
     */
    public static ArrayList<ArrayList> getAut()
    {
        return aut;
    }

    /**
     * @param aAut the aut to set
     */
    public static void setAut(ArrayList<ArrayList> aAut)
    {
        aut = aAut;
    }

    public static void ponPnl(JPanel jp, String t)
    {
        jp.setSize(740, 540);
        jp.setLocation(0, 0);
        pnlMuest.removeAll();
        pnlMuest.add(jp, BorderLayout.CENTER);
        pnlMuest.revalidate();
        pnlMuest.repaint();
        textTitulo.setText(t);
    }

    /**
     * @return the pnlMen
     */
    public static javax.swing.JPanel getPnlMen()
    {
        return pnlMen;
    }

    /**
     * @return the jPanel1
     */
    public static javax.swing.JPanel getjPanel1()
    {
        return jPanel1;
    }
    
}
