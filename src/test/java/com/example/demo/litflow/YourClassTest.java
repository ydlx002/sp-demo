package com.example.demo.litflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author lizhenhua
 * @Date 2024/10/28 17:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class YourClassTest {

    @Autowired
    private YourClass yourClass;


    @Test
    public void testConfig() {
        yourClass.testConfig();
    }

}