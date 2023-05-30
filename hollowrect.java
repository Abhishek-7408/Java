import java.util.Scanner;

public class hollowrect {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
