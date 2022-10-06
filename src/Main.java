import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n;
        int counter = 0;
        int numbers;
        int startIndex = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();

        int[] list = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        do {
            System.out.print(counter + 1 + ". Elemanı : ");
            numbers = input.nextInt();
            list[startIndex++] = numbers;
            counter++;

        } while (counter != n);

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
