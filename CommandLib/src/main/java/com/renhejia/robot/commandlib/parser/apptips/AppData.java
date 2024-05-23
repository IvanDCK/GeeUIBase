package com.renhejia.robot.commandlib.parser.apptips;

import java.util.Arrays;

public class AppData {

    private String config_key;
    private String config_title;
    private AppTipsInfo[] config_data;

    public String getConfig_key() {
        return config_key;
    }

    public void setConfig_key(String config_key) {
        this.config_key = config_key;
    }

    public String getConfig_title() {
        return config_title;
    }

    public void setConfig_title(String config_title) {
        this.config_title = config_title;
    }

    public AppTipsInfo[] getConfig_data() {
        return config_data;
    }

    public void setConfig_data(AppTipsInfo[] config_data) {
        this.config_data = config_data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "config_key='" + config_key + '\'' +
                ", config_title='" + config_title + '\'' +
                ", config_data=" + Arrays.toString(config_data) +
                '}';
    }

}
