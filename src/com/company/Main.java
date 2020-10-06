package com.company;

import java.util.Arrays;
import java.util.Scanner;


class C {
    int a, b, c;

    void method1() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    int method_2() {
        return a % 10;
    }

    int method_3() {
        int b_replace = b;
        while (b_replace > 10) {
            b_replace = b_replace / 10;
        }
        return b_replace;
    }

    int method_4() {
        int c_replace = c, sum = 0;

        while (c_replace > 10) {
            sum = sum + c_replace % 10;
            c_replace = c_replace / 10;
        }
        return sum;
    }

    int method_5() {
        int met2 = method_2();
        int met3 = method_3();
        return met2 * met3;
    }

    int method6() {
        int met3 = method_3();
        int met5 = method_5();

        return met3 + met5;
    }

}

class A {
    public int x;

    public A() {
        System.out.println("Hello");
    }

    void method_1() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt(x);
    }

    void method_2() {
        System.out.println(x + 12);
    }

    void method_3() {
        if (x % 2 == 0) {
            System.out.println("x is an even number");
        } else {
            System.out.println("x is an odd number");
        }
    }
}

class B extends A {
    int y;

    @Override
    void method_1() {
        super.method_1();
        Scanner sca = new Scanner(System.in);
        y = sca.nextInt();
    }

    int method2() {
        return x + y;
    }
}

class Task3 {
    public Task3() {
        int ricxvi1, ricxvi2;
        Scanner scanner = new Scanner(System.in);
        ricxvi1 = scanner.nextInt();
        ricxvi2 = scanner.nextInt();
        int[] sia = new int[40];
        int rand = 0;
        if (ricxvi1 > ricxvi2) {
            for (int i = 0; i < 40; i++) {
                rand = ricxvi1 - ricxvi2;
                sia[i] = (int) ((Math.random() * (rand)) + ricxvi2);
            }
        } else {
            for (int i = 0; i < 40; i++) {
                rand = ricxvi2 - ricxvi1;
                sia[i] = (int) ((Math.random() * (rand)) + ricxvi1);
            }
        }

        int luwebi = 0, kentebi = 0, jamiluwis = 0, jamikentis = 0;

        for (int index = 0; index < sia.length; index++) {
            if (sia[index] % 2 == 0) {
                luwebi = luwebi + 1;
                jamiluwis = jamiluwis + sia[index];

            } else {
                kentebi = kentebi + 1;
                jamikentis = jamikentis + sia[index];

            }
        }
        System.out.println(luwebi);
        System.out.println(kentebi);
        System.out.println(jamikentis);
        System.out.println(jamiluwis);
        int[] sia2 = new int[5];

        int random = 0;
        random = jamikentis - jamiluwis;

        for (int i = 0; i < 5; i++) {
            sia2[i] = (int) ((Math.random() * random) + jamiluwis);
        }

        System.out.println(Arrays.toString(sia2));
    }

}

public class Main {

    public static void main(String[] args) {
        Task3 task = new Task3();

    }

}
