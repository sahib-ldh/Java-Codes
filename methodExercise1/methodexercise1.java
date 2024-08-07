public class Calculator {
    public double findAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return Math.round(average * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double average = calculator.findAverage(10, 20, 30);
        double average2 = calculator.findAverage(12, 8, 15);
        
        System.out.println("The average is: " + average);
        System.out.println("The average is: " + average2);
    }
}