interface Calculable {
    int calc(int a, int b);
}

class Calculator {
    public int calc(int a, int b, Calculable calculable) {
        return calculable.calc(a, b);
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.calc(2, 3, (a, b) -> a + b);

        int sub = calculator.calc(5, 4, (a, b) -> a - b);

        //5
        System.out.println(sum);

        //1
        System.out.println(sub);
    }
}