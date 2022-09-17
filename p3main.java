public class p3main
{
    public static void main(String[] args) {
        P3interface p3 = new P3interface();
        System.out.println("a="+p3.a);
        System.out.println("a1="+p3.a1);
        System.out.println("a2="+p3.a2);
        System.out.println("a3="+p3.a3);
        p3.get();
        System.out.println("Divide="+p3.divide());
        System.out.println("Multiply="+p3.multiply());
        System.out.println("Addition="+p3.sum());
        System.out.println("Subtraction="+p3.subt());
    }
}
