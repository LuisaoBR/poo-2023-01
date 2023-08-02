package poo.com.github.circulo;

public class Ponto {
    private double x;
    private double y;
    public Ponto(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void move(double x1,double y1){
        this.x = x1;
        this.y = y1;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
