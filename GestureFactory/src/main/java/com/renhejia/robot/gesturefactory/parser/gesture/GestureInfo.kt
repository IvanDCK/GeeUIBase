package com.renhejia.robot.gesturefactory.parser.gesture

/**
 * @author liujunbin
 */
class GestureInfo {
    var version: Int = 0
    var name: String? = null
    var length: Int = 0

    override fun toString(): String {
        return "GestureInfo{" +
                "version=" + version +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}'
    }
}
