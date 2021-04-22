
/*
 * Principal.java
 *
 * @author elaprendiz http://www.youtube.com/user/JleoD7
 */
package Formulario;

import static Formulario.IngresoSistema.cuenta;
import claseConectar.conectar;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        //this.setUndecorated(true);
       //this.setExtendedState(Principal.MAXIMIZED_BOTH);    
        //this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        //this.setExtendedState(Principal.MAXIMIZED_BOTH);
        //this.setLocation(200, 50);
        System.out.println("Formulario.Principal.<init>()+ "+Principal.MAXIMIZED_BOTH);
        if(cuenta.equals("USUARIO")){
            jMenuItem4.setEnabled(false);
            jMenuItem3.setEnabled(false);
            jMenuItem15.setEnabled(false);
            jMenuItem18.setEnabled(false);

        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     *nego WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem16 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jdpescritorio = new javax.swing.JDesktopPane(){
            Image IMG=new ImageIcon(getClass().getResource("/Imagenes/bussines_3.jpg")).getImage();
            @Override
            public void paintChildren(Graphics g){
                g.drawImage(IMG, 0, 0, getWidth(), getHeight(), this);
                super.paintChildren(g);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        jMenuItem16.setText("jMenuItem16");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas  LR.Soft");
        setBackground(new java.awt.Color(255, 255, 204));
        setExtendedState(MAXIMIZED_BOTH);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jdpescritorio.setBackground(new java.awt.Color(25, 153, 153));
        jdpescritorio.setAutoscrolls(true);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivoSelected.png"))); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento.png"))); // NOI18N
        jMenu2.setText("Mantenimiento");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimientoSelected.png"))); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenu7.setBackground(new java.awt.Color(153, 153, 255));
        jMenu7.setText("Producto");

        jMenuItem3.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem3.setText("Nuevo Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItem22.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem22.setText("Actualizar Producto");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem18.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem18.setText("Tallas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuItem21.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem21.setText("Colores");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenu2.add(jMenu7);

        jMenuItem4.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem15.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem15.setText("Colaboradores");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem13.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem13.setText("Maquinas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movimiento.png"))); // NOI18N
        jMenu3.setText("Movimiento");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movimientoSelected.png"))); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem5.setText("Factura");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem10.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem10.setText("Boleta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem19.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem19.setText("Caja Registradora");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuItem12.setText("Gastos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultas.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultasSelected.png"))); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem7.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem7.setText("Clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem8.setText("Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu8.setBackground(new java.awt.Color(153, 153, 255));
        jMenu8.setText("Ventas");

        jMenuItem9.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem9.setText("Facturas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuItem11.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem11.setText("Boletas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuItem23.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem23.setText("Nota Ventas");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem23);

        jMenuItem20.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem20.setText("Ventas General");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenu4.add(jMenu8);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analisis.png"))); // NOI18N
        jMenu6.setText("Costos");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.jpg"))); // NOI18N
        jMenu6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analisisSelected.png"))); // NOI18N
        jMenu6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analisisSelected.png"))); // NOI18N
        jMenu6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analisisSelected.png"))); // NOI18N

        jMenuItem17.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem17.setText("Flujo Caja");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Software creado por LR.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
    IngresoSistema principal= new IngresoSistema();
    principal.setVisible(true);
    principal.pack();
    this.setVisible(false);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
     IngresoProductos ip= new IngresoProductos();
    jdpescritorio.add(ip);
    ip.show();
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_jMenu2ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
// TODO add your handling code here:
    IngresoCliente cli= new IngresoCliente();
    jdpescritorio.add(cli);
    cli.show();
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jMenu3ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
// TODO add your handling code here:
     Factura fac= new Factura();
    jdpescritorio.add(fac);
    fac.show();
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
// TODO add your handling code here:
   ConsultasClientes clientes= new ConsultasClientes();
    jdpescritorio.add(clientes);
    clientes.show();
    
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
// TODO add your handling code here:
    ConsultasProductos productos= new ConsultasProductos();
    jdpescritorio.add(productos);
    productos.show();
    
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
// TODO add your handling code here:
    ConsultasFacturas Facturas= new  ConsultasFacturas();
    jdpescritorio.add(Facturas);
    Facturas.show();
    
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
// TODO add your handling code here:
    Boleta bol = new Boleta();
    jdpescritorio.add(bol);
    bol.show();
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jMenu4ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
// TODO add your handling code here:
     ConsultasBoletas Boletas= new  ConsultasBoletas();
    jdpescritorio.add(Boletas);
    Boletas.show();
   
   // Boletas.setLocation(null);
  //  Boletas.setVisible(true);
    
}//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
         IngresoVendedor col= new IngresoVendedor();
         jdpescritorio.add(col);
         col.show();
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
       try{
            IngresoTalla col= new IngresoTalla();
            jdpescritorio.add(col);
            col.show();
        
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error!");
            }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        CajaRegistradora   col= new CajaRegistradora();
        jdpescritorio.add(col);
        col.show();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        ConsultasVentas col= new ConsultasVentas();
        jdpescritorio.add(col);
        col.setLocation(275, 25);
        col.show();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        IngresoColor col= new IngresoColor();
        jdpescritorio.add(col);
        col.show();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        ActualizarProductos col= new ActualizarProductos();
        jdpescritorio.add(col);
        col.setLocation(335, 60);
        col.show();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        ConsultasTicketVenta col= new ConsultasTicketVenta();
        jdpescritorio.add(col);
        col.setLocation(335, 60);
        col.show();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        FlujoCaja col= new FlujoCaja();
        jdpescritorio.add(col);
        col.setLocation(335, 5);
        col.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        ConsultasGastos col= new ConsultasGastos();
        jdpescritorio.add(col);
        col.setLocation(290, 20);
        col.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
         /*IngresoMaquinas col= new IngresoMaquinas();
         jdpescritorio.add(col);
         col.setLocation(290, 20);
         col.show();*/
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JDesktopPane jdpescritorio;
    // End of variables declaration//GEN-END:variables
}
