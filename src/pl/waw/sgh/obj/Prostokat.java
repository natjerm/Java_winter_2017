package pl.waw.sgh.obj;

public class Prostokat {

    double parA;
    double parB;

    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public double policzPole() {
        return parA*parB;
    }
}
