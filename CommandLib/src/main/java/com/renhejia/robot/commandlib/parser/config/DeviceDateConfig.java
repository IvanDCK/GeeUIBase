package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceDateConfig {
    private int hour_24_switch;
    private int date_format;
    private String time_zone;

    public int getHour_24_switch() {
        return hour_24_switch;
    }

    public void setHour_24_switch(int hour_24_switch) {
        this.hour_24_switch = hour_24_switch;
    }

    public int getDate_format() {
        return date_format;
    }

    public void setDate_format(int date_format) {
        this.date_format = date_format;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    @Override
    public String toString() {
        return "{" +
                "hour_24_switch=" + hour_24_switch +
                ", date_format=" + date_format +
                ", time_zone='" + time_zone + '\'' +
                '}';
    }
}