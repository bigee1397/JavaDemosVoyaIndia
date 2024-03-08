package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl();
        bonusCalculator.calculate(5);
        IBonusCalculator.show();

        IAllowanceCalculator iAllowanceCalculator = (IAllowanceCalculator) bonusCalculator;
        iAllowanceCalculator.calculate(6);
        iAllowanceCalculator.policyType();

    }
}
