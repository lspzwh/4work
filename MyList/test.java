package MyList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        Mylist arry=new Mylist();
        arry.Arry(1);
        arry.add(1);
        arry.add(2);
        arry.add(3);
        arry.add(4);
        arry.add(5);
        arry.add(6);
        arry.add(7);
        arry.remove(3);
        System.out.println(arry.getSize());
        for (int i = 0; i < arry.getSize(); i++) {
            System.out.println(arry.get(i));
        }
        ArrayList arrayList=new ArrayList();
    }



}
