package service;

public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        if (months < 1) throw new IllegalArgumentException("Argument months is`t acceptable.");
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    }
}
