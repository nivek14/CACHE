package memorias;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class GerarTxt {
    
    private String type_map;
    private String miss_r,hit_r;
    private File file;
    
    public GerarTxt(){
        
    }
   public void GerarTxtNovo() throws FileNotFoundException, IOException{
      file = new File("dados_caches.txt");
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
        buffWrite.append(miss_r+ "\n");
        buffWrite.newLine();
        buffWrite.append(hit_r+ "\n"); 
        buffWrite.newLine();
        buffWrite.close();
        
    } 
}
