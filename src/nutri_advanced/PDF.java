/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutri_advanced;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Yordy Garcia
 */
public class PDF {
    public void CrearPDF(String idPac,String Peso,String talla,String Imc,String Clasi,String PesoI,String PorcG,String MasaMag,String MB,String ReqCal,String Carbo,String Prot,String Gras){
    JFileChooser dlg =new JFileChooser();
    GenRec rec=new GenRec();
       String ruta="/Users/AlexisLopez/NetBeansProjects/Nutri_Advanced/Reportes/ReportePaciente_"+idPac;
       String contenido="\n\nNUTRI-ADVANCED (REPORTE DE PACIENTE)\n\n\n\n"
                       + "ID de paciente: "+idPac+"\n\n\n"
                       + "-Peso: "+Peso+" kg\n\n"
                       + "-Talla: "+talla+" mt\n\n"
                       
                       + "-IMC: "+Imc+"\n\n"
                       + "-Clasificacion: "+Clasi+"\n\n"
                       + "-Peso Ideal: "+PesoI+"\n\n"
                       + "-Porcentaje De Grasa: "+PorcG+" %\n\n"
                       + "-Masa Magra: "+MasaMag+"\n\n"
                       + "-Metabolismo Basal: "+MB+"\n\n"
                       + "-Requerimiento Caloritico: "+ReqCal+"\n\n"
                       + "-Carbohidratos: "+Carbo+"\n\n"
                       + "-Proteinas: "+Prot+"\n\n"
                       + "-Grasas: "+Gras+"\n\n";
       String contenido2="";
       ArrayList Receta;
                        for(int d=1;d<8;d++){
                                if(d==1){
                                    contenido2 += "DIA "+d+"\n";
                                }
                                else{
                                    contenido2 += "\n\n\nDIA "+d+"\n";
                                }
                        Receta=rec.Receta(Float.parseFloat(ReqCal));
                            for (int j = 0; j < Receta.size(); j++) 
                            {
                                contenido2 +=Receta.get(j)+"\n";
                            }
                        }
        String contenidoFinal=contenido+contenido2;
        
       try{
       FileOutputStream archivo=new FileOutputStream(ruta+".pdf");
       Document doc=new Document();
       PdfWriter.getInstance(doc, archivo);
       doc.open();
       doc.add(new Paragraph(contenidoFinal));
       doc.close();
       JOptionPane.showMessageDialog(null, "Se ha guardado el reporte en: "+ruta);
       }catch(Exception e){System.out.println("ERROR: "+e);}
       
       try 
        { 
            String rutaA = "/Users/AlexisLopez/NetBeansProjects/Nutri_Advanced/Reportes/ReportePaciente_"+idPac+".pdf" ;
            String rutaB = "//Applications/Adobe_Acrobat_Reader_DC.app";
            ProcessBuilder p = new ProcessBuilder();
            p.command(rutaB,rutaA);
            p.start();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        Pag_Principal pp = new Pag_Principal();
        pp.setVisible(true);
       
       
       
       
    }
    
}
