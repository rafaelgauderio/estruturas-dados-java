package Aula11_ListaDuplamenteLigada;

public class Program {

    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        System.out.println(ld);

        System.out.println("Inserindo no inicio");
        for(int i=0 ; i<8; i++) {
            ld.inserirInicio("" +(char)(i +97));
            System.out.println(ld);
        }


        System.out.println("Inserindo no meio");
        ld.inserirMeio(4,"rafael");
        System.out.println(ld);

        System.out.println("Removendo item: " +ld.removerMeio(4));
        System.out.println(ld);



        System.out.println("Removendo itens do inicio");
        while ((ld.removerInicio()!=null)) {
            System.out.println(ld);
        }

        System.out.println("\nInserindo no Fim");
        System.out.println(ld);
        for(int i=0 ; i<5; i++) {
            ld.inserirFim("" +(char)(i +97));
            System.out.println(ld);
        }
        System.out.println("Inserindo no meio");
        ld.inserirMeio(4,"rafael");
        ld.inserirMeio(3,"Juliana");
        System.out.println(ld);

        System.out.println("Removendo item: " +ld.removerMeio(3));
        System.out.println("Removendo item: " +ld.removerMeio(5));
        System.out.println(ld);




        System.out.println("Removendo itens do Fim");
        while ((ld.removerFim()!=null)) {
            System.out.println(ld);
        }



    }
}
