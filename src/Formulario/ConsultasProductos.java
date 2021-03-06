
/*
 * ConsultasProductos.java
 *
 * @author Luis Ramos
 */
package Formulario;

import claseConectar.conectar;
import java.sql.*;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class ConsultasProductos extends javax.swing.JInternalFrame {

    /** Creates new form ConsultasProductos */
    public ConsultasProductos() {
        initComponents();
        mostrartodosproductos();
        calcular();
        txtTotal.setEditable(false);
        setLocation(300, 10);
        
    }
    private String consulta="";
            
    void mostrartodosproductos()
    {
        /*DefaultTableModel tabla= new DefaultTableModel(){
              @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        String []titulos={"CODIGO","DESCRIPCION","PRECIO","STOCK"};
        tabla.setColumnIdentifiers(titulos);
        this.tbproductos.setModel(tabla);
        String consulta= "SELECT * FROM producto";
        String []Datos= new String [4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("cod_pro");
                Datos[1]=rs.getString("descripcion");
                Datos[2]=rs.getString("precio");
                Datos[3]=rs.getString("Stock");
                 if(Datos[3].equals("0")){
                    JOptionPane.showMessageDialog(null, "No hay suficiente Stock de "+Datos[1]+"!", "ALERTA", 2);
                }
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    String [] Titulo = {"Codigo","Descripcion","Talla","Color","Stock","Precio S/."};
    DefaultTableModel tabla= new DefaultTableModel(null,Titulo){
              @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
    TableRowSorter sorter = new TableRowSorter(tabla);
    String []Registro= new String[6];
    String mostrar0="select producto.cod_pro, producto.descripcion, talla.des_talla,color.des_color,talla_producto.Stock,talla_producto.Precio_talla";
    String mostrar1="from talla,producto,talla_producto,color";
    String mostrar2="WHERE( talla_producto.cod_talla=talla.cod_talla) and (talla_producto.cod_pro=producto.cod_pro) and (talla_producto.cod_color=color.cod_color) and "; 
    String mostrar3="(CONCAT (producto.cod_pro,' ',producto.descripcion,' ', talla.des_talla,talla_producto.Stock,talla_producto.Precio_talla) LIKE"+"'%%')";
    String mostrar4="order by producto.descripcion ASC,talla_producto.Precio_talla  asc";
    String mostrar=mostrar0+" "+mostrar1+" "+mostrar2+" "+mostrar3+" "+mostrar4;

    Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs =st.executeQuery(mostrar);
            while(rs.next())
            {
                Registro[0]=rs.getString(1);
                Registro[1]=rs.getString(2);
                Registro[2]=rs.getString(3);
                Registro[3]=rs.getString(4);
                Registro[4]=rs.getString(5);
                Registro[5]=rs.getString(6);
                tabla.addRow(Registro);
                if(Registro[4].equals("0")){
                    JOptionPane.showMessageDialog(null, "No hay suficiente Stock de "+Registro[1]+"!", "ALERTA", 2);
                }
            }
            tbproductos.setModel(tabla);
            this.tbproductos.setRowSorter(sorter);
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbtndes = new javax.swing.JRadioButton();
        rbtntodo = new javax.swing.JRadioButton();
        btnbuscar = new javax.swing.JButton();
        txtdescripcion = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA DE PRODUCTOS");

        jPanel2.setBackground(new java.awt.Color(217, 222, 239));

        jPanel1.setBackground(new java.awt.Color(175, 238, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 173, 165)));

        buttonGroup1.add(rbtndes);
        rbtndes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtndes.setSelected(true);
        rbtndes.setText("Mostrar Productos por Descripcion");
        rbtndes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtndesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtntodo);
        rbtntodo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtntodo.setText("Mostrar todos los Productos");
        rbtntodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntodoActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(0, 128, 128));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtdescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtndes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtntodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(242, 242, 242)))
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtndes)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rbtntodo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir ");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        txtTotal.setBackground(new java.awt.Color(51, 255, 204));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Thonburi", 1, 14)); // NOI18N
        jLabel2.setText("Total Stock");

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contenido (1)++.png"))); // NOI18N
        jButton1.setText("Reporte");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contenido.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contenidoPresed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbproductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rbtntodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtntodoActionPerformed
// TODO add your handling code here:
    if(rbtntodo.isSelected()==true)
    {
        txtdescripcion.setText("");
        txtdescripcion.setEnabled(false);
        consulta="";
        mostrartodosproductos();
        calcular();
    }
   
}//GEN-LAST:event_rbtntodoActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
    String buscar=txtdescripcion.getText();
    if(rbtndes.isSelected()==true)
    {
        String [] Titulo = {"Codigo","Descripcion","Talla","Color","Stock","Precio S/."};
       DefaultTableModel tabla= new DefaultTableModel(null,Titulo){
              @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
       TableRowSorter sorter = new TableRowSorter(tabla);
    String []Registro= new String[6];
    String mostrar0="select producto.cod_pro, producto.descripcion, talla.des_talla,color.des_color,talla_producto.Stock,talla_producto.Precio_talla";
    String mostrar1="from talla,producto,talla_producto,color";
    String mostrar2="WHERE( talla_producto.cod_talla=talla.cod_talla) and (talla_producto.cod_pro=producto.cod_pro) and (talla_producto.cod_color=color.cod_color) and"; 
    String mostrar3="(CONCAT (producto.cod_pro,' ',producto.descripcion,' ', talla.des_talla,talla_producto.Stock,talla_producto.Precio_talla) LIKE '%"+buscar+"%')";
    String mostrar4="order by producto.descripcion ASC,talla_producto.Precio_talla  asc";
    String mostrar=mostrar0+" "+mostrar1+" "+mostrar2+" "+mostrar3+" "+mostrar4;

    Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs =st.executeQuery(mostrar);
            while(rs.next())
            {
                Registro[0]=rs.getString(1);
                Registro[1]=rs.getString(2);
                Registro[2]=rs.getString(3);
                Registro[3]=rs.getString(4);
                Registro[4]=rs.getString(5);
                Registro[5]=rs.getString(6);
                tabla.addRow(Registro);
                if(Registro[4].equals("0")){
                    JOptionPane.showMessageDialog(null, "No hay suficiente Stock de "+Registro[1]+"!", "ALERTA", 2);
                }
            }
            tbproductos.setModel(tabla);
            this.tbproductos.setRowSorter(sorter);
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        consulta=buscar;
        calcular();
    }
    else
    {
        mostrartodosproductos();
        calcular();
    }
}//GEN-LAST:event_btnbuscarActionPerformed

private void rbtndesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtndesActionPerformed
// TODO add your handling code here:
    if(rbtndes.isSelected()==true)
    {
        txtdescripcion.setEnabled(true);
        txtdescripcion.requestFocus();
    }
}//GEN-LAST:event_rbtndesActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        String descripcion=consulta;
        String total=txtTotal.getText();
        if(rbtntodo.isSelected()){descripcion="";}
        conectar miconexion = new conectar();
        URL archivo = this.getClass().getResource("reportProducto.jasper");
        JasperReport jr = null;
        try {
            jr= (JasperReport) JRLoader.loadObject(archivo);
            Map parametro = new HashMap();
            parametro.put("buscar",descripcion);
            parametro.put("TotalStock",total);
            JasperPrint jp =JasperFillManager.fillReport(jr,parametro, miconexion.conexion());
            JasperPrintManager.printReport(jp, true);   
        } catch (JRException e) {
            System.out.printf(e.getMessage());
        }
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String descripcion=txtdescripcion.getText();
        String total=txtTotal.getText();
        if(rbtntodo.isSelected()){descripcion="";}
        conectar miconexion = new conectar();
        URL archivo = this.getClass().getResource("reportProducto.jasper");
        JasperReport jr = null;
        try {
            jr= (JasperReport) JRLoader.loadObject(archivo);
            Map parametro = new HashMap();
            parametro.put("buscar",descripcion);
            parametro.put("TotalStock",total);
            JasperPrint jp =JasperFillManager.fillReport(jr,parametro, miconexion.conexion());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Reporte Productos");
        } catch (JRException e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed
public void presionar(){
    mostrartodosproductos();
    calcular();
}
     void calcular()
    {
        
        String can;
        int cantidad;
        int imp=0;
        
            /*can=Integer.parseInt(cant);
            imp=pre*can;
            dato[4]=Float.toString(imp);*/
        
        for(int i=0;i<tbproductos.getRowCount();i++)
        {
            
            can=tbproductos.getValueAt(i, 4).toString();
            cantidad=Integer.parseInt(can);
            imp=imp+cantidad;
           
            // txtcod.setText(""+Math.rint(c*100)/100)   
        }
        txtTotal.setText(Integer.toString(imp));
     
       /* txtsubtotal.setText(Double.toString(subtotal));
        txtigv.setText(""+Math.rint(igv*100)/100);
        txttotal.setText(""+Math.rint(total*100)/100);*/            
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtndes;
    private javax.swing.JRadioButton rbtntodo;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
conectar cc= new conectar();
Connection cn = cc.conexion();

}
