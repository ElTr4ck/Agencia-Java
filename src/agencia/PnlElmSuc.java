/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class PnlElmSuc extends javax.swing.JPanel
{

    /**
     * Creates new form PnlElmSuc
     */
    public PnlElmSuc()
    {
        initComponents();
        List<Sucursal> sucursalesDisponibles = SucursalDAO.desplegarTodasLasSucursales();
        for (int i = 0; i < sucursalesDisponibles.size(); i++)
        {
            mosSuc.addItem(sucursalesDisponibles.get(i).getNombre());
        }
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

        jLabel1 = new javax.swing.JLabel();
        mosSuc = new javax.swing.JComboBox<>();
        btnElm = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 222, 219));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mapa.png"))); // NOI18N
        jLabel1.setText("Selecciona la sucursal a eliminar:");

        mosSuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnElm.setBackground(new java.awt.Color(51, 153, 255));
        btnElm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnElm.setText("Eliminar");
        btnElm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        btnElm.setBorderPainted(false);
        btnElm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnElmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnElm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mosSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mosSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(btnElm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnElmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnElmActionPerformed
    {//GEN-HEADEREND:event_btnElmActionPerformed
        List<Sucursal> sucursalesDisponibles = SucursalDAO.desplegarTodasLasSucursales();
        if (!sucursalesDisponibles.isEmpty())
        {
            if(SucursalDAO.eliminarSucursal(mosSuc.getSelectedItem().toString())){
                JOptionPane.showMessageDialog(this, "Se elimino con exito la sucursal", "Exito", JOptionPane.INFORMATION_MESSAGE);
                mosSuc.removeAllItems();
                sucursalesDisponibles = SucursalDAO.desplegarTodasLasSucursales();
                for (int i = 0; i < sucursalesDisponibles.size(); i++)
                {
                    mosSuc.addItem(sucursalesDisponibles.get(i).getNombre());
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la sucursal", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
           
        } else
        {
            JOptionPane.showMessageDialog(this, "No hay sucursales registradas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnElmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> mosSuc;
    // End of variables declaration//GEN-END:variables
}
