package service;

public class BrazilInterestRate {
    private double interest;

    public BrazilInterestRate(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public double payment(double amount, int months) {
        if (months < 1) throw new IllegalArgumentException("Argument months is`t acceptable.");
        return amount * Math.pow((1 + interest / 100), months);
    }
}
