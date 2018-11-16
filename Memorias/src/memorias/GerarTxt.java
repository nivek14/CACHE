package memorias;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GerarTxt {
    
    private String type_map;
    private String miss_r,hit_r;
    
    public GerarTxt(){
        
    }
   public void GerarTxtNovo() throws FileNotFoundException, IOException{
      BufferedWriter buffWrite = new BufferedWriter(new FileWriter("dados_caches.txt", false));
      buffWrite.close();
   }
    
   
    public void setarTxt(int mapeamento,float missRatio,float hitRatio){
        this.type_map = Integer.toString(mapeamento);
        this.miss_r = Float.toString(missRatio);
        this.hit_r = Float.toString(hitRatio);
    }
    
    public void save() throws IOException, InterruptedException{
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("dados_caches.txt", true));
        
        buffWrite.append(type_map);
        buffWrite.newLine();
        buffWrite.append(miss_r);
        buffWrite.newLine();
        buffWrite.append(hit_r); 
        buffWrite.newLine();
        buffWrite.close();
        
    } 
    
    public void ler(){
       Scanner scan = new Scanner("dados_caches.txt");
       int map;
       float miss, hit;
       while(scan.hasNextLine()){
           map = Integer.parseInt(scan.nextLine());
           miss = Float.parseFloat(scan.nextLine());
           hit = Float.parseFloat(scan.nextLine());
       }
       scan.close();
    }
}
