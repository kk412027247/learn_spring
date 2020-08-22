package com.wangluoguimi.soundsystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompactDisc {

    private String title;
    private String artist;
    private List<Music> tracks;
    private Set<Music> tracks2;
    private Map<String, Music> tracks3;
    private Music[] tracks4;

    public CompactDisc() {
        super();
        System.out.println("CompactDisc constructor " + this.toString());

    }

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
        System.out.println("Compact disc constructor with title and artist" + this.toString());
    }

    public CompactDisc(String title, String artist, List<Music> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        System.out.println("Compact disc constructor with title and artist and track" + this.toString());
    }

    public CompactDisc(String title, String artist, Set<Music> tracks2) {
        this.title = title;
        this.artist = artist;
        this.tracks2 = tracks2;
    }

    public CompactDisc(String title, String artist, Map<String, Music> tracks3) {
        this.title = title;
        this.artist = artist;
        this.tracks3 = tracks3;
    }

    public CompactDisc(String title, String artist, Music[] tracks4) {
        this.title = title;
        this.artist = artist;
        this.tracks4 = tracks4;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Music> getTracks() {
        return tracks;
    }

    public void setTracks(List<Music> tracks) {
        this.tracks = tracks;
    }

    public Set<Music> getTracks2() {
        return tracks2;
    }

    public void setTracks2(Set<Music> tracks2) {
        this.tracks2 = tracks2;
    }

    public Map<String, Music> getTracks3() {
        return tracks3;
    }

    public void setTracks3(Map<String, Music> tracks3) {
        this.tracks3 = tracks3;
    }

    public Music[] getTracks4() {
        return tracks4;
    }

    public void setTracks4(Music[] tracks4) {
        this.tracks4 = tracks4;
    }

    public void play() {
        System.out.println("Play the music " + this.toString() + " " + this.title + " by " + this.artist);
        if (this.tracks != null) {
            for (Music track : this.tracks) {
                System.out.println("music: " + track.getTitle() + " duration: " + track.getDuration());
            }
        }

        if (this.tracks2 != null) {
            for (Music track : this.tracks2) {
                System.out.println("set music: " + track.getTitle() + " duration: " + track.getDuration());
            }
        }

        if (this.tracks3 != null) {
            for (String key : this.tracks3.keySet()) {
                System.out.println("key: " + key);
                Music music = this.tracks3.get(key);
                System.out.println("music: " + music.getTitle() + " duration: " + music.getDuration());
            }
        }

        if (this.tracks4 != null) {
            for (Music track : this.tracks4) {
                System.out.println("array music: " + track.getTitle() + " duration: " + track.getDuration());
            }
        }
    }

}
