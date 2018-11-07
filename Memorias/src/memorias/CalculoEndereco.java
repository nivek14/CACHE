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
    
    public void calculo_de_endereco(int linhas, int end){
        int end2 = end;
        while(end<=1){ // endereco irá assumir o valor de n onde 2^n é a quantidade de linhas
            end = end/2;
            endereco ++;
        }
        while(linhas<=1){ //tag irá assumir o valor de n onde 2^n é a quentidade do endereço
            linhas = linhas/2;
            deslocamento ++; 
        }
        
        tag = end2 - endereco - deslocamento ;
        
    }
    
    public void enderecoDefault(){
        int end = 1024;
        int end2 = 32;
        int offset = 32;
        while(end<=1){ // endereco irá assumir o valor de n onde 2^n é a quantidade de linhas
            end = end/2;
            endereco ++;
        }
        while(offset<=1){ //deslocamento irá assumir o valor de n onde 2^n é a quentidade do endereço
            offset = offset/2;
            deslocamento ++; 
        }
        
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
