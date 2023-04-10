import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        float scored;
        float total;
        float percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("total Marks Obtained in exam:");
        scored=sc.nextFloat();
         System.out.println("total");
         total=sc.nextFloat();
         percentage=(float)((scored/total)*100);
         System.out.println("Percentage is : "+percentage+ "%");
         
       
              
              
    }
}