package program;

import service.BrazilInterestRate;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Month: ");
        int months = sc.nextInt();

        BrazilInterestRate tax = new BrazilInterestRate(2.0);
        double payment = tax.payment(amount, months);
        System.out.println("Payment after " + months + " months: " + String.format("%.2f", payment));

        sc.close();
    }
}