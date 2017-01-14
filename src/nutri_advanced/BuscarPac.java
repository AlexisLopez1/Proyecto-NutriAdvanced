package nutri_advanced;
/**
 * @author AlexisLopez
 */
import Codigo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarPac extends javax.swing.JFrame {
    
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
			
  		  	 JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);
  		  	 
	 	 }
		 catch (Exception ex)
		 {
			
			 JOptionPane.showMessageDialog(null,ex, "Error", JOptionPane.ERROR_MESSAGE);
		 }
    
        }
    
    public BuscarPac() {
        initComponents();
        Tabla();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bbuscar = new javax.swing.JButton();
        Tbuscar = new javax.swing.JTextField();
        bAcept = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Bbuscar.setBackground(new java.awt.Color(255, 255, 255));
        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda2.png"))); // NOI18N
        Bbuscar.setBorderPainted(false);
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Tbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbuscarActionPerformed(evt);
            }
        });

        bAcept.setBackground(new java.awt.Color(255, 255, 255));
        bAcept.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        bAcept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acept.png"))); // NOI18N
        bAcept.setText("Aceptar");
        bAcept.setBorder(null);
        bAcept.setBorderPainted(false);
        bAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptActionPerformed(evt);
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
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAcept)
                        .addContainerGap())))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAcept)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void bAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptActionPerformed
        
        AddCita ip = new AddCita();
                ip.setVisible(true);
                dispose();
                
                int select = table.getSelectedRow();
                try
                {
                    String  valor ;
                    valor = table.getValueAt(select,0).toString();
                    ip.Buscar(valor);
                } 
                
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
        
        
        
        
    }//GEN-LAST:event_bAceptActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JTextField Tbuscar;
    private javax.swing.JButton bAcept;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
