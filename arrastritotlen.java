import java.util.Scanner;

public class arrastritotlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[]= new String[size];
        int totallength = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.next();
            totallength+=arr[i].length();
        }
        System.out.println(totallength);
    }
    
}
