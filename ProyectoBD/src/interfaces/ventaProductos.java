/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.ManipulaDBC;
import bd.Querys;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ventaProductos extends javax.swing.JFrame {

    Connection con;
    int xy, xx;
    int flag = 0;
    float precioF = 0;
    int toDeleteIndex = -1;
    DefaultTableModel model = new DefaultTableModel();
    Querys q = new Querys();

    ArrayList<Object> columnaMap1 = new ArrayList();
    ArrayList<Object> columnaMap2 = new ArrayList();
    ArrayList<Object> columnaMap3 = new ArrayList();

    Calendar c = Calendar.getInstance();
    float precioTotal = 0;

    /**
     * Creates new form altasProduct
     */
    public ventaProductos() {
        initComponents();
        model.setColumnIdentifiers(new Object[]{
            "ID Producto", "Precio C/U", "Cantidad", "Subtotal"
        });
        jTVentas.setModel(model);
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
        jTFProductID = new javax.swing.JTextField();
        jTFCantID = new javax.swing.JTextField();
        jTFSubtotal = new javax.swing.JTextField();
        jBVender = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jLNamePro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFVentaID = new javax.swing.JTextField();
        jBLimpia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVentas = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta de productos");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFProductID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFProductIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFProductIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTFProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 126, 180, -1));

        jTFCantID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCantIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCantIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTFCantID, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 156, 180, -1));

        jTFSubtotal.setEnabled(false);
        jPanel1.add(jTFSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 366, 180, -1));

        jBVender.setText("Vender");
        jBVender.setEnabled(false);
        jBVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVenderActionPerformed(evt);
            }
        });
        jPanel1.add(jBVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 408, 84, -1));

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitulo.setText("Venta de productos");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 54, 156, -1));

        jLNamePro.setText("Id de venta:");
        jPanel1.add(jLNamePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 102, -1));

        jLabel1.setText("Id del producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 108, -1));

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 114, -1));

        jLabel3.setText("Total:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 30, -1));

        jTFVentaID.setEnabled(false);
        jPanel1.add(jTFVentaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 96, 180, -1));

        jBLimpia.setText("Limpiar");
        jBLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiaActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 408, 84, -1));

        jTVentas.setAutoCreateRowSorter(true);
        jTVentas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto", "Precio C/U", "Cantidad", "Subtotal"
            }
        ));
        jTVentas.setGridColor(new java.awt.Color(255, 255, 255));
        jTVentas.setSelectionBackground(new java.awt.Color(223, 227, 238));
        jTVentas.setSelectionForeground(new java.awt.Color(139, 157, 195));
        jTVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVentasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTVentasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 222, 384, 130));

        jBAgregar.setText("Agregar");
        jBAgregar.setEnabled(false);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        jBAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAgregarKeyPressed(evt);
            }
        });
        jPanel1.add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 186, 96, -1));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize1.png"))); // NOI18N
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
        });

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return1.png"))); // NOI18N
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 444, 42));

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 186, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con = ManipulaDBC.conectaDB();

        int ID;
        try {
            columnaMap1 = q.Seleccion(con, "idventa", "venta", "", false);
        } catch (Exception e) {
            System.out.println("Error en el SELECT de inicio 1...exception ->" + e);
        }

        if (columnaMap1.get(0).equals(" ")) {
            jTFVentaID.setText("1");
        } else {
            try {
                columnaMap1 = q.Seleccion(con, "MAX(idventa)", "venta", "", false);
                ID = Integer.parseInt((String) columnaMap1.get(0)) + 1;
                jTFVentaID.setText(String.valueOf(ID));
            } catch (Exception e) {
                System.out.println("Error en el SELECT de inicio 2...exception ->" + e);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ManipulaDBC.desconectaDB(con);
        jBLimpiaActionPerformed(null);

        int rowCount = model.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        flag = 0;
    }//GEN-LAST:event_formWindowClosed

    private void jBLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiaActionPerformed

        CtrlInterfaz.limpia(jTFProductID, jTFCantID);
        CtrlInterfaz.selecciona(jTFProductID);
        CtrlInterfaz.habilita(false, jBAgregar);

    }//GEN-LAST:event_jBLimpiaActionPerformed

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        this.dispose();
        new menuPrincipal().setVisible(true);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jTVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVentasMouseClicked

    }//GEN-LAST:event_jTVentasMouseClicked

    private void jTVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVentasMousePressed
        toDeleteIndex = jTVentas.getSelectedRow();
    }//GEN-LAST:event_jTVentasMousePressed

    private void jTFProductIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductIDKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFProductIDKeyTyped

    private void jTFProductIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFProductIDKeyPressed
        Validaciones.enterEntero(this, evt, jTFProductID, jTFCantID);
    }//GEN-LAST:event_jTFProductIDKeyPressed

    private void jTFCantIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantIDKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFCantIDKeyTyped

    private void jTFCantIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantIDKeyPressed
        Validaciones.enterEntero(this, evt, jTFCantID, jBAgregar);
    }//GEN-LAST:event_jTFCantIDKeyPressed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        try {
            columnaMap2 = q.Seleccion(con, "id, precioventaun", "producto", "id='" + jTFProductID.getText() + "'", true);
            int fila = buscalineaproducto();
            if (fila != -1) {
                int cantidadnueva = Integer.valueOf(jTFCantID.getText()) + (Integer.valueOf(jTVentas.getValueAt(fila, 2).toString()));
                jTVentas.setValueAt(cantidadnueva, fila, 2);
                float subtanterior = Float.valueOf(jTVentas.getValueAt(fila, 3).toString());
                float subtotalnuevo = cantidadnueva * Float.valueOf(jTVentas.getValueAt(fila, 1).toString());
                jTVentas.setValueAt(subtotalnuevo, fila, 3);
                precioTotal=precioTotal-subtanterior+subtotalnuevo;
            } else {
                precioF = Float.parseFloat(jTFCantID.getText()) * Float.parseFloat((String) columnaMap2.get(1));
                precioTotal += precioF;
                columnaMap3.add(columnaMap2.get(0));
                columnaMap3.add(columnaMap2.get(1));
                columnaMap3.add(jTFCantID.getText());
                columnaMap3.add(precioF);
                model.addRow(new Object[]{
                    columnaMap3.get(0),
                    columnaMap3.get(1),
                    columnaMap3.get(2),
                    columnaMap3.get(3)
                });
            }
            jTFSubtotal.setText(String.valueOf(precioTotal));
        } catch (Exception e) {
            System.out.println("error --> " + e);
        }
        columnaMap3.clear();
        columnaMap2.clear();
        CtrlInterfaz.habilita(true, jBVender);
        jBLimpiaActionPerformed(null);
    }//GEN-LAST:event_jBAgregarActionPerformed

    public int buscalineaproducto() {
        for (int i = 0; i < jTVentas.getRowCount(); i++) {
            if (jTFProductID.getText().equals(jTVentas.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
    }

    private void jBVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVenderActionPerformed

        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c.get(Calendar.YEAR));

        String values = "'" + jTFVentaID.getText() + "',"
                + "'" + annio + "-" + mes + "-" + dia + "',"
                + "'" + jTFSubtotal.getText() + "'";

        try {
            q.Insertar(con, "venta", values);

        } catch (Exception e) {
            System.out.println("Error en el INSERT 1...exception ->" + e);
        }
        values = "";
        for (int i = 0; i < jTVentas.getRowCount(); i++) {

            values = "'" + jTFVentaID.getText() + "',"
                    + "'" + jTVentas.getValueAt(i, 0) + "',"
                    + "'" + jTVentas.getValueAt(i, 2) + "',"
                    + "'" + jTVentas.getValueAt(i, 3) + "'";
            System.out.println(values);
            try {
                q.Insertar(con, "productoventa", values);

            } catch (Exception e) {
                System.out.println("Error en el INSERT 2...exception ->" + e);
            }
        }

        Mensaje.exito(this, "Se realizo la venta correctamente el producto");

        CtrlInterfaz.limpia(jTFSubtotal);
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        flag = 0;
        precioF = 0;
        precioTotal = 0;
        formWindowOpened(null);
        CtrlInterfaz.habilita(false, jBVender);
    }//GEN-LAST:event_jBVenderActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            if (toDeleteIndex != -1) {
                precioTotal -= (float) jTVentas.getValueAt(toDeleteIndex, 3);
                flag = flag - 4;
                model.removeRow(toDeleteIndex);
                jTFSubtotal.setText(String.valueOf(precioTotal));
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAgregarKeyPressed
        if (evt.getKeyChar() == '\n') {
            jBAgregarActionPerformed(null);
        }
    }//GEN-LAST:event_jBAgregarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpia;
    private javax.swing.JButton jBVender;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLNamePro;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantID;
    private javax.swing.JTextField jTFProductID;
    private javax.swing.JTextField jTFSubtotal;
    private javax.swing.JTextField jTFVentaID;
    private javax.swing.JTable jTVentas;
    // End of variables declaration//GEN-END:variables
}
