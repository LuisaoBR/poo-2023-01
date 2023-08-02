package poo.com.github.circulo;

public class Circulo {
    private double raio;
    private Ponto ponto;

    public Circulo(double raio,Ponto ponto){
        this.raio = raio;
        this.ponto = ponto;
    }
    public void move(double x1,double y1){
        ponto.move(x1,y1);
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", ponto=" + ponto +
                '}';
    }
}
