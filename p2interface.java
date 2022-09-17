import java.util.Scanner;
interface IScanner{
    int sub();
    int sum();
}
interface IPrinter{
    void GetData();
}
public class p2interface implements IScanner,IPrinter
{
    private int a,b;

    @Override
    public void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a=sc.nextInt();
        System.out.println("Enter the second value:");
        b= sc.nextInt();
    }

    @Override
    public int sum() {
        return a+b;
    }
    @Override
    public int sub() {
        return a-b;
    }
}