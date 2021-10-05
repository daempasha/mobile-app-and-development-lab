public class Rectangle extends Shape {
    int length, width;

    public Rectangle(int length, int width){
        super();
        this.length = length;
        this.width = width;
    }

    public double area(){
        return this.length * this.width;
    }
}
