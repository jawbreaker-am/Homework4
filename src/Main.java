//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1:");
        int age = 20;
        String answer1;
        if (age >= 18) {
            answer1 = "он совершеннолетний";
        } else {
            answer1 = "он не достиг совершеннолетия, нужно немного подождать";
        }
        System.out.println("Если возраст человека равен " + age + ", то " + answer1);

        //Задача 2
        System.out.println("\nЗадача 2:");
        int outsideTemperature = 0;
        String answer2;
        if (outsideTemperature<5) {
            answer2 = "сегодня холодно, нужно надеть шапку";
        } else {
            answer2 = "сегодня тепло, можно идти без шапки";
        }
        System.out.println("На улице " + outsideTemperature + " градусов, " + answer2);

        //Задача 3
        System.out.println("\nЗадача 3:");
        int speed = 60;
        String answer3;
        if (speed>60) {
            answer3 = "придется заплатить штраф";
        } else {
            answer3 = "можно ездить спокойно";
        }
        System.out.println("Если скорость " + speed + ", то " + answer3);

        //Задача 4
        System.out.println("\nЗадача 4:");
        int manAge = 16;
        String answer4 = "пусть сидит дома";

        if (manAge>=2 && manAge<=6) {
            answer4 = "ему нужно ходить в детский сад";
        } else if (manAge>=7 && manAge<=17) {
            answer4 = "ему нужно ходить в школу";
        } else if (manAge>=18 && manAge<=24) {
            answer4 = "его место в университете";
        } else if (manAge>24) {
            answer4 = "ему пора ходить на работу";
        }
        System.out.println("Если возраст человека равен " + manAge + ", то " + answer4);

        //Задача 5
        System.out.println("\nЗадача 5:");
        int kidAge = 12;
        String answer5 = "можно кататься на аттракционе";
        if (kidAge<=5) {
            answer5 = "нельзя кататься на аттракционе";
        } else if (kidAge>5 && kidAge<14) {
            answer5 = answer5 + " в сопровождении взрослого";
        } else {
            answer5 = answer5 + " без сопровождения взрослого";
        }
        System.out.println("Если возраст ребенка равен " + kidAge + ", то ему " + answer5);

        //Задача 6
        System.out.println("\nЗадача 6:");
        int passengersQty = 56;
        String answer6 = "мест больше нет";
        if (passengersQty<=60) {
            answer6 = "остались еще сидячие места";
        } else if (passengersQty<=102) {
            answer6 = "остались только cтоячие места";
        }
        System.out.println("Если количество пассажиров " + passengersQty + ", то " + answer6);

        //Задача 7
        System.out.println("\nЗадача 7:");
        int one=1;
        int two=2;
        int three=3;
        System.out.println("\none = " + one + "\ntwo = " + two + "\nthree = " + three + "\n");
        if (one>two && one>three) {
            System.out.println("one - большее из трёх");
        } else if (two>one && two>three) {
            System.out.println("two - большее из трёх");
        } else if (three>one && three>two) {
            System.out.println("three - большее из трёх");
        } else if (one==two && two==three) {
            System.out.println("one, two и three равны между собой");
        } else if (one==two) {
            System.out.println("one и two равны между собой и больше, чем three");
        } else if (one==three) {
            System.out.println("one и three равны между собой и больше, чем two");
        } else {
            System.out.println("two и three равны между собой и больше, чем one");
        }
    }
}