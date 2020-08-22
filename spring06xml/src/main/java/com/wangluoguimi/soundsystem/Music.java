package com.wangluoguimi.soundsystem;

public class Music {
    private String title;
    private Integer duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("insert " + this.toString() + " title");
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
        System.out.println("insert " + this.toString() + " duration");
    }


    public Music() {
        System.out.println("constructor without parameter");
    }

    public Music(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }
}
