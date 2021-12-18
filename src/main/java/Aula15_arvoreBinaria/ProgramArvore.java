package Aula15_arvoreBinaria;

public class ProgramArvore {

    public static void main(String[] args) {

        BTree arvoreBinaria = new BTree();

        BTNode raiz = new BTNode();
        BTNode filhoEsquerda = new BTNode();
        BTNode filhoDireita = new BTNode();
        BTNode netoEsquerda1 = new BTNode("Cristina De Luca da Silva",null, null);
        BTNode netoDireita1 = new BTNode("João da Silva",null,null);
        BTNode netoEsquerda2 = new BTNode("Sabrina Souza",null,null);
        BTNode netoDireita2 = new BTNode("Marcus de Luca de Oliveira", null, null);

        arvoreBinaria.setRoot(raiz);
        raiz.setValue("Rafael De Luca");
        raiz.setLeft(filhoEsquerda);
        raiz.setRight(filhoDireita);
        filhoEsquerda.setValue("Lara De luca");
        filhoEsquerda.setLeft(netoEsquerda1);
        filhoEsquerda.setRight(netoDireita1);
        filhoDireita.setValue("Claudio Souza");
        filhoDireita.setLeft(netoEsquerda2);
        filhoDireita.setRight(netoDireita2);



        System.out.println("Árvore é vazia? "+ arvoreBinaria.isEmpty());
        System.out.println("Altura da árvore: " + arvoreBinaria.depth());
        System.out.println("Número de nós da árvore: " + arvoreBinaria.numberNodes());
        System.out.println("Valor do nó na raiz da árvore: " + arvoreBinaria.getroot().getValue());
        System.out.println("Filho a esquerda da raiz: " + arvoreBinaria.getroot().getLeft());
        System.out.println("Filho a direita da raiz: " + arvoreBinaria.getroot().getRight());

        //imprimindo a árvore de acordo com o tipo de pesquisa
        arvoreBinaria.printPreOrder();
        arvoreBinaria.printInOrder();
        arvoreBinaria.printPostOrder();
        arvoreBinaria.printPesquisalargura();

        //Realizando Buscas
        System.out.println(arvoreBinaria.contains("Rafael De Luca"));
        System.out.println(arvoreBinaria.contains("RAFAEL DE LUCA"));
        System.out.println(arvoreBinaria.contains("Leandro PEREIRA"));
        System.out.println(arvoreBinaria.contains("Claudio Souza"));



        BTree arvoreVazia = new BTree();
        arvoreVazia.setRoot(null);
        //Vericando arvore nula
        System.out.println("\nArvore é vazia? " + arvoreVazia.isEmpty());
        System.out.println("Altura da árvore: " + arvoreVazia.depth());
        System.out.println("Número de nós da árvore: " + arvoreVazia.numberNodes());
        try {
            System.out.println("Valor do nó na raiz da árvore: " + arvoreVazia.getroot().getValue());
            System.out.println("Filho a esquerda da raiz: " + arvoreVazia.getroot().getLeft());
            System.out.println("Filho a direita da raiz: " + arvoreVazia.getroot().getRight());
        }
         catch (Exception erro) {
             erro.getLocalizedMessage();
        }



    }
}
