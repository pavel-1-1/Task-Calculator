package org.example;

public class Calculator {
    public Formula newFormula() {
        return new Formula();
    }

    protected enum Operation {
        SUM, SUB, MULTI, DIV, POW
    }

    public static class Formula {
        private Double a, b, result;

        protected Formula() {
        }

        public Formula addOperand(double operand) {
            if (a == null) {
                a = operand;
            } else if (b == null) {
                b = operand;
            } else {
                throw new IllegalStateException("Formula is full of operands");
            }
            return this;
        }

        public Formula calculate(Operation op) {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            switch (op) {
                case SUM -> result = a + b;
                case SUB -> result = a - b;
                case MULTI -> result = a * b;
                case DIV -> result = a / b;
                case POW -> result = Math.pow(a, b);
            }
            return this;
        }

        public double result() {
            if (result == null)
                throw new IllegalStateException("Formula is not computed!");
            return result;
        }
    }
}

