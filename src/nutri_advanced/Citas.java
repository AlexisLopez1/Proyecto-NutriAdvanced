package nutri_advanced;

import Codigo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
/**
 * @author AlexisLopez
 */
public class Citas extends javax.swing.JFrame {
    
    private Conexion conexion = null; 
    private ResultSet rs = null;
    DefaultTableModel model;
    
    public void Tabla()
	{ 
           
		try
		{
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select Citas.No_Cita, Pacientes.Nombre, Pacientes.Apellido, Citas.Fecha, Citas.Hora, Citas.ID_Acesor from Citas, Pacientes where (Citas.ID_Paciente = Pacientes.ID) && (Citas.Fecha > current_date())";
                        String[] titulos = {"No_Cita", "Nombre", "Apellido", "Fecha", "Hora", "Acesor"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[6];
                        
                        while(rs.next())
                        {
			fila[0]=rs.getString("No_Cita");
			fila[1]=rs.getString("Nombre");
			fila[2]=rs.getString("Apellido");
                        fila[3]=rs.getString("Fecha");
                        fila[4]=rs.getString("Hora");
                        fila[5]=rs.getString("ID_Acesor");
                        
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
	}
    
    public Citas() 
    {
        initComponents();
        Tabla();
        bEliminar.setVisible(false);
        bSig.setForeground(Color.blue);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bBuscar = new javax.swing.JButton();
        tBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bNuevo = new javax.swing.JButton();
        bSig = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bAnt = new javax.swing.JButton();
        bTod = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUTRI-ADVANCED.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-nutriciónPequeñ.jpg"))); // NOI18N

        jLabel_usuario.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel_usuario.setText("Citas");

        bBuscar.setBackground(new java.awt.Color(255, 255, 255));
        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda2.png"))); // NOI18N
        bBuscar.setBorderPainted(false);
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBuscarActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        bNuevo.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        bNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Evaluaciones.png"))); // NOI18N
        bNuevo.setText("Nuevo");
        bNuevo.setBorderPainted(false);
        bNuevo.setContentAreaFilled(false);
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bSig.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bSig.setText("Citas Siguientes");
        bSig.setBorderPainted(false);
        bSig.setContentAreaFilled(false);
        bSig.setEnabled(true);
        bSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSigActionPerformed(evt);
            }
        });

        bEliminar.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete copia.png"))); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.setBorderPainted(false);
        bEliminar.setContentAreaFilled(false);
        bEliminar.setEnabled(true);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bAnt.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bAnt.setText("Citas Pasadas");
        bAnt.setBorderPainted(false);
        bAnt.setContentAreaFilled(false);
        bAnt.setEnabled(true);
        bAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntActionPerformed(evt);
            }
        });

        bTod.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bTod.setText("Todas las Citas");
        bTod.setBorderPainted(false);
        bTod.setContentAreaFilled(false);
        bTod.setEnabled(true);
        bTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTodActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bAnt)
                            .addComponent(bTod)
                            .addComponent(bSig, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEliminar)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_usuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bNuevo)
                                    .addComponent(bEliminar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(tBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(bSig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bAnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bTod)))
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        bSig.setForeground(Color.black);
        bAnt.setForeground(Color.black);
        bTod.setForeground(Color.black);
        
        try
        {

            String nom = tBuscar.getText();

            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            String consulta = "select Citas.No_Cita, Pacientes.Nombre, Pacientes.Apellido, Citas.Fecha, Citas.Hora, Citas.ID_Acesor from Citas, Pacientes where (Citas.ID_Paciente=Pacientes.ID) and (Citas.No_Cita like('%"+nom+"%') or Citas.ID_Paciente like('%"+nom+"%') or Citas.Fecha like('%"+nom+"%') or Pacientes.Nombre like('%"+nom+"%') or Pacientes.Apellido like('%"+nom+"%'))";
            String[] titulos = {"No_Cita", "Nombre", "Apellido", "Fecha", "Hora", "Acesor"};
            rs = conexion.Consultar(consulta);
            model = new DefaultTableModel(null, titulos);

            String []fila = new String[6];

            while(rs.next())
            {
                fila[0]=rs.getString("No_Cita");
		fila[1]=rs.getString("Nombre");
		fila[2]=rs.getString("Apellido");
                fila[3]=rs.getString("Fecha");
                fila[4]=rs.getString("Hora");
                fila[5]=rs.getString("ID_Acesor");

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

    }//GEN-LAST:event_bBuscarActionPerformed

    private void tBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBuscarActionPerformed

    }//GEN-LAST:event_tBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        AddCita ac = new AddCita();
        ac.setVisible(true);
        dispose();

    }//GEN-LAST:event_bNuevoActionPerformed

    private void bSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSigActionPerformed
        Tabla();  
        bSig.setForeground(Color.blue);
        bAnt.setForeground(Color.black);
        bTod.setForeground(Color.black);
    }//GEN-LAST:event_bSigActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        bEliminar.setVisible(true);
    }//GEN-LAST:event_tableMouseClicked

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        try
        {
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            int fila = table.getSelectedRow();
            String delete = "delete from Citas where No_Cita="+table.getValueAt(fila,0);
            conexion.insertaRegistro(delete);
            Tabla();

            JOptionPane.showMessageDialog(null,"Cita Eliminada", null, JOptionPane.INFORMATION_MESSAGE);
            bEliminar.setVisible(false);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntActionPerformed
        
        bSig.setForeground(Color.black);
        bAnt.setForeground(Color.blue);
        bTod.setForeground(Color.black);
        
        try
	{
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            String consulta = "select Citas.No_Cita, Pacientes.Nombre, Pacientes.Apellido, Citas.Fecha, Citas.Hora, Citas.ID_Acesor from Citas, Pacientes where (Citas.ID_Paciente = Pacientes.ID) && (Citas.Fecha < current_date())";
            String[] titulos = {"No_Cita", "Nombre", "Apellido", "Fecha", "Hora", "Acesor"};
            rs = conexion.Consultar(consulta);
            model = new DefaultTableModel(null, titulos);
                        
            String []fila = new String[6];
                        
            while(rs.next())
            {
                fila[0]=rs.getString("No_Cita");
		fila[1]=rs.getString("Nombre");
		fila[2]=rs.getString("Apellido");
                fila[3]=rs.getString("Fecha");
                fila[4]=rs.getString("Hora");
                fila[5]=rs.getString("ID_Acesor");
                        
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
    }//GEN-LAST:event_bAntActionPerformed

    private void bTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTodActionPerformed
       
        bSig.setForeground(Color.black);
        bAnt.setForeground(Color.black);
        bTod.setForeground(Color.blue);
        
        try
	{
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            String consulta = "select Citas.No_Cita, Pacientes.Nombre, Pacientes.Apellido, Citas.Fecha, Citas.Hora, Citas.ID_Acesor from Citas, Pacientes where Citas.ID_Paciente = Pacientes.ID";
            String[] titulos = {"No_Cita", "Nombre", "Apellido", "Fecha", "Hora", "Acesor"};
            rs = conexion.Consultar(consulta);
            model = new DefaultTableModel(null, titulos);
                        
            String []fila = new String[6];
                        
            while(rs.next())
            {
                fila[0]=rs.getString("No_Cita");
		fila[1]=rs.getString("Nombre");
		fila[2]=rs.getString("Apellido");
                fila[3]=rs.getString("Fecha");
                fila[4]=rs.getString("Hora");
                fila[5]=rs.getString("ID_Acesor");
                        
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
    }//GEN-LAST:event_bTodActionPerformed

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bAnt;
    private javax.swing.JButton bBuscar;
    public javax.swing.JButton bEliminar;
    private javax.swing.JButton bNuevo;
    public javax.swing.JButton bRegresar;
    public javax.swing.JButton bSig;
    public javax.swing.JButton bTod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField tBuscar;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
