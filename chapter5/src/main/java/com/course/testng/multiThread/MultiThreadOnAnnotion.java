package com.course.testng.multiThread;


import org.testng.annotations.Test;

/**
 * 多线程测试，没有关联的用例可以使用多线程，减少执行时间
 * invocationCount---->执行次数
 * threadPoolSize----->线程池大小
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void threadTest(){
        System.out.println("********hello world*********");
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}
