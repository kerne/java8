package cl.poc.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class LoginSemaphore {

    private final Semaphore semaphore;

    public LoginSemaphore(int slots) {
        this.semaphore = new Semaphore(slots);
    }

    public boolean tryLogin() {
        return this.semaphore.tryAcquire();
    }

    public void logout() {
        this.semaphore.release();
    }

    public int availableSlots() {
        return this.semaphore.availablePermits();
    }

}
