package com.spring.boot.test.starter;

import com.mistra.mistrastarter.MistraService;
import com.spring.boot.test.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/6/26/026
 * Describe: 自定义starter测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class StarterPomTest {

    @Autowired
    private MistraService mistraService;

    @Test
    public void say() {
        System.out.println(mistraService.sayYourName());
    }
}
