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
    public Linha[] bloco;
    private int tam_tag, tam_indice, tam_desloc;
    private int qnt_Linhas;
    private int tipoDeMapeamento;
    public ConjuntoDeLinhas(int quantidade_de_linhas, int t_tag, int t_ind, int t_des, int mapeamento){
        this.bloco = new Linha[quantidade_de_linhas];
        this.tam_tag = t_tag;
        this.tam_indice = t_ind;
        this.tam_desloc = t_des;
        this.qnt_Linhas = quantidade_de_linhas;
        this.tipoDeMapeamento = mapeamento;
        gerarLinhas(quantidade_de_linhas);
    }
    
    public void gerarLinhas(int n_linhas){
        for(int i=0; i<n_linhas; i++){
            bloco[i]= new Linha(tam_tag, tam_indice, tam_desloc);
            bloco[i].setTag(i); // transforma o valor de i para um numero binario
        }
    }
    
    public void buscaPalavraTotalmenteAssociativa(String palavra){
        String tag, offset;
        int i=0;
        tag = palavra.substring(0,tam_tag);
         offset = palavra.substring(tam_tag,tam_tag+tam_desloc);
         
         int valTag = Integer.parseInt(tag, 2); // transforma a tag em numero inteiro para melhor encontrar
         for(i=0;i<bloco.length;i++){
             if(bloco[i].getTag()==valTag){
                 System.out.println("HIT");
                 break;
             }
             else if(i==bloco.length-1){ // a tag não foi encontrada, então deve-se colocala em uma posição ainda nao ocupada
                                           // ou no caso se estiver cheia a cache, colocar em uma posição randomica
                 int valor = (int) (Math.random() * bloco.length);
                 bloco[valor].setTag(valTag);
                 bloco[valor].setBitValidade(1);
                 System.out.println("MISS CAPACIDADE");
                 break;
             }
             if(bloco[i].getBitValidade()==0){
                bloco[i].setTag(valTag);
                bloco[i].setBitValidade(1);
                System.out.println("MISS COMPULSORIO");
                break;
             }
         }
         
    }

    public void buscaPalavraMapeamentoDireto(String palavra){
        String tag;
        String indice;
        String offset;
        //System.out.println(Integer.toString(tam_tag) +" "+ Integer.toString(tam_indice)+" "+ Integer.toString(tam_desloc));
        tag = palavra.substring(0,tam_tag);
        indice = palavra.substring(tam_tag, tam_tag+tam_indice);
        offset = palavra.substring(tam_tag+tam_indice,tam_tag+tam_indice+ tam_desloc);
        
        //System.out.println(tag + " " + indice + " " + offset + " ");
        int numero = Integer.parseInt(indice, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        //System.out.println(numero);
        
        int valTag = Integer.parseInt(tag, 2);
        if(bloco[numero].getTag() == valTag){
            System.out.println("HIT");
        }
        else{
            System.out.println("MISS");
            bloco[numero].setTag(valTag);
        }
    }
    public void buscaPalavra(String palavra, int mapeamento){
        if(mapeamento == 0){
            buscaPalavraMapeamentoDireto(palavra);
        }
        if(mapeamento == 1 ){
            buscaPalavraTotalmenteAssociativa(palavra);
        }
    }
    
    
    public Linha[] getBloco() {
        return bloco;
    }

    public void setBloco(Linha[] bloco) {
        this.bloco = bloco;
    }

    public int getTam_tag() {
        return tam_tag;
    }

    public void setTam_tag(int tam_tag) {
        this.tam_tag = tam_tag;
    }

    public int getTam_indice() {
        return tam_indice;
    }

    public void setTam_indice(int tam_indice) {
        this.tam_indice = tam_indice;
    }

    public int getTam_desloc() {
        return tam_desloc;
    }

    public void setTam_desloc(int tam_desloc) {
        this.tam_desloc = tam_desloc;
    }
    
    
}
