package nutri_advanced;

import Codigo.Conexion;
import nutri_advanced.Pacientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author AlexisLopez
 */
public class Inf_Pacientes extends javax.swing.JFrame {

    public Pacientes pac = new Pacientes();
    int id1;
    private Conexion conexion = null; 
    private ResultSet rs = null;
    DefaultTableModel model;
    String id=null;
    
    public Inf_Pacientes() {
        initComponents();
        Informacion.setVisible(true);
        Historial.setVisible(false);
        
        bInformacion.setForeground(Color.blue);
        bGuardar.setVisible(false);
        bCancel.setVisible(false);
        Deshabilitar();
        
        
        
    }
    void Consulta(String var)
    {
        try
        {
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            
            String consulta = "select * from Pacientes, Datos_Evaluacion where Pacientes.ID = Datos_Evaluacion.ID and Pacientes.ID="+var;
            
            rs = conexion.Consultar(consulta);
            if(rs.next());
            {
                tID.setText((rs.getString("ID")));
                
                tNombre.setText((rs.getString("Nombre")));
                tApellido.setText((rs.getString("Apellido")));
                tDireccion.setText((rs.getString("Direccion")));
                tTelefono.setText((rs.getString("Telefono")));
                tCorreo.setText((rs.getString("CorreoElectronico")));
                tEdad.setText((rs.getString("Edad")));
                tSexo.setText((rs.getString("Sexo")));
                tPeso.setText((rs.getString("Peso")));
                tEstatura.setText((rs.getString("Estatura")));
                tCintura.setText((rs.getString("Cintura")));
                tCadera.setText((rs.getString("Cadera")));
                tTalla.setText((rs.getString("Talla")));
                tAlergias.setText((rs.getString("Alergias")));
            }
            
           id=tID.getText();
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
    
    void Tabla()
        {
            try
		{
			
                        System.out.println(id);
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select * from Evaluaciones where ID_Paciente="+id;
                        System.out.println(consulta);
                        String[] titulos = {"No_Evaluacion", "ID_Paciente", "Fecha", "IMC", "Clasificacion", "PesoIdeal", "PGrasa","MasaMagra","MB", "ReqCal", "Carbohidratos", "Proteinas", "Grasas"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[13];
                       
                        while(rs.next())
                        {
			fila[0]=rs.getString("No_Evaluacion");
			fila[1]=rs.getString("ID_Paciente");
                        fila[2]=rs.getString("Fecha");
			fila[3]=rs.getString("IMC");
                        fila[4]=rs.getString("Clasificacion");
                        fila[5]=rs.getString("PesoIdeal");
                        fila[6]=rs.getString("PGrasa");
                        fila[7]=rs.getString("MasaMagra");
			fila[8]=rs.getString("MB");
			fila[9]=rs.getString("ReqCal");
                        fila[10]=rs.getString("Carbohidratos");
                        fila[11]=rs.getString("Proteinas");
                        fila[12]=rs.getString("Grasas");
                        
                     
                        
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

    void Deshabilitar()
    {
        tID.setEnabled(false);
        tNombre.setEnabled(false);
        tApellido.setEnabled(false);
        tDireccion.setEnabled(false);
        tTelefono.setEnabled(false);
        tCorreo.setEnabled(false);
        tEdad.setEnabled(false);
        tSexo.setEnabled(false);
        tPeso.setEnabled(false);
        tEstatura.setEnabled(false);
        tCintura.setEnabled(false);
        tCadera.setEnabled(false);
        tTalla.setEnabled(false);
        tAlergias.setEnabled(false);
    }
    
    void Habilitar()
    {
        tNombre.setEnabled(true);
        tApellido.setEnabled(true);
        tDireccion.setEnabled(true);
        tTelefono.setEnabled(true);
        tCorreo.setEnabled(true);
        tEdad.setEnabled(true);
        tSexo.setEnabled(true);
        tPeso.setEnabled(true);
        tEstatura.setEnabled(true);
        tCintura.setEnabled(true);
        tCadera.setEnabled(true);
        tTalla.setEnabled(true);
        tAlergias.setEnabled(true);
        tNombre.requestFocus();
        
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
        jSeparator1 = new javax.swing.JSeparator();
        bHistorial = new javax.swing.JButton();
        bInformacion = new javax.swing.JButton();
        Informacion = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        CRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tEdad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tSexo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tPeso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tEstatura = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tCintura = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tCadera = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tTalla = new javax.swing.JTextField();
        tAlergias = new javax.swing.JTextField();
        bAct = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        Historial = new javax.swing.JLayeredPane();
        CRegresar1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel_usuario1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        bT = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        bS = new javax.swing.JButton();
        bA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 767));
        jPanel1.setPreferredSize(new java.awt.Dimension(1709, 642));

        bHistorial.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        bHistorial.setText("Historial");
        bHistorial.setBorderPainted(false);
        bHistorial.setContentAreaFilled(false);
        bHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHistorialActionPerformed(evt);
            }
        });

        bInformacion.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        bInformacion.setText("Informacion");
        bInformacion.setBorderPainted(false);
        bInformacion.setContentAreaFilled(false);
        bInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInformacionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-nutriciónPequeñ.jpg"))); // NOI18N

        CRegresar.setBackground(new java.awt.Color(255, 255, 255));
        CRegresar.setForeground(new java.awt.Color(255, 255, 255));
        CRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        CRegresar.setAutoscrolls(true);
        CRegresar.setBorder(null);
        CRegresar.setBorderPainted(false);
        CRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRegresarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUTRI-ADVANCED.jpg"))); // NOI18N

        jLabel_usuario.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel_usuario.setText("Pacientes");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        tID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Apellido:");

        tApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");

        tDireccion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        tTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Correo Electronico:");

        tCorreo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(45, 47, 98));
        jLabel10.setText("Contacto");

        jLabel11.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 47, 98));
        jLabel11.setText("Información");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Edad:");

        tEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Sexo:");

        tSexo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Peso:");

        tPeso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Estatura:");

        tEstatura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText("Cintura:");

        tCintura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText("Cadera:");

        tCadera.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("Talla:");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setText("Alergias:");

        tTalla.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tAlergias.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        bAct.setBackground(new java.awt.Color(255, 255, 255));
        bAct.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        bAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reporte.png"))); // NOI18N
        bAct.setText("Actualizar");
        bAct.setBorderPainted(false);
        bAct.setContentAreaFilled(false);
        bAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActActionPerformed(evt);
            }
        });

        bGuardar.setBackground(new java.awt.Color(255, 255, 255));
        bGuardar.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        bGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acept.png"))); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.setBorderPainted(false);
        bGuardar.setContentAreaFilled(false);
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bCancel.setBackground(new java.awt.Color(255, 255, 255));
        bCancel.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        bCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel.png"))); // NOI18N
        bCancel.setText("Cancelar");
        bCancel.setBorderPainted(false);
        bCancel.setContentAreaFilled(false);
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        Informacion.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(CRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tPeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tEstatura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tCintura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tCadera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tTalla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(tAlergias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(bAct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(bGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Informacion.setLayer(bCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformacionLayout.createSequentialGroup()
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(58, 58, 58)
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(tSexo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tEstatura)
                                    .addComponent(tEdad, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(82, 82, 82)
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(42, 42, 42)
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tTalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(tCadera, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tCintura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tAlergias)))
                            .addGroup(InformacionLayout.createSequentialGroup()
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(53, 53, 53)
                                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_usuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bGuardar)
                    .addComponent(bAct)
                    .addComponent(bCancel))
                .addGap(26, 26, 26))
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_usuario)
                            .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InformacionLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(CRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(InformacionLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel2))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(12, 12, 12)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(tCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(tCadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(tTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(tAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(InformacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancel)
                        .addGap(30, 30, 30))))
        );

        CRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        CRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        CRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        CRegresar1.setAutoscrolls(true);
        CRegresar1.setBorder(null);
        CRegresar1.setBorderPainted(false);
        CRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRegresar1ActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUTRI-ADVANCED.jpg"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-nutriciónPequeñ.jpg"))); // NOI18N

        jLabel_usuario1.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        jLabel_usuario1.setText("Pacientes");

        bT.setBackground(new java.awt.Color(255, 255, 255));
        bT.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bT.setText("Todas");
        bT.setBorderPainted(false);
        bT.setContentAreaFilled(false);
        bT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bS.setBackground(new java.awt.Color(255, 255, 255));
        bS.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bS.setText("Siguientes");
        bS.setBorderPainted(false);
        bS.setContentAreaFilled(false);
        bS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSActionPerformed(evt);
            }
        });

        bA.setBackground(new java.awt.Color(255, 255, 255));
        bA.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        bA.setText("Anteriores");
        bA.setBorderPainted(false);
        bA.setContentAreaFilled(false);
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
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
        jScrollPane1.setViewportView(table);

        jLabel3.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 34, 102));
        jLabel3.setText("Evaluaciones");

        Historial.setLayer(CRegresar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jLabel_usuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(bT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(bS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(bA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Historial.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout HistorialLayout = new javax.swing.GroupLayout(Historial);
        Historial.setLayout(HistorialLayout);
        HistorialLayout.setHorizontalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(HistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HistorialLayout.createSequentialGroup()
                        .addComponent(CRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_usuario1))
                    .addGroup(HistorialLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bS, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HistorialLayout.setVerticalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialLayout.createSequentialGroup()
                        .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel_usuario1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistorialLayout.createSequentialGroup()
                        .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HistorialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HistorialLayout.createSequentialGroup()
                        .addGroup(HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HistorialLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HistorialLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(861, 861, 861))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(Informacion))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 834, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Informacion))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHistorialActionPerformed
        Informacion.setVisible(false);
        Historial.setVisible(true);   
        bInformacion.setForeground(Color.black);
        bHistorial.setForeground(Color.blue); 
        bT.setForeground(Color.blue);
        bS.setForeground(Color.black);
        bA.setForeground(Color.black);
        Tabla();
      
    }//GEN-LAST:event_bHistorialActionPerformed

    private void bInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInformacionActionPerformed
        Informacion.setVisible(true);
        Historial.setVisible(false);
        
        this.bInformacion.setBackground(Color.getHSBColor(0,102,255));
        bInformacion.setForeground(Color.blue);
        bHistorial.setBackground(Color.white);
        bHistorial.setForeground(Color.black);
    }//GEN-LAST:event_bInformacionActionPerformed

    private void CRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRegresarActionPerformed
        Pacientes p = new Pacientes();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_CRegresarActionPerformed

    private void bActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActActionPerformed
        Habilitar();
        bGuardar.setVisible(true);
        bCancel.setVisible(true);
        bAct.setVisible(false);
        
    }//GEN-LAST:event_bActActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        String id = tID.getText();
        String nom = tNombre.getText();
        String ap = tApellido.getText();
	String edad = tEdad.getText();
	String dir = tDireccion.getText();
	String tel = tTelefono.getText();
	String mail = tCorreo.getText();
	String al = tAlergias.getText();
	String peso = tPeso.getText();
	String est = tEstatura.getText();
	String cin = tCintura.getText();
	String cad = tCadera.getText();
        String sexo = tSexo.getText();
        String talla = tTalla.getText();
        
        conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
        conexion.conecta();
        String insP = "update Pacientes set Nombre='"+nom+"', Apellido='"+ap+"', Direccion='"+dir+"', Telefono="+tel+", CorreoElectronico='"+mail+"' where ID="+id;
        String insD = "update Datos_Evaluacion set Edad="+edad+", Sexo='"+sexo+"', Peso="+peso+", Estatura="+est+", Talla="+talla+", Cintura="+cin+", Cadera="+cad+", Alergias='"+al+"' where ID="+id;
        
        conexion.insertaRegistro(insP);
        conexion.insertaRegistro(insD);
        JOptionPane.showMessageDialog(null,"Actualizado", "", JOptionPane.INFORMATION_MESSAGE);
        
        Deshabilitar();
        bGuardar.setVisible(false);
        bCancel.setVisible(false);
        bAct.setVisible(true);
        
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        Deshabilitar();
        bGuardar.setVisible(false);
        bCancel.setVisible(false);
        bAct.setVisible(true);
        
        try
        {
            conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
            conexion.conecta();
            String id=tID.getText();
            String consulta = "select * from Pacientes, Datos_Evaluacion where Pacientes.ID = Datos_Evaluacion.ID and Pacientes.ID="+id;
            
            rs = conexion.Consultar(consulta);
            if(rs.next());
            {
                tID.setText((rs.getString("ID")));
                tNombre.setText((rs.getString("Nombre")));
                tApellido.setText((rs.getString("Apellido")));
                tDireccion.setText((rs.getString("Direccion")));
                tTelefono.setText((rs.getString("Telefono")));
                tCorreo.setText((rs.getString("CorreoElectronico")));
                tEdad.setText((rs.getString("Edad")));
                tSexo.setText((rs.getString("Sexo")));
                tPeso.setText((rs.getString("Peso")));
                tEstatura.setText((rs.getString("Estatura")));
                tCintura.setText((rs.getString("Cintura")));
                tCadera.setText((rs.getString("Cadera")));
                tTalla.setText((rs.getString("Talla")));
                tAlergias.setText((rs.getString("Alergias")));
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
        
        
    }//GEN-LAST:event_bCancelActionPerformed

    private void bTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTActionPerformed
        Tabla();
        bT.setForeground(Color.blue);
        bS.setForeground(Color.black);
        bA.setForeground(Color.black);
    }//GEN-LAST:event_bTActionPerformed

    private void CRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRegresar1ActionPerformed
        Pacientes p = new Pacientes();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_CRegresar1ActionPerformed

    private void bSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSActionPerformed
        bT.setForeground(Color.black);
        bS.setForeground(Color.blue);
        bA.setForeground(Color.black);
        
        try
		{
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select Fecha, Hora from Citas where Fecha > current_date() && ID_Paciente = "+id;
                        String[] titulos = {"Fecha", "Hora"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[6];
                        
                        while(rs.next())
                        {
			fila[0]=rs.getString("Fecha");
			fila[1]=rs.getString("Hora");
			
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
        
    }//GEN-LAST:event_bSActionPerformed

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
        bT.setForeground(Color.black);
        bS.setForeground(Color.black);
        bA.setForeground(Color.blue);
        
        try
		{
			
                        System.out.println(id);
			conexion = new Conexion("alexis", "root", "com.mysql.jdbc.Driver", "NutriAdvanced");
			conexion.conecta();
			String consulta = "select * from Evaluaciones where Fecha < current_date && ID_Paciente="+id;
                        System.out.println(consulta);
                        String[] titulos = {"No_Evaluacion", "ID_Paciente", "Fecha", "IMC", "Clasificacion", "PesoIdeal", "PGrasa","MasaMagra","MB", "ReqCal", "Carbohidratos", "Proteinas", "Grasas"};
			rs = conexion.Consultar(consulta);
			model = new DefaultTableModel(null, titulos);
                        
                        String []fila = new String[13];
                       
                        while(rs.next())
                        {
			fila[0]=rs.getString("No_Evaluacion");
			fila[1]=rs.getString("ID_Paciente");
                        fila[2]=rs.getString("Fecha");
			fila[3]=rs.getString("IMC");
                        fila[4]=rs.getString("Clasificacion");
                        fila[5]=rs.getString("PesoIdeal");
                        fila[6]=rs.getString("PGrasa");
                        fila[7]=rs.getString("MasaMagra");
			fila[8]=rs.getString("MB");
			fila[9]=rs.getString("ReqCal");
                        fila[10]=rs.getString("Carbohidratos");
                        fila[11]=rs.getString("Proteinas");
                        fila[12]=rs.getString("Grasas");
                        
                     
                        
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
    }//GEN-LAST:event_bAActionPerformed

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
            java.util.logging.Logger.getLogger(Inf_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inf_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inf_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inf_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inf_Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CRegresar;
    private javax.swing.JButton CRegresar1;
    private javax.swing.JLayeredPane Historial;
    private javax.swing.JLayeredPane Informacion;
    public javax.swing.JButton bA;
    private javax.swing.JButton bAct;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bGuardar;
    public javax.swing.JButton bHistorial;
    public javax.swing.JButton bInformacion;
    public javax.swing.JButton bS;
    public javax.swing.JButton bT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JLabel jLabel_usuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField tAlergias;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tCadera;
    private javax.swing.JTextField tCintura;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEdad;
    private javax.swing.JTextField tEstatura;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPeso;
    private javax.swing.JTextField tSexo;
    private javax.swing.JTextField tTalla;
    private javax.swing.JTextField tTelefono;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
