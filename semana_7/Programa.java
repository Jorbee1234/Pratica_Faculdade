package semana_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException{

        String arquivo = "C:\\Users\\jorbe\\Documents\\Exercicio Java\\Facul_Jv\\src\\semana_7\\votacao.csv";
  
        List<voto> apuracao = new ArrayList<>();
        
        
        //Para ler um arquivo somente usar esses comandos
        try(BufferedReader br = new BufferedReader( new FileReader(arquivo) )){
            String linha = br.readLine();

            while(linha != null){
            	String[] votos = linha.split(",");
            	voto voto = new voto(votos[0], Integer.parseInt(votos[1]));
            	apuracao.add(voto);
                System.out.println(linha);
                linha = br.readLine();
            }
            
        } catch (Exception e){
            System.out.println("Erro ao tentar ler o arquivo." + e.getMessage()); //e.getMessage usado para mostrar o erro
        }
        //Funciona de maneira geral 
        Collections.sort(apuracao);
        
        System.out.println("Apuração dos Votos:");
        System.out.println("------------");
         for (voto voto : apuracao) {
        	 System.out.println("Candidato:"+ voto.getNome()+"- Votos:"+ voto.getQtdVotos());
         }
       // apuração ordenada por quantidades de votos
         /*Collections.sort(apuracao, new Comparator<voto>() { Faz de maneira mais direta

             public int compare(voto o1, voto o2){
                 return Integer.compare(o1.getQtdVotos(), o2.getQtdVotos());
             }
         });

         System.out.println("\nApós ordenar: ");
         for (voto voto : apuracao) {
             System.out.println("Candidato: " + voto.getNome() + " - Votos: " + voto.getQtdVotos());
         }*/
         
         //Apurar vencedor
         
         Map<String, Integer> rank = new HashMap<>();
         
         for(voto voto : apuracao) {
        	 if(rank.get(voto.getNome()) == null) {
        		 // entrando pela primeira vez na hash
        		 rank.put(voto.getNome(), voto.getQtdVotos());
        	 }
        	 else {
        		 //acumula voto
        		 Integer acumVoto = rank.get(voto.getNome());
        		 rank.put(voto.getNome(), voto.getQtdVotos() + acumVoto);
        	 }
         }
         //Mostra resultado final 
         System.out.println("Rank final:");
         System.out.println("----------");
         for(Map.Entry<String, Integer> r1: rank.entrySet()) {
        	 System.out.println(r1);
         }
          
    }
}