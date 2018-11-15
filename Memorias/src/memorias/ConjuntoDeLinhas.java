package memorias;

import static java.lang.Math.pow;

public class ConjuntoDeLinhas {
    
    public Linha[] bloco;
    private int tam_tag, tam_indice, tam_desloc;
    private int count_miss=0,count_hit=0,count_missCap=0,count_missComp=0;
    private int tot_acessos=0;
    private int qnt_Linhas;
    private int metodoSubs;
    private int tipoDeMapeamento;
    private PoliticaDeSubstituicao politicaSubs;
    public ConjuntoDeLinhas(int quantidade_de_linhas, int t_tag, int t_ind, int t_des, int mapeamento, int subst){
        this.bloco = new Linha[quantidade_de_linhas];
        this.tam_tag = t_tag;
        this.tam_indice = t_ind;
        this.tam_desloc = t_des;
        this.qnt_Linhas = quantidade_de_linhas;
        this.tipoDeMapeamento = mapeamento;
        this.metodoSubs = subst;
        politicaSubs = new PoliticaDeSubstituicao(bloco);
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
        int i, contador=0;
        tag = palavra.substring(0,tam_tag);
        offset = palavra.substring(tam_tag,tam_tag+tam_desloc);
         
        int valTag = Integer.parseInt(tag, 2); // transforma a tag em numero inteiro para melhor encontrar
        for(i=0;i<bloco.length;i++){
            if(bloco[i].getTag()==valTag){
                    for(int j=0; j<bloco[i].ConjuntoDePalavras.length;j++){
                        if(bloco[i].ConjuntoDePalavras[j].getIndex() == Integer.parseInt(offset,2) &&
                                    bloco[i].ConjuntoDePalavras[j].isBitValidade()==true){
                            System.out.println("HIT");
                            count_hit += 1;
                            j=bloco.length; // sai do for
                            contador=1;
                        }
                    }
                    if(contador!=1){
                        bloco[i].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
                        count_missComp+=1;
                        count_miss +=1;
                        contador =1;
                        System.out.println("Miss, falta de dado");
                    }
                    break;
            }
            
            else if(i==bloco.length-1 && contador!=1){ // a tag não foi encontrada, então deve-se colocala em uma posição ainda nao ocupada
                                           // ou no caso se estiver cheia a cache, colocar em uma posição dependendo do metodo de substituição
                if(this.metodoSubs == 1){
                    politicaSubs.SubstituicaoFifo(tag, null, offset);
                    System.out.println("MISS CAPACIDADE");
                    count_missCap +=1;
                    count_miss += 1;
                }
                else if(this.metodoSubs==2){
                    politicaSubs.SubstituicaoRandom(valTag, null, offset);
                    System.out.println("MISS CAPACIDADE");
                    count_missCap +=1;
                    count_miss += 1;
                }
                if(i!=0){
                   bloco[i].setBitFifo(true);
                   bloco[i-1].setBitFifo(false);
               }
               else {
                   bloco[i].setBitFifo(true);
                   bloco[bloco.length-1].setBitFifo(false);
               }
                break;
            }
            if(bloco[i].getBitValidade()==0 && contador!=1){
               bloco[i].setTag(valTag);
               bloco[i].setBitValidade(1);
               bloco[i].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
               if(i!=0){
                   bloco[i].setBitFifo(true);
                   bloco[i-1].setBitFifo(false);
               }
               else {
                   bloco[i].setBitFifo(true);
                   bloco[bloco.length-1].setBitFifo(false);
               }
               System.out.println("MISS COMPULSORIO");
               count_missComp += 1;
               count_miss += 1;
               break;
            }
        }
        tot_acessos += 1;
    }

