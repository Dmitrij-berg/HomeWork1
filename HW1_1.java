package HomeWork1;

/**
 Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
 (заранее не известно сколько цифр будет в числе).
 */
public class HW1_1 {
    public static void main (String[] args){
        int n = 123;
        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n/= 10;
        }
        System.out.println(sum + " ");
    }
}
