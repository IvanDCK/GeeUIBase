package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */

class Gesture {
    var info: GestureInfo? = null
    var gesture: Array<Gestures> = emptyArray()

    override fun toString(): String {
        return "Gesture{" +
                "info=" + info +
                ", gesture=" + gesture.contentToString() +
                '}'
    }
}
