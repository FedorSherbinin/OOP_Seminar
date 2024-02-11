package main.exzmple;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematika m = (a, b) -> a + b;
        Mathematika x = Double::sum;   //лямда функция
        System.out.println(x.add(45, 56));
    }
}
interface Mathematika {
    double add (double a, double b);
}
class Calculator{
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('f', arr -> Math.sqrt(arr[0]));
    }
    public static void main(String[] args) {
        System.out.println(calculator1('+', 45, 78));
        System.out.println(calculator1('f', 9, 45));

    }
    public static double calculator(char op, double x, double y){
        if (op == '+') return x + y;
        if (op == '+') return x - y;
        if (op == '+') return x * y;
        else throw new UnsupportedOperationException("Не реализуется");
    }

    public static double calculator1(char op, double ... arr){
        return map.get(op).calc(arr);
    }
}

interface Calculable {
    double calc(double ... arr);
}