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
public class CalculoEndereco {
    private int tag=0, endereco=0, deslocamento=0;
    
    
    
    public void calculo_de_endereco_MapDireto(int tamBloco, int quantLinhas){
        int end = 32; // tamanho do barramento
        while(quantLinhas>=1){ // endereco irá assumir o valor de n onde 2^n é a quantidade de linhas
            quantLinhas = quantLinhas/2;
            endereco ++;
        }
        while(tamBloco>=1){ //tag irá assumir o valor de n onde 2^n é a quantidade do endereço
            tamBloco = tamBloco/2;
            deslocamento ++; 
        }
        endereco--;
        deslocamento--;
        tag = end - endereco - deslocamento ;
    }
    
    public void enderecoMapeamentoTotalmenteAcossiativo(int tamBloco){
        int end = 32;
        while(tamBloco>=1){ //tag irá assumir o valor de n onde 2^n é a quantidade do endereço
            tamBloco = tamBloco/2;
            deslocamento ++; 
        }
        deslocamento--;
         tag = end -  deslocamento ;
    }
    
    public void enderecoDefault(){
        int end = 1024;
        int end2 = 32;
        while(end>=1){ // endereco irá assumir o valor de n onde 2^n é a quantidade de linhas
            end = end/2;
            endereco ++;
        }
        endereco --;
        deslocamento =2; // sabe-se que é 2 pois são 4 bytes, logo 2^n, n = 2
        tag = end2 - deslocamento - endereco;
        
    }

    public int getTag() {
        return tag;
    }

    public int getEndereco() {
        return endereco;
    }

    public int getDeslocamento() {
        return deslocamento;
    }
    
       
}
