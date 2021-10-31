package Aula06_arquivos;

import java.io.File;

public class PrincipalTADs {

    public static void main(String[] args) {

        //Usando o método leiaFracao
        ManipuladorDeArquivos mp = new ManipuladorDeArquivos();
        File arquivo = mp.inicializa();
        System.out.println("Método leia");
        mp.leia(arquivo);
        System.out.println("\nMétodo leiaFracao");
        mp.leiaFracao(arquivo);
        System.out.println("\nMétodo LeiaPonto");
        mp.leiaPonto(arquivo);



    }
}
