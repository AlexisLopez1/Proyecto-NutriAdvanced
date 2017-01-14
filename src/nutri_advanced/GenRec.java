package nutri_advanced;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Yordy Garcia
 */
public class GenRec {
    public  ArrayList Receta(float ReqerimientoCalorico)
    {
//        ReqerimientoCalorico=(float)(ReqerimientoCalorico*.80);
        float countCalorias=0;
        String [][] ListaAlim = 
        {
        {"200 gr De Leche Entera","126"},{"100 gr De Nata","337"},{"100 gr De Yogurt Con Frutas","89"},{"100 gr De Yogurt Entero","61"},{"100 gr De Yogurt Con Fibra","71"},{"100 gr De Yogurt Con Miel","119"},{"100 gr De Queso Cheddar","381"},{"100 gr De Queso Mozzarella","245"},{"100 gr De Queso Parmesano","374"},{"100 gr De Queso De Oveja","380"},{"200gr De Huevo Entero","312"},{"200 gr De Huevo De Codorniz","360"},{"100 gr De Yema De Huevo ","341"},{"200 gr De Bistec De Ternera","184"},{"200 gr De Pechuga De Pavo","268"},
        {"200 gr De Pechuga De Pollo ","268"},{"100 gr De Muslo De Pavo","186"},{"100 gr De Hamburguesa De Pollo","108"},{"50 gr De Tira De Asada","200"},{"25 gr De Chorizo ","90"},{"25 gr De Jamon ","75"},{"50 gr De Lomo","75"},{"100 gr De Atun Fresco","158"},{"100 gr De Pescado","109"},{"100 gr De Salmon","176"},{"100 gr De Sardina","124"},{"100 gr De Atun En Aceite","288"},{"200 gr De Pulpo ","114"},{"200 gr De Calamar","136"},{"200 gr De Acelga ","55"},
        {"100 gr De Ajo ","124"},{"100 gr De Clabaza","20"},{"200 gr De Coliflor","50"},{"100 gr De Espinacas Cocidas","134"},{"200 gr De Espinaca","65"},{"200 gr De Lechuga","40"},{"100 gr De Patatas","80"},{"100 gr De Patatas Asadas ","142"},{"100 gr De Pepino","11"},{"100 gr De Pure De Papa","100"},{"100 gr De Setas","35"},{"200 gr De Tomate","32"},{"200 gr De Zanahoria ","74"},{"100 gr De Alubias","316"},{"200 gr De Garbanzos Cocidos","180"},
        {"100 gr De Garbanzo Frito ","283"},{"100 gr De Guisantes secos","304"},{"100 gr De Judias Guizadas ","109"},{"200 gr De Lentejas Guisadas","240"},{"200 gr De Lentejas En Pure","128"},{"100 gr De Aguacate ","232"},{"200 gr De Arandano ","82"},{"100 gr De Coco Fresco ","296"},{"100 gr De Frambuesa","30"},{"100 gr De Fresa ","27"},{"100 gr De Kiwi","56"},{"50 gr De Mandarina","20"},{"50 gr De Mango","36"},{"100 gr De Manzana ","45"},{"100 gr De Melon ","30"},
        {"100 gr De Naranja ","53"},{"100 gr De Piña","55"},{"100 gr De Pera","59"},{"100 gr De Platano","85"},{"100 gr De Sandia","15"},{"100 gr De Uva","61"},{"25 gr De Almendra ","120"},{"25 gr De Cacahuate","110"},{"50 gr De Ciruela Pasa","82"},{"25 gr De Nuez ","162"},{"25 gr De Piñon","140"},{"25 gr De Pistachon ","150"},{"50 gr De Uva Pasas","150"},{"25 gr De Semillas De Sesamo","142"},{"200 gr De Arroz Cocido","250"},
        {"100 gr De Arroz En Paella De Marisco","222"},{"100 gr De Avena Cocida ","383"},{"50 gr De Harina De Trigo","172"},{"100 gr De Maiz","363"},{"50 gr De Pan Blanco","135"},{"100 gr De Pan Integral","230"},{"100 gr De Pan Tostado","420"},{"100 gr De Pasta De Semola","336"},{"100 gr De Fideos ","369"},{"100 gr De Pizza","246"},{"100 gr De Fideos De Harina Integral","359"},{"100 gr De Azucar Morena","373"},{"100 gr De Azucar Blanca","385"},{"100 gr De Mermelada","272"},{"100 gr De Miel","300"},
        {"50 gr De Chocolate","280"},{"50 gr De Chocolate Con ALmendras ","290"},{"100 gr De Arroz Con Leche","118"},{"50 gr De Aceite de Oliva","450"},{"50 gr De Aceite de semillas ","450"},{"50 gr De Mantequilla","350"},{"50 gr De Margarina","375"},{"200 gr De Jugo De Naranja ","100"},{"200 gr De Jugo De Manzana","106"},{"200 gr De Jugo De Uva","150"},{"200 gr De Jugo De Piña","102"}
        };
        Random rnd = new Random();
        ArrayList Receta=new ArrayList();
        
        float Kcal;
        
        while(countCalorias<ReqerimientoCalorico)
        {
        
            int indice=(int)(rnd.nextDouble() * 101 + 0);
            Receta.add(ListaAlim[indice][0]);
            Kcal=Float.parseFloat(ListaAlim[indice][1]);
            countCalorias=(countCalorias+Kcal);

        }
        
        
    return Receta;
    }
    
}
