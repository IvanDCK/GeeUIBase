package com.renhejia.robot.commandlib.parser.tips

/**
 * @author liujunbin
 */
class ConfigData {
    var tips_list: Array<TipsName> = emptyArray()
    var tips_en_list: Array<TipsName> = emptyArray()

    override fun toString(): String {
        return "{" +
                "tips_list=" + tips_list.contentToString() +
                '}'
    }
}
