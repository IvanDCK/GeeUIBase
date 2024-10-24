package com.renhejia.robot.commandlib.parser.geeuiface

/**
 *
 *
 * @author liujunbin
 */
class RobotMode {
    var mode: String? = null
    var face: String? = null

    override fun toString(): String {
        return "{" +
                "mode:'" + mode + '\'' +
                ", face:'" + face + '\'' +
                '}'
    }
}
