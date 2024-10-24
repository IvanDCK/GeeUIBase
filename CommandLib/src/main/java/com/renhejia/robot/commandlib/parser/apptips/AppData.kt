package com.renhejia.robot.commandlib.parser.apptips

class AppData {
    var config_key: String? = null
    var config_title: String? = null
    var config_data: Array<AppTipsInfo> = emptyArray()

    override fun toString(): String {
        return "AppData{" +
                "config_key='" + config_key + '\'' +
                ", config_title='" + config_title + '\'' +
                ", config_data=" + config_data.contentToString() +
                '}'
    }
}
