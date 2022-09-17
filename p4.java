public class p4
{
    void sample1(int p,int q){
        System.out.println("In parent class Method");
        System.out.println("p+q="+(p+q));
    }
}
class child extends p4{
    void sample1(int p,int q){
        System.out.println("In child class method");
        System.out.println("p-q="+(p-q));
    }
}
