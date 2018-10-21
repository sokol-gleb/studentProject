import java.util.Scanner;

public class Task3Again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter apartment number: ");
        int ap = scanner.nextInt();

        if (ap>0 && ap<145){
            int ent = ap/36 + (ap%36==0? 0 : 1);
            int floor;
            floor = getFloor(ap, ent);
            System.out.println("Apartment: "+ap);
            System.out.println("Entrance: "+ ent);
            System.out.println("Floor: "+ floor);
        }
        else{
            System.out.println("Apartment doesn't exist");
        }

    }

    private static int getFloor(int ap, int ent) {
        int floor;
        if (ent==1){
            floor = ap/4 + (ap%4==0? 0:1);
        }
        else if (ent==2){
            floor = ap/4 - 9 + (ap%4==0? 0:1);
        }
        else if (ent==3){
            floor = ap/4 - 18 + (ap%4==0? 0:1);
        }
        else{
            floor = ap/4 - 27 + (ap%4==0? 0:1);
        }
        return floor;
    }
}
