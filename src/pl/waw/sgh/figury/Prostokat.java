package pl.waw.sgh.figury;

public class Prostokat extends Figura {
    public Prostokat(double parA, double parB) {
        super(parA, parB);
    }

    public double policzPole() {
        return parA*parB;
    }
}
