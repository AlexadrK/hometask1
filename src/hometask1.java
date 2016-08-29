import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Aleksandr on 29.08.2016.
 */
public class hometask1 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int[] a = new int[10];
        for (int i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(a);
        String text=Arrays.toString(a);
        System.out.println(text);
        scanner.close();
    }
}