package service;

public class UsaInterestRate implements InterestService {
    private final double interestRate;

    public UsaInterestRate(double interest) {
        this.interestRate = interest;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
