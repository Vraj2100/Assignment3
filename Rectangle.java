public class Rectangle extends GeometricObject
{
    double h;
    double w;
    Rectangle() {}
    Rectangle(double h ,double w) {
        this.h = h;
        this.w = w;
    }
    Rectangle(double h ,double w , String color , boolean filled )
    {
        super(color , filled);
        this.h=h;
        this.w=w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getArea()
    {
        return w*h;
    }
    public double getPerimeter()
    {
        return 2*(w+h);
    }
}
