package org.example;

public class IntsCalculator implements Ints {
    private final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM).result();
    }

    @Override
    public int multi(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.MULTI).result();
    }

    @Override
    public int pow(int arg0, int arg1) {
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.POW).result();
    }
}
