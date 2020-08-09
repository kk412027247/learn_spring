package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("application Spring");
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
