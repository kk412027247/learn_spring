package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    //    @Autowired
    private CompactDisc cd;

    //    @Autowired
    private Power power;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer no parameter");
    }

//    @Autowired
//    public void setCd(CompactDisc cd) {
//        this.cd = cd;
//    }
//
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//    }
//
//
//    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("CDPlayer constructor with parameter");
//    }

    @Autowired
    public CDPlayer(CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("CDPlayer constructor with CompactDisc and Power");
    }

//    @Autowired
//    public void prepare(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//    }

    public void play() {
        power.supply();
        cd.play();
    }
}
