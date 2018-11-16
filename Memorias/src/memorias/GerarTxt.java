package memorias;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarTxt {
    
    private String type_map,qtd_hit,qtd_miss,qtd_compulsorio,qtd_capacidade;
    private String miss_r,hit_r;
    private File file;
    private PrintWriter outFile;
    
   public GerarTxt() throws FileNotFoundException, IOException{
      file = new File("arqTexto1.txt");
     
   }
    
   
    public void setDados(int mapeamento,int hits,int misses,int compulsorios,int capacidade,float missRatio,float hitRatio){
        this.type_map = Integer.toString(mapeamento);
        this.qtd_hit = Integer.toString(hits);
        this.qtd_miss = Integer.toString(misses);
        this.qtd_compulsorio = Integer.toString(compulsorios);
        this.qtd_capacidade = Integer.toString(capacidade);
        this.miss_r = Float.toString(missRatio);
        this.hit_r = Float.toString(hitRatio);
    }
    
    public void save() throws IOException{
        outFile = new PrintWriter(new FileWriter(file));
        outFile.println(type_map);
        outFile.println(qtd_hit);
        outFile.println(qtd_miss);
        outFile.println(qtd_compulsorio);
        outFile.println(qtd_capacidade);
        outFile.println(miss_r);
        outFile.println(hit_r); 
        outFile.close();
    }
    
    
}
