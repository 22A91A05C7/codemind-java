import java.util.*;
public class DiskCapacity
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int tk = obj.nextInt();
        int st = obj.nextInt();
        int blk = obj.nextInt();
        int sf = 2;
        int by = 512;
        System.out.print(tk*st*blk*sf*by);
    }
}