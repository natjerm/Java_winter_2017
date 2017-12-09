package pl.waw.sgh.obj;

public class OperNaProstokatach {

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(24,3);
        System.out.println(p1.toString());
        //p1.ustawParam(24,3);
        System.out.println("Pole p1: " + p1.policzPole());

        Prostokat p2 = new Prostokat(3,6);
        //p2.ustawParam(3,6);
        System.out.println("Pole p2: " + p2.policzPole());

    }
}
