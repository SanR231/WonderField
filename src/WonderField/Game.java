package WonderField;

import java.util.Scanner;

public class Game {
    private final static int numberOfPlayers = 3; //Количество игроков
    private final static int numberOfRounds = 4; //Количество раундов
    private final static int numberOfGroupRounds = 3; // Количество групповых раундов
    public final static int indexFinalRound = 3; //Индекс финального раунда
    public final static Scanner scanner = new Scanner(System.in);

    private String[] questions = new String[numberOfRounds]; //Массив из строк для вопросов
    private String[] answers = new String[numberOfRounds]; //Массив из строк для ответов

    public void init () {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре. " +
                "Вам нужно ввести вопросы и ответы для игры.");

        fillingQuestions();
        inputQuestions();

        System.out.println("Инициализация закончена, игра начнется через 5 секунд.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Прошло 5 секунд.");
        System.out.println("\n".repeat(50));
    }

    private void inputQuestions() {
        for (int i = 0; i < numberOfRounds; i++) {
            System.out.printf("Введите вопрос номер %s\n", i + 1);
            String question = scanner.nextLine();
            System.out.printf("Введите ответ на вопрос номер %s\n", i + 1);
            String answer = scanner.nextLine();
            questions[i] = question;
            answers[i] = answer;
        }
    }

    private void fillingQuestions() {
        String questionOne = "Вопрос один";
        String questionTwo = "Вопрос два";
        String questionThree = "Вопрос три";
        String questionFour = "Вопрос четыре?";
        String answerOne = "один";
        String answersTwo = "два";
        String answerThree = "три";
        String answerFour = "четыре";

        this.questions = new String[] {questionOne, questionTwo, questionThree, questionFour};
        this.answers = new String[] {answerOne, answersTwo, answerThree, answerFour};
    }
}
