package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceGeneralConfig {
    var display_switch: Int = 0
    var time_switch: Int = 0
    var weather_switch: Int = 0
    var calendar_switch: Int = 0
    var general_battery_switch: Int = 0

    override fun toString(): String {
        return "{" +
                "display_switch=" + display_switch +
                ", time_switch=" + time_switch +
                ", weather_switch=" + weather_switch +
                ", calendar_switch=" + calendar_switch +
                ", general_battery_switch=" + general_battery_switch +
                '}'
    }
}
