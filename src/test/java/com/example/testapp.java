package com.example; // Matches the folder structure

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// No need to import app if they are in the same package

public class testapp {
    @Test
    public void test() { // Removed 'static'
        assertEquals(356.0, app.convert(180.0));
    }
}
