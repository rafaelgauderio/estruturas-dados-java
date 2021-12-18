package Aula11_ListaDuplamenteLigada;

public class ListaDupla { //Lista duplamente encadeada

    private No inicio; //Ponteiro para o primeiro nó da lista
    private No fim; //Ponteiro para o último nó da lista
    private int tamanho; //quantidade de elementos da lista duplamente encadeada

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /*operacoes: inserir e retirar no inicio, inserir e retirar no meio, inserir e retirar no fim
     */



    public void inserirInicio(String informacao) {

        No no = new No();
        no.setInformacao(informacao);
        no.setAnterior(null);
        no.setProximo(this.inicio);
        this.setInicio(no);
        if(this.inicio!=null) {
            this.inicio.setAnterior(no);
        }
        this.inicio=no;

        if(this.tamanho==0) {
            this.setFim(inicio);
        }
        tamanho++;

    }

    public String removerInicio( ) {

        if (inicio == null) {
            return null;
        }
        String out = inicio.getInformacao();
        inicio=inicio.getProximo();
        if(inicio != null) {
            inicio.setAnterior(null);
        } else {
            this.setFim(null);
        }
        tamanho--;
        return out;

    }

    public void inserirFim(String informacao) {

        No no = new No();
        no.setInformacao(informacao);;
        no.setProximo(null);
        no.setAnterior(fim);
        if(this.fim != null) {
            this.fim.setProximo(no);
        }
        this.setFim(no);
        if(tamanho==0) {
            this.inicio=this.fim;
        }
        tamanho++;
    }

    public String removerFim() {
        if(this.fim==null) {
            return null;
        }
        String out = fim.getInformacao();
        this.fim=fim.getAnterior();
        if(this.fim!=null) {
            this.fim.setProximo(null);
        }else {
            this.inicio=null;
        }
        tamanho--;
        return out;

    }

    public void inserirMeio(int indice, String informacao) {

        if(indice <=0) {
            inserirInicio(informacao);
        } else if(indice >= tamanho) {
            inserirFim(informacao);
        } else {
          No aux = inicio;
          for(int i=0; i<indice-1; i++) {
              aux=aux.getProximo();
          }
          No novoNo = new No();
          novoNo.setInformacao(informacao);
          novoNo.setAnterior(aux);
          novoNo.setProximo(aux.getProximo());

          aux.setProximo(novoNo);
          novoNo.getProximo().setAnterior(novoNo);
          tamanho++;
        }

    }

    public String removerMeio(int indice) {
        if(indice<0 || indice >=tamanho || inicio==null) {
            return null;
        } else if (indice ==0) {
            return removerInicio();
        } else if (indice == tamanho-1) {
            return removerFim();
        }
        No local = this.inicio;
        for(int i=0 ; i<indice; i++) {
            local = local.getProximo();
        }
        if(local.getAnterior() != null) {
            local.getAnterior().setProximo(local.getProximo());
            //local.anterior.proximo = local.proximo;
        }
        if(local.getProximo() != null) {
            local.getProximo().setAnterior(local.getAnterior());
        }
        tamanho--;
        return local.getInformacao();

    }
    /*
    @Override
    public String toString() {
        return "ListaDupla{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", tamanho=" + tamanho +
                '}';
    }
    */


    public String toString() {
        String str = "[" + tamanho + "] " ;
        No aux = inicio;
        while(aux != null) {
            str += aux.getInformacao() + " ";
            aux = aux.getProximo();
        }
        return str;
    }





}
