import com.wangluoguimi.soundsystem.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("Appliction is running");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        CompactDisc cd = context.getBean(CompactDisc.class);
        CompactDisc cd = (CompactDisc) context.getBean("compactDisc2");

        cd.play();
    }
}
