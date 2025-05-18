import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Vowels {
    public void removeVowels() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        System.out.println("Результат: " + result.toString());
    }
}
