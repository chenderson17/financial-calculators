import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // example: System.out.printf("Total interest: $%.2f", mortgage_calculator(53000,7.625,15));
        System.out.printf("Enter the principal:");
        double principal = scanner.nextDouble();
        System.out.println("Enter the interest rate: ");
        double interest_rate = scanner.nextDouble();
        System.out.println("Enter the loan length(years): ");
        double loan_length = scanner.nextDouble();
        mortgage_calculator(principal,interest_rate,loan_length);


    }


    //Mortgage Calculator
    //accept the principal, interest rate, and loan length
    public static void mortgage_calculator(double principal, double interest_rate,double loan_length){
        double n = loan_length * 12; // number of monthly payments
        double i = (interest_rate/100)/12;
        double m = principal * (i * (Math.pow(1 + i, n)) / (Math.pow(1+i,n) -1));
        double total_interest = (m*n) - principal;
        System.out.printf("Monthly Payments:$%.2f\n",m);
        System.out.printf("Total Interest:$%.2f",total_interest);
    }
}