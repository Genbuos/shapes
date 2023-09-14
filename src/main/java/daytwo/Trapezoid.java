package daytwo;

public class Trapezoid extends Shape{
    public double base;
    public double height;

    public Trapezoid(String color, double base, double height, double side) {
        super(color);
        this.base = base;
        this.height = height;
        this.side = side;

    }

    @Override
    public double calculateArea() {
        // having this sout is annoying becasue when you invoke and store inside a double variable the
        // sout prints
        //even if you are not printing it out in main but as long as you call the method the sout will print

//        System.out.println("this is the area of a Trapezoid: ");
        return 0.5 * (this.side + this.base) * this.height;
    }
}
