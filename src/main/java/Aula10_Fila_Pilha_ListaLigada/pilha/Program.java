package Aula10_Fila_Pilha_ListaLigada.pilha;

import Aula10_Fila_Pilha_ListaLigada.fila.Queue;

public class Program {

    public static void main(String[] args) {
        //Pilha não é um estrutura de dados é um Tipo abstrato de dados.
        // Podemos ter uma pilha de ListaLigada, de vetores
        //FILO = first in, Last out
        //vai empilhando os elementos, o primeiro elemento a entrar, vai ser o último a sair
        Stack stack = new Stack();

        stack.add("Brazil");
        stack.add("USA");
        stack.add("Jamaica");
        stack.add("Sweden");
        stack.add("Spain");
        stack.add("Norway");


        //Sempre remove o que entrou por ultimo na pilha e em cima da pilha
        //ou seja remove sempre o elemento no topo da pilha e adiciona no topo da pilha;
        System.out.println("First Element of stack: " + stack.getElement());
        stack.remove();
        System.out.println("New First Element of stack: " + stack.getElement());
        stack.remove();
        System.out.println("New First Element of stack: " + stack.getElement());

    }
}
