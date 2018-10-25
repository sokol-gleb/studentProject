package homework1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        int i = 10;
        list1.add(i);
        int j = 20;
        list1.add(j);
        System.out.println(list1);
        int k = 30;
        int l = 10;
        list2.add(k);
        list2.add(l);
        System.out.println(list2);



        for (int m=0; m<list1.size(); m++){
            int check = (int) list1.get(m);
            boolean contains = list2.contains(check);
            if (contains==true){
                list3.add(check);
            }
        }
        System.out.println(list3);
        
    }
}
