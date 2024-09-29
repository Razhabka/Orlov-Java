import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сравнение и вычисление над двумя числами");
        System.out.println("Введите первое число: ");
        float numb1 = in.nextInt();
        System.out.println("Введите второе число: ");
        float numb2 = in.nextInt();

        ComparisonAndCalculation test1 = new ComparisonAndCalculation(numb1, numb2);
        test1.comparison();
        test1.calculation();

        System.out.println("\nПровека строк");
        System.out.println("Введите первую строку:");
        String firstStr = in.next();
        System.out.println("Введите вторую строку:");
        String secondStr = in.next();

        StringComparison test2 = new StringComparison(firstStr, secondStr);
        test2.equalsString();

        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println("\nНахождение всех четных чисел массива");
        evenNumbers(list);
    }

     static void evenNumbers (int[] list){
        List<Integer> result = new ArrayList<>();
         for (int j : list) {
             if (j % 2 == 0) {
                 result.add(j);
             }
         }
         System.out.println(result);
    }
}
