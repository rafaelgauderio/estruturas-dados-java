package Aula06_arquivos;

import java.io.File;

public class Principal {

    public static void main(String [] args) {


        Fracao fracao = new Fracao(4,20);
        Fracao fracao2 = new Fracao(7,12);

        System.out.println("--FRAÇÃO--");
        System.out.println("Fracao1\nNumerador: " + fracao.getNumerador());
        System.out.println("Denominador: " + fracao.getDenominador());
        System.out.println("Valor real da fracao: "+String.format("%.4f",fracao.getValorReal()));
        System.out.println("Multiplicando as frações: "+ fracao.multiplica(fracao,fracao2));

        System.out.println("\nFracao2\nNumerador: " + fracao2.getNumerador());
        System.out.println("Denominador: " + fracao2.getDenominador());
        System.out.println("Valor real da fracao: "+String.format("%.4f",fracao2.getValorReal()));
        System.out.println("Valor real da multiplicacao das frações: "+ String.format("%.4f",fracao.multiplica(fracao,fracao2).getValorReal()));

        Fracao fracao3 = fracao.multiplica(fracao,fracao2);

        System.out.println("\nFracao3\nNumerador: " + fracao3.getNumerador());
        System.out.println("Denominador: " + fracao3.getDenominador());
        System.out.println("Valor real da fracao: "+String.format("%.4f",fracao3.getValorReal()));


        System.out.println("\n--PONTO--");

        Ponto ponto = new Ponto(4,7);
        Ponto ponto1 = new Ponto();
        ponto1.setX(6);
        ponto1.setY(13);


        System.out.println(ponto);
        System.out.println(ponto1);
        System.out.println("Distancia entre os pontos: "+ String.format("%.2f",ponto.distancia(ponto1)));
        //ponto.soma(ponto1);
        //System.out.println("Somando as coordenadas entre os pontos. X: " + ponto.getX() + ", Y: " + ponto.getY());



        //SaLvando o valor real em uma fração em arquivo
        ManipuladorDeArquivos mp = new ManipuladorDeArquivos();
        File arquivo = mp.inicializa();
        //convertendo o double para String e escrevendo no arquivo
        String numEden = "Numerador: " +String.valueOf(fracao3.getNumerador()) + ", Denominador: " +String.valueOf(fracao3.getDenominador());;
        String valorReal = "\nValor real da fração " + String.format("%.4f",fracao3.getValorReal());
        mp.escreve(arquivo,numEden+valorReal,true);


        //Salvando o ponto no arquivo
        arquivo = mp.inicializa();
        String texto1 = String.valueOf("Coordenada X: " +ponto.getX()+ ", Coordenada Y: "+ponto.getY()+", distância : " + String.format("%.2f",ponto.distancia(ponto1)));
        String texto2 = String.valueOf("Coordenada X: " +ponto1.getX()+ ", Coordenada Y: "+ponto1.getY()+", distância : " + String.format("%.2f",ponto1.distancia(ponto)));
        ponto.soma(ponto1);
        String soma = String.valueOf("Somando os 2 pontos: Coordenada X: " +ponto.getX()+ ", Coordenada Y: "+ponto.getY());
        mp.escreve(arquivo,texto1+"\n"+texto2+"\n"+soma,false);

        System.out.println("\n--Lendo a partir do arquivo--");
        mp.leia(arquivo);

    }


}
