public class Rectangle extends Shape{

    private double l;
    private double b;


    public Rectangle(double s, String Name) {
        super(Name);
        this.l = this.b = s;
    }

    public Rectangle (double l, double b){
        super("Rectangle");
        this.l = l;
        this.b = b;
    }

    public double area(){
        return this.l * this.b;
    }

}
