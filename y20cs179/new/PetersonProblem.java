class Peterson {
    private volatile boolean[] flag = new boolean[2];
    private volatile int turn;

    public void enter(int threadId) {
        int other = 1 - threadId;
        flag[threadId] = true;
        turn = threadId;
        while (flag[other] && turn == threadId) {
            // busy wait
        }
    }

    public void leave(int threadId) {
        flag[threadId] = false;
    }
}

class PetersonProblem {
    private static int sharedResource = 0;
    private static Peterson lock = new Peterson();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    lock.enter(0);
                    sharedResource++;
                    lock.leave(0);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    lock.enter(1);
                    sharedResource++;
                    lock.leave(1);
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value of shared resource: " + sharedResource);
    }
}
