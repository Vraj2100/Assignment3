import java.util.Scanner;
interface p{
    public final int a=10;
    int multiply();
}
interface p1 extends p{
public final int a1=100;
int sum();
}
interface p2 extends p{
    public final int a2=30;
    int subt();
}
interface p12 extends p1,p2{
    public final int a3=20;
    int divide();
}
public class P3interface implements p12
{
    private int p,q;
    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        p=sc.nextInt();
        System.out.println("Enter the second value:");
        q=sc.nextInt();
    }
    @Override
    public int divide() {
        return p/q;
    }
    @Override
    public int sum() {
        return p+q;
    }
    @Override
    public int subt() {
        return p-q;
    }
    @Override
    public int multiply() {
        return p*q;
    }
}
