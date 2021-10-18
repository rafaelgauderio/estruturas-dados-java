package Aula03_github;

public class ProgramAluno {

    public static void main(String [] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Juliana da Silva");
        aluno1.setCurso("Engenharia Elétrica");
        aluno1.setMatricula(15497);
        aluno1.setSexo('F');
        aluno1.setIdade(26);

        aluno2.setNome("Carlos Souza");
        aluno2.setCurso("Matemática");
        aluno2.setMatricula(37497);
        aluno2.setSexo('M');
        aluno2.setIdade(18);

        System.out.println(aluno1);
        System.out.println(aluno2);





    }




}
