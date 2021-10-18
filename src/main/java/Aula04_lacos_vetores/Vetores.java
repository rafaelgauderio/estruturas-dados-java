package Aula04_lacos_vetores;

import Aula03_github.Aluno;

public class Vetores {

    public static void main(String [] args) {

        Aluno[] alunos = new Aluno[5];


        //instancionado um vetor de 5 alunos
        for(int i=0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
        }

        alunos[0].setNome("Juliana da Silva");
        alunos[0].setCurso("Engenharia Elétrica");
        alunos[0].setMatricula(156984);
        alunos[0].setSexo('F');
        alunos[0].setIdade(26);


        alunos[1].setNome("Marília leite");
        alunos[1].setCurso("Engenharia Civil");
        alunos[1].setMatricula(125698);
        alunos[1].setSexo('F');
        alunos[1].setIdade(20);

        alunos[2].setNome("João de Souza");
        alunos[2].setCurso("Música");
        alunos[2].setMatricula(206954);
        alunos[2].setSexo('M');
        alunos[2].setIdade(32);

        alunos[3].setNome("Luciana Riquelme");
        alunos[3].setCurso("Matemática");
        alunos[3].setMatricula(5968475);
        alunos[3].setSexo('M');
        alunos[3].setIdade(22);

        alunos[4].setNome("Claudia Silva");
        alunos[4].setCurso("Logística");
        alunos[4].setMatricula(152069);
        alunos[4].setSexo('F');
        alunos[4].setIdade(19);


        for(int i=0; i< alunos.length ; i++) {
            System.out.println(alunos[i]);
            if (alunos[i].getIdade()>=21) {
                System.out.println("Aluno MAIOR de 21 anos. Já pode ser monitor de disciplinas.\n");
            }
            else {
                System.out.println("Aluno MENOR de 21 anos. Não pode trabalhar como monitor.\n");
            }
        }


    }

}
