package memorias;

public class Memorias {

    public static void main(String[] args) {
        int tam=0, tam_bloco=0, lines=0, tam_barramento=0, map=0, nvl=0;
        //GeradorCache cache1 = new GeradorCache(tam, tam_bloco, lines, tam_barramento, map, nvl);              
           
       /* System.out.println("CASHE 1");
        GeradorCache cache1 = new GeradorCache();
        
        String bin = "10000000000000001100000000110001";
        cache1.memoria[0].buscaPalavra(bin,0);
        cache1.memoria[0].buscaPalavra(bin,0);
        cache1.memoria[0].buscaPalavra(bin,0);
        bin = "10000000000000001010000000110001";
        cache1.memoria[0].buscaPalavra(bin,0);
        bin = "10000000000000001010000000110000";
        cache1.memoria[0].buscaPalavra(bin,0);
        bin = "10000000000000001010000000110000";
        cache1.memoria[0].buscaPalavra(bin,0);
        */
        System.out.println("CACHE 2");
        GeradorCache cache2 = new GeradorCache(1024,8,4,1);
        String bin = "10000000000000001100000000110001";
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001100000000110000";
        cache2.memoria[0].buscaPalavra(bin,1);
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001000000000110011";
        cache2.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001100000000110001";
        cache2.memoria[0].buscaPalavra(bin,1);
       /*
        System.out.println("CACHE 3");
        GeradorCache cache3 = new GeradorCache(512,8,2);
        bin = "10000000000000001100000000110001";
        cache3.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001100000000110101";
        cache3.memoria[0].buscaPalavra(bin,1);
        bin = "10000000000000001100000000111101";
        cache3.memoria[0].buscaPalavra(bin,1);
        /*String bin = "0111";
        int numero = Integer.parseInt(bin, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
        System.out.println(numero);
		

        String bin2 = Integer.toBinaryString(7);//Converter um valor int para binario e atribui o valor a um tipo string
        System.out.println(bin2);*/
    }
}
