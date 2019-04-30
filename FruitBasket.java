import java.util.ArrayList;

/**
 * The fruit goes in the basket.
 *
 * @author Luke Wismer
 * @version 1.1.1
 */
public class FruitBasket
{
    private ArrayList<Fruit> basket;
    private int numberOfFruits;

    /**
     * Constructor for objects of class FruitBasket
     */
    public FruitBasket()
    {
        basket = new ArrayList<Fruit>();
        numberOfFruits = 0;
    }

    public void addFruitToBasket(Fruit newFruit)
    {
        basket.add(newFruit);
       numberOfFruits = numberOfFruits + 1;
       System.out.println("5 fruit of type:Apple were added to the basket");
    }
    
    public void createNewFruit(String type, int amount)
    {
        Fruit fr1 = new Fruit(type, amount);
        type = type;
        amount = amount;
        addFruitToBasket(fr1);
    }
}
