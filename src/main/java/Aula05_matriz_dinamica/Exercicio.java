package Aula05_matriz_dinamica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public static void main(String [] args) {
        int i=0,j=0,k=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da uma matriz quadrada: ");
        int tamanho = Integer.parseInt(sc.nextLine());
        //int tamanho =3;
        int [][] matriz = new int[tamanho][tamanho];

        System.out.println("\nMatriz quadrada de inteiros");
        //preenchendo e imprimindo a matriz
        for (i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[i].length; j++) {
                matriz[i][j]=k;
                k++;
                System.out.printf("["+ String.format("%02d",matriz[i][j])+"]");
            }
            System.out.println();

        }

        String matrizStrings [] [] = new String[][]{
                {"Rafael","Joao","Maria"},
                {"Claudia","Larissa","Julia"},
                {"Amanda","Rafael","Flavia"}
        };

        System.out.println("\n--Matriz de Strings--");
        //imprimindo a matris de strings
        for (i=0; i<matrizStrings.length; i++) {
            for(j=0; j<matrizStrings[i].length; j++) {

                System.out.printf("["+ matrizStrings[i][j]+"]");
            }
            System.out.println();

        }

        Exercicio exercicio = new Exercicio();

        System.out.println("\n--Método de busca de string--");
        exercicio.buscarString(matrizStrings,"Rafael");
        exercicio.buscarString(matrizStrings,"Felipe");
        exercicio.buscarString(matrizStrings,"Figueroa");
        exercicio.buscarString(matrizStrings,"Joao");
        exercicio.buscarString(matrizStrings,"Flavia");

    }

    public void buscarString(String [] [] ondeProcurar,String oqueProcurar) {
        int i = 0, j = 0;
        boolean iguais = false;
        for (i = 0; i < ondeProcurar.length; i++) {
            for (j = 0; j < ondeProcurar[i].length; j++) {

                if (ondeProcurar[i][j].equalsIgnoreCase(oqueProcurar)==true) {
                    System.out.println("Foi encontrado o texto: " + oqueProcurar + ", na posicao linha: "+ (i+1)+ " e coluna: "
                            +(j+1));
                    iguais=true;
                }
            }
        }
           if (iguais==false){
            System.out.println("O texto: " + oqueProcurar + " NÃO foi encontado.");

        }

    }


}
