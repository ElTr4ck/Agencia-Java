/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.awt.BorderLayout;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class PnlIcnMen extends javax.swing.JPanel
{

    /**
     * Creates new form PnlIcnMen
     */
    JLabel []icn=new JLabel[12];
     
    public PnlIcnMen()
    {
        initComponents();
        icn[0]=icnRegSuc;
        icn[1]=icnAgPint;
        icn[2]=icnAgServ;
        icn[3]=icnElmPin;
        icn[4]=icnElmSer;
        icn[5]=icnElimSuc;
        icn[6]=icnMuesTod;
        icn[7]=mustPSuc;
        icn[8]=mustPint;
        icn[9]=MusServ;
        icn[10]=icnMover;
        icn[11]=icnBusc;
        for (int i = 0; i < 12; i++)
        {
            icn[i].setOpaque(false);
        }
        icn[IntrPrincipal.p].setOpaque(true);
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

        pnlMen = new javax.swing.JPanel();
        icnMen = new javax.swing.JLabel();
        icnRegSuc = new javax.swing.JLabel();
        icnAgPint = new javax.swing.JLabel();
        icnAgServ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icnElmPin = new javax.swing.JLabel();
        icnElmSer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icnElimSuc = new javax.swing.JLabel();
        icnMuesTod = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mustPSuc = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mustPint = new javax.swing.JLabel();
        MusServ = new javax.swing.JLabel();
        icnMover = new javax.swing.JLabel();
        icnBusc = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(60, 650));

        pnlMen.setBackground(new java.awt.Color(195, 36, 58));
        pnlMen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icnMen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        icnMen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_icon_2_icon-icons.com_71856.png"))); // NOI18N
        icnMen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnMen.setIconTextGap(40);
        icnMen.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                icnMenMouseClicked(evt);
            }
        });
        pnlMen.add(icnMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 45));

        icnRegSuc.setBackground(new java.awt.Color(226, 222, 219));
        icnRegSuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnRegSuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnRegSuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/department-48_44780.png"))); // NOI18N
        icnRegSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnRegSuc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnRegSuc.setIconTextGap(13);
        icnRegSuc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                icnRegSucMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                icnRegSucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                icnRegSucMouseExited(evt);
            }
        });
        pnlMen.add(icnRegSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 45));

        icnAgPint.setBackground(new java.awt.Color(226, 222, 219));
        icnAgPint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnAgPint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnAgPint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color_palette_brush_paint_icon_193857.png"))); // NOI18N
        icnAgPint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnAgPint.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnAgPint.setIconTextGap(15);
        icnAgPint.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                icnAgPintMouseClicked(evt);
            }
        });
        pnlMen.add(icnAgPint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 45));

        icnAgServ.setBackground(new java.awt.Color(226, 222, 219));
        icnAgServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnAgServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnAgServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auto-repair_39384.png"))); // NOI18N
        icnAgServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnAgServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnAgServ.setIconTextGap(15);
        icnAgServ.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnAgServMousePressed(evt);
            }
        });
        pnlMen.add(icnAgServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 45));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color_palette_brush_paint_icon_193857.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 200, -1, -1));

        icnElmPin.setBackground(new java.awt.Color(226, 222, 219));
        icnElmPin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnElmPin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icnElmPin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangle-perspective-in-diagonal-position_icon-icons.com_74254.png"))); // NOI18N
        icnElmPin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnElmPin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnElmPin.setIconTextGap(12);
        icnElmPin.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnElmPinMousePressed(evt);
            }
        });
        pnlMen.add(icnElmPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, 45));

        icnElmSer.setBackground(new java.awt.Color(226, 222, 219));
        icnElmSer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnElmSer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnElmSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car_off_icon_138805.png"))); // NOI18N
        icnElmSer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnElmSer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnElmSer.setIconTextGap(12);
        icnElmSer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnElmSerMousePressed(evt);
            }
        });
        pnlMen.add(icnElmSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 60, 45));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/department-48_44780.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 45));

        icnElimSuc.setBackground(new java.awt.Color(226, 222, 219));
        icnElimSuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnElimSuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icnElimSuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangle-perspective-in-diagonal-position_icon-icons.com_74254.png"))); // NOI18N
        icnElimSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnElimSuc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnElimSuc.setIconTextGap(25);
        icnElimSuc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnElimSucMousePressed(evt);
            }
        });
        pnlMen.add(icnElimSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 60, 45));

        icnMuesTod.setBackground(new java.awt.Color(225, 221, 218));
        icnMuesTod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnMuesTod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnMuesTod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        icnMuesTod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMuesTod.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnMuesTod.setIconTextGap(45);
        icnMuesTod.setOpaque(true);
        icnMuesTod.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnMuesTodMousePressed(evt);
            }
        });
        pnlMen.add(icnMuesTod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 60, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 30));

        mustPSuc.setBackground(new java.awt.Color(226, 222, 219));
        mustPSuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mustPSuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mustPSuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/department-48_44780 (1).png"))); // NOI18N
        mustPSuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mustPSuc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mustPSuc.setIconTextGap(18);
        mustPSuc.setMaximumSize(new java.awt.Dimension(48, 32));
        mustPSuc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                mustPSucMousePressed(evt);
            }
        });
        pnlMen.add(mustPSuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 60, 45));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel11.setMinimumSize(new java.awt.Dimension(50, 50));
        pnlMen.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 40, 30));

        mustPint.setBackground(new java.awt.Color(226, 222, 219));
        mustPint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mustPint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mustPint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color_palette_brush_paint_icon_193857 (1).png"))); // NOI18N
        mustPint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mustPint.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mustPint.setIconTextGap(8);
        mustPint.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                mustPintMousePressed(evt);
            }
        });
        pnlMen.add(mustPint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 60, 45));

        MusServ.setBackground(new java.awt.Color(226, 222, 219));
        MusServ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MusServ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MusServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auto-repair_39384 (1).png"))); // NOI18N
        MusServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MusServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MusServ.setIconTextGap(14);
        MusServ.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                MusServMousePressed(evt);
            }
        });
        pnlMen.add(MusServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 60, 45));

        icnMover.setBackground(new java.awt.Color(226, 222, 219));
        icnMover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnMover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1495574618-map-location-solid-style-30_84555.png"))); // NOI18N
        icnMover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMover.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnMover.setIconTextGap(58);
        icnMover.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                icnMoverMousePressed(evt);
            }
        });
        pnlMen.add(icnMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 60, 45));

        icnBusc.setBackground(new java.awt.Color(226, 222, 219));
        icnBusc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icnBusc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icnBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seo-social-web-network-internet_340_icon-icons.com_61497 (1).png"))); // NOI18N
        icnBusc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnBusc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        icnBusc.setIconTextGap(76);
        icnBusc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                icnBuscMouseClicked(evt);
            }
        });
        pnlMen.add(icnBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void icnMenMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnMenMouseClicked
    {//GEN-HEADEREND:event_icnMenMouseClicked
        IntrPrincipal.getjPanel1().remove(IntrPrincipal.getPnlMen());
        IntrPrincipal.getjPanel1().add(IntrPrincipal.getPnlMen(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 650),1);
        //IntrPrincipal.getPnlMen().setSize(210, 650);
        PnlMenu jp=new PnlMenu();
        jp.setSize(210, 650);
        jp.setLocation(0, 0);
        IntrPrincipal.getPnlMen().removeAll();
        IntrPrincipal.getPnlMen().add(jp, BorderLayout.CENTER);
        IntrPrincipal.getPnlMen().revalidate();
        IntrPrincipal.getPnlMen().repaint();
    }//GEN-LAST:event_icnMenMouseClicked

    private void icnRegSucMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnRegSucMouseClicked
    {//GEN-HEADEREND:event_icnRegSucMouseClicked
        if (IntrPrincipal.y != icnRegSuc.getY())
        {
            IntrPrincipal.ponPnl(new PnlRegSuc(),"Registrar Sucursal");
            IntrPrincipal.y = icnRegSuc.getY();
//            //p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=0;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnRegSuc;
        }
    }//GEN-LAST:event_icnRegSucMouseClicked

    private void icnRegSucMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnRegSucMouseExited
    {//GEN-HEADEREND:event_icnRegSucMouseExited
    
    }//GEN-LAST:event_icnRegSucMouseExited

    private void icnRegSucMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnRegSucMouseEntered
    {//GEN-HEADEREND:event_icnRegSucMouseEntered
      
    }//GEN-LAST:event_icnRegSucMouseEntered

    private void icnAgPintMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnAgPintMouseClicked
    {//GEN-HEADEREND:event_icnAgPintMouseClicked
        if (IntrPrincipal.y != icnAgPint.getY())
        {
            IntrPrincipal.ponPnl(new PnlAgPin(),"Agregar Auto a Pintura");
            IntrPrincipal.y = icnAgPint.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=1;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnAgPint;
        }
    }//GEN-LAST:event_icnAgPintMouseClicked

    private void icnAgServMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnAgServMousePressed
    {//GEN-HEADEREND:event_icnAgServMousePressed

        if (IntrPrincipal.y != icnAgServ.getY())
        {
            IntrPrincipal.ponPnl(new PnlAgServ(),"Agregar Auto a Servicio");
            IntrPrincipal.y = icnAgServ.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=2;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnAgServ;
        }
    }//GEN-LAST:event_icnAgServMousePressed

    private void icnElmPinMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnElmPinMousePressed
    {//GEN-HEADEREND:event_icnElmPinMousePressed
        if (IntrPrincipal.y != icnElmPin.getY())
        {
            IntrPrincipal.ponPnl(new PnlElmAut(true),"Eliminar Auto de Pintura");
            IntrPrincipal.y = icnElmPin.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=3;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnElmPin;
        }
    }//GEN-LAST:event_icnElmPinMousePressed

    private void icnElmSerMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnElmSerMousePressed
    {//GEN-HEADEREND:event_icnElmSerMousePressed
        if (IntrPrincipal.y != icnElmSer.getY())
        {
            IntrPrincipal.ponPnl(new PnlElmAut(false),"Eliminar Auto de Servicio");
            IntrPrincipal.y = icnElmSer.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=4;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnElmSer;
        }
    }//GEN-LAST:event_icnElmSerMousePressed

    private void icnElimSucMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnElimSucMousePressed
    {//GEN-HEADEREND:event_icnElimSucMousePressed
        if (IntrPrincipal.y != icnElimSuc.getY())
        {
            IntrPrincipal.ponPnl(new PnlElmSuc(), "Eliminar Sucursal");
            IntrPrincipal.y = icnElimSuc.getY();
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p = 5;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnElimSuc;
        }
    }//GEN-LAST:event_icnElimSucMousePressed

    private void icnMuesTodMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnMuesTodMousePressed
    {//GEN-HEADEREND:event_icnMuesTodMousePressed
        if (IntrPrincipal.y != icnMuesTod.getY())
        {
            IntrPrincipal.ponPnl(new PnlMosT(),"Mostrar Todos los Datos");
            IntrPrincipal.y = icnMuesTod.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=6;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnMuesTod;
        }
    }//GEN-LAST:event_icnMuesTodMousePressed

    private void mustPSucMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mustPSucMousePressed
    {//GEN-HEADEREND:event_mustPSucMousePressed
        if (IntrPrincipal.y != mustPSuc.getY())
        {
            IntrPrincipal.ponPnl(new PnlMosPorSuc(),"Muestra por Sucursal");
            IntrPrincipal.y = mustPSuc.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=7;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = mustPSuc;
        }
    }//GEN-LAST:event_mustPSucMousePressed

    private void icnMoverMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnMoverMousePressed
    {//GEN-HEADEREND:event_icnMoverMousePressed
        if (IntrPrincipal.y != icnMover.getY())
        {
            IntrPrincipal.ponPnl(new PnlMover(),"Mover Autos");
            IntrPrincipal.y = icnMover.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=10;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnMover;
        }
    }//GEN-LAST:event_icnMoverMousePressed

    private void icnBuscMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_icnBuscMouseClicked
    {//GEN-HEADEREND:event_icnBuscMouseClicked
        if (IntrPrincipal.y != icnBusc.getY())
        {
            IntrPrincipal.ponPnl(new PnlBusAut(),"Buscar Auto");
            IntrPrincipal.y = icnBusc.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=11;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnBusc;
        }
    }//GEN-LAST:event_icnBuscMouseClicked

    private void mustPintMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mustPintMousePressed
    {//GEN-HEADEREND:event_mustPintMousePressed
        if (IntrPrincipal.y != mustPint.getY())
        {
            IntrPrincipal.ponPnl(new PnlMosPinSuc(true),"Mostrar Autos de Pintura por Sucursal");
            IntrPrincipal.y = mustPint.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=8;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnBusc;
        }
    }//GEN-LAST:event_mustPintMousePressed

    private void MusServMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MusServMousePressed
    {//GEN-HEADEREND:event_MusServMousePressed
        if (IntrPrincipal.y != MusServ.getY())
        {
            IntrPrincipal.ponPnl(new PnlMosPinSuc(false),"Mostrar Autos de Servicio por Sucursal");
            IntrPrincipal.y = MusServ.getY();
//            p = false;
            icn[IntrPrincipal.p].setOpaque(false);
            IntrPrincipal.p=9;
            icn[IntrPrincipal.p].setOpaque(true);
//            rep = icnBusc;
        }
    }//GEN-LAST:event_MusServMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MusServ;
    private javax.swing.JLabel icnAgPint;
    private javax.swing.JLabel icnAgServ;
    private javax.swing.JLabel icnBusc;
    private javax.swing.JLabel icnElimSuc;
    private javax.swing.JLabel icnElmPin;
    private javax.swing.JLabel icnElmSer;
    private javax.swing.JLabel icnMen;
    private javax.swing.JLabel icnMover;
    private javax.swing.JLabel icnMuesTod;
    private javax.swing.JLabel icnRegSuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mustPSuc;
    private javax.swing.JLabel mustPint;
    private javax.swing.JPanel pnlMen;
    // End of variables declaration//GEN-END:variables
}
