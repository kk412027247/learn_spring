package com.wangluoguimi.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer1;

    @Autowired
    private CDPlayer cdPlayer2;

    @Autowired
    private CDPlayer cdPlayer3;

    @Autowired
    private CDPlayer cdPlayer4;

    @Autowired
    private CDPlayer cdPlayer5;

    @Test
    public void test01() {
        cdPlayer1.play();
    }

    @Test
    public void test02(){
        cdPlayer2.play();
    }

    @Test
    public void test03(){
        cdPlayer3.play();
    }

    @Test
    public void test04(){
        cdPlayer4.play();
    }


    @Test
    public void test05(){
        cdPlayer5.play();
    }
}
