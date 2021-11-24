package Aula09;

public class Aluno {

    private int codigo;
    private String nome;
    private double nota;

    public Aluno() {

    }

    public Aluno(int codigo, String nome, double nota) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
