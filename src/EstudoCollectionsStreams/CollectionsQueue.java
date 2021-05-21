package EstudoCollectionsStreams;

// @author Arthur Luiz do Nascimento

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {

        /* Exemplo de programa que utiliza o java.util.Queue
        para organizar uma fila de Banco simples */

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Arthur");
        filaBanco.add("Luiza");
        filaBanco.add("Victoria");
        filaBanco.add("Roberto");
        filaBanco.add("Karla");
        filaBanco.add("Emanoel");
        filaBanco.add("Jonas");

        // organizando a saida com for.

        for (String filaOrdem: filaBanco){
            System.out.println("(: --> " + filaOrdem);
        }

        // o metodo .poll chama o que esta na frente e o remove

        String Remove = filaBanco.poll();
        System.out.println("\n" + "Chamando o próximo e removendo: " + Remove + "\n");

        System.out.println("Resultado:");
        for (String proximo: filaBanco){
            System.out.println("(: --> " + proximo);
        }

        // o metodo .peek chama o que esta na frente e não o remove

        String NaoRemove = filaBanco.peek();
        System.out.println("\n" + "Chamando o próximo é não remove: " + NaoRemove + "\n");

        System.out.println("Resultado:");
        for (String proximo: filaBanco){
            System.out.println("(: --> " + proximo);
        }

        // o metodo .element retorna um erro "Exception" quando o "queue filaBanco" está vazio.

        // removendo todos os elementos
        filaBanco.clear();

        System.out.println("\n" + "Retornando um Erro");

        String retornaErro = filaBanco.element();
        System.out.println(retornaErro);
    }
}
