package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Witam!!!");

        int a = 5;
        Integer aa = 10;

        Double d;
        d = 5d;

        d = d + a + aa;
        //a = d + a;
        System.out.println("d=" + d);

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1.concat(s2);

        System.out.println(s3);

        boolean b = false;
        boolean c = true;

        // AND   &&
        // OR    ||
        // XOR   ^
        boolean r = b && c;

        int j = 8;
        {
            int i = 6;
            System.out.println(i);
            System.out.println(j);
        }
        //System.out.println(i);
        System.out.println(j);

        if (r) {
            System.out.println("r jest prawda");
        } else
            System.out.println("r jest fałszem");

        String s = "ACERRR";

        switch (s) {
            case "AC" :
                System.out.println("AC");
                break;
            case "AB" :
                System.out.println("AB");
            case "EF" :
                System.out.println("EF");
                break;
            default:
                System.out.println("def");
        }
        int jj = 3;
        //       Warunek ? PRAWDA ? Fałsz
        int ii = jj>=4 ? 10 : 20;
        System.out.println(ii);

        String ss1 = "abc";
        String ss2 = "abc";
        //String ss2 = new String("abc");

        //if (ss1==ss2) {
        if (ss1.equals(ss2)) {
            System.out.println("ss1 jest taki sam jak ss2");
        } else {
            System.out.println("ss1 i ss2 różne");
        }
        if (jj==ii) {
            System.out.println("ii i jj równe");
        }

        String ss = "abcddfrgr";

        System.out.println(ss.length());
        System.out.println(ss.charAt(2));
        System.out.println(ss.indexOf("f"));

        System.out.println(ss.indexOf("r"));

        System.out.println(ss.substring(2,5));




    }
}
