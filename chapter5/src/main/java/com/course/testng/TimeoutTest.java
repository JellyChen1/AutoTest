package com.course.testng;

import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);

    }
}

