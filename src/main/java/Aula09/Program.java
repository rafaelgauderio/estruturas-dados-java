package Aula09;

import java.util.Comparator;

public class Program {

    public static void main(String[] args) {


        Aluno [] vetorAlunos = new Aluno[10];

        Aluno aluno0 = new Aluno(1212,"Rafael De Luca",5.7);
        Aluno aluno1 = new Aluno(1213,"Juliana Souza",10.0);
        Aluno aluno2 = new Aluno(1214,"Claudia Silva",8.3);
        Aluno aluno3 = new Aluno(1215,"Paula da Silva",9.5);
        Aluno aluno4 = new Aluno(1216,"Zulmira Pereira",5.4);
        Aluno aluno5= new Aluno(1217,"Bruno Nunes",4.5);
        Aluno aluno6 = new Aluno(1218,"Laura Leite",6.3);
        Aluno aluno7 = new Aluno(1219,"João Lopes",9.2);
        Aluno aluno8 = new Aluno(1220,"Ana Paula",8.1);
        Aluno aluno9 = new Aluno(1221,"Mariana Clara",6.5);

        vetorAlunos[0]=aluno0;
        vetorAlunos[1]=aluno1;
        vetorAlunos[2]=aluno2;
        vetorAlunos[3]=aluno3;
        vetorAlunos[4]=aluno4;
        vetorAlunos[5]=aluno5;
        vetorAlunos[6]=aluno6;
        vetorAlunos[7]=aluno7;
        vetorAlunos[8]=aluno8;
        vetorAlunos[9]=aluno9;

        System.out.println("\nVetor Desordenado");
        for(int i=0; i< vetorAlunos.length ; i++) {
            System.out.println(vetorAlunos[i]);
        }

        QuickSort<Aluno> algoritmoQuickSort = new QuickSort<Aluno>();

        Comparator<Aluno> compararPorNota = (alunoX, alunoY) -> Double.compare(alunoX.getNota(),alunoY.getNota());
        algoritmoQuickSort.quickSort(vetorAlunos,compararPorNota);

        //notas em ordem de nota decrescente
        System.out.println("\nVetor Ordenado por Nota");
        for(int i=0; i<vetorAlunos.length ; i++) {
            System.out.println(vetorAlunos[i]);
        }

        Comparator<Aluno> compararPorNome = (alunoX, alunoY) -> String.CASE_INSENSITIVE_ORDER.compare(alunoX.getNome(),alunoY.getNome());
        algoritmoQuickSort.quickSort(vetorAlunos,compararPorNome);
        //nomes em ordem alfabética decrescente

        System.out.println("\nVetor Ordenado por Nome");
        for(Aluno apelido :vetorAlunos) {
            System.out.println(apelido);
        }


    }



}
