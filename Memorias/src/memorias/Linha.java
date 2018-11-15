package memorias;

import static java.lang.Math.pow;

public class Linha {
    
    private String indice=" ";
    private int tag;
    private int bitValidade=0;
    private boolean bitFifo=false;
    private int offset;
    private int tamanho_tag, tamanho_indice, tamanho_offset;    
    public Palavra[] ConjuntoDePalavras;
    
    public Linha(int tam_tag, int tam_indice, int tam_offset){
        this.tamanho_tag = tam_tag;
        this.tamanho_indice = tam_indice;
        this.tamanho_offset = tam_offset;
        int variavel = (int) pow(2,tam_offset);
        this.ConjuntoDePalavras = new Palavra[variavel];
        for(int i=0; i<pow(2,tam_offset);i++){
            ConjuntoDePalavras[i] = new Palavra();
            ConjuntoDePalavras[i].setIndex(i);
        }
    }

    //
    public boolean metodoPrincipal(){
        return true;
    }
    //------------- Metodos get e set ------------------------------------------
    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
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

    public boolean isBitFifo() {
        return bitFifo;
    }

    public void setBitFifo(boolean bitFifo) {
        this.bitFifo = bitFifo;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    
    
}
