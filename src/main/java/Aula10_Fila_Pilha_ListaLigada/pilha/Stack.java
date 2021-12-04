package Aula10_Fila_Pilha_ListaLigada.pilha;

import Aula10_Fila_Pilha_ListaLigada.listaLigada.LinkedList;

public class Stack {

    private LinkedList list;

    public Stack() {
        this.list= new LinkedList();

    }
    //adiciona no inicio da pilha, na fila adiciona no final
    public void add(String newValue) {
        this.list.addBegin(newValue);

    }
    //remove o primeiro elemento da pilha
    public void remove() {
        this.list.remove(this.getElement());
    }

    public String getElement() {
        return this.list.getFirst().getValue();
    }




}
