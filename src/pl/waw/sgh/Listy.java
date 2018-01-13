package pl.waw.sgh;

import java.util.*;

public class Listy {

    public static void main(String[] args) {
        List<Integer> listaInt = new ArrayList<>();

        listaInt.add(3);
        listaInt.add(55);
        listaInt.add(46547);
        listaInt.add(3);
        //listaInt.add("sgsg");

        for (int i=0;i<listaInt.size();i++) {
            System.out.println("Elem " + i + " = " + listaInt.get(i));
        }

        Set<String> strSet = new HashSet<>();
        strSet.add("abc");
        strSet.add("bcd");
        strSet.add("def");
        strSet.add("abc");

        for (String str : strSet) {
            System.out.println(str);
        }

        Map<String, String> mapa = new HashMap<>();
        mapa.put("abc", "test");
        mapa.put("def", "etestq");
        mapa.put("ghi", "wtgwrgywer");

        for (String key : mapa.keySet()) {
            System.out.println(key + " = " + mapa.get(key));
        }


    }
}
