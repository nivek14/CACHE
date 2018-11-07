
package memorias;

/**
 *
 * @author MOTTA-PC
 */
public class GeradorCache {
    private int tamanho, tamanho_bloco, linhas, tamanho_barramento, mapeamento, niveis;
    Linha memoria[];
    // tipos de mapeamento:
    // mapeamento direto - 0
    // mapeamento totalmente assossiativo - 1
    // mapeamento assossiativo -2, 4, etc;
    // ****** nivel é referente aos niveis da cache valores de 1 até ***********
    public GeradorCache(int tam, int tam_bloco, int lines, int tam_barramento, int map, int nvl) {
        this.tamanho = tam;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = map;
        this.niveis = nvl;
    }
    public GeradorCache(int tam, int tam_bloco, int lines , int tam_barramento, int nvl) { //é definido por padrão mapeamento direto
        this.tamanho = tam;
        this.tamanho_bloco = tam_bloco;
        this.linhas = lines;
        this.tamanho_barramento = tam_barramento;
        this.mapeamento = 0;
        this.niveis = nvl;
    }
    //    ***************** METODOS DE BUSCA DE INFORMAÇÃO *********************
    public void buscaElementos(String endereco){
        
    }

    //***************** METODOS DE DISTRIBUICAO PARA MAPEAMENTO ************
    private void MetodosDeMapeamento(){
        switch (this.getMapeamento()) {
        // mapeamento direto
            case 0:
                memoria = MapeamentoDireto(this.tamanho);
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
    
    private Linha[] MapeamentoDireto(int tamanho){
        Linha newCache[] = new Linha[1];
        newCache[1].Linha(tamanho);
        return newCache;
    }
    
    //****************************************
    // METODOS GETTERS AND SETTERS
    //****************************************
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
