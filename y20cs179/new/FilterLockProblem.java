class FilterLock {
    private volatile boolean[] flag;
    private volatile int[] level;
    private volatile int[] victim;

    public FilterLock(int n) {
        flag = new boolean[n];
        level = new int[n];
        victim = new int[n];
        for (int i = 0; i < n; i++) {
            level[i] = 0;
        }
    }

    public void lock(int threadId) {
        for (int i = 1; i < flag.length; i++) {
            level[threadId] = i;
            victim[i] = threadId;
            flag[threadId] = true;
            while (existThreadInSameOrHigherLevel(i) && victim[i] == threadId) {
                // busy wait
            }
        }
    }

    public void unlock(int threadId) {
        flag[threadId] = false;
    }

    private boolean existThreadInSameOrHigherLevel(int level) {
        for (int i = 0; i < flag.length; i++) {
            if (this.level[i] >= level && flag[i]) {
                return true;
            }
        }
        return false;
    }
}

class FilterLockProblem {
    public static void main(String[] args) {
        int n = 5;
        FilterLock lock = new FilterLock(n);
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            final int threadId = i;
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    lock.lock(threadId);
                    // critical section
                    lock.unlock(threadId);
                }
            });
        }
        for (int i = 0; i < n; i++) {
            threads[i].start();
        }
    }
}
