package HomeWork1;
/*
   ¬ переменной n хранитс€ натуральное двузначное число.
   —оздайте программу, вычисл€ющую и вывод€щую на экран сумму цифр числа n(n Ц вводит пользователь).
 */
public class HW1_7 {

    public static void main(String[] args){
        int n = 46;
        int sum = 0;
        int i = 0;
            while (n != 0) {
                if (i < 2) {
                    sum = sum + (n % 10);
                }else {
                    System.out.println("Number does not a two-digit!");
                    sum = 0;
                    n = 0;
                }
                n /= 10;
                i ++;
            }
            System.out.println(sum);
    }
}
