package ht1.clock;

public class ClockClass implements Readable{
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public void readTime() {
        System.out.println("Time: " + getHours() + ":" + getMinutes() + ":" + getSeconds());
    }
}
