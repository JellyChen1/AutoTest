package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {


   /* //再通过测试方法调用DataProvider
    @Test(dataProvider = "data")
     public void testDataProvider(String name,int age){
         System.out.println("name="+name+",age="+age);
     }
     //先声明DataProvider
     @DataProvider(name="data")
     public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"lisa",17},
                {"july",16},
                {"peggic",17}
        };
        return o;
     }*/

   //利用方法名传递参数
   @Test(dataProvider = "methodData")
    public void test1(String name,int age){
       System.out.println("test111方法 name="+name+",age="+age);
   }
   @Test(dataProvider = "methodData")
    public void test2(String name,int age){
       System.out.println("test222方法 name="+name+",age="+age);
   }

   @DataProvider(name="methodData")
   //Method method------>Java反射的一种，用于获得关联的方法的相关信息
    public Object[][] methodDataProvider(Method method){
       Object[][] result=null;
       if(method.getName().equals("test1")){
           result=new Object[][]{
                   {"lisa",20},
                   {"judy",19}
           };
       }else if(method.getName().equals("test2")){
           result=new Object[][]{
                   {"joho",21},
                   {"leis",23}
           };
       }

       return result;
   }



}
