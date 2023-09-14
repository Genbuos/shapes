package daytwo;

public class Rectangle extends Shape{

    public double width;
    public Rectangle(String color, double side, double width) {
        super(color);
        this.width = width;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        // having this sout is annoying becasue when you invoke and store inside a double variable the
        // sout prints
        //even if you are not printing it out in main but as long as you call the method the sout will print

//        System.out.println("the area of a rectangle: ");
        return this.side * this.width;
    }
}
