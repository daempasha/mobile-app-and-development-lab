
class Main {
    public static void main(String[] args){
        Circle smallCircle = new Circle(5);
        Rectangle smallRectangle = new Rectangle(10, 2);

        Shape largerShape = getLargerShape(smallRectangle, smallCircle);
        System.out.println(largerShape);

    }

    public static Shape getLargerShape(Shape s1, Shape s2){
        if(s1.area() > s2.area()){
            return s1;
        }
        return s2;
    }
}