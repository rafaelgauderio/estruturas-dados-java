package Aula10_Fila_Pilha_ListaLigada.fila;

public class Program {

    public static void main(String[] args) {

        //Fila não é um estrutura de dados é um Tipo abstrato de dados.
        // Podemos ter uma fila de ListaLigada, de vetores
        //FIFO = first in, first out
        Queue queue = new Queue();

        queue.add("Brazil");
        queue.add("USA");
        queue.add("Jamaica");
        queue.add("Sweden");
        queue.add("Spain");
        queue.add("Norway");

        //Sempre remove o que entrou por ultimo na fila e adiciona no final da fila
        System.out.println("First Element of queue: " + queue.getElement());
        queue.remove();
        System.out.println("New First Element of queue: " + queue.getElement());
        queue.remove();
        System.out.println("New First Element of queue: " + queue.getElement());

    }
}
