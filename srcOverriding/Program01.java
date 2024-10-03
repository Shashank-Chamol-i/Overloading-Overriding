class Animal
{
    String sound()
    {
        return null;
    }
}
class Dog extends Animal
{
    @Override
    String sound()
    {
        return "Bark";
    }
}
class Cat extends Animal
{
    @Override
    String sound()
    {
        return "Meow";
    }
}
public class Program01 {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        System.out.println(d.sound());
        Cat c = new Cat();
        System.out.println(c.sound());
    }
}
