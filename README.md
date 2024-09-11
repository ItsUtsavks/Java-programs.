import java.util.*;
class rail
{
    String name; String coach;
    long mobno;
    int amt=100,totalment=0;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter Coach type:(First_AC/Second_Ac/Third_AC/sleeper)");
        coach=sc.nextLine();
        System.out.println("Enter mobile number:");
        mobno=sc.nextLong();
        
    }
    void update()
    {
        if(coach.equals("First_AC")==true)
        amt=amt+700;
        else if(coach.equals("Second_AC")==true)
        amt=amt+500;
        else if(coach.equals("Third_AC")==true)
        amt=amt+250;
        else if(coach.equals("Sleeper")==true)
        amt=amt;
        
        totalment=totalment+amt;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Mobile number:"+mobno);
        System.out.println("Coach type:"+coach);
        System.out.println("Total amount to be paid:"+totalment);
    }
    public static void main()
    {
        rail obj= new rail();
        obj.accept();
        obj.update();
        obj.display();
    }
}
