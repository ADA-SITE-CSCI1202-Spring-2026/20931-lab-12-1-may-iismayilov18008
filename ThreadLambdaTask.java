public class ThreadLambdaTask {
    public static void main(String[] args) {

        // TODO 1
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });

        // TODO 2
        t.start();

        System.out.println("Main method finished.");
    }
}
