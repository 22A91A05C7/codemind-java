import java.util.Scanner;
 public class AreaOfTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        sc.close();
        double s=(a+b+c)/2;
        double p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f", p);
    }

}