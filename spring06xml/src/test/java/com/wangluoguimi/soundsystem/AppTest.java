package com.wangluoguimi.soundsystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    private CompactDisc compactDisc1;

    @Autowired
    @Qualifier("compactDisc2")
    private CompactDisc compactDisc2;

    @Autowired
    private CompactDisc compactDisc3;

    @Autowired
    private CompactDisc compactDisc4;

    @Autowired
    private CompactDisc compactDisc5;

    @Autowired
    private CompactDisc compactDisc6;

    @Test
    public void test01(){
        compactDisc1.play();
        compactDisc2.play();
        compactDisc3.play();
        compactDisc4.play();
        compactDisc5.play();
        compactDisc6.play();
    }
}
