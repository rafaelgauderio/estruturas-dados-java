package Aula10_Fila_Pilha_ListaLigada.fila;

import Aula10_Fila_Pilha_ListaLigada.listaLigada.LinkedList;

public class Queue {

    private LinkedList list;

    public Queue () {
        this.list = new LinkedList();
    }

    public void add (String newValue) {
        this.list.add(newValue);
    }

    public void remove ( ) {
        this.list.remove(this.getElement());
    }

    public String getElement() {
        return this.list.getFirst().getValue();
    }


}
