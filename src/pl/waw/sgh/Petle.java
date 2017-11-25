package pl.waw.sgh;

public class Petle {

    public static void main(String[] args) {

        int c = 0;
        int j = 0;
        //j = ++c;
        //j = c++;
        c--;
        j += c; // j = j + c

        for (int i=0;i<5;i++) {
            //if (i==3) continue;
            if (i==2)  break;
            System.out.println("i=" +i);
        }

        c = 6;
        while (c>0) {
            System.out.println("c=" +c);
            c--;
        }
        c = 0;
        do {
            System.out.println("cc = " + c);
            c++;
        } while (c>10);

    }
}
