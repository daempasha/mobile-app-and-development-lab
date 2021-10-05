public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }


    public void eat(String food){
        System.out.println("Sam ate " + food);
    }

    public abstract void sound();
}