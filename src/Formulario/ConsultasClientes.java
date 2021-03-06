/*
 * ConsultasClientes.java
 *
 * @author elaprendiz http://www.youtube.com/user/JleoD7
 */
package Formulario;

import claseConectar.conectar;
import java.net.URL;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ConsultasClientes extends javax.swing.JInternalFrame {
 
    public ConsultasClientes() {
        initComponents();
        txtdni.setEnabled(false);
        Cargarlistaclientes();
    }
    void Cargarlistaclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel()
        {
              @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DNI","TELEFONO","RUC","EMAIL","DIRECCION"};
        modelo.setColumnIdentifiers(Titulos);
         TableRowSorter sorter = new TableRowSorter(modelo);
         this.tbclientes.setModel(modelo);
         this.tbclientes.setRowSorter(sorter);
        try {
            
            String ConsultaSQL="SELECT * FROM cliente";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dni_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("ruc_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdgenero = new javax.swing.JRadioButton();
        rddni = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        cbogenero = new javax.swing.JComboBox();
        txtdni = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA DE CLIENTES");

        jPanel2.setBackground(new java.awt.Color(227, 255, 255));

        jPanel1.setBackground(null);
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(204, 0, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102)));

        buttonGroup1.add(rdgenero);
        rdgenero.setSelected(true);
        rdgenero.setText("Mostrar Clientes por Genero:");
        rdgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgeneroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rddni);
        rddni.setText("Buscar Clientes por DNI:");
        rddni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddniActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdtodo);
        rdtodo.setText("Mostrar todos los clientes");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        cbogenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.setBorderPainted(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar.setIconTextGap(-1);
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarSelected.png"))); // NOI18N
        btnbuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rddni)
                        .addGap(24, 24, 24)
                        .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdtodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdgenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbogenero, 0, 162, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addComponent(btnbuscar)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdgenero)
                            .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rddni)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdtodo)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tbclientes.setAutoCreateRowSorter(true);
        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbclientes);

        jLabel1.setText("Cantidad de Registros");

        txtcant.setEnabled(false);

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

        btnImprimir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir ");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnImprimir)
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir))
                .addGap(4, 4, 4))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rdgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgeneroActionPerformed
// TODO add your handling code here:
    if(rdgenero.isSelected()==true)
    {
        
        cbogenero.setSelectedItem(0);
        cbogenero.setEnabled(true);
        txtdni.setEnabled(false);
        txtdni.setText("");
    }
}//GEN-LAST:event_rdgeneroActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
   String sexo= cbogenero.getSelectedItem().toString();
   String dni=txtdni.getText();
   
   if(rdgenero.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DNI","TELEFONO","RUC","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE sexo_cli='"+sexo+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dni_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("ruc_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(rddni.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DNI","TELEFONO","RUC","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE dni_cli like '%"+dni+"%'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dni_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("ruc_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(rdtodo.isSelected()==true)
   {
       Cargarlistaclientes();
   }
   
}//GEN-LAST:event_btnbuscarActionPerformed

private void rddniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddniActionPerformed
// TODO add your handling code here:
    if(rddni.isSelected()==true)
    {
        cbogenero.setSelectedIndex(0);
        cbogenero.setEnabled(false);
        txtdni.setEnabled(true);
        txtdni.requestFocus();
    }
}//GEN-LAST:event_rddniActionPerformed

private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
// TODO add your handling code here:
    Cargarlistaclientes();
    txtdni.setText("");
    txtdni.setEnabled(false);
}//GEN-LAST:event_rdtodoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String genero=cbogenero.getSelectedItem().toString();
        String dni=txtdni.getText();
        if(rdgenero.isSelected()){dni="";}
        if(rddni.isSelected()){genero="";}
    conectar miconexion = new conectar();
    URL archivo = this.getClass().getResource("reportesClientes.jasper");
    JasperReport jr = null;
    try {
        jr= (JasperReport) JRLoader.loadObject(archivo);
        Map parametro = new HashMap();
        parametro.put("SEXO",genero);
        parametro.put("DNI",dni);
        JasperPrint jp =JasperFillManager.fillReport(jr,parametro, miconexion.conexion());
        JasperViewer jv = new JasperViewer(jp,false);
        jv.setVisible(true);
        jv.setTitle("Reporte Clientes");
    } catch (JRException e) {
       System.out.printf(e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        String genero=cbogenero.getSelectedItem().toString();
        String dni=txtdni.getText();
        if(rdgenero.isSelected()){dni="";}
        if(rddni.isSelected()){genero="";}
        conectar miconexion = new conectar();
        URL archivo = this.getClass().getResource("reportesClientes.jasper");
        JasperReport jr = null;
        try {
            jr= (JasperReport) JRLoader.loadObject(archivo);
            Map parametro = new HashMap();
            parametro.put("SEXO",genero);
            parametro.put("DNI",dni);
            JasperPrint jp =JasperFillManager.fillReport(jr,parametro, miconexion.conexion());
            JasperPrintManager.printReport(jp, true);      
        } catch (JRException e) {
           System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbogenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddni;
    private javax.swing.JRadioButton rdgenero;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables
conectar cc= new conectar();
Connection cn = cc.conexion();


}
