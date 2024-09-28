package Percentage_Calculator;

// Marks should be out of 100.
import java.util.Scanner;
public class code {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int t_sub=sc.nextInt();
        System.out.print("Enter total marks: ");
        float marks=sc.nextFloat();
        float percentage=marks/t_sub;
        System.out.print("Your Percentage: "+percentage);
        System.out.print("Enter 1 to know your CGPA or 0 to exit: ");
        int a=sc.nextInt();
        if(a==1){
            double cgpa=percentage/9.5;
            System.out.print("Your CGPA: "+cgpa);
        }
        else if(a==0){ 
            System.out.print("Thank you!");
        }
        else{
            System.out.print("INVALID INPUT");
        }

    }
    
}
