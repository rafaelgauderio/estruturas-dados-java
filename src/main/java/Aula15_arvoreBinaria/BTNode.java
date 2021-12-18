package Aula15_arvoreBinaria;

public class BTNode <T>{

    private T value; //valor do nó
    private BTNode<T> left; //filho a esquerda
    private BTNode<T> right; // filho a direita
    //Em uma árvore binária um nó tem que conhecer os seu filhos e o seu valor

    public BTNode() {
    }

    public BTNode(T value, BTNode<T> left, BTNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public BTNode<T> getRight() {
        return right;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BTNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
