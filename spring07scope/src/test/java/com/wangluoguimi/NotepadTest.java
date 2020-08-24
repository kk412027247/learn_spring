package com.wangluoguimi;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NotepadTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Notepad notepad1 = (Notepad)context.getBean("notepad");
        Notepad notepad2 = (Notepad)context.getBean("notepad");
        System.out.println(notepad1 == notepad2);

        context.close();
    }
}
