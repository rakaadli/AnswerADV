package com.rap.answers;

import java.util.Scanner;

class PrimeNumbersApp
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mau berapa yang di print:");
        int N = scanner.nextInt();
        scanner.close();
        printPrimes(N);
    }
    public static void printPrimes(Integer N){
        int count = 0;
        int num = 2;
        var PrimeNumbers = "";
        while(count != N) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                count++;
//                System.out.println(num); only for test
                PrimeNumbers = PrimeNumbers + num + " ";
            }
            num++;
        }
        System.out.println("List prime numbers dari 1 ke "+ N + " adalah :");
        System.out.println(PrimeNumbers);
    }

}
