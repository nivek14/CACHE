package memorias;

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
    
    public void criarGrafico(){
        
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(1400, "seila", "");
        barra.setValue(1000,"eoq","");
        
        JFreeChart grafico = ChartFactory.createBarChart3D("A","B","C",barra,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
        
    }
    
    
}
