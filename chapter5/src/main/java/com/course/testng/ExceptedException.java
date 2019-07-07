package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {

/*

    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个失败的异常测试");
    }
*/

   //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }


/*

   //这是一个预期结果是异常的测试
    @Test(expectedExceptions = ArithmeticException.class)
    public void testMethod(){
        int a=0;
        int b=10;
        System.out.println(b/a);
    }
*/

}
