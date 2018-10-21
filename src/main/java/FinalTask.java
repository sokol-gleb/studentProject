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
//            if ((foo.charAt(0)!='1' || foo.charAt(0)!='2' || foo.charAt(0)!='3') && (foo.charAt(1)!='1' || foo.charAt(1)!='2' || foo.charAt(1)!='3') && (foo.charAt(2)!='1' || foo.charAt(2)!='2' || foo.charAt(2)!='3') && (foo.charAt(3)!='1' || foo.charAt(3)!='2' || foo.charAt(3)!='3') && (foo.charAt(4)!='1' || foo.charAt(4)!='2' || foo.charAt(4)!='3') && (foo.charAt(5)!='1' || foo.charAt(5)!='2' || foo.charAt(5)!='3') && (foo.charAt(6)!='1' || foo.charAt(6)!='2' || foo.charAt(6)!='3') && (foo.charAt(7)!='1' || foo.charAt(7)!='2' || foo.charAt(7)!='3')){
//                list2.add(i);
//            }
//            else{
//                list3.add(i);
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
//||