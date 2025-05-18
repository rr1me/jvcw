import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите массив в формате [1, 0, 1, 1, ...]: ");
//        String input = scanner.nextLine().trim();
//
//        String cleanedInput = input.replaceAll("[\\[\\] ]", "");
//        String[] elements = cleanedInput.split(",");
//
//        int employeeCount = 0;
//        for (String element : elements) {
//            if (element.equals("1")) {
//                employeeCount++;
//            }
//        }
//
//        System.out.println("Количество сотрудников: " + employeeCount);
//        Vowels vowels = new Vowels();
//        vowels.removeVowels();
        BestSumFinder bsf = new BestSumFinder();
        bsf.run();
    }
}