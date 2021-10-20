package Aula04_lacos_vetores;

import Aula03_github.Aluno;

import java.util.List;

public class ArrayList {

    public static void main(String [] args) {

        //Armazenando em uma lista
        List<Aula03_github.Aluno> listaAlunos = new java.util.ArrayList<Aula03_github.Aluno>(5);


        Aula03_github.Aluno alun1 = new Aula03_github.Aluno();
        alun1.setNome("Juliana da Silva");
        alun1.setCurso("Engenharia Elétrica");
        alun1.setMatricula(156984);
        alun1.setSexo('F');
        alun1.setIdade(26);
        listaAlunos.add(alun1);

        Aula03_github.Aluno alun2 = new Aula03_github.Aluno();
        alun2.setNome("Marília leite");
        alun2.setCurso("Engenharia Civil");
        alun2.setMatricula(125698);
        alun2.setSexo('F');
        alun2.setIdade(20);
        listaAlunos.add(alun2);

        Aula03_github.Aluno alun3 = new Aula03_github.Aluno();
        alun3.setNome("João de Souza");
        alun3.setCurso("Música");
        alun3.setMatricula(206954);
        alun3.setSexo('M');
        alun3.setIdade(32);
        listaAlunos.add(alun3);

        Aula03_github.Aluno alun4 = new Aula03_github.Aluno();
        alun4.setNome("Luciana Riquelme");
        alun4.setCurso("Matemática");
        alun4.setMatricula(5968475);
        alun4.setSexo('M');
        alun4.setIdade(22);
        listaAlunos.add(alun4);

        Aula03_github.Aluno alun5 = new Aluno();
        alun5.setNome("Claudia Silva");
        alun5.setCurso("Logística");
        alun5.setMatricula(152069);
        alun5.setSexo('F');
        alun5.setIdade(19);
        listaAlunos.add(alun5);

        //imprimindo a lista
        for(int i=0 ; i < listaAlunos.size(); i++) {
            System.out.println(listaAlunos.get(i));
        }

    }
}
