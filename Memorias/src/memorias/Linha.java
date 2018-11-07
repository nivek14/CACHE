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
    private int tamanho_tag, tamanho_indice, tamanho_offset;    
    
    public void Linha(int tam_tag, int tam_indice, int tam_offset){
        this.tamanho_tag = tam_tag;
        this.tamanho_indice = tam_indice;
        this.tamanho_offset = tam_offset;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getTag() {
        return tag;
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

    public int getTamanho_tag() {
        return tamanho_tag;
    }

    public void setTamanho_tag(int tamanho_tag) {
        this.tamanho_tag = tamanho_tag;
    }

    public int getTamanho_indice() {
        return tamanho_indice;
    }

    public void setTamanho_indice(int tamanho_indice) {
        this.tamanho_indice = tamanho_indice;
    }

    public int getTamanho_offset() {
        return tamanho_offset;
    }

    public void setTamanho_offset(int tamanho_offset) {
        this.tamanho_offset = tamanho_offset;
    }
    
    
    
}
