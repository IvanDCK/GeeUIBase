package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureFootMotion(var motion: String, var number: Int, var speed: Int) {
    var motion_name: String? = null


    override fun toString(): String {
        return "{" +
                "motion='" + motion + '\'' +
                ", motion_name='" + motion_name + '\'' +
                ", number=" + number +
                ", speed=" + speed +
                '}'
    }
}
