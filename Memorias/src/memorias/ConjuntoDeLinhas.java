/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorias;

/**
 *
 * @author MOTTA-PC
 */
public class ConjuntoDeLinhas {
    private Linha[] bloco;
    private int tam_tag, tam_indice, tam_desloc;
    
    public ConjuntoDeLinhas(int quantidade_de_linhas, int t_tag, int t_ind, int t_des){
        Linha blocos[] = new Linha[quantidade_de_linhas];
        this.bloco = blocos;
        
        this.tam_tag = t_tag;
        this.tam_indice = t_ind;
        this.tam_desloc = t_des;
        gerarLinhas(quantidade_de_linhas);
    }
    
    public void gerarLinhas(int n_linhas){
        for(int i=0; i<n_linhas; i++){
            bloco[i].Linha(tam_tag, tam_indice, tam_desloc);
            bloco[i].setIndice(Integer.toBinaryString(i)); // transforma o valor de i para um numero binario
        }
    }
}
