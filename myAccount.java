import javax.swing.JOptionPane;

public class myAccount
{
    public static void main(String [] args)
    {
        String input;

        input = JOptionPane.showInputDialog("What is your accounts starting balance?");
        BankAccount BankAccount = new BankAccount(input);


        input = JOptionPane.showInputDialog("How much would you like to deposit?");
        BankAccount.deposit(input);

        JOptionPane.showMessageDialog(null,String.format("Your deposit has been"+
                "completed. Your balance is now $%,.2f",BankAccount.getBalance()));

        input = JOptionPane.showInputDialog("How much would you like withdraw from your account?");
        BankAccount.withdraw(input);

        JOptionPane.showMessageDialog(null,String.format("Now your balance is now $%,.2f",BankAccount.getBalance()));

        System.exit(0);
    }
}
