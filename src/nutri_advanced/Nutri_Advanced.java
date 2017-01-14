/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutri_advanced;

/**
 *
 * @author Yordy Garcia
 */
public class Nutri_Advanced {

 
    public  float I_M_C(float peso,float altura){
        float IMC=0;
            altura=altura*altura;
            IMC=peso/altura;
        return IMC;
    }
    public  String Clasificacion_IMC(float imc){
            if(imc<16){
                return "Desnutricion 3er grado";
            }
            if(imc>=16 && imc<17){
                return "Desnutricion 2do grado";
            }
            if(imc>=17 && imc<18.5){
                return "Desnutricon";
            }
            if(imc>=18.5 && imc<25){
                return "Normal";
            }
            if(imc>=25 && imc<30){
                return "Sobre peso";
            }
            if(imc>=30 && imc<35){
                return "Obesidad";
            }
            if(imc>=35 && imc<40){
                return "Obesidad 2do grado ";
            }
            if(imc>=40){
                return "Obesidad 3er grado";
            }
        return "";
    }
    public  float P_Ideal(float talla, char sexo){
        float pesoIdeal=0;
            if(sexo=='1'){
                talla=talla*100;
                pesoIdeal=(float) ((((talla-152)/2.5)*2.7)+48.2);
            }
            if(sexo=='2'){
                talla=talla*100;
                pesoIdeal=(float) ((((talla-152)/2.5)*2.3)+45.5);
            }
            
        return pesoIdeal;
    }
    public  float Porcentaje_grasa(float IMC,int edad){
        float PorcGrasa=0;
            PorcGrasa= (float)((1.20*IMC)+(0.23*edad)-(10.8*1)-5.4);
        return PorcGrasa;
    }
    public  float Masa_Grasa(float peso, float PorcGrasa){
        float masaGrasa=0;
            masaGrasa=(peso*PorcGrasa)/100;
        return masaGrasa;
    }
    public  float Masa_Magra(float peso,float masaGrasa){
        float masaMagra;
            masaMagra=peso-masaGrasa;
        return masaMagra;
    }
    public  float Agua_Corporal_Total(char sexo, float peso, int edad){
        float aguaCorpTotal=0;
            if(sexo=='1'){
                aguaCorpTotal=(float) ((peso*79.45)-(0.24*peso)-(0.15*edad)/100);
            }
            if(sexo=='2'){
                aguaCorpTotal=(float)((peso*69.81)-(0.26*peso)-(0.12*edad)/100);
            }
        return aguaCorpTotal;
    }
    public  float Agua_Corporal_Intracelular(float aguaCorpTotal,int edad,char sexo){
        float aguaCorpIntraCelu=0;
            if(sexo==1){
                aguaCorpIntraCelu=(float)((62.3-(0.16*edad)/100)*aguaCorpTotal);
            }
            if(sexo==2){
                aguaCorpIntraCelu=(float)((52.3-(0.7*edad)/100)*aguaCorpTotal);
            }
        return aguaCorpIntraCelu;
    }
    /*Falta*/public  float Agua_Corporal_Extracelular(float aguaCorpTotal,float aguaCorpIntraCelu){
        float aguaCorpExtraCelu=0;
            aguaCorpExtraCelu=(aguaCorpTotal-aguaCorpIntraCelu);
        return aguaCorpExtraCelu;
    }
    public  float Cintura_Cadera(float cintura,float cadera){
        float cinturaCadera=0;
            cinturaCadera=(cintura/cadera);
        return cinturaCadera;
    }
    public float MetabolismoBasal(float MasaMagra){
        float MB=0;
            MB=(float)(370+(21.6*MasaMagra));
        return MB;
    }
    public float RequeCaloritico(float MetabolismoBasal, int NumAct){
    float ReqeCalor=0;
    
        if(NumAct==1)
        {
            //Sedentario
            ReqeCalor=(float)(MetabolismoBasal*1.2);
            return ReqeCalor;
        }
        if(NumAct==2)
        {
            //Levemente Activo
            ReqeCalor=(float)(MetabolismoBasal*1.375);
            return ReqeCalor;
        }
        if(NumAct==3)
        {
            //Moderadamente activo
            ReqeCalor=(float)(MetabolismoBasal*1.55);
            return ReqeCalor;
        }
        if(NumAct==4)
        {
            //Muy activo
            ReqeCalor=(float)(MetabolismoBasal*1.725);
            return ReqeCalor;
        }
        if(NumAct==5)
        {
            //Hiperactivo 
            ReqeCalor=(float)(MetabolismoBasal*1.9);
            return ReqeCalor;
        }
        
    
    return ReqeCalor;
    }
    public float Proteina(float ReqCaloritico){
        float T_proteina;
                T_proteina=(float)(ReqCaloritico*.40);
        return T_proteina;
    }
    public float Grasas(float ReqCaloritico){
        float T_grasas;
                T_grasas=(float)(ReqCaloritico*.20);
        return T_grasas;
    }
    public float carbono(float ReqCaloritico){
        float T_carbono;
                T_carbono=(float)(ReqCaloritico*.40);
        return T_carbono;
    }
}
