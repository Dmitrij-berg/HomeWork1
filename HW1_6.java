package HomeWork1;
/*
�	������� ���������, ����������� � ���������� �� �����, �������� �� ����� �����,
���������� � ���������� n, ������ ���� �������� (n � ������ ������������).
 */

public class HW1_6 {
    int n = 10;
    String g = "�� ������";
    String d = "������";
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
