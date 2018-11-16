package memorias;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafico extends JFrame {
    
    public Grafico(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Graficos cache");
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void criarGrafico() throws FileNotFoundException, IOException{
        int[] vetor;
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        
        
        String line, mapeamento;
        int map;
        float miss, hit;
        BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream("dados_caches.txt")));
        while ((line = data.readLine()) != null) {
 	    map = Integer.parseInt(line);
           
           if(map==0){
               mapeamento = "Mapeamento direto";
           }
           else if (map==1)
               mapeamento = "Totalmente Associativo";
           else if( map==2)
               mapeamento = "2 Associativo";
           else
               mapeamento = "4 Associativo";
           line = data.readLine();
           miss = Float.parseFloat(line);
           barra.setValue(miss, mapeamento, "");
           line = data.readLine();
           hit = Float.parseFloat(line);
 		}
        data.close();
       
       
       ////////////////////////////////////
        JFreeChart grafico = ChartFactory.createBarChart3D("TAXA DE MISS","MAPEAMENTOS","MISS RATE",barra,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
        
    }
    
    
}
