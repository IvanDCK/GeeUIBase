package com.renhejia.robot.commandlib.parser.clock

class ClockListInfo {
    var code: Int = 0
    var data: ClockListData? = null
    var msg: String? = null

    override fun toString(): String {
        return "ClockListInfo{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}'
    }
}
