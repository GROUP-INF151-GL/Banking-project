
import java.util.Scanner;

public class home {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double balance = 0;
        boolean isRunning = true;
        double deposit;
        int choice;
        while(isRunning){

             System.out.println("*********************");
        System.out.println("Bankin Project  UY1  ");
        System.out.println("*********************");
        System.out.println("choose an option bellow to procced");
        System.out.println("1. Show balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");

        System.out.println("*********************");
        System.out.print("Enter a chioce from (1-4): ");
        choice = scanner.nextInt(); 

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += topUpp();
            case 3 -> balance -=Withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println(" invalid choice");
        }
        System.out.println("***********************");
        System.out.println("Thank you for banking with us ");
        System.out.println("***********************");
        


    }
    }
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);

    }

    static double topUpp() {
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();
        if(amount <= 0){
            System.out.println("Invalid deposit amount");   
            return 0;

        }
        else{
            return amount;
    
        }

    }
    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("insoficient balance");
            return 0;

        }
        else if(amount< 0){
            System.out.println("Amount can't be a negative figure:");
            return 0;

        }
        else{
        return amount;
        }

    }
}
