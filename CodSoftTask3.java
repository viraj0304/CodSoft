package codsoft;

import java.util.Scanner;

public class CodSoftTask3 
{
	public static void main(String[]args) 
	{
		Scanner scanner=new Scanner(System.in);

        System.out.print("Enter initial balance:");
        double initialBalance=scanner.nextDouble();

        BankAccount userAccount=new BankAccount(initialBalance);
        ATM atm=new ATM(userAccount);

        while(true) 
        {
            atm.displayOptions();
            
            System.out.print("Choose an option:");
            System.out.print("\n");
            int option = scanner.nextInt();

            atm.executeOption(option,scanner);
        }
	}
}
class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance=initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance+=amount;
    }

    public boolean withdraw(double amount)
    {
        if(amount>0&&amount<=balance) 
        {
            balance-=amount;
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

class ATM 
{
    private BankAccount userAccount;

    public ATM(BankAccount account) 
    {
        this.userAccount=account;
    }

    public void displayOptions() 
    {
        System.out.print("\n");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.print("\n");
        
    }

    public void executeOption(int option, Scanner scanner) 
    {
        switch (option) 
        {
            case 1:
                checkBalance();
                break;
                
            case 2:
                System.out.print("\n");
                System.out.print("Enter deposit amount:");
                System.out.print("\n");
                double depositAmount=scanner.nextDouble();
                deposit(depositAmount);
                break;
                
            case 3:
                System.out.print("\n");
                System.out.print("Enter withdrawa amount:");
                double withdrawalAmount=scanner.nextDouble();
                withdraw(withdrawalAmount);
                break;
                
            case 4:
                System.out.print("\n");
                System.out.println("Thank you");
                System.exit(0);
                break;
                
            default:
                System.out.println("Invalid option");
        }
    }

    public void checkBalance() 
    {
        System.out.print("\n");
    	System.out.println("Your balance:"+userAccount.getBalance());
    }

    public void deposit(double amount) 
    {
        userAccount.deposit(amount);
        System.out.print("\n");
        System.out.println("Deposit successful");
        System.out.println("New balance:"+userAccount.getBalance());
    }

    public void withdraw(double amount) 
    {
        if (userAccount.withdraw(amount)) 
        {
            System.out.print("\n");
            System.out.println("Withdrawa successful");
            System.out.println("New balance:"+userAccount.getBalance());
        } else {
            System.out.println("you enter invalid amount");
        }
    }
}