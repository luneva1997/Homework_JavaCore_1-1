public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        double a = calc.plus.apply(1.0, 2.0);
        double b = calc.minus.apply(1.0, 1.0);
        double c = calc.devide.apply(a, b);

        calc.println.accept(c); //Возможно деление на ноль, добавлено исключение в код метода devide
    }
}