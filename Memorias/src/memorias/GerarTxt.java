package memorias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class GerarTxt {
    
    private String type_map,qtd_hit,qtd_miss,qtd_compulsorio,qtd_capacidade;
    private String miss_r,hit_r;
    private File file;
    
    public GerarTxt(){
        
    }
   public void GerarTxtNovo() throws FileNotFoundException, IOException{
      file = new File("dados_caches.txt");
   }
    
   
    public void setarTxt(int mapeamento,int hits,int misses,int compulsorios,int capacidade,float missRatio,float hitRatio){
        this.type_map = Integer.toString(mapeamento);
        this.qtd_hit = Integer.toString(hits);
        this.qtd_miss = Integer.toString(misses);
        this.qtd_compulsorio = Integer.toString(compulsorios);
        this.qtd_capacidade = Integer.toString(capacidade);
        this.miss_r = Float.toString(missRatio);
        this.hit_r = Float.toString(hitRatio);
    }
    
    public void save() throws IOException, InterruptedException{
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("dados_caches.txt", true));
        
        buffWrite.append(type_map);
        buffWrite.newLine();
        buffWrite.append(qtd_hit);
        buffWrite.newLine();
        buffWrite.append(qtd_miss);
        buffWrite.newLine();
        buffWrite.append(qtd_compulsorio);
        buffWrite.newLine();
        buffWrite.append(qtd_capacidade);
        buffWrite.newLine();
        buffWrite.append(miss_r+ "\n");
        buffWrite.newLine();
        buffWrite.append(hit_r+ "\n"); 
        buffWrite.newLine();
        buffWrite.close();
        
    }
    
    
}
