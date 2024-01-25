import java.util.Scanner;
 public class  AddingTwoNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int p=a+b;
        System.out.println(p);
    }
}
