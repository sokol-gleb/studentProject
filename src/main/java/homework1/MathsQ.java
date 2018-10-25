package homework1;

public class MathsQ {

    public static void main(String[] args) {
        int max = 33_333_333;
        int min = 11_111_111;
        int n = max - min;
        int count=0;

        for (int i = 0, k = min; i < n; i++, k++) {
            if (consist(k) && k % 18 == 0) {
                count++;
                System.out.println(k);
            }
        }
        System.out.println("count: "+ count);
    }

    private static boolean consist(int k) {
        int[] arr = new int[8];
        arr[0]=k/10_000_000;
        arr[1]=k/1_000_000-(arr[0]*10);
        arr[2]=k/100_000-(arr[0]*100+arr[1]*10);
        arr[3]=k/10_000-(arr[0]*1_000+arr[1]*100+arr[2]*10);
        arr[4]=k/1_000-(arr[0]*10_000+arr[1]*1_000+arr[2]*100+arr[3]*10);
        arr[5]=k/100-(arr[0]*100_000+arr[1]*10_000+arr[2]*1_000+arr[3]*100+arr[4]*10);
        arr[6]=k/10-(arr[0]*1_000_000+arr[1]*100_000+arr[2]*10_000+arr[3]*1_000+arr[4]*100+arr[5]*10);
        arr[7]=k%10;

        return check(arr);
    }

    private static boolean check(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if(!(arr[i]==1||arr[i]==2||arr[i]==3)){
                return false;
            }
        }
        return true;
    }
}
