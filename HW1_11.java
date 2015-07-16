package HomeWork1;
/**
 В три переменные a, b и c записаны три вещественных числа.
 Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0,
 либо сообщать, что корней нет(a, b и c – вводит пользователь).
 */
public class HW1_11 {

    public static void main(String[] args){
        double a = 2;
        double b = 5;
        double c = 3;
        double d, x1, x2, x;

        d = Math.sqrt((b * b) - (4*a*c));
        if(d > 0) {
            x1 = ((-b + d) / 2*a);
            x2 = ((-b - d) / 2*a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
        if(d == 0){
            x = ((-b) / 2*a);
            System.out.println("X = " + x);
        }
        if(d < 0){
            System.out.println("Корней нет!");
        }

    }
}
