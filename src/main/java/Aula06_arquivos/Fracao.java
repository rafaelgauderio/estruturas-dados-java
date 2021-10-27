package Aula06_arquivos;

public class Fracao {


    //TADs - Tipos abstratos de dados
    // Metodologia de programação que reduz a informação necessária para a programação de um algoritmo
    // conceito se baseia na abstração de variáveis envolvidas em uma única classe fechada que possui métodos e atributos
    // vem para suprir a insuficiência apenas nos tipos de dados suportados pela propria linguagem de programação.
    // TADs = TIPOS DE DADOS + FUNÇÕES RELACIONADAS (funções de manipulações de suas estruturas)

    private int numerador;
    private int denominador;

    public Fracao() {

    }

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getValorReal() {

        return Double.valueOf(numerador) /Double.valueOf(denominador);

    }

    public Fracao multiplica(Fracao f1, Fracao f2) {

        return new Fracao(
                f1.getNumerador() *f2.getNumerador(),
                f1.getDenominador()*f2.getDenominador());


    }




    @Override
    public String toString() {
        return "Fracao{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

}
