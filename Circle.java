public class Circle extends GeometricObject
{
    private double r;
    Circle(){}
    Circle(double r)
    {
        this.r=r;
    }
    Circle(double r , String color , boolean filled)
    {
        super(color , filled);
        this.r=r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getD()
    {
        return r*2;
    }
    public double getArea()
    {
        return 3.14*r*r;
    }
    public double getPerimeter()
    {
        return 2*3.14*r;
    }

}
