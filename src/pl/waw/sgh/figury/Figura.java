package pl.waw.sgh.figury;

public class Figura {

    protected double parA;
    protected double parB;

    public Figura(double parA, double parB) {
        ustawParam(parA, parB);
    }

    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Figura o parametrach A=" + parA +
                " i B=" + parB;
    }
}
