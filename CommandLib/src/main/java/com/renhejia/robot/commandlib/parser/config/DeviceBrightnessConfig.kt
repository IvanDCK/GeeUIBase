package com.renhejia.robot.commandlib.parser.config

/**
 * @author liujunbin
 */
class DeviceBrightnessConfig {
    var brightness_switch: Int = 0
    var volume_size: Int = 0

    override fun toString(): String {
        return "{" +
                "brightness_switch=" + brightness_switch +
                ", volume_size=" + volume_size +
                '}'
    }
}
