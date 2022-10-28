import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        for(;;){
            if (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите ввод.");
                sc.nextLine();
                continue;
            }
            number = sc.nextInt();
            if (number > 0)
                return number;
            else
                System.out.println("Введите положительное число.");
        }
    }

    public static int NOD(int x, int y) {
        int r;
        do{
            if (x < y) {
                int t = x;
                x = y;
                y = t;
            }
            r = x % y;
            x = r;
        } while(r > 0);
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Введите два целых числа:");
        System.out.print("a = ");
        int a = enterNumber();
        System.out.print("b = ");
        int b = enterNumber();
        System.out.print("c = ");
        System.out.println("Наибольший общий делитель введённых чисел равен " + NOD(a, b));
    }
}
