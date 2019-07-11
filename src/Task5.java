import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * решение задачи 5
 */

public class Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(1*number + " " + 2*number + " " + 3*number + " " + 4*number + " " + 5*number + " " + 6*number + " " + 7*number + " " + 8*number + " " + 9*number + " " + 10*number);
    }
}
