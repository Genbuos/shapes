package daytwo;
//Class - a blueprint
public abstract class Shape {
    //State - what it knows
    public String color;

    public double side;

    public Shape(String color){
        this.color = color;
    }

    //calcuLATE AREA

   public  abstract double calculateArea();

}
