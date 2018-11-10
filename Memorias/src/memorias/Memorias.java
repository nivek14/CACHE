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

public class Memorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int tam=0, tam_bloco=0, lines=0, tam_barramento=0, map=0, nvl=0;
        GeradorCache cache1 = new GeradorCache(tam, tam_bloco, lines, tam_barramento, map, nvl);*/                
             
        System.out.println("CASHE 1");
        GeradorCache cache1 = new GeradorCache();
        
        String bin = "10000000000000001100000000110001";
        cache1.memoria[0].buscaPalavra(bin,0);
        cache1.memoria[0].buscaPalavra(bin,0);
        cache1.memoria[0].buscaPalavra(bin,0);
        bin = "10000000000000001010000000110001";
        cache1.memoria[0].buscaPalavra(bin,0);
        cache1.memoria[0].buscaPalavra(bin,0);
        bin = "10000000000000001010000100110011";
        cache1.memoria[0].buscaPalavra(bin,0);
        
        System.out.println("CACHE 2");
        GeradorCache cache2 = new GeradorCache(512,8,1);
        bin = "10000000000000001100000000110001";
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001010000000110001";
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001010000100110011";
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001100000000110001";
        cache2.memoria[0].buscaPalavra(bin,1);
        
        /*String bin = "0111";
        int numero = Integer.parseInt(bin, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        System.out.println(numero);
		

        String bin2 = Integer.toBinaryString(7);//Converter um valor int para binario e atribui o valor a um tipo string
        System.out.println(bin2);*/
    }
}
