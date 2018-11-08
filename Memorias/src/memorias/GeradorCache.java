
package memorias;

/**
 *
 * @author MOTTA-PC
 */
public class GeradorCache {
    private int QntConjuntos, tamanho_bloco, linhas, tamanho_barramento, mapeamento, niveis;
    ConjuntoDeLinhas[] memoria;
    CalculoEndereco endereco = new CalculoEndereco();
    // tipos de mapeamento:
    // mapeamento direto - 0
    // mapeamento totalmente assossiativo - 1
    // mapeamento assossiativo -2, 4, etc;
    // ****** nivel é referente aos niveis da cache valores de 1 até ***********
    public GeradorCache(int qntConj, int tam_bloco, int lines, int tam_barramento, int map, int nvl) {
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = map;
        this.niveis = nvl;
        this.endereco.calculo_de_endereco(linhas, tamanho_barramento);
    }
    public GeradorCache(int qntConj, int tam_bloco, int lines , int tam_barramento, int nvl) { //é definido por padrão mapeamento direto
        this.QntConjuntos = qntConj;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = 0;
        this.niveis = nvl;
        this.endereco.calculo_de_endereco(linhas, tamanho_barramento);
        
    }
    // memoria default
    public GeradorCache(){
        this.QntConjuntos = 1024;
        this.tamanho_bloco = 4; //4bytes
        this.mapeamento = 0; // mapeamento direto
        this.niveis = 1;
        this.endereco.enderecoDefault();
        MetodosDeMapeamento();
    }
    //    ***************** METODOS DE BUSCA DE INFORMAÇÃO *********************
    public void buscaElementos(String endereco){
        
    }

    //***************** METODOS DE DISTRIBUICAO PARA MAPEAMENTO ************
    private void MetodosDeMapeamento(){
        switch (this.getMapeamento()) {
        // mapeamento direto
            case 0:
                memoria = new ConjuntoDeLinhas[1];
                memoria[0] = MapeamentoDireto();
                break;
        // mapeamento totalmente associativo
            case 1:
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
        ConjuntoDeLinhas newCache = new ConjuntoDeLinhas(this.getLinhas(), endereco.getTag(), endereco.getEndereco(), endereco.getDeslocamento());
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
