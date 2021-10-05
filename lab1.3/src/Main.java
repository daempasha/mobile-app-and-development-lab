public class Main {
    public static void main(String[] args){
        Cow sam = new Cow("Sam");
        sam.eat("Grass");
        sam.sound();

        Dog rex = new Dog("rex");
        rex.eat("Bone");
        rex.sound();
    }
}
