public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int currentYear = 2022;
        int friendYear = 1990;
        int result = currentYear-friendYear;
        System.out.println("My friend is " + result  + " years");

        int number = 123456;
        int lastDigit = number%10;
        System.out.println(lastDigit);

        String name = "Victoriia";
        int age = 28;
        if (age >= 18 & age <=30)
            {
            System.out.println(name + ", congratulations you figured out how it works if");
            }

        int x = 8;
        int y = -7;
        if ( (x == 0) | (y == 0)) {
            System.out.println("Цель находится на координатной оси или в центре");

        }

        if (x>0 & y>0) {
            System.out.println("Цель находится в первой четверти");
        }
        if (x<0 & y>0) {
            System.out.println("Цель находится вo второй четверти");
        }
        if (x<0 & y<0) {
            System.out.println("Цель находится в третьей четверти");
        }
        if (x>0 & y<0) {
            System.out.println("Цель находится в четвертой четверти");
        }
        int a = 8;
        int b = 2;
        int c = 8;
        if ((a + b) > c & (b + c) > a & (c + a) > b) { System.out.println("Треугольник существует."); }
        else { System.out.println("Треугольник не существует."); }

    }





}

