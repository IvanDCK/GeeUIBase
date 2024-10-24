package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureSoundEffect {
    var sound: String? = null
    var sound_name: String? = null
    var times: Int = 0

    override fun toString(): String {
        return "{" +
                "sound='" + sound + '\'' +
                ", sound_name='" + sound_name + '\'' +
                ", times=" + times +
                '}'
    }
}
