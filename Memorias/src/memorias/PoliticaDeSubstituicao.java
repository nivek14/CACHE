
package memorias;

public class PoliticaDeSubstituicao {
    
    private Linha [] cache;
     
    public PoliticaDeSubstituicao(Linha [] cache){
        this.cache = cache;
    }
    
    public void SubstituicaoRandom(int valTag,String indice, String offset){
        
        int i;
        
        i = (int) (Math.random() * cache.length);
        cache[i].setTag(valTag);
        cache[i].setBitValidade(1);
        cache[i].setIndice(indice);
        cache[i].setOffset(Integer.parseInt(offset, 2));
        
    }
    
    public void SubstituicaoFifo(String tag, String indice, String offset){
        
        int i,valTag,valOff;
        
        for(i=0;i<cache.length;i++){
            if(cache[i].isBitFifo() == true)
                break;
        }
        
        valTag = Integer.parseInt(tag, 2);
        valOff = Integer.parseInt(offset, 2);
        
        if(cache.length-1 == i){
            cache[0].setTag(valTag);
            cache[0].setIndice(indice);
            cache[0].setOffset(valOff);
        }
        
        else{
            cache[i+1].setTag(valTag);
            cache[i+1].setIndice(indice);
            cache[i+1].setOffset(valOff);
        }
        
        
    }
    
    
}
