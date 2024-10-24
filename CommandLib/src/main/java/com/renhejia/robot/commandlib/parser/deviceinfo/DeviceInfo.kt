package com.renhejia.robot.commandlib.parser.deviceinfo

/**
 * 设备信息
 */
class DeviceInfo {
    var code: Int = 0
    var msg: String? = null
    var data: DeviceData? = null

    override fun toString(): String {
        return "{" +
                "code:" + code +
                ", msg:'" + msg + '\'' +
                ", data:" + data +
                '}'
    }
}
