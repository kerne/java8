package cl.poc.concurrent.semaphore;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LoginSemaphoreSpec {

    @Test
    public void when_login_reach_limit_then_blocked() {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginSemaphore loginSemaphore = new LoginSemaphore(slots);
        IntStream.range(0, slots)
                .forEach(unused -> executorService.execute(loginSemaphore::tryLogin));
        executorService.shutdown();


        assertEquals(0, loginSemaphore.availableSlots());
        assertFalse(loginSemaphore.tryLogin());
        loginSemaphore.logout();

    }


    @Test
    public void when_logout_then_available_slots() {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginSemaphore loginSemaphore = new LoginSemaphore(slots);
        IntStream.range(0, slots)
                .forEach(unused -> executorService.execute(loginSemaphore::tryLogin));
        executorService.shutdown();

        assertEquals(0, loginSemaphore.availableSlots());
        loginSemaphore.logout();

        assertTrue(loginSemaphore.availableSlots() > 0);
        assertTrue(loginSemaphore.tryLogin());

    }

}
