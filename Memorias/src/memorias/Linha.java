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
public class Linha {
    private String indice, tag;
    private int bitValidade;
    Linha cache[];
    
    public void Linha(int tamanho){
        cache = new Linha[tamanho];
        for(int i=0; i<tamanho; i++){
            cache[i].setIndice(Integer.toString(i, 2));
            cache[i].setBitValidade(0);
        }
    }
    
    public String getIndice() {
        return indice;
    }

        public String getTag() {
        return tag;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getBitValidade() {
        return bitValidade;
    }

    public void setBitValidade(int bitValidade) {
        this.bitValidade = bitValidade;
    }
    
    
}
