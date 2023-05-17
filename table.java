import java.util.Scanner;

public class table {
    public static void printTable(int n){
for(int i=1;i<=10;i++){

    int a = i*n;
    System.out.println(a);
}

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }
    
}
