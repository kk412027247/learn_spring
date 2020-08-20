package com.wangluoguimi.soundsystem;

public class CDPlayer {
    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer constructor "+this.toString());
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer constructor with paramer"+this.toString());
    }

    public void play(){
        System.out.println("CDPlayer: "+ this.toString());
        cd.play();
    }
}
