import java.util.ArrayList;
import java.util.List;

public class BestSumFinder {

    public Integer chooseBestSum(int maxDistance, int citiesToVisit, List<Integer> distances) {
        List<List<Integer>> combinations = generateCombinations(distances, citiesToVisit);
        int bestSum = -1;

        for (List<Integer> combo : combinations) {
            int currentSum = combo.stream().mapToInt(Integer::intValue).sum();
            if (currentSum <= maxDistance && currentSum > bestSum) {
                bestSum = currentSum;
            }
        }

        return bestSum == -1 ? null : bestSum;
    }

    private List<List<Integer>> generateCombinations(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(list, k, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateCombinationsHelper(List<Integer> list, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            current.add(list.get(i));
            generateCombinationsHelper(list, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public void run() {
        List<Integer> distances = List.of(50, 55, 57, 58, 60);
        Integer result = chooseBestSum(175, 3, distances);
        System.out.println("Максимальная сумма: " + result);

        List<Integer> testDistances = List.of(50, 55, 56, 57, 58);
        result = chooseBestSum(163, 3, testDistances);
        System.out.println("Тестовый результат: " + result);
    }
}