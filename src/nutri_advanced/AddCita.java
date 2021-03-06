package nutri_advanced;
/**
 * @author AlexisLopez
 */
import Codigo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;



public class AddCita extends javax.swing.JFrame {
    private Conexion conexion = null; 
    private ResultSet rs = null;
    String id=null;

    void Buscar(String var) 
    {
        try
        {
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            
            String consulta = "select * from Pacientes where ID="+var;
            rs=conexion.Consultar(consulta);
        
            if(rs.next());
            {
                tPas.setText((rs.getString("ID")));
                lNom.setText((rs.getString("Nombre")));
                lAp.setText((rs.getString("Apellido")));
                lTel.setText((rs.getString("Telefono")));
            }
            
            id=tPas.getText();
        
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
    
    public AddCita() {
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
        bRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tPas = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lNom = new javax.swing.JLabel();
        lTel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tAc = new javax.swing.JTextField();
        BtnAgregarPac = new javax.swing.JButton();
        tHora = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jSpin = new javax.swing.JSpinner();
        lAp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        bRegresar.setBackground(new java.awt.Color(255, 255, 255));
        bRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        bRegresar.setAutoscrolls(true);
        bRegresar.setBorder(null);
        bRegresar.setBorderPainted(false);
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUTRI-ADVANCED.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-nutriciónPequeñ.jpg"))); // NOI18N

        jLabel_usuario.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel_usuario.setText("Nueva Cita");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("ID Paciente:");

        bBuscar.setBackground(new java.awt.Color(255, 255, 255));
        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addusr.png"))); // NOI18N
        bBuscar.setBorder(null);
        bBuscar.setBorderPainted(false);
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        lNom.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        lTel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lTel.setText(" ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Hora:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("ID Acesor:");

        BtnAgregarPac.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgregarPac.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        BtnAgregarPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acept.png"))); // NOI18N
        BtnAgregarPac.setText("Aceptar");
        BtnAgregarPac.setBorder(null);
        BtnAgregarPac.setBorderPainted(false);
        BtnAgregarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarPacActionPerformed(evt);
            }
        });

        tHora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tHora.setText("00:00");

        jDate.setDateFormatString("yyyy-MM-dd");
        jDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateMouseClicked(evt);
            }
        });

        jSpin.setModel(new javax.swing.SpinnerListModel(new String[] {"am", "pm", "am", "pm", "am"}));
        jSpin.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        lAp.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_usuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tAc)
                                        .addGap(263, 263, 263))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAgregarPac)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(tPas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lNom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel_usuario)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(BtnAgregarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        Citas c = new Citas();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void BtnAgregarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarPacActionPerformed

        conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
        conexion.conecta();
        
        String Pas = tPas.getText();
        String Ac = tAc.getText();

        String dia = Integer.toString(jDate.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDate.getCalendar().get(Calendar.MONTH)+1);
        String año = Integer.toString(jDate.getCalendar().get(Calendar.YEAR));
        String Fecha = año+"-"+mes+"-"+dia;
        
        String Hora = tHora.getText();
        Object spin = jSpin.getValue();
        String am = spin.toString();
          
        String consulta = "select * from Citas where Fecha ='"+Fecha+"' && Hora='"+Hora+" "+am+"'";
        String insert = "insert into Citas values(null, '"+Pas+"', '"+Ac+"', '"+Fecha+"', '"+Hora+" "+am+"')";
       
         System.out.println(consulta);
         System.out.println(insert);
        rs = conexion.Consultar(consulta);
        try
        {
            if(!(rs.next()))
            {
                conexion.insertaRegistro(insert);
                
                Citas c= new Citas();
                c.setVisible(true);
                dispose();

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Ya hay una cita en este horario", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);//Error sql
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE);//Error java
        }
    }//GEN-LAST:event_BtnAgregarPacActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
       BuscarPac bp = new BuscarPac();
       bp.setVisible(true);
    }//GEN-LAST:event_bBuscarActionPerformed

    private void jDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateMouseClicked

    }//GEN-LAST:event_jDateMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
        conexion.conecta();
        String pa = tPas.getText();
        String consulta = "Select Nombre, Apellido, Telefono from Pacientes where ID="+pa;
        
        rs = conexion.Consultar(consulta);
        try
        {
            if(rs.next())
            {
                lNom.setText((rs.getString("Nombre")));
                lAp.setText((rs.getString("Apellido")));
                lTel.setText((rs.getString("Telefono")));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El paciente no existe", "Error", JOptionPane.ERROR_MESSAGE);
                lNom.setText("");
                lAp.setText("");
                lTel.setText("");
                tPas.setText("");
            }
            
        }
         catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo la Conexión", "Error", JOptionPane.ERROR_MESSAGE); 	 
        }
        catch (Exception ex)
        {		
	    JOptionPane.showMessageDialog(null,ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarPac;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bRegresar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpin;
    private javax.swing.JLabel lAp;
    private javax.swing.JLabel lNom;
    private javax.swing.JLabel lTel;
    private javax.swing.JTextField tAc;
    private javax.swing.JTextField tHora;
    private javax.swing.JTextField tPas;
    // End of variables declaration//GEN-END:variables
}
