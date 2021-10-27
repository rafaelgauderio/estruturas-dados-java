package Aula06_arquivos;

public class Ponto {

    private int x;
    private int y;

    public Ponto () {

    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Ponto p) {

        double dx = p.getX() -x;
        double dy = p.getY() -y;
        return (double) Math.sqrt(dx*dx + dy*dy);
    }

    public void soma(Ponto p) {

        x = x + p.getX();
        y = y + p.getY();

    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


        }
