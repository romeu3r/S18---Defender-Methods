package service;

public class BrazilInterestRate implements InterestService {
    private final double interestRate;

    public BrazilInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
