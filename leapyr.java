import java.util.Scanner;
public class leapyr {
    public static void main(String[] args) {
        int y;
    System.out.println("Enter Year: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("Leap year "+y);
        }
        else
        {
            System.out.println("Not a Leap Year "+y);
        }
    }
    }

   
