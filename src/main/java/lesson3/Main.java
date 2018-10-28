package lesson3;

public class Main {
    public static void main(String[] args) {
//        int i = 0;
//        for (; i < 10; ) {
//            System.out.println(i++);
//        }

        int a = 10;
        int b = 10;
        System.out.println("a=" + a--);
        System.out.println("b=" + (--b));
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int c = 1;
        //   c++;// c=c+1;
        // c += 2;// c=c+2;
        System.out.println("for");
        for (int i = 0; i < 2; i++) {
//            c *= 2;
//            System.out.println(c);
            System.out.println("Hello");
        }

        int j = 0;
        System.out.println("while");
        while (j < 2) {
            System.out.println("Hello");
            j++;
        }

        do {
            System.out.println("do while");
        } while (false);


    }

    public static void print(){

    }
}
