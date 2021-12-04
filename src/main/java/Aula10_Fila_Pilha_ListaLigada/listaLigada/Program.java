package Aula10_Fila_Pilha_ListaLigada.listaLigada;

public class Program {
    /*VETOR
    *Elementos tem posição fixa. Assim para encontrar um elemento basta ir direto na posição
    *para adicionar uma elemento no final de um vetor tenho que redimensinar ele para +1. Isso tem um custo computacional
    *para excluir um elemento tenho que reposicionar todos os elementos
    *
    * LISTA ENCADEADA
    * Os elementos não tem posição fixa. Cada elemento está ligada a seu próximo. Tem um tamanho dinâmico
    * Cada elemento apenas sabe quem é seu próximo e seu valor
    * Baixo custo computacional para remover um elemento. Altero apenas o antecessor e sucessor
    * Desvantagens: Tem que varrerar toda a lista para encontrar um elemento.
    */

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("Size of the LinKedList: " + list.getSize());

        list.add("Internacional");
        list.add("São Paulo");

        System.out.println("Size of the LinKedList: " +list.getSize());
        System.out.println("First element: " +list.getFirst().getValue());
        System.out.println("Last element: " +list.getLast().getValue());

        System.out.println(list);

        list.add("Flamengo");
        list.add("Palmeiras");
        list.add("Cruzeiro");

        System.out.println(list);

        System.out.println("\nElement in position three:  " + list.getElement(3));





    }


}
