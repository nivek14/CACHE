
package memorias;

/**
 *
 * @author MOTTA-PC
 */
public class GeradorCache {
    private int QntConjuntos, tamanho_bloco, linhas, tamanho_barramento, mapeamento, niveis;
    public ConjuntoDeLinhas[] memoria;
    
    CalculoEndereco endereco = new CalculoEndereco();
    // tipos de mapeamento:
    // mapeamento direto - 0
    // mapeamento totalmente assossiativo - 1
    // mapeamento assossiativo -2, 4, etc;
    // ****** nivel é referente aos niveis da cache valores de 1 até ***********
    public GeradorCache(int qntConj, int tam_bloco, int map) {
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.mapeamento = map;
        quantidadeDeLinhas();
        MetodosDeMapeamento();
    }
    
    public GeradorCache(int qntConj, int tam_bloco, int lines , int tam_barramento, int nvl) { //é definido por padrão mapeamento direto
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = 0;
        this.niveis = nvl;
        quantidadeDeLinhas();
        MetodosDeMapeamento();
    }
    
    // memoria default
    public GeradorCache(){
        this.linhas = 1024;
        this.tamanho_bloco = 4; //4bytes
        this.mapeamento = 0; // mapeamento direto
        this.niveis = 1;
        MetodosDeMapeamento();
    }
    // ******************** METODO PARA IDENTIFICAR A QUANTIDADE DE LINHAS ***********
    private void quantidadeDeLinhas(){
            this.linhas = this.QntConjuntos;
    }
    //    ***************** METODOS DE BUSCA DE INFORMAÇÃO *********************
    public void buscaElementos(String endereco){
        
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
                this.endereco.enderecoMapeamentoTotalmenteAcossiativo(tamanho_bloco);
                memoria = new ConjuntoDeLinhas[1];
                memoria[0] = ConjuntoTotalmenteAssociativo();
                break;
        // mapeamento 2 associativo
            case 2:
                
                break;
        // mapeamento 4 associativo
            case 4:
                break;
            default:
                break;
        }
    }
    
    private ConjuntoDeLinhas MapeamentoDireto(){        
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), endereco.getEndereco(), endereco.getDeslocamento(),this.mapeamento);
        return newCache;
    }
    
    private ConjuntoDeLinhas ConjuntoTotalmenteAssociativo(){        
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), 0, endereco.getDeslocamento(), this.mapeamento);
        return newCache;
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
