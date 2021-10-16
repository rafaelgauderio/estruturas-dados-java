package Aula01;

public class Cachorro {
    private String nome;
    private int idade;
    private String latido="Auau";

    public Cachorro() {

    }

    public Cachorro(String nome, int idade, String latido) {
        nome=this.nome;
        idade=this.idade;
        latido=this.latido;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getLatido() {
        return latido;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void latir() {

        System.out.println(this.latido);

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", latido='" + latido + '\'' +
                '}';
    }



}
