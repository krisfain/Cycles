package com.company;

public class Loop {

    public static void method2 () {
        int i = 100;
        while (i >=10) {
            System.out.print("Обратный отчет:" + i);
            i-=10;
        }
    }

    public static void method1 () {
        int i = 1;
        int currentResult = i * i;
        System.out.println("Before while");
        while (currentResult < 199) {
            System.out.print(i + " ");
            i = i + 1;
            currentResult = i * i;
        }
        System.out.println("");
        System.out.println("After while");
    }

    public static void method3() {
        int a = 5;
        int b = 10;
        int c = a + b;
        for (int i=0; i < 3; i++) {
            b = b + c;
            c = c + a;
            a = c + b;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
