import java.util.Scanner;
import java.util.*;
public class TemperatureConversion
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        double c = obj.nextDouble();
        double f = 32+(c*9/5);
        System.out.format("%.2f", f);
    }
}