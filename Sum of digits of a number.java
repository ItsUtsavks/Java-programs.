import java.util.*;
class sum_of_digits_of_a_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to calculate sum of its digits:");
        int n=sc.nextInt();
        int rem,d; 
        int sum=0;
        for(d=n;d>0;d=d/10)
        {
            rem=d%10;
            sum=sum+rem;
        }
        System.out.println("sum:"+sum);
    }
}
