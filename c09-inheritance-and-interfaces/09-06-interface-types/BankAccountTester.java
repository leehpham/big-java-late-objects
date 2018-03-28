public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount(100.00);
        System.out.println(ba.getBalance());
        System.out.println(ba.toString());

        // Test the compareTo method implemented from Comparable interface
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(10000);
        accounts[1] = new BankAccount(0);
        accounts[2] = new BankAccount(2000);
        Arrays.sort(accounts);

        // Print out the sorted array
        for (BankAccount account : accounts)
        {
            System
        }
    }
}