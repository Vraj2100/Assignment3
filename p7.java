interface A{
    public void Details();
    default void Address(){
        System.out.println("Address:-\n 422-Omkar Residency,\nVADODARA");
    }
}
public class p7 implements A
{
    @Override
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name:Parmar Vraj V");
        System.out.println("ID NO.: 21CE088");
        System.out.println("College: CSPIT");
        System.out.println("Branch: Computer Engineering");
        System.out.println("Current sem: 3");
    }

    public static void main(String[] args) {
        p7 p =new p7();
        p.Details();
        p.Address();
    }
}
