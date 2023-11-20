/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PC
 */
public class PnlMosT extends javax.swing.JPanel
{

    /**
     * Creates new form PnlMosT
     */
    public PnlMosT()
    {
        initComponents();
        mostrarTodo.setLayout(new GridLayout(0, 4, 5, 10));
        mos();
    }

    private void mos()
    {
        List<Sucursal> sucursalesDisponibles = SucursalDAO.desplegarTodasLasSucursales();
        for(int i = 0; i < sucursalesDisponibles.size(); i++){
            JLabel sucur = new JLabel("<html>Sucursal: <p>" + sucursalesDisponibles.get(i).getNombre()
                    + "<html>", new javax.swing.ImageIcon(getClass().getResource("/imagenes/department-48_44780.png")),
                    javax.swing.SwingConstants.CENTER);
            sucur.setBackground(new java.awt.Color(226, 222, 219));
            sucur.setOpaque(true);
            sucur.setFont(new java.awt.Font("Tahoma", 1, 12));
            mostrarTodo.add(sucur);
            List<Auto> autos = AutoDAO.obtenerAutosPorSucursal(sucursalesDisponibles.get(i).getNombre());
            for (int j = 0; j < autos.size(); j++){
                if (PinturaDAO.verificarExistenciaAuto(autos.get(j).getPlacas())){
                    JLabel lab = new JLabel("<html>Sucursal: <p>" + sucursalesDisponibles.get(i).getNombre()
                            + "<p>Placas: <p>" + autos.get(j).getPlacas()
                            + "<p>Modelo: <p>" + autos.get(j).getModelo()
                            + "<p>Año:<p>" + autos.get(j).getAnio()
                            + "<p>Color:<p>" + PinturaDAO.obtenerPintura(autos.get(j).getPlacas())
                            + "<p>Fecha de ingreso:<p>" + PinturaDAO.obtenerFechaEntrada(autos.get(j).getPlacas())
                            + "<p>Fecha de salida:<p>" + PinturaDAO.obtenerFechaSalida(autos.get(j).getPlacas())
                            + "<html>", new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnPin.png")),
                            javax.swing.SwingConstants.CENTER);
                    //lab.setSize(200, 200);
                    lab.setBackground(new java.awt.Color(226, 222, 219));
                    lab.setOpaque(true);
                    lab.setFont(new java.awt.Font("Tahoma", 1, 12));
                    mostrarTodo.add(lab);
                } else{
                    String pagadito = (ServicioDAO.isPagado(autos.get(j).getPlacas())) ? "SI" : "NO";
                    JLabel lab = new JLabel("<html>Sucursal:<p>" + sucursalesDisponibles.get(i).getNombre()
                            + "<p>Placas:<p>" + autos.get(j).getPlacas().toString()
                            + "<p>Modelo:<p>" + autos.get(j).getModelo().toString()
                            + "<p>Año:<p>" + autos.get(j).getAnio()
                            + "<p>Presupuesto:<p>" + ServicioDAO.getPresupuesto(autos.get(j).getPlacas().toString())
                            + "<p>Tip. de servicio:<p>" + ServicioDAO.obtenerTipo(autos.get(j).getPlacas().toString())
                            + "<p>Pagado:<p>" + pagadito + "<html>",
                            new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnRep.png")),
                            javax.swing.SwingConstants.CENTER);
                    //lab.setSize(200, 200);
                    lab.setBackground(new java.awt.Color(226, 222, 219));
                    lab.setFont(new java.awt.Font("Tahoma", 1, 12));
                    lab.setOpaque(true);
                    mostrarTodo.add(lab);
                }
            }
            for (int j = 0; j < ((autos.size()+1)%4==0?0:4-((autos.size()+1)%4)) ; j++)
            {
                JLabel relleno = new JLabel();
                relleno.setBackground(new java.awt.Color(0, 0, 0));
                mostrarTodo.add(relleno);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarTodo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(78, 82, 85));

        jScrollPane1.setBackground(new java.awt.Color(78, 82, 85));

        mostrarTodo.setBackground(new java.awt.Color(78, 82, 85));
        mostrarTodo.setLayout(new java.awt.GridLayout(2, 4, 10, 5));
        jScrollPane1.setViewportView(mostrarTodo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mostrarTodo;
    // End of variables declaration//GEN-END:variables
}
