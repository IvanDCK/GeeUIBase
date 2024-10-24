package com.renhejia.robot.commandlib.parser.displaymodes.fans

/**
 * @author liujunbin
 */
class FansInfo {
    var code: Int = 0
    var data: Array<FansData> = emptyArray()
    var msg: String? = null

    override fun toString(): String {
        return "{" +
                "code=" + code +
                ", data=" + data.contentToString() +
                ", msg='" + msg + '\'' +
                '}'
    }
}
