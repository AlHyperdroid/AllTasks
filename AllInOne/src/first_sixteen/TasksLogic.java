package first_sixteen;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.ceil;

public class TasksLogic {

    public static double divide(double a, double b) {
        System.out.println("Задача 1 Деление с остатком");
        double c = a / b;
        return c;
    }

    public static int sumTwodigit(int n) {
        System.out.println("Задача 2 Сумма цифр числа n(2х значное). Суммироемое число:" + n);
        int a = n / 10;
        int b = (n / 1) - a * 10;
        int sumn = (a + b);
        return sumn;
    }

    public static double round(double n) {
        System.out.println("Задача 3 Округление. Число для округления: " + n);
    return Math.round(n);
    }

    public static int sumThreedigit(int n) {
        System.out.println("Задача 4 Сумма цифр числа n(2х значное). Суммироемое число: " + n);
        int a = n / 10;
        int b = (n / 100) - a * 10;
        int c = n - b * 10 - a * 100;
        int sumn = (a + b + c);
        return sumn;
    }

    public static double yourMoonWeight(double yourweight) {
        System.out.println("Задача 5 Вес человека на луне");
        double yourmoonweight = yourweight / 100 * 17;
        return yourmoonweight;
    }

    public static int[] arrayPlus() {
        System.out.println("Задача 6 Прибавление процента к значению в массиве ");
        int[] arr = new int[4];
        int[] sarr = new int[4];
        arr[0] = 5;
        arr[1] = 1560;
        arr[2] = 20;
        arr[3] = 30;
        for (int i = 0; i < arr.length; i++) {
            sarr[i] = arr[i] * 10 / 100;
            sarr[i] = sarr[i] + arr[i];
        }
        return sarr;
    }

    public static int moreless(int a, int b) {
        System.out.println("Задача 7 Поиск максимального. Сравниваемые числа: " + a + " и " + b);
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String chetnechet(int с) {
        System.out.println("Задача 8 Четное или нечетное");
        String a = "четное";
        String b = "нечетное";
        System.out.println("Ваше число для проверки:" + с);
        if (с % 2 == 0) {
            return a;
        } else {
            return b;
        }
    }

    public static String wholenumber(double x) {
        System.out.println("Задача 9 Целоеое ли число?");
        System.out.println("Ваше число для проверки:" + x);
        if (ceil(x) == x) {
            return "Целое";
        } else {
            return "Неа не целое";
        }
    }

    public static void consoleinput() {
        System.out.println("Задача 10 Ввод имени с консоли");
        System.out.println("Введите свое имя");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Ваше имя: " + userName);
    }

    public static void tableX() {
        System.out.println("Задача 11 Таблица умножения");
        System.out.println("Введите число от 2 до 9 чтобы получить таблицу умножения на ваше число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 2) {
            for(int i = 1; i!=11; i++){
                int c = 2 * i;
                System.out.println("2 * "+ i + " = "+ c);
            }
        } else if (a == 3) {
            for(int i = 1; i!=11; i++){
                int c = 3 * i;
                System.out.println("3 * "+ i + " = "+ c);
            }
        } else if (a == 4) {
            for(int i = 1; i!=11; i++){
                int c = 4 * i;
                System.out.println("4 * "+ i + " = "+ c);
            }
        } else if (a == 5) {
            for(int i = 1; i!=11; i++){
                int c = 5 * i;
                System.out.println("5 * "+ i + " = "+ c);
            }
        } else if (a == 6) {
            for(int i = 1; i!=11; i++){
                int c = 6 * i;
                System.out.println("6 * "+ i + " = "+ c);
            }
        } else if (a == 7) {
            for(int i = 1; i!=11; i++){
                int c = 7 * i;
                System.out.println("7 * "+ i + " = "+ c);
            }
        } else if (a == 8) {
            for(int i = 1; i!=11; i++){
                int c = 8 * i;
                System.out.println("8 * "+ i + " = "+ c);
            }
        } else if (a == 9) {
            for(int i = 1; i!=11; i++){
                int c = 9 * i;
                System.out.println("9 * "+ i + " = "+ c);
            }
        }
    }

    public static int speed() {
        System.out.println("Задача 12 Рассчитать скорость");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние которое нужно проехать");
        int N = sc.nextInt();
        System.out.println("Введите время за которое нужно проехать");
        int T = sc.nextInt();
        int S = N / T;
        return S;
    }

    public static void hourssum() {
        System.out.println("Задача 13 Рассчет времени");
        System.out.println("Введите кол-во дней для рассчета");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int a = 24;
        int b = 1440;
        int c = 86400;
        a = d * a;
        b = d * b;
        c = d * c;
        System.out.println("В " + d + " днях " + a + " часов " + b + " минут " + c + " секунд ");
    }

    public static void converterGrntoDlr() {
        System.out.println("Задача 14 Перевод денег");
        double verh = 28.17;
        System.out.println("Введите сумму для перевода");
        Scanner sc = new Scanner(System.in);
        double grn = sc.nextDouble();
        double dol = grn / verh;
        String res = String.format("%.2f", dol);
        System.out.println("Курc:" + verh + '\n' + "Ваша сумма в долларах:" + res);
    }

    public static void triangle(int a, int b) {
        System.out.println("Задача 15 Треугольник");
        double hptn = Math.pow(a, 2) + Math.pow(b, 2);
        double per = a + b + hptn;
        int sqr = (a * b) / 2;
        System.out.println("Гипотенуза равна: " + hptn + '\n' + "Площадь равна: " + sqr + '\n' + "Перимерт равен: " + per);
    }

    public static void degrees() {
        System.out.println("Задача 16 Перевод температуры");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько вам нужно градусв перевести");
        int cls = sc.nextInt();
        double frngt = cls * 1.8 + 32;
        String res = String.format("%.1f", frngt);
        System.out.println("Ваша температура в фаренгейтах: " + res);
    }

    public static void switchTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания. Для выхода введите 0");
        int task = sc.nextInt();

        switch (task) {
            case 0:
                break;
            case 1:
                System.out.println("Результат деления " + divide(21, 8));
                switchTask();
            case 2:
                System.out.println("Результат суммирования " + sumTwodigit(25));
                switchTask();
            case 3:
                System.out.println("Результат округления " + round(2.5));
                switchTask();
            case 4:
                System.out.println("Результат суммирования " + sumThreedigit(111));
                switchTask();
            case 5:
                System.out.println("Ваш вес на луне приблизительно равен " + yourMoonWeight(68) + " кг");
                switchTask();
            case 6:
                System.out.println("Результат увелечения значений " + Arrays.toString(arrayPlus()));
                switchTask();
            case 7:
                System.out.println("Наибольшее число " + moreless(9, 6));
                switchTask();
            case 8:
                System.out.println("Число: " + chetnechet(6));
                switchTask();
            case 9:
                System.out.println("Число: " + wholenumber(6.0));
                switchTask();
            case 10:
                consoleinput();
                switchTask();
            case 11:
                tableX();
                switchTask();
            case 12:
                System.out.println("С такой скоростью вам нужно ехать: " + speed() + "км/ч");
                switchTask();
            case 13:
                hourssum();
                switchTask();
            case 14:
                converterGrntoDlr();
                switchTask();
            case 15:
                triangle(5, 7);
                switchTask();
            case 16:
                degrees();
                switchTask();
        }
    }
}
