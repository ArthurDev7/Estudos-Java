package EstudoCollectionsStreams;

// @author Arthur Luiz do Nascimento

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();

        // comando .add para adicionar itens ao ArrayList

        nomes.add("Karla");
        nomes.add("Arthur");
        nomes.add("Victoria");
        nomes.add("Fernanda");
        nomes.add("Marco");
        System.out.println(nomes + "\n");

        for (String listaNomes : nomes){
            System.out.println("---> " + listaNomes);
        }
        System.out.println("\n");

        // comando Collections.sort para colocar os itens em ordem alfabetica

        Collections.sort(nomes);
        for (String ordemNomes : nomes){
            System.out.println("---> " + ordemNomes);
        }
        System.out.println("\n");

        //o comando .indexOf retorna a posicao (index) do objeto - se nao existir ele retorna (-1)

        int qualIndex = nomes.indexOf("Arthur");
        System.out.println("O numero do index do objeto: " + qualIndex);

        // comando .set para substituir itens no ArrayList

        nomes.set(1, "Emily");
        System.out.println(nomes);

        // comando .remove para remover itens por index ou objetos no ArrayList

        nomes.remove(3);
        System.out.println(nomes);

        /* comando .get pega o item desejado no ArrayList (pelo numero do index)
         tem que atribuir a uma nova String */

        String nome = nomes.get(3);
        System.out.println(nome);

        /* comando .size para percorrer o ArrayList e informar a quantidade / tamanho dos itens
        tem que atribuir a uma nova String */

        int tamanho = nomes.size();
        System.out.println(tamanho);

        // comando .contains retorna um valor boolean true or false - tem que fazer uma nova atribuicao

        boolean contemObjeto = nomes.contains("Karla");
        System.out.println(contemObjeto);

        /* comando .isEmpty (pergunta se o ArrayList está vazio ou não) retorna um valor boolean true or false
        tem que fazer uma nova atribuicao */

        boolean estaVazio = nomes.isEmpty();
        System.out.println("Está vazio? " + estaVazio);

        // comando .clear limpa todo o ArrayList

        nomes.clear();
        System.out.println("Limpando tudo " + nomes);

        // repetindo o mesmo valor boolean true or false

        boolean naoVazio = nomes.isEmpty();
        System.out.println("Está vazio? " + naoVazio);
    }
}
