package HomeWork1;
/**
 	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 Вычислить и вывести на экран площадь треугольника и его периметр(a и b – вводит пользователь).
 */
public class HW1_10 {

    public static void main(String[] args){
        double a = 5;
        double b = 10;
        double s, p, c;
        s = ((a * b) / 2);
        c = Math.sqrt(a*a+b*b);
        p = a + b + c;
        System.out.println("S = " + s);
        System.out.println("P = " + p);
    }
}
