
public class Animal{
    String name;
    int eye;
    int legs;

    public void eat(String food){
        System.out.println("Animal.eat()" + food);
    }

    public void move(String moveType){
        System.out.println("Animal.move()" + moveType);
    }

}