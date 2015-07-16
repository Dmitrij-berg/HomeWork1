package HomeWork1;/*
 —оздать класс Dog, который будет содержать 2 пол€ name и says.
 ¬ main( ) создать 2 экземпл€ра класса с name УspotФ (says, УRuff!Ф) и УscruffyФ (says, УWurf!Ф). » распечатать пол€ объектов.
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
