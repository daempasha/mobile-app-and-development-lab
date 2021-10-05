public class Circle extends Shape {
    int radius;

    public Circle(int radius){
        super();
        this.radius = radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
