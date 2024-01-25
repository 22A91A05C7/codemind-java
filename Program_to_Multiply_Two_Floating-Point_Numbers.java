import java.util.Scanner;
public class ProgramToMultiplyTwoFloatingPointNumbers 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        sc.close();
        double p=a*b;
        System.out.format("%.2f",p);
    }
}