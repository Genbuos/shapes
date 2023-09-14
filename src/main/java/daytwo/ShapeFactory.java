package daytwo;

public class ShapeFactory {
    public static void main(String[] args) {
//        Shape rectangle = new Shape("blue");
    Circle circle = new Circle("blue",40.0);
    double returnedvalueFrom = circle.calculateArea();

    Rectangle rectangle = new Rectangle("red", 20.0, 30.0);
    double returnedvalueFromRectangle = rectangle.calculateArea();

    Trapezoid daTrap = new Trapezoid("green", 30.0, 20.0, 15);
    double returnValueFromTrap = daTrap.calculateArea();

        System.out.println("this is the area of a Trapezoid: \n" + returnValueFromTrap);
        System.out.println("this is the area of a Circle: \n" + returnedvalueFrom);
        System.out.println("this is the area of a Rectangle: \n" + returnedvalueFromRectangle);


    }
}
