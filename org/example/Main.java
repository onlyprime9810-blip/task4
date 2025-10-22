package org.example;
import java.util.Scanner;
// Ниже пояснил как работает код
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = scan.nextInt();

        int result = Tribonacci(n);
        System.out.println("The smallest Tribonacci number greater than or equal to " + n + ": " + result);
    }

    // Основная функция для вычислений
    public static int Tribonacci(int n) {
        // Базовые случаи для чисел Трибоначчи
        if (n <= 1) return n; // 0 или 1

        // Первые три числа Трибоначчи
        int a = 0, b = 1, c = 1;

        // Поиск наименьшего числа Трибоначчи >= n
        while (c < n) {
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        return c;
    }
}