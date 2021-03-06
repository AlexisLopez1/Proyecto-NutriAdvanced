package nutri_advanced;

import Codigo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * @author AlexisLopez
 */
public class Pacientes extends javax.swing.JFrame {

    private Conexion conexion = null; 
    private ResultSet rs = null;
    DefaultTableModel model;
    public int id;
    
    public void Tabla()
	{ 
           
		try
		{
			
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select * from Pacientes";
                        String[] titulos = {"ID", "Nombre", "Apellido", "Direccion", "Telefono", "CorreoElectronico"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[7];
                        
                        while(rs.next())
                        {
			fila[0]=rs.getString("ID");
			fila[1]=rs.getString("Nombre");
			fila[2]=rs.getString("Apellido");
                        fila[3]=rs.getString("Direccion");
                        fila[4]=rs.getString("Telefono");
                        fila[5]=rs.getString("CorreoElectronico");
                        
                        model.addRow(fila);
                        }
                        this.table.setModel(model);  		
				
		}
		catch (SQLException ex)
		 {
			
  		  	 
  		  	 
	 	 }
		 catch (Exception ex)
		 {
			
			 
		 }	
	}
    
    public Pacientes() {
        initComponents();
        Tabla();
        Beliminar.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tbuscar = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Beliminar = new javax.swing.JButton();
        Bnuevo = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-nutriciónPequeñ.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUTRI-ADVANCED.jpg"))); // NOI18N

        jLabel_usuario.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel_usuario.setText("Pacientes");

        Tbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbuscarActionPerformed(evt);
            }
        });

        Bbuscar.setBackground(new java.awt.Color(255, 255, 255));
        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda2.png"))); // NOI18N
        Bbuscar.setBorderPainted(false);
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Beliminar.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        Beliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete copia.png"))); // NOI18N
        Beliminar.setText("Eliminar");
        Beliminar.setBorderPainted(false);
        Beliminar.setContentAreaFilled(false);
        Beliminar.setEnabled(true);
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        Bnuevo.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        Bnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evaluaciones.png"))); // NOI18N
        Bnuevo.setText("Nuevo");
        Bnuevo.setBorderPainted(false);
        Bnuevo.setContentAreaFilled(false);
        Bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoActionPerformed(evt);
            }
        });

        bRegresar.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        bRegresar.setBorderPainted(false);
        bRegresar.setContentAreaFilled(false);
        bRegresar.setEnabled(true);
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Beliminar)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_usuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_usuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Tbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Bbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Beliminar)
                    .addComponent(Bnuevo))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbuscarActionPerformed

    }//GEN-LAST:event_TbuscarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed

        try
		{
			
			String nom = Tbuscar.getText();
			
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select * from Pacientes where ID like('%"+nom+"%') or Nombre like('%"+nom+"%') or Apellido like('%"+nom+"%') or Direccion like('%"+nom+"%') or CorreoElectronico like('%"+nom+"%')";
                        String[] titulos = {"ID", "Nombre", "Apellido", "Direccion", "Telefono", "CorreoElectronico"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[7];
                        
                        while(rs.next())
                        {
			fila[0]=rs.getString("ID");
			fila[1]=rs.getString("Nombre");
			fila[2]=rs.getString("Apellido");
                        fila[3]=rs.getString("Direccion");
                        fila[4]=rs.getString("Telefono");
                        fila[5]=rs.getString("CorreoElectronico");
                        
                        model.addRow(fila);
                        }
                        this.table.setModel(model);                                                               	
		}
		catch (SQLException ex)
		 {
			
  		  	 JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);
  		  	 
	 	 }
		 catch (Exception ex)
		 {
			
			 JOptionPane.showMessageDialog(null,ex, "Error", JOptionPane.ERROR_MESSAGE);
		 }
			
			
    }//GEN-LAST:event_BbuscarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(evt.getClickCount()==1)
        {    
            Beliminar.setVisible(true);
        }
        else
        {
            if(evt.getClickCount()==2)
            {
                Inf_Pacientes ip = new Inf_Pacientes();
                ip.setVisible(true);
                dispose();
                
                int select = table.getSelectedRow();
                try
                {
                    String  valor ;
                    valor = table.getValueAt(select,0).toString();
                    ip.Consulta(valor);
                } 
                
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed

        try
        {
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            int fila = table.getSelectedRow();
            String delete = "delete from Datos_Evaluacion where ID="+table.getValueAt(fila,0);
            String delete1 = "delete from Pacientes where ID="+table.getValueAt(fila,0);
            
            conexion.insertaRegistro(delete);
            conexion.insertaRegistro(delete1);
            Tabla();
            
            JOptionPane.showMessageDialog(null,"Registro Eliminado", null, JOptionPane.INFORMATION_MESSAGE);
            Beliminar.setVisible(false);                       
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BeliminarActionPerformed

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoActionPerformed
        Add_Paci ap = new Add_Paci();
        ap.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BnuevoActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Beliminar.setVisible(false);
        Tabla();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        Pag_Principal pp = new Pag_Principal();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    public javax.swing.JButton Beliminar;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JTextField Tbuscar;
    public javax.swing.JButton bRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
