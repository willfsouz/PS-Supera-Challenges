package Challenge_4;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantas linhas serão desembaralhadas?");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("---------------------------------------");

        System.out.println("Insira as " + n + " linhas abaixo:");
        System.out.println("---------------------------------------");

        for (int i = 0; i < n; i++) {
            String inputString = input.nextLine();
            System.out.println(unshuffle(inputString));
            System.out.println("---------------------------------------");
        }
    }

    public static String unshuffle(String line) {
        int cutString = line.length() / 2;
        String leftSide = new StringBuilder(line.substring(0, cutString)).reverse().toString();
        String rightSide = new StringBuilder(line.substring(cutString)).reverse().toString();
        return leftSide + rightSide;
    }
}