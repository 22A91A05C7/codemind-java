import java.util.Scanner;
 public class AreaOfCircle
{
    public static void main(String args[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        double area=r*r*(3.14);
        System.out.format("%.2f",area);
    }
}