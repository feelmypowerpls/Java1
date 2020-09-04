package lesson1;

public class main {
    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения
        byte aByte = 123;
        short aShort = 12345;
        int aInt = 1234567891;
        long aLong = 3859472036123456123L;
        float aFloat = 3.4e+038f;
        double aDouble = 0x1.fffffffffffffP+1023;
        boolean aBoolean = true;
        char aChar = '\uffff';

        System.out.println("#3");
        System.out.println(eval1(1, 2, 3, 4));
        System.out.println(eval1(1.1, 21, 10, 11.22222));



        System.out.println("#4");
        double p1 = 11, p2 = 6;
        if (isSummInRange(p1, p2)) {
            System.out.println(p1 + "+" + p2 + " в пределе >=10 <=20");
        } else {
            System.out.println(p1 + "+" + p2 + " вне пределa");
        }
        p1 = 17;
        p2 = 60;
        if (isSummInRange(p1, p2)) {
            System.out.println(p1 + "+" + p2 + " в пределе >=10 <=20");
        } else {
            System.out.println(p1 + "+" + p2 + " вне пределa");
        }


        System.out.println("#5");
        printNumberPosNeg(-10);
        printNumberPosNeg(100);


        System.out.println("#6");
        System.out.println("10 отрицательное = " + isNumberNegative(10));
        System.out.println("-5 отрицательное = " + isNumberNegative(-5));


        System.out.println("#7");
        prnName("Азат");


        System.out.println("#8");
        for (int i = 0; i <= 2017; i++)
            isLeapYear(i);

    }
// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    private static double eval1(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean isSummInRange(double param1, double param2) {
        return (((param1 + param2) >= 10) && ((param1 + param2) <= 20));
    }
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    private static void printNumberPosNeg(int number) {
        if (number >= 0) {
            System.out.println("число " + number + " положительное");
        } else {
            System.out.println("число " + number + " отрицательное");
        }
    }
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    private static boolean isNumberNegative(int number) {
        return (number < 0);
    }
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;//
    private static void prnName(String inName) {
        System.out.println("Привет, " + inName + "!");
    }
    // 8. * Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. //
    private static void isLeapYear(int inYear) {
        boolean isLeap = false;
        int ostMod4 = inYear % 4;
        int ostMod100 = inYear % 100;
        int ostMod400 = inYear % 400;
        if (inYear >= 4) isLeap = (ostMod4 == 0);
        if ((inYear >= 100) && isLeap && (ostMod100 == 0)) isLeap = false;
        if ((inYear >= 400) && (ostMod400 == 0)) isLeap = true;

        if (isLeap) {
            System.out.println("Год " + inYear + " високосный");
        } else {
            System.out.println("Год " + inYear + " не високосный ");
        }
    }
}