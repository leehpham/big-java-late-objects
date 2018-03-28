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
        // obj.getColor();

        // If you want to do so, you need to cast it to Fruit and assign its value to a new reference
        // NOTE: for some reason you can't reassign it to itself
        // obj = (Fruit) obj;
        // System.out.println(obj.getColor());

        Fruit temp = (Fruit) obj;
        System.out.println(temp.getColor()); // -> red
    }
}