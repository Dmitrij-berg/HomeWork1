package HomeWork1;

/**
 �������� �� ����� ������ 11 ������ ������������������ ���������.
 ����������, ��� ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.
 */
public class HW1_2 {

    public static void main (String[] args){

        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 3; i <= 11; i++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum ;
            System.out.println(sum + " ");
        }

    }
}
