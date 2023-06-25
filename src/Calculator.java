import java.util.function.*;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Double> plus = (x, y) -> x + y;
    BinaryOperator<Double> minus = (x, y) -> x - y;
    BinaryOperator<Double> multiply = (x, y) -> x * y;
    BinaryOperator<Double> devide = (x, y) -> y != 0 ? x/y: POSITIVE_INFINITY;

    UnaryOperator<Double> pow = x -> x * x;
    UnaryOperator<Double> abs = x -> x > 0 ? x: x * -1;

    Predicate<Double> isPositive = x -> x > 0;

    Consumer<Double> println = System.out::println;
}

