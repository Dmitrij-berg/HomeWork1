package HomeWork1;/*
 ������� ����� Dog, ������� ����� ��������� 2 ���� name � says.
 � main( ) ������� 2 ���������� ������ � name �spot� (says, �Ruff!�) � �scruffy� (says, �Wurf!�). � ����������� ���� ��������.
 */


public class Dog {
        String name;
        String says;
    Dog(String dogname, String dogsays)
    {
        name =dogname;
        says=dogsays;
        System.out.println(name + " " + says);
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");

    }
}
