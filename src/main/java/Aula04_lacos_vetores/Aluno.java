package Aula04_lacos_vetores;

public class Aluno {

    private String nome;
    private String curso;
    private long matricula;
    private char sexo;
    private int idade;

    public Aluno() {

    }

    public Aluno(String nome, String curso, long matricula, char sexo, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", matrícula=" + matricula +
                ", sexo=" + sexo +
                ", idade=" + idade +
                "}";
    }
}
