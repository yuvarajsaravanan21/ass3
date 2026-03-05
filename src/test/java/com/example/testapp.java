package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.com.example.app; 
public class testapp{
    @Test
    public void test(){
        app ap=new app();
        assertEquals(356,app.convert(180.0));
    }

 }