package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceDateConfig {
    var hour_24_switch: Int = 0
    var date_format: Int = 0
    var time_zone: String? = null

    override fun toString(): String {
        return "{" +
                "hour_24_switch=" + hour_24_switch +
                ", date_format=" + date_format +
                ", time_zone='" + time_zone + '\'' +
                '}'
    }
}