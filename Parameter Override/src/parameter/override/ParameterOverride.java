package parameter.override;

class Rectangle {
    int length;
    int breadth;
    
    Rectangle(int l,int b) {
    this.length = l;
    this.breadth = b;
    }
    void perimeter(){
        System.out.println("Perimeter = "+2*(length+breadth));
    }
    void area(){
        System.out.println("Area = "+length*breadth);
    }
}

class Cuboid extends Rectangle {
    int height;
    
    Cuboid (int l, int b, int h){
        super (l,b);
        height = h;
    }
    void perimeter (){
        System.out.println("The Perimeter is : "+4*(length+breadth+height));
    }
    void area (){
        System.out.println("The Area is : "+2*(length*breadth+breadth*height+length*height));
    }
    void volume(){
        System.out.println("The Volume is : "+length*breadth*height);
    }
}

public class ParameterOverride {

    public static void main(String[] args) {
        Cuboid cube = new Cuboid(5,5,5);
        cube.perimeter();
        cube.area();
        cube.volume();
        Rectangle rec = new Rectangle(4,5);
        rec.perimeter();
        rec.area();
        Rectangle rc = new Cuboid (4,5,5);
        rc.perimeter();
        rc.area();
    }
}
