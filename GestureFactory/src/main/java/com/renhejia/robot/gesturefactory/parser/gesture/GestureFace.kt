package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureFace(var face: String) {
    var face_name: String? = null
    var filePrefix: String? = null
    var times: Int = 0

    override fun toString(): String {
        return "{" +
                "face='" + face + '\'' +
                ", face_name='" + face_name + '\'' +
                ", filePrefix='" + filePrefix + '\'' +
                ", times=" + times +
                '}'
    }
}
