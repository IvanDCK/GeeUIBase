package com.renhejia.robot.commandlib.parser.antennalight

class AntennaLight
/**
 * 1: 红色-red
 * 2: 绿色-green
 * 3: 蓝色-blue
 * 4: 橙色-orange
 * 5: 白色-white
 * 6: 黄色-yellow
 * 7: 紫色-purple
 * 8: 青色-cyan
 * 9: 黑色-black
 */(var antenna_light: String, var antenna_light_color: Int) {
    override fun toString(): String {
        return "{" +
                '\"' + "antenna_light" + '\"' + ":" + '\"' + antenna_light + '\"' +
                "," + '\"' + "antenna_light_color" + '\"' + ":" + antenna_light_color +
                '}'
    }
}
