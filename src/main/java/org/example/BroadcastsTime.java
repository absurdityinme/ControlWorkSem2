package org.example;

public class BroadcastsTime{
    byte hour;
    byte minutes;
    BroadcastsTime(String timeString) {
        int index = timeString.indexOf(":");
        hour = Byte.parseByte(timeString.substring(0, index));
        minutes = Byte.parseByte(timeString.substring(index + 1));
    }
    public boolean after(BroadcastsTime t) {
        return this.compareTo(t) > 0;
    }
    public boolean before(BroadcastsTime t) {
        return this.compareTo(t) < 0;
    }
    public boolean between(BroadcastsTime t1, BroadcastsTime t2) {
        return after(t1) && before(t2);
    }
    public int compareTo(BroadcastsTime t) {
        if (hour > t.hour || (hour == t.hour && minutes > t.minutes)) return 1;
        else if (hour == t.hour && minutes == t.minutes) return 0;
        return -1;
    }
}
