import java.util.Vector;
public class Ass2
{
    public static void main(String[] args) {
        Vector<p2interface> v = new Vector<p2interface>(2);
        for (int i = 0; i < 2; i++) {
            p2interface p1 = new p2interface();
            v.add(p1);
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.println(" answer for Index = "+ i+1);
            v.get(i).GetData();
            System.out.println("Sum = " + v.get(i).sum());
            System.out.println("Sub = " + v.get(i).sub());
        }
    }
}
