package ctripTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class main {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("key","asd");
        HashMap<String,String> h = new HashMap<>();
        h.put("key","hekki");
        System.out.println(hm.get("key"));

        HashMap<String, Tb> hh = new HashMap<>();
        hh.put("key",new Tb("ppp"));
        HashMap<String, Tb> hhh = new HashMap<>();
        Tb newtb = new Tb("fuck");
        hhh.put("key", newtb);
        System.out.println(hh.get("key").name);

        List<Tb> listTb = new ArrayList<>();
        listTb.add(new Tb("ybb"));
        List<Tb> ll = new ArrayList<>(listTb);
        System.out.println(ll.get(0).name);
        Tb a = ll.get(0);
        a.name = "yyy";
        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println(ll.get(0).name);
        System.out.println(listTb.get(0).name);
    }
}


class Tb {
    public String name;
    public Tb(String name){
        this.name = name;
    }
}