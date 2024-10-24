package com.renhejia.robot.commandlib.parser.config

class RobotConfig {
    var code: Int = 0
    var msg: String? = null
    var data: RobotConfigData? = null

    override fun toString(): String {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}'
    }
}
