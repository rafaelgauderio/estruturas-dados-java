package Aula10_Fila_Pilha_ListaLigada.listaLigada;

public class LinkedList {


    private Element first;
    private Element last;
    private int size;


    public LinkedList() {
        this.size=0;
    }

    public LinkedList(Element first, Element last, int size) {
        super();
        this.first = first;
        this.last = last;
        this.size = size;
    }


    public Element getFirst() {
        return first;
    }


    public void setFirst(Element first) {
        this.first = first;
    }


    public Element getLast() {
        return last;
    }


    public void setLast(Element last) {
        this.last = last;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public Element getElement(int position) {
        Element actual = this.first;
        for(int i=0; i< position; i++) {
            if(actual.getNext() != null) {
                actual = actual.getNext();
            }
        }

        return actual;
    }

    public void add(String newValue) {
        Element newElement = new Element(newValue);
        if (this.first==null && this.last==null) {
            this.first= newElement;
            this.last=newElement;

        } else {
            this.last.setNext(newElement);
            this.last=newElement;
        }
        this.size++;


    }

    public void addBegin(String newValue) {
        Element newElement = new Element(newValue);
        if(this.first==null && this.last==null) {//caso da lista vazia
            this.first= newElement;
            this.last=newElement;
        } else {
            newElement.setNext(this.first);
            this.first=newElement;

    }
        this.size++;

    }

    public void remove(String SearchValue){
        Element previus = null;
        Element actual = this.first;
        for(int i=0; i < this.getSize(); i++){
            if (actual.getValue().equalsIgnoreCase(SearchValue)){
                if (this.size == 1){
                    this.first = null;
                    this.last = null;
                }else if (actual == first){
                    this.first = actual.getNext();
                    actual.setNext(null);
                }else if (actual == last){
                    this.last = previus;
                    previus.setNext(null);
                }else{
                    previus.setNext(actual.getNext());
                    actual = null;
                }
                this.size--;
                break;
            }
            previus=actual;
            actual=actual.getNext();

        }
    }

    public void printList(LinkedList list) {
        for(int i=0 ; i<list.getSize(); i++ ) {

            System.out.println(list.getElement(i).getValue());

        }
    }




    @Override
    public String toString() {
        return "\nLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

}