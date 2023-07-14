package Challenge_3;

import java.util.Scanner;

public class PairInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor alvo: ");
        int k = scanner.nextInt();

        System.out.print("Tamanho da array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Adicione os números: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                int difference = Math.abs(arr[i] - arr[j]);

                if (difference == k) {
                    count++;
                }
            }
        }
        System.out.print("Sua array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nPares nessa array: " + count);
    }
}