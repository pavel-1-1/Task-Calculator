package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator cals = new Calculator();
        System.out.println(cals.newFormula().addOperand(5)
                .addOperand(15).calculate(Calculator.Operation.MULTI)
                .result());

        Ints calc = new IntsCalculator();
        System.out.println(calc.multi(3, 5));
        System.out.println(calc.sum(23, 47));
        System.out.println(calc.pow(5, 3));
    }
}