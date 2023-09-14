package daytwo;

public class Circle extends Shape{

//    public double radius;

    public Circle(String color, double side) {
        super(color);
        this.side = side;
    }




    @Override
    public double calculateArea() {
        // having this sout is annoying becasue when you invoke and store inside a double variable the
        // sout prints
        //even if you are not printing it out in main but as long as you call the method the sout will print

//        System.out.println("this is the area of the circle: ");
        return Math.PI * this.side * this.side;
    }
}
