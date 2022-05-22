import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        System.out.printf("Запускаем программу \n " +
                "Просим пользователя ввести входные данные для списка \n" +
                "Введите размер списка: ");
        int sizeList = scanner.nextInt();

        System.out.format("Введите верхнюю границу для значений: ");
        int upValue = scanner.nextInt();

        List<Integer> input = generationValue(sizeList, upValue);
        System.out.print("Создаём и наполняем список\n" +
                "Вот случайный список: " + input + "\n");
        System.out.format("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();

        List result = new Filter(filterValue).filterOut(input);
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу");
    }

    private static List<Integer> generationValue(int sizeList, int upValue) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            result.add(random.nextInt(upValue));
        }
        return result;
    }
}