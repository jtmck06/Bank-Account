import javax.swing.JOptionPane;

public class BankAccount
{
    private static double balance;
    private static final double lowBalance = 0;

    public BankAccount(String str)
    {
        balance = Double.parseDouble(str);

        if(balance <= lowBalance)
        {
            displayMessage();
        }
    }
    public static void deposit(String str)
    {
        balance += Double.parseDouble(str);
    }
    public static void withdraw(String str)
    {
        balance -= Double.parseDouble(str);
    }
    public double getBalance()
    {
        if(balance <= lowBalance)
        displayMessage();

        return balance;
    }
    public void displayMessage()
    {
        String input;
        input = JOptionPane.showInputDialog("Your account has been overdrawn." +
                "Please make deposit before you are charged with overdraft fees");
    }
}
