package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureEarMotion {
    var motion: String? = null
    var step: Int = 0
    var speed: Int = 0
    var times: Int = 0

    override fun toString(): String {
        return "{" +
                '\"' + "motion" + '\"' + ":" + '\"' + motion + '\"' +
                "," + '\"' + "speed" + '\"' + ":" + speed +
                "," + '\"' + "step" + '\"' + ":" + step +
                "," + '\"' + "times" + '\"' + ":" + times +
                '}'
    }
}
