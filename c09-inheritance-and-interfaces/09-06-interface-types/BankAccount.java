public class BankAccount implements Measurable, Comparable
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    /**
     * Implements getMeasure method from the Measurable interface
     */
    public double getMeasure()
    {
        return balance;
    }

    /**
     * Implements (overrides) compareTo method from the Comparable interface
     */
    @Override
    public int compareTo(Object o) 
    {
        BankAccount other = (BankAccount) o;
        if (this.balance < other.balance) { return -1; }
        if (this.balance > other.balance) { return 1;}
        return 0;
    }

    /**
     * Overrides the toString method from the Object class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return "balance: " + balance;
    }
}