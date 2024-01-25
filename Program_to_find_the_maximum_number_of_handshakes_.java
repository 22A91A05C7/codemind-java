import java.util.*;
public class MaximumNumberOfHandshakes
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int count = 0;
            for(int i=1;i<=n;i++)
            {
              for(int j=i+1;j<=n;j++)
              {
               count++;
              }
            }
         System.out.println(count);
    }
}