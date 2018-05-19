import java.util.ArrayList;

/*
Describes an invoice for a set of purchased products.
*/
public class Invoice
{
    private Address billingAddress;
    private ArrayList<LineItem> items;

    /**
     * 
     */
    public Invoice(Address billingAddress)
    {
        this.billingAddress = billingAddress;
        items = new ArrayList<LineItem>();
    }

    /**
     * Adds a charge for a product to this invoice.
     * @param aProduct the product that the customer ordered.
     * @param quantity the quantity of the product
     */
    public void add(Product aProduct, int quantity)
    {
        LineItem anItem = new LineItem(aProduct, quantity);
        items.add(anItem);
    }

    /**
     * Formats the invoice.
     * @return the formatted invoice.
     */
    public String format()
    {
        String r = "                    INVOICE\n\n"
            + billingAddress.format()
            + String.format("\n\n%-30s%8s%5s%8s\n", 
                "Description", "Price", "Qty", "Total");

        for (LineItem item : items)
        {
            r += item.format() + "\n";
        }

        r += String.format("\nAMOUNT DUE: $%8.2f", this.getAmountDue());

        return r;
    }

    /**
     * Computes the total amount due
     * @return the amount due
     */
    private double getAmountDue()
    {
        double amountDue = 0;
        for (LineItem item : items)
        {
            amountDue += item.getTotalPrice();
        }
        return amountDue;
    }
}