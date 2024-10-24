package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceBleConfig {
    var ble_switch: Int = 0
    var be_discover_switch: Int = 0

    override fun toString(): String {
        return "{" +
                "ble_switch=" + ble_switch +
                ", be_discover_switch=" + be_discover_switch +
                '}'
    }
}
