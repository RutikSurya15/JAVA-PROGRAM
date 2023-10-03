class Shape
{
    public void area()
    {
        System.out.println("Display Area");
    }

}
class Triangle extends Shape{
    public void area(int l,int h)
    {
        System.out.println(l*h);
    }
}
class Circle extends Triangle
{
    public void area(int r)
    {
        System.out.println(r*r);
    }
}
public class Oops {
    public static void main(String args[])
    {
       Circle s=new Circle();
        s.area();
        s.area(10,20);
        s.area(5);
    }
    
}
