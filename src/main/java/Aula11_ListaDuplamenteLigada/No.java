package Aula11_ListaDuplamenteLigada;

public class No { // Nó da lista duplamente encadeada

    private String informacao; //informação a ser amarzenada
    private No proximo; //Ponteiro para o proximo nó
    private No anterior; // Ponteiro para o nó anterior

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}


