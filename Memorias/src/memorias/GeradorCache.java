package memorias;

public class GeradorCache {
    
    private int QntConjuntos, tamanho_bloco, linhas, tamanho_barramento, mapeamento, niveis,subs;
    public ConjuntoDeLinhas[] memoria;
    
    CalculoEndereco endereco = new CalculoEndereco();
    
    // tipos de mapeamento:
    // mapeamento direto - 0
    // mapeamento totalmente assossiativo - 1
    // mapeamento assossiativo -2, 4, etc;
    // politica de substituição FIFO - 1
    // politica de substituição Random - 2
    // ****** nivel é referente aos niveis da cache valores de 1 até ***********
    
    public GeradorCache(int qntConj, int tam_bloco, int map,int subs) {
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.mapeamento = map;
        this.subs = subs;
        quantidadeDeLinhas();
        MetodosDeMapeamento();
    }
    
    public GeradorCache(int qntConj, int tam_bloco, int lines , int tam_barramento, int nvl,int subs) { //é definido por padrão mapeamento direto
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = 0;
        this.niveis = nvl;
        this.subs = subs;
        quantidadeDeLinhas();
        MetodosDeMapeamento();
    }
    
    // memoria default
    public GeradorCache(){
        this.linhas = 1024;
        this.tamanho_bloco = 4; //4bytes
        this.mapeamento = 0; // mapeamento direto
        this.niveis = 1;
        this.subs = 2; // politica de substituição random
        MetodosDeMapeamento();
    }
    // ******************** METODO PARA IDENTIFICAR A QUANTIDADE DE LINHAS ***********
    private void quantidadeDeLinhas(){
            this.linhas = this.QntConjuntos;
    }

    //***************** METODOS DE DISTRIBUICAO PARA MAPEAMENTO ************
    private void MetodosDeMapeamento(){
        switch (this.getMapeamento()) {
        // mapeamento direto
            case 0:
                this.endereco.calculo_de_endereco_MapDireto(this.tamanho_bloco, this.linhas);
                memoria = new ConjuntoDeLinhas[1];
                memoria[0] = MapeamentoDireto();
                break;
        // mapeamento totalmente associativo
            case 1:
                this.endereco.enderecoMapeamentoTotalmenteAssociativo(tamanho_bloco);
                memoria = new ConjuntoDeLinhas[1];
                memoria[0] = ConjuntoTotalmenteAssociativo();
                break;
        // mapeamento N associativo
            case 2:
                this.endereco.enderecoNAss(tamanho_bloco, mapeamento);
                memoria = new ConjuntoDeLinhas[2];
                memoria[0] = ConjuntoTotalmenteAssociativo();
                memoria[1] = ConjuntoTotalmenteAssociativo();                
                break;
            case 4:
                this.endereco.enderecoNAss(tamanho_bloco, mapeamento);
                memoria = new ConjuntoDeLinhas[4];
                for(int i=0; i<4; i++){
                    memoria[i] = ConjuntoTotalmenteAssociativo();
                }
                break;
            default:
                break;
        }
    }
    
    private ConjuntoDeLinhas BuscaPalavra(String palavra){
        int i=0;
        String tag;
        String conjunto;
        String offset;
        //System.out.println(Integer.toString(tam_tag) +" "+ Integer.toString(tam_indice)+" "+ Integer.toString(tam_desloc));
        tag = palavra.substring(0,endereco.getTag());
        conjunto = palavra.substring(endereco.getTag(), endereco.getTag()+endereco.getEndereco());
        offset = palavra.substring(endereco.getTag()+endereco.getEndereco(),endereco.getTag()+endereco.getEndereco()+ endereco.getDeslocamento());
        if((conjunto.equals(00)&& mapeamento == 4) || (conjunto.equals(0) && mapeamento==2)){
            memoria[0].buscaPalavraNAssociativo(tag,offset);
        }
        if((conjunto.equals(01)&& mapeamento == 4) || (conjunto.equals(1) && mapeamento==2)){
            memoria[1].buscaPalavraNAssociativo(tag, offset);
        }
        if(conjunto.equals(10)&& mapeamento == 4){
            memoria[2].buscaPalavraNAssociativo(tag,offset);
        }
        if(conjunto.equals(11)&& mapeamento == 4){
            memoria[3].buscaPalavraNAssociativo(tag, offset);
        }
        return memoria[i];
    }
    
    private ConjuntoDeLinhas MapeamentoDireto(){        
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), endereco.getEndereco(), endereco.getDeslocamento(),this.mapeamento, this.subs);
        return newCache;
    }
    
    private ConjuntoDeLinhas ConjuntoTotalmenteAssociativo(){        
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), 0, endereco.getDeslocamento(), this.mapeamento, this.subs);
        return newCache;
    }
    
    private ConjuntoDeLinhas ConjuntoNAssociativo(){
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), 0, endereco.getDeslocamento(), this.mapeamento, this.subs);
        return newCache;        
    }
    
    public int acessos(){
        int aux = mapeamento;
        return memoria[aux].getTotAcessos(); 
    }
    
    public int hits(){
        int aux = mapeamento;
        return memoria[aux].getTotHit();
    }
    
    public int misses(){
        int aux = mapeamento;
        return memoria[aux].getTotMiss();
    }
    
    public int compulsorio(){
        int aux = mapeamento;
        return memoria[aux].getMissCompulsorio();
    }
    
    public int capacidade(){
        int aux = mapeamento;
        return memoria[aux].getMissCapacidade();
    }
    
    //****************************************
    // METODOS GETTERS AND SETTERS
    //****************************************
    public int getTamanho() {
        return QntConjuntos;
    }

    public void setTamanho(int qntConj) {
        this.QntConjuntos = qntConj;
    }

    public int getTamanho_bloco() {
        return tamanho_bloco;
    }

    public void setTamanho_bloco(int tamanho_bloco) {
        this.tamanho_bloco = tamanho_bloco;
    }

    public int getLinhas() {
        return linhas;
    }

    public int getMapeamento() {
        return mapeamento;
    }

    public void setMapeamento(int mapeamento) {
        this.mapeamento = mapeamento;
    }

    public int getNiveis() {
        return niveis;
    }

    public void setNiveis(int niveis) {
        this.niveis = niveis;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getTamanho_barramento() {
        return tamanho_barramento;
    }

    public void setTamanho_barramento(int tamanho_barramento) {
        this.tamanho_barramento = tamanho_barramento;
    }
    
    
    
}
