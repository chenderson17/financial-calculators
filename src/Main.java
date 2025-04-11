import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Type 'm' for mortgage calculator or 'f' for future value or 'q' to quit: ");
        handle_scanner(scanner.next());
    }

    public static String handle_scanner(String input){
        if(input.toLowerCase().equals("m")){
            //calculate mortgage
            System.out.print("Enter the principal:");
            double principal = scanner.nextDouble();
            System.out.print("Enter the interest rate: ");
            double interest_rate = scanner.nextDouble();
            System.out.print("Enter the loan length(years): ");
            double loan_length = scanner.nextDouble();
            mortgage_calculator(principal,interest_rate,loan_length);
        }
        else if(input.toLowerCase().equals(("f"))){
            //calcualte cd future
            System.out.print("Enter the deposit: ");
            double deposit = scanner.nextDouble();
            System.out.print("Enter the interest rate: ");
            double interest_rate = scanner.nextDouble();
            System.out.print("Enter the number of years: ");
            double years = scanner.nextDouble();
            future_value(deposit,interest_rate,years);
        }
        else if(input.toLowerCase().equals("q")){
            //quit and end the program
            System.out.println("Have a nice day!");
            System.exit(0);
        }
        else{
            System.out.println("Didn't recognize input please try again");
            System.out.print("Type 'm' for mortgage calculator or 'f' for future value or 'q' to quit: ");
            handle_scanner(input = scanner.next());
        }
        return "";
    }


    // Calulator 1: Mortgage Calculator
    //accept the principal, interest rate, and loan length
    public static void mortgage_calculator(double principal, double interest_rate,double loan_length){
        double n = loan_length * 12; // number of monthly payments
        double i = (interest_rate/100)/12;
        double m = principal * (i * (Math.pow(1 + i, n)) / (Math.pow(1+i,n) -1));
        double total_interest = (m*n) - principal;
        System.out.printf("Monthly Payments:$%.2f\n",m);
        System.out.printf("Total Interest:$%.2f",total_interest);
    }
    // Calculator 2: Future Value
    /* a. It would accept the deposit, interest rate, and number of
          years from the user
       b. It would display the future value and the total interest
            earned
     */
    public static void future_value(double deposit, double interest_rate, double years){
        //FV = P × (1 + (r / 365))^(365 × t)
        double r = interest_rate/100.0;
        double fv = deposit * Math.pow((1 + (r/365.0)), (365.0 * years));
        double total_interest = fv - deposit;
        System.out.printf("Total Earned:$%.2f\n",fv);
        System.out.printf("Total Interest:$%.2f\n",total_interest);

    }


}