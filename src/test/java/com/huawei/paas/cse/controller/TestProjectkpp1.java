package com.huawei.paas.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectkpp1 {

        Projectkpp1Delegate projectkpp1Delegate = new Projectkpp1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectkpp1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}