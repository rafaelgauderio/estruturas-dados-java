package Aula15_arvoreBinaria;


//classe que representa a árvore
public class BTree <T>{
    private BTNode<T> root;

    public BTree() {
        root=null;
    }


    public BTree(BTNode<T> root) {
        this.root = root;
    }


    public BTNode getroot() {
        return root;
    }

    public void setRoot(BTNode<T> root) {
        this.root=root;
    }

    //Tem que ter pelo menos 1 nó (raiz) a árvore já não está vazia.
    public boolean isEmpty() {
        return root == null;
    }

    //Método para contar o número de nós
    //método princial
    public int numberNodes() {
        //método não está chamando ele mesmo, pois a assinatura do método é diferente
        return numberNodes(this.root);
    }

    //método auxiliar recursivo
    private int numberNodes(BTNode<T> number) {
        if(number == null) {
            return 0;
        }
        return 1 + numberNodes(number.getLeft()) + numberNodes(number.getRight());
    }

    //calcular altura
    // altura = 1 + valor maximo(algura da direita,altura da esquerda)
    public int depth() {
        return depth(this.root);
    }

    private int depth(BTNode <T> number) {
        if(number == null)
            return -1;
        return 1 + Math.max(depth(number.getLeft()), depth(number.getRight()));
    }

    //Método de busca do valor na árvore

    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(BTNode<T> number, T value) {
        if(number== null) {
            return false;
        }
        if (number.getValue().toString().equalsIgnoreCase((String) value))return true;
        return contains(number.getLeft(),value) || contains(number.getRight(),value);
    }

    public void printPreOrder() {
        System.out.println("\nImprimindo PreOrder:");
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(BTNode<T> number) {
        if(number== null) {
            return;
        }
        System.out.print(number.getValue() + ", ");
        printPreOrder(number.getLeft());
        printPreOrder(number.getRight());

    }

    public void printInOrder() {
        System.out.println("\nImprimindo InOrder:");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BTNode<T> number) {
        if(number== null) {
            return;
        }
        printInOrder(number.getLeft());
        System.out.print(number.getValue() + ", ");
        printPreOrder(number.getRight());

    }

    public void printPostOrder() {
        System.out.println("\nImprimindo PostOrder:");
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(BTNode<T> number) {
        if(number== null) {
            return;
        }
        printPostOrder(number.getLeft());
        System.out.print(number.getValue() + ", ");
        printPostOrder(number.getRight());

    }





    @Override
    public String toString() {
        return "BTree{" +
                "root=" + root +
                '}';
    }
}
