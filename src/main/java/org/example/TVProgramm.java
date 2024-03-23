package org.example;

public class TVProgramm {
    String channel;
    BroadcastsTime time;
    String title;

    TVProgramm(String channel, BroadcastsTime time, String title) {
        this.channel = channel;
        this.time = time;
        this.title = title;
    }
}
