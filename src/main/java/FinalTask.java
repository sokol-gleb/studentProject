import java.util.ArrayList;
import java.util.List;

public class FinalTask {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        List finalList = new ArrayList();
        int num = 99999999;
        for (int i=10000000; i<num; i++){
            if (i%18==0){
                list1.add(i);
            }
            String foo = String.valueOf(i);
            for (int m=0; m<9; m++){
                if (foo.charAt(m)!='1' || foo.charAt(m)!='2' || foo.charAt(m)!='3'){
                    list2.add(i);
                }
                else{
                    list3.add(i);
                }
            }
        }


        for (int j=0; j<(list3.size()+1); j++){
            int check = (int) list1.get(j);
            boolean contains = list3.contains(check);
            if (contains==true){
                finalList.add(check);
            }

        }
        System.out.println(finalList);
    }
}