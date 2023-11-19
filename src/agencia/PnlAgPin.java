/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class PnlAgPin extends javax.swing.JPanel
{

    /**
     * Creates new form PnlAgPin
     */
    LocalDate todaysDate = LocalDate.now();
    JTextField re = new JTextField();

    public PnlAgPin()
    {
        initComponents();
        List<Sucursal> sucursalesDisponibles = SucursalDAO.desplegarTodasLasSucursales();
        for (int i = 0; i < sucursalesDisponibles.size(); i++)
        {
            desSuc.addItem(sucursalesDisponibles.get(i).getNombre());
        }
        fecha.setText("" + todaysDate);
        fechaSalida.setText(tanFech("" + todaysDate));
        re.setBorder(modAuto.getBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelo = new javax.swing.JLabel();
        modAuto = new javax.swing.JTextField();
        pAuto = new javax.swing.JLabel();
        placas = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        colorA = new javax.swing.JTextField();
        btnAg = new javax.swing.JButton();
        desSuc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechaSalida = new javax.swing.JTextField();
        anioAuto = new javax.swing.JTextField();
        modelo1 = new javax.swing.JLabel();
        menErrorM = new javax.swing.JLabel();
        menErrorA = new javax.swing.JLabel();
        menErrorP = new javax.swing.JLabel();
        menErrorC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 222, 219));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        modelo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modelo.setText("Ingrese el modelo del auto:");

        modAuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modAuto.setForeground(new java.awt.Color(153, 153, 153));
        modAuto.setText("Ingresa el modelo del auto.");
        modAuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                modAutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                modAutoFocusLost(evt);
            }
        });
        modAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modAutoActionPerformed(evt);
            }
        });
        modAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAutoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modAutoKeyPressed(evt);
            }
        });

        pAuto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pAuto.setText("Ingrese las placas del auto:");

        placas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        placas.setForeground(new java.awt.Color(153, 153, 153));
        placas.setText("XXX-XXX-XXX");
        placas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                placasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                placasFocusLost(evt);
            }
        });
        placas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placasKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placasKeyPressed(evt);
            }
        });

        color.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        color.setText("Ingrese el color: ");

        colorA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorA.setForeground(new java.awt.Color(153, 153, 153));
        colorA.setText("Ingresa un color.");
        colorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                colorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colorAFocusLost(evt);
            }
        });
        colorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAActionPerformed(evt);
            }
        });
        colorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                colorAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorAKeyTyped(evt);
            }
        });

        btnAg.setBackground(new java.awt.Color(51, 153, 255));
        btnAg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAg.setText("Agregar");
        btnAg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        btnAg.setBorderPainted(false);
        btnAg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgActionPerformed(evt);
            }
        });

        desSuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        desSuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desSucMouseClicked(evt);
            }
        });
        desSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desSucActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mapa.png"))); // NOI18N
        jLabel1.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Fecha de Ingreso:");

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Fecha de salida:");

        fechaSalida.setEditable(false);
        fechaSalida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaSalidaActionPerformed(evt);
            }
        });

        anioAuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anioAuto.setForeground(new java.awt.Color(153, 153, 153));
        anioAuto.setText("AAAA");
        anioAuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                anioAutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                anioAutoFocusLost(evt);
            }
        });
        anioAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anioAutoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anioAutoKeyPressed(evt);
            }
        });

        modelo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modelo1.setText("Ingrese el año del auto:");

        menErrorM.setForeground(new java.awt.Color(255, 0, 0));

        menErrorA.setForeground(new java.awt.Color(255, 0, 0));

        menErrorP.setForeground(new java.awt.Color(255, 0, 0));

        menErrorC.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modelo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menErrorA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pAuto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(placas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(color)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menErrorP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menErrorC, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(modelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menErrorM, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnAg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desSuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo)
                    .addComponent(modAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menErrorM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo1)
                    .addComponent(anioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menErrorA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pAuto)
                    .addComponent(placas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menErrorP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menErrorC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnAg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modAutoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_modAutoKeyPressed
    {//GEN-HEADEREND:event_modAutoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (modAuto.getText().equals(""))
            {
                modAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                menErrorM.setText("Llenar el campo de texto");
            }
            anioAuto.requestFocus();
        }
    }//GEN-LAST:event_modAutoKeyPressed

    private void placasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_placasKeyPressed
    {//GEN-HEADEREND:event_placasKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (placas.getText().equals(""))
            {
                placas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                menErrorP.setText("Llenar el campo de texto");
            }
            colorA.requestFocus();
        }
    }//GEN-LAST:event_placasKeyPressed

    private void btnAgActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgActionPerformed
    {//GEN-HEADEREND:event_btnAgActionPerformed
        if (IntrPrincipal.getSuc().size() != 0)
        {
            if (Validaciones.pinError(modAuto, menErrorM, "Ingresa el modelo del auto.", "Llenar el campo de texto",false) 
                    && (Validaciones.pinError(anioAuto, menErrorA, "AAAA", "Llenar el campo de texto",false) 
                    && Validaciones.pinError(anioAuto, menErrorA, "AAAA", anioAuto.getText().equals("AAAA")
                            ?"Llenar el campo de texto":"Ingresa bien el año", anioAuto.getText().length()<4?true:false))
                    && Validaciones.pinError(placas, menErrorP, "XXX-XXX-XXX", "Llenar el campo de texto",false) 
                    && Validaciones.pinError(colorA, menErrorC, "Ingrese un color.", "Llenar el campo de texto", false) || false)
            {
                // Crear un objeto Auto con los datos ingresados
                Sucursal sucSel = new Sucursal(desSuc.getSelectedItem().toString());
                
                Auto auto = new Auto(
                        modAuto.getText(),
                        Integer.parseInt(anioAuto.getText()),
                        placas.getText(),
                        sucSel
                );

               System.out.println("Antes de llamar a guardarAuto");

                // Guardar el auto en la base de datos
                if(!AutoDAO.guardarAuto(auto)){
                    JOptionPane.showMessageDialog(this, "No se pudo registrar el auto correctamente");
                }
                else{
                    if(PinturaDAO.guardarPintura(colorA.getText(), auto.getPlacas())){
                        JOptionPane.showMessageDialog(this, "Se registro con exito el auto y su pintura", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        modAuto.setText("");
                        modAutoFocusLost(null);
                        anioAuto.setText("");
                        anioAutoFocusLost(null);
                        placas.setText("");
                        placasFocusLost(null);
                        colorA.setText("");
                        colorAFocusLost(null);
                        fechaSalida.setText(tanFech("" + todaysDate));
                        btnAg.requestFocus();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "No se pudo registrar la pintura correctamente");
                    }
                }
                System.out.println("Después de llamar a guardarAuto");
            
                //IntrPrincipal.getAut().get(desSuc.getSelectedIndex()).add(new Pintura(fecha.getText(), colorA.getText(), fechaSalida.getText(), modAuto.getText(), Integer.parseInt(anioAuto.getText()), placas.getText(), sucSel))
                
            }
        }else
        {
            JOptionPane.showMessageDialog(this, "No hay sucursales registradas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseClicked
    {//GEN-HEADEREND:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void desSucMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_desSucMouseClicked
    {//GEN-HEADEREND:event_desSucMouseClicked

    }//GEN-LAST:event_desSucMouseClicked

    private void desSucActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_desSucActionPerformed
    {//GEN-HEADEREND:event_desSucActionPerformed

    }//GEN-LAST:event_desSucActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fechaActionPerformed
    {//GEN-HEADEREND:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void fechaSalidaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fechaSalidaActionPerformed
    {//GEN-HEADEREND:event_fechaSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaSalidaActionPerformed

    private void anioAutoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_anioAutoKeyPressed
    {//GEN-HEADEREND:event_anioAutoKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (anioAuto.getText().equals(""))
            {
                anioAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                menErrorA.setText("Llenar el campo de texto");
            }
            placas.requestFocus();
        }
    }//GEN-LAST:event_anioAutoKeyPressed

    private void modAutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modAutoActionPerformed
    {//GEN-HEADEREND:event_modAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modAutoActionPerformed

    private void modAutoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_modAutoFocusLost
    {//GEN-HEADEREND:event_modAutoFocusLost
        if (modAuto.getText().equals("") || !Validaciones.valPal(modAuto.getText()))
        {
            modAuto.setForeground(new java.awt.Color(153, 153, 153));
            modAuto.setText("Ingresa el modelo del auto.");
        }
    }//GEN-LAST:event_modAutoFocusLost

    private void modAutoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_modAutoFocusGained
    {//GEN-HEADEREND:event_modAutoFocusGained
        if (modAuto.getText().equals("Ingresa el modelo del auto."))
        {
            modAuto.setText("");
            modAuto.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_modAutoFocusGained

    private void modAutoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_modAutoKeyTyped
    {//GEN-HEADEREND:event_modAutoKeyTyped
        if (evt.getKeyChar() != ' ' && evt.getKeyChar() != '\n' && evt.getKeyChar() != ((char) 8))
        {
            menErrorM.setText("");
            modAuto.setBorder(re.getBorder());
        }
        Validaciones.va(evt, 25, modAuto.getText());
        if (modAuto.getText().equals("") && evt.getKeyChar() == ' ')
        {
            evt.consume();
        }
    }//GEN-LAST:event_modAutoKeyTyped

    private void anioAutoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_anioAutoKeyTyped
    {//GEN-HEADEREND:event_anioAutoKeyTyped
        Validaciones.validaEntero(evt, 4, anioAuto.getText());
        if (evt.getKeyChar() != ' ' && evt.getKeyChar() != '\n' && evt.getKeyChar() != ((char) 8))
        {
            menErrorA.setText("");
            anioAuto.setBorder(re.getBorder());
        }
        if (evt.getKeyChar() == ' ')
        {
            evt.consume();
        }
    }//GEN-LAST:event_anioAutoKeyTyped

    private void anioAutoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_anioAutoFocusLost
    {//GEN-HEADEREND:event_anioAutoFocusLost
        if (anioAuto.getText().equals("") || !Validaciones.valPal(anioAuto.getText()))
        {
            anioAuto.setForeground(new java.awt.Color(153, 153, 153));
            anioAuto.setText("AAAA");
        }
        if (anioAuto.getText().length() < 4)
        {
            anioAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
            menErrorA.setText("Ingresa bien el año");
        }
    }//GEN-LAST:event_anioAutoFocusLost

    private void anioAutoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_anioAutoFocusGained
    {//GEN-HEADEREND:event_anioAutoFocusGained
        if (anioAuto.getText().equals("AAAA"))
        {
            anioAuto.setText("");
            anioAuto.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_anioAutoFocusGained

    private void placasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_placasKeyTyped
    {//GEN-HEADEREND:event_placasKeyTyped
        if (evt.getKeyChar() != ' ' && evt.getKeyChar() != '\n' && evt.getKeyChar() != ((char) 8))
        {
            menErrorP.setText("");
            placas.setBorder(re.getBorder());
        }
        Validaciones.vaP(evt, 11, placas.getText());
        if (evt.getKeyChar() == ' ')
        {
            evt.consume();
        }
    }//GEN-LAST:event_placasKeyTyped

    private void placasFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_placasFocusLost
    {//GEN-HEADEREND:event_placasFocusLost
        if (placas.getText().equals("") || !Validaciones.valPal(placas.getText()))
        {
            placas.setForeground(new java.awt.Color(153, 153, 153));
            placas.setText("XXX-XXX-XXX");
        }
    }//GEN-LAST:event_placasFocusLost

    private void placasFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_placasFocusGained
    {//GEN-HEADEREND:event_placasFocusGained
        if (placas.getText().equals("XXX-XXX-XXX"))
        {
            placas.setText("");
            placas.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_placasFocusGained

    private void colorAKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_colorAKeyTyped
    {//GEN-HEADEREND:event_colorAKeyTyped
        if (evt.getKeyChar() != ' ' && evt.getKeyChar() != '\n' && evt.getKeyChar() != ((char) 8))
        {
            menErrorC.setText("");
            colorA.setBorder(re.getBorder());
        }
        Validaciones.va(evt, 20, colorA.getText());
        if (colorA.getText().equals("") && evt.getKeyChar() == ' ')
        {
            evt.consume();
        }

    }//GEN-LAST:event_colorAKeyTyped

    private void colorAKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_colorAKeyPressed
    {//GEN-HEADEREND:event_colorAKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (colorA.getText().equals(""))
            {
                colorA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
                menErrorC.setText("Llenar el campo de texto");
            }
            btnAg.requestFocus();
            btnAgActionPerformed(null);
        }
    }//GEN-LAST:event_colorAKeyPressed

    private void colorAFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_colorAFocusLost
    {//GEN-HEADEREND:event_colorAFocusLost
        if (colorA.getText().equals("") || !Validaciones.valPal(colorA.getText()))
        {
            colorA.setForeground(new java.awt.Color(153, 153, 153));
            colorA.setText("Ingresa un color.");
        }
    }//GEN-LAST:event_colorAFocusLost

    private void colorAFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_colorAFocusGained
    {//GEN-HEADEREND:event_colorAFocusGained
        if (colorA.getText().equals("Ingresa un color."))
        {
            colorA.setText("");
            colorA.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_colorAFocusGained

    private void colorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorAActionPerformed

    private String tanFech(String s)
    {
        s += "-";
        int fe[] = new int[3];
        char[] c = s.toCharArray();
        String f = "";
        for (int i = 0, a = 0; i < c.length; i++)
        {
            if (c[i] == '-' || i == c.length - 1)
            {
                fe[a] = Integer.parseInt(f);
                a++;
                f = "";

                continue;
            }
            f += c[i];
        }
        int r = (int) ((Math.random() * 100) % 16);
        fe[2] += r;
        int fecha = fe[1] == 2 ? 28 : 0;
        fecha = fe[1] == 1 || fe[1] == 3 || fe[1] == 5 || fe[1] == 7 || fe[1] == 8 || fe[1] == 10 || fe[1] == 12 ? 31 : fecha;
        fecha = fe[1] == 4 || fe[1] == 6 || fe[1] == 9 || fe[1] == 11 ? 30 : fecha;
        if (fe[2] > fecha)
        {
            fe[2] -= fecha;
            fe[1]++;
            if (fe[1] > 12)
            {
                fe[1] = 1;
                fe[0]++;
            }
        }
        return fe[0] + "-" + fe[1] + "-" + fe[2];
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioAuto;
    private javax.swing.JButton btnAg;
    private javax.swing.JLabel color;
    private javax.swing.JTextField colorA;
    private javax.swing.JComboBox<String> desSuc;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel menErrorA;
    private javax.swing.JLabel menErrorC;
    private javax.swing.JLabel menErrorM;
    private javax.swing.JLabel menErrorP;
    private javax.swing.JTextField modAuto;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel modelo1;
    private javax.swing.JLabel pAuto;
    private javax.swing.JTextField placas;
    // End of variables declaration//GEN-END:variables
}
