package Challenge_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números iremos ordenar?");
        int n = input.nextInt();

        System.out.println("Quais são os números?");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();

            if (num % 2 == 0) {
                evenNum.add(num);
            } else{
                oddNum.add(num);
            }
        }

        input.close();

        Collections.sort(evenNum);
        Collections.sort(oddNum, Collections.reverseOrder());

        System.out.println("Aqui estão os números na ordem solicitada:");
        for(int even: evenNum) {
            System.out.println(even);
        }
        for (int odd: oddNum) {
            System.out.println(odd);
        }
    }
}
