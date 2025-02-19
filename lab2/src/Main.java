public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        int calculationLength = 30;
        int sleepTime = 10;

        for (int i = 0; i < numberOfThreads; i++) {
            new MyThread(i + 1, calculationLength, sleepTime).start(); // Запускаем поток
        }
    }
}
