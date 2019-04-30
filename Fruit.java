
/**
 * The fruit goes in the basket.
 *
 * @author Luke Wismer
 * @version 1.1.1
 */
public class Fruit
{
    private String type;
    private int amount;

    /**
     * Constructor for objects of class Fruit
     */
    public Fruit(String type, int amount)
    {
        this.type = type;
        this.amount = amount;
        if (amount > 20 ) {
            System.out.println("Warning: there are too many fruit for one basket");
        }
    }

    public Fruit()
    {
        type = "";
        amount = 20;
    }

    public void changeType(String newType)
    {
        type = newType;
    }

    public String getType()
    {
        return type;
    }

    public int getAmount()
    {
        return amount;
    }
}