    public void buscaPalavraMapeamentoDireto(String palavra){
        String tag;
        String indice;
        String offset;
        int contadorDeAcertos=0;
        //System.out.println(Integer.toString(tam_tag) +" "+ Integer.toString(tam_indice)+" "+ Integer.toString(tam_desloc));
        tag = palavra.substring(0,tam_tag);
        indice = palavra.substring(tam_tag, tam_tag+tam_indice);
        offset = palavra.substring(tam_tag+tam_indice,tam_tag+tam_indice+ tam_desloc);
        
        //System.out.println(tag + " " + indice + " " + offset + " ");
        int numero = Integer.parseInt(indice, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        //System.out.println(numero);
        int valTag = Integer.parseInt(tag, 2);
        if(bloco[numero].getTag() == valTag){
                if(bloco[numero].getIndice().equals(indice)){
                    for(int j=0; j< pow(2,tam_desloc);j++){
                        if(bloco[numero].ConjuntoDePalavras[j].getIndex()==Integer.parseInt(offset,2) &&
                                bloco[numero].ConjuntoDePalavras[j].isBitValidade()==true){
                            System.out.println("HIT");
                            count_hit += 1;
                            contadorDeAcertos=1;
                             j= (int) pow(2,tam_desloc);
                        }
                    }
                    if(contadorDeAcertos!=1){
                        count_miss += 1;
                        count_missComp +=1;
                        bloco[numero].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
                        System.out.println("Miss compulsório, dado nao encontrado");
                        contadorDeAcertos=1;
                    }
                }
            if(contadorDeAcertos!=1){
                System.out.println("Miss, tag encontrada, mas indice não");
                bloco[numero].setIndice(indice);
                bloco[numero].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
                count_miss += 1;
                count_missComp +=1;
            }
        }
        else{
            System.out.println("MISS");
            count_missComp +=1;
            count_miss += 1;
            bloco[numero].setTag(valTag);
            bloco[numero].setIndice(indice);
            bloco[numero].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
        }
        tot_acessos += 1;
    }
    
    public void buscaPalavraNAssociativo(String tag, String offset){
        int i, contador=0;
        int valTag = Integer.parseInt(tag, 2); // transforma a tag em numero inteiro para melhor encontrar
        for(i=0;i<bloco.length;i++){
            if(bloco[i].getTag()==valTag){
                    for(int j=0; j<bloco[i].ConjuntoDePalavras.length;j++){
                        if(bloco[i].ConjuntoDePalavras[j].getIndex() == Integer.parseInt(offset,2) &&
                                    bloco[i].ConjuntoDePalavras[j].isBitValidade()==true){
                            System.out.println("HIT");
                            count_hit += 1;
                            j=bloco.length; // sai do for
                            contador=1;
                        }
                    }
                    if(contador!=1){
                        bloco[i].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
                        count_missComp+=1;
                        count_miss +=1;
                        contador =1;
                        System.out.println("Miss, falta de dado");
                    }
                    break;
            }
            
            else if(i==bloco.length-1 && contador!=1){ // a tag não foi encontrada, então deve-se colocala em uma posição ainda nao ocupada
                                           // ou no caso se estiver cheia a cache, colocar em uma posição dependendo do metodo de substituição
                if(this.metodoSubs == 1){
                    politicaSubs.SubstituicaoFifo(tag, null, offset);
                    System.out.println("MISS CAPACIDADE");
                    count_missCap +=1;
                    count_miss += 1;
                }
                else if(this.metodoSubs==2){
                    politicaSubs.SubstituicaoRandom(valTag, null, offset);
                    System.out.println("MISS CAPACIDADE");
                    count_missCap +=1;
                    count_miss += 1;
                }
                if(i!=0){
                   bloco[i].setBitFifo(true);
                   bloco[i-1].setBitFifo(false);
               }
               else {
                   bloco[i].setBitFifo(true);
                   bloco[bloco.length-1].setBitFifo(false);
               }
                break;
            }
            if(bloco[i].getBitValidade()==0 && contador!=1){
               bloco[i].setTag(valTag);
               bloco[i].setBitValidade(1);
               bloco[i].ConjuntoDePalavras[Integer.parseInt(offset,2)].setBitValidade(true);
               if(i!=0){
                   bloco[i].setBitFifo(true);
                   bloco[i-1].setBitFifo(false);
               }
               else {
                   bloco[i].setBitFifo(true);
                   bloco[bloco.length-1].setBitFifo(false);
               }
               System.out.println("MISS COMPULSORIO");
               count_missComp += 1;
               count_miss += 1;
               break;
            }
        }
        tot_acessos += 1;
    
    }
    
    public void buscaPalavra(String palavra, int mapeamento){
        if(mapeamento == 0){
            buscaPalavraMapeamentoDireto(palavra);
        }
        else if(mapeamento == 1 ){
            buscaPalavraTotalmenteAssociativa(palavra);
        }
        else 
            System.out.println("ERROR");
    }
    
    //----------------- Metodos get e set --------------------------------------
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
    
    public int getTotMiss(){
        return count_miss;
    }
    
    public int getMissCompulsorio(){
        return count_missComp;
    }
    
    public int getMissCapacidade(){
        return count_missCap;
    }
    
    public int getTotHit(){
        return count_hit;
    }
    
    public int getTotAcessos(){
        return tot_acessos;
    }
    
}
