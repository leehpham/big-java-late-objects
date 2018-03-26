public class FruitTester
{
    public static void main(String[] args)
    {
        Fruit apple = new Fruit("red");
        Object obj = new Object();
        // "Small" reference points to bigger object
        obj = apple;
        
        // Interestingly, obj is now considered an instance of Fruit
        System.out.println(obj instanceof Fruit); // -> true

        // But you still can't use it to call getColor
    }
}