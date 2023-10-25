package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;
    private int hour, minute, second;
    //생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(final int hour) {
        if(hour < MIN_HOUR) { this.hour = MIN_HOUR; return;}
        if(hour > MAX_HOUR) { this.hour = MAX_HOUR; return;}
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%02d시 %02d분 %02d초",hour, minute, second );
    }
}

class TimeTest {
    public static void main(String[] args) {

        Time time = new Time(14, 20 ,30);
        time.setMinute(7);
        time.setHour(30); // 0~23, 만약 23초과값이 들어오면 23이, 0미만 값이 0이 들어가도록
        System.out.println(time);
        //time.hour = 10;
    }
}
