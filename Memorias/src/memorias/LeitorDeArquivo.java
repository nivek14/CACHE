/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorias;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author MOTTA-PC
 */
public class LeitorDeArquivo {
    GeradorCache cache ;
    public void leitorDeTxT(int qntItens, GeradorCache cache) throws IOException{
        this.cache = cache;
        DataInputStream filtro = null;
        String bin= "";
        try {
            FileInputStream arquivo = new FileInputStream( "arqBinario1.dat" );
            filtro = new DataInputStream( arquivo );
        }
        catch( FileNotFoundException e ) {
            System.out.println( "Arquivo inexistente" );
        }
        for(int w=0; w<qntItens;w++){
            bin = Integer.toString(filtro.readInt(),2);
            int tamanho = bin.length();
            if(tamanho <=32){
                for(int i=0;i<32-tamanho;i++){
                    bin = "0" + bin;
                }
                System.out.println(bin);
                testaMapeamento(bin);
            }
        }
        // FECHAMENTO
        try {
            filtro.close();
        }
        catch( IOException e ) {
            System.out.println("Falha ao fechar");
        }

    }
    
    public void testaMapeamento(String bin){
        if(cache.getMapeamento()==0){
            //map direto
            cache.memoria[0].buscaPalavra(bin,0);
        }
        else if(cache.getMapeamento()==1){
            cache.memoria[0].buscaPalavra(bin,1);
        }
        else {
            cache.BuscaPalavra(bin);
            System.out.println("errrrr");
        }
    }
}
