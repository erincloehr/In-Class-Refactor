package edu.bsu.refactoring;

public class InsuranceStrategyHigh extends InsuranceStrategy {

    InsuranceStrategyHigh() {
    }

    @Override
    public int getConstant() {
        return 76500;
    }

    @Override
    public double getWeight() {
        return 0.1;
    }

    @Override
    public int getAdjustment() {
        return 30000;
    }
}
