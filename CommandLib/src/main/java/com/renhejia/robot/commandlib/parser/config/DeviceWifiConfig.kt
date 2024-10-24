package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceWifiConfig {
    var wifi_switch: Int = 0

    var is_connected: Int = 0
    var selected_wifi: String? = null

    override fun toString(): String {
        return "{" +
                "wifi_switch=" + wifi_switch +
                ", is_connected=" + is_connected +
                ", selected_wifi='" + selected_wifi + '\'' +
                '}'
    }
}
