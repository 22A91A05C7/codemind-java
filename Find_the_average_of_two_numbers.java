import java.util.*;
public class AverageOfTwoNumbers
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        double avrg = (double)(m+n)/2;
        System.out.format("%.4f",avrg);
    }
}