package memorias;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarTxt {
    
    private String type_map,qtd_hit,qtd_miss,qtd_compulsorio,qtd_capacidade;
    private String miss_r,hit_r;
    private PrintWriter arquivo;
    
   public GerarTxt() throws FileNotFoundException{
       this.arquivo = new PrintWriter("dados_caches.txt");
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
    
    public void save(){
        arquivo.write(type_map);
        arquivo.write(qtd_hit);
        arquivo.write(qtd_miss);
        arquivo.write(qtd_compulsorio);
        arquivo.write(qtd_capacidade);
        arquivo.write(miss_r);
        arquivo.write(hit_r); 
    }
    
    
}
