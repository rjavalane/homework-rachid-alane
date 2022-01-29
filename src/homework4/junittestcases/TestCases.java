package homework4.junittestcases;



import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestCases {

    @Test
    public void test0() {
        int a = 5;
        int b = 10;
        int actualAddTotal;
        int expectedTotal = 15;
        actualAddTotal = a + b;

        Assert.assertEquals(expectedTotal, actualAddTotal);
        System.out.println("Test 0 passed");
    }

    @Test
    public void test1() {
        int c = 27;
        int d = 18;
        int actualSubTotal;
        int expectedTotal = 9;
        actualSubTotal = c - d;

        Assert.assertEquals(expectedTotal, actualSubTotal);
        System.out.println("Test 1 passed");
    }


    @Test
    public void test2() {
        int e = 10;
        int f = 11;
        int actualMulTotal;
        int expectedTotal = 180;
        actualMulTotal = e * f;

        Assert.assertEquals(expectedTotal, actualMulTotal);
        System.out.println("Test 2 passed");
    }

    @Test
    public void test3() {
        int g = 180;
        int h = 60;
        int actualMulTotal;
        int expectedTotal = 3;
        actualMulTotal = g / h;

        Assert.assertEquals(expectedTotal, actualMulTotal);
        System.out.println("Test 3 passed");
    }

    @Test
    public void test4() {
        String country = "algeria";
        String subcountry = "alg";

        Assert.assertTrue(country.contains(subcountry));
        System.out.println("Test 4 passed");
    }

    @Test
    public void test5() {
        String fruits = "redfruitsbag";
        String juice = "orange";

        Assert.assertTrue(fruits.contains(juice));
        System.out.println("Test 5 passed");
    }

    @Test
    public void test6() {
        char[] name = {'b', 'a', 'n', 'a', 'n', 'a'};
        char[] fruit = "banana".toCharArray();

        Assert.assertArrayEquals(name, fruit);
        System.out.println("Test 6 passed");
    }

    @Test
    public void test7() {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 27, 18, 1, 91, 89, 63, 58));
        int lucky = 27;

        Assert.assertTrue(number.contains(lucky));
        System.out.println("Test 7 passed");

    }

    @Test
    public void test8() {
        Map<String, String> example = new HashMap<>();
        example.put("toyota", "rav4");
        example.put("body", "doors");
        example.put("engine", "biturbine");
        example.put("color", "black");

        //String val;
        Assert.assertTrue(example.containsKey("toyota"));
        System.out.println("test 8 passed");


    }
    @Test
    public void test9() {
    Map<String, String> aptSize = new HashMap<>();
    aptSize.put("bedrooms", "two");
    aptSize.put("bathrooms","one");
    aptSize.put("livingrooms", "one");
    aptSize.put("balcony","three");

    Assert.assertTrue(aptSize.containsValue("four"));
    System.out.println("test 9 passed");


    }


    }