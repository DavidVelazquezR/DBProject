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
import java.sql.Connection;
import cjb.ci.Validaciones;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class altasProduct extends javax.swing.JFrame {

    Connection con;
    int xy, xx;
    public ArrayList<Object> columnaMap1 = new ArrayList();

    /**
     * Creates new form altasProduct
     */
    public altasProduct() {
        initComponents();
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
        jTFMarcaProduct = new javax.swing.JTextField();
        jTFCant = new javax.swing.JTextField();
        jTFPrecComp = new javax.swing.JTextField();
        jTFPrecVU = new javax.swing.JTextField();
        jTFPrecVM = new javax.swing.JTextField();
        jTFCantMM = new javax.swing.JTextField();
        jBIngresar = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jLNamePro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNomProduct = new javax.swing.JTextField();
        jBLimpia = new javax.swing.JButton();
        jTFIDProduct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFMedidaPesoProduct = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas de productos");
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

        jTFMarcaProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarcaProductActionPerformed(evt);
            }
        });
        jTFMarcaProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFMarcaProductKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMarcaProductKeyTyped(evt);
            }
        });
        jPanel1.add(jTFMarcaProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 156, 180, -1));

        jTFCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCantKeyTyped(evt);
            }
        });
        jPanel1.add(jTFCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 216, 180, -1));

        jTFPrecComp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPrecCompKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPrecCompKeyTyped(evt);
            }
        });
        jPanel1.add(jTFPrecComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 246, 180, -1));

        jTFPrecVU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPrecVUKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPrecVUKeyTyped(evt);
            }
        });
        jPanel1.add(jTFPrecVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 276, 180, -1));

        jTFPrecVM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPrecVMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPrecVMKeyTyped(evt);
            }
        });
        jPanel1.add(jTFPrecVM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 306, 180, -1));

        jTFCantMM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCantMMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCantMMKeyTyped(evt);
            }
        });
        jPanel1.add(jTFCantMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 336, 180, -1));

        jBIngresar.setText("Ingresar producto");
        jBIngresar.setEnabled(false);
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });
        jBIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBIngresarKeyPressed(evt);
            }
        });
        jPanel1.add(jBIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 372, -1, -1));

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitulo.setText("Altas de productos");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 54, -1, -1));

        jLNamePro.setText("Nombre del producto:");
        jPanel1.add(jLNamePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        jLabel1.setText("Medida o peso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, -1, -1));

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        jLabel3.setText("Precio de compra:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, -1, -1));

        jLabel4.setText("Precio de venta por unidad: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, -1, -1));

        jLabel5.setText("Precio de venta por mayoreo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 306, -1, -1));

        jLabel6.setText("Cantidad minima de mayoreo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 336, -1, -1));

        jTFNomProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomProductActionPerformed(evt);
            }
        });
        jTFNomProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomProductKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNomProductKeyTyped(evt);
            }
        });
        jPanel1.add(jTFNomProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 126, 180, -1));

        jBLimpia.setText("Limpiar");
        jBLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiaActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 372, -1, -1));

        jTFIDProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDProductActionPerformed(evt);
            }
        });
        jTFIDProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFIDProductKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIDProductKeyTyped(evt);
            }
        });
        jPanel1.add(jTFIDProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 96, 180, -1));

        jLabel7.setText("ID del producto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, -1, -1));

        jLabel8.setText("Marca del producto:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, -1, -1));

        jTFMedidaPesoProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMedidaPesoProductActionPerformed(evt);
            }
        });
        jTFMedidaPesoProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFMedidaPesoProductKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMedidaPesoProductKeyTyped(evt);
            }
        });
        jPanel1.add(jTFMedidaPesoProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 186, 180, -1));

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
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 444, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con = ManipulaDBC.conectaDB();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ManipulaDBC.desconectaDB(con);
    }//GEN-LAST:event_formWindowClosed

    private void jBLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiaActionPerformed
        CtrlInterfaz.limpia(jTFIDProduct, jTFCant, jTFCantMM, jTFMarcaProduct, jTFNomProduct,
                jTFPrecComp, jTFPrecVM, jTFPrecVU, jTFMedidaPesoProduct);
        CtrlInterfaz.habilita(false, jBIngresar);
        CtrlInterfaz.selecciona(jTFIDProduct);
    }//GEN-LAST:event_jBLimpiaActionPerformed

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        this.dispose();
        new menuPrincipal().setVisible(true);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jTFNomProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomProductKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jTFNomProductKeyTyped

    private void jTFNomProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomProductKeyPressed
        Validaciones.enter(this, evt, jTFMarcaProduct);
    }//GEN-LAST:event_jTFNomProductKeyPressed

    private void jTFMarcaProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMarcaProductKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jTFMarcaProductKeyTyped

    private void jTFMarcaProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMarcaProductKeyPressed
        Validaciones.enter(this, evt, jTFMedidaPesoProduct);
    }//GEN-LAST:event_jTFMarcaProductKeyPressed

    private void jTFCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFCantKeyTyped

    private void jTFCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantKeyPressed
        Validaciones.enterEntero(this, evt, jTFCant, jTFPrecComp);
    }//GEN-LAST:event_jTFCantKeyPressed

    private void jTFPrecCompKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecCompKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_jTFPrecCompKeyTyped

    private void jTFPrecCompKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecCompKeyPressed
        Validaciones.enterFlotante(this, evt, jTFPrecComp, jTFPrecVU);
    }//GEN-LAST:event_jTFPrecCompKeyPressed

    private void jTFPrecVUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecVUKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_jTFPrecVUKeyTyped

    private void jTFPrecVUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecVUKeyPressed
        Validaciones.enterFlotante(this, evt, jTFPrecVU, jTFPrecVM);
    }//GEN-LAST:event_jTFPrecVUKeyPressed

    private void jTFPrecVMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecVMKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_jTFPrecVMKeyTyped

    private void jTFPrecVMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecVMKeyPressed
        Validaciones.enterFlotante(this, evt, jTFPrecVM, jTFCantMM);
    }//GEN-LAST:event_jTFPrecVMKeyPressed

    private void jTFCantMMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantMMKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_jTFCantMMKeyTyped

    private void jTFCantMMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCantMMKeyPressed
        Validaciones.enterFlotante(this, evt, jTFCantMM, jBIngresar);
    }//GEN-LAST:event_jTFCantMMKeyPressed

    private void jBIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBIngresarKeyPressed
        if (evt.getKeyChar() == '\n') {
            jBIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_jBIngresarKeyPressed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        this.setCursor(WAIT_CURSOR);

        Querys q = new Querys();
        boolean flag = false;
        try {
            columnaMap1 = q.Seleccion(con, "id", "producto", "", false);
        } catch (Exception e) {
            System.out.println("Error en el SELECT...exception ->" + e);
        }

        for (int i = 0; i < columnaMap1.size(); i++) {
            if (columnaMap1.get(i).toString().trim().equals( jTFIDProduct.getText())) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (!flag) {
            Mensaje.error(this, "El ID esta siendo ocupado por otro producto\n"
                    + "Ingrese un ID diferente");
        } else {
            String columns = "";
            String values = "'" + jTFIDProduct.getText() + "',"
                    + "'" + jTFNomProduct.getText() + " " + jTFMarcaProduct.getText() + " " + jTFMarcaProduct.getText() + "',"
                    + "'" + jTFCant.getText() + "',"
                    + "'" + jTFPrecComp.getText() + "',"
                    + "'" + jTFPrecVU.getText() + "',"
                    + "'" + jTFPrecVM.getText() + "',"
                    + "'" + jTFCantMM.getText() + "'";

            try {
                q.Insertar(con, "producto", values);
            } catch (Exception e) {
                System.out.println("Error en el INSERT...exception ->" + e);
            }

            Mensaje.exito(this, "Se dio de alta correctamente el producto");
            jBLimpiaActionPerformed(evt);
            flag = false;
        }

        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jTFMarcaProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarcaProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMarcaProductActionPerformed

    private void jTFNomProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomProductActionPerformed

    private void jTFIDProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDProductActionPerformed

    private void jTFIDProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDProductKeyPressed
        Validaciones.enterEntero(this, evt, jTFIDProduct, jTFNomProduct);
    }//GEN-LAST:event_jTFIDProductKeyPressed

    private void jTFIDProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDProductKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_jTFIDProductKeyTyped

    private void jTFMedidaPesoProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMedidaPesoProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMedidaPesoProductActionPerformed

    private void jTFMedidaPesoProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMedidaPesoProductKeyPressed
        Validaciones.enter(this, evt, jTFCant);
    }//GEN-LAST:event_jTFMedidaPesoProductKeyPressed

    private void jTFMedidaPesoProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMedidaPesoProductKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jTFMedidaPesoProductKeyTyped

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBLimpia;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLNamePro;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFCant;
    private javax.swing.JTextField jTFCantMM;
    private javax.swing.JTextField jTFIDProduct;
    private javax.swing.JTextField jTFMarcaProduct;
    private javax.swing.JTextField jTFMedidaPesoProduct;
    private javax.swing.JTextField jTFNomProduct;
    private javax.swing.JTextField jTFPrecComp;
    private javax.swing.JTextField jTFPrecVM;
    private javax.swing.JTextField jTFPrecVU;
    // End of variables declaration//GEN-END:variables
}
