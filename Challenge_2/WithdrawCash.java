package Challenge_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithdrawCash {
    public static void main(String[] args) {
        Scanner insertValue = new Scanner(System.in);
        BigDecimal minValue = BigDecimal.valueOf(0.01);
        BigDecimal maxValue = BigDecimal.valueOf(1000000.00);
        BigDecimal value;
        System.out.println("-------------------------");
        System.out.println("Quanto você deseja sacar? \n" +
                            "Entre 0,01 e 1.000.000,00");
        String valueInput = insertValue.next();
        value = new BigDecimal(valueInput).setScale(2, RoundingMode.HALF_EVEN);

        while (value.compareTo(minValue) < 0 || value.compareTo(maxValue) > 0) {
            System.out.println("Valor inválido, insira novamente.");
            valueInput = insertValue.next();
            value = new BigDecimal(valueInput).setScale(2, RoundingMode.HALF_EVEN);
        }

        insertValue.close();

        List<BigDecimal> notes = new ArrayList<>();
        notes.add(BigDecimal.valueOf(100.00));
        notes.add(BigDecimal.valueOf(50.00));
        notes.add(BigDecimal.valueOf(20.00));
        notes.add(BigDecimal.valueOf(10.00));
        notes.add(BigDecimal.valueOf(5.00));
        notes.add(BigDecimal.valueOf(2.00));

        List<BigDecimal> coins = new ArrayList<>();
        coins.add(BigDecimal.valueOf(1.00));
        coins.add(BigDecimal.valueOf(0.50));
        coins.add(BigDecimal.valueOf(0.25));
        coins.add(BigDecimal.valueOf(0.10));
        coins.add(BigDecimal.valueOf(0.05));
        coins.add(BigDecimal.valueOf(0.01));

        System.out.println("------------------------");
        System.out.println("Valor a sacar: " + value);
        System.out.println("------------------------");

        System.out.println("Quantas notas:");
        for(BigDecimal note: notes) {
            if (value.compareTo(new BigDecimal(2)) < 0) {
                break;
            }

            int result = value.divideToIntegralValue(note).intValue();
            value = value.remainder(note);

            if (result > 1) {
                System.out.printf("%d notas de: R$ %.2f%n", result, note);
            } else if (result == 1) {
                System.out.printf("%d nota de: R$ %.2f%n", result, note);
            }
        }

        System.out.println("------------------------");
        System.out.println("Quantas moedas:");
        for (BigDecimal coin: coins) {
            int result = value.divideToIntegralValue(coin).intValue();
            value = value.remainder(coin);

            if (result > 1) {
                System.out.printf("%d moedas de: R$ %.2f%n", result, coin);
            } else if (result == 1) {
                System.out.printf("%d moeda de: R$ %.2f%n", result, coin);
            }
        }
        System.out.println("------------------------");
    }
}