package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        double resultAdd = calculator.add(10, 5);
        double resultMinus = calculator.minus(10, 5);
        double resultDivide = calculator.divide(10, 5);
        double resultMultiply = calculator.multiply(10, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultMinus);
        System.out.println("Division: " + resultDivide);
        System.out.println("Multiplication: " + resultMultiply);
    }
}
