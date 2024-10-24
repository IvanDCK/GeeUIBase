package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureLight {
    var color: Int = 0
    var status: String? = null
    var times: Int = 0

    override fun toString(): String {
        return "{" +
                '\"' + "color" + '\"' + ":" + color +
                "," + '\"' + "status" + '\"' + ":" + status +
                "," + '\"' + "times" + '\"' + ":" + times +
                '}'
    }
}
