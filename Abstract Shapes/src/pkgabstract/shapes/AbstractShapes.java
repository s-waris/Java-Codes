package pkgabstract.shapes;
abstract class Shapes{
    double perimeter,area;
    Shapes(){
        perimeter=area=0;
    }
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shapes{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    public double perimeter(){
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    public double area(){
        area=Math.PI*radius*radius;
        return area;
    }
}

class Rectangle extends Shapes{
    double length, breadth;
    Rectangle(double l, double b){
        this.length=l;
        this.breadth=b;
    }
    public double perimeter(){
        perimeter = 2*length+breadth;
        return perimeter;
    }
    public double area(){
        area=length*breadth;
        return area;
    }
}

public class AbstractShapes {

    public static void main(String[] args) {
        Shapes s = new Circle(9);
        System.out.println("Perimeter ="+s.perimeter());
        System.out.println("Area = "+s.area());
        Shapes r = new Rectangle(5,10);
        System.out.println("Perimeter ="+r.perimeter());
        System.out.println("Area = "+r.area());
    }
}
