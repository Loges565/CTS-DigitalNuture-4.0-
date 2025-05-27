public class VirtualThreadsExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread " + Thread.currentThread().threadId());
            });
        }

        long end = System.currentTimeMillis();
        System.out.println("Finished in " + (end - start) + " ms");
    }
}
