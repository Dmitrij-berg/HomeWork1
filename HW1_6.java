package HomeWork1;
/*
Х	—оздать программу, провер€ющую и сообщающую на экран, €вл€етс€ ли целое число,
записанное в переменную n, чЄтным либо нечЄтным (n Ц вводит пользователь).
 */

public class HW1_6 {
    int n = 10;
    String g = "Ќе четное";
    String d = "„етное";
    String even(){
        if(n % 2 == 0){
            return d;
        } else return g;
    }

    public static void main(String[] args){
        HW1_6 k = new HW1_6();
        System.out.println(k.even());
    }

}
