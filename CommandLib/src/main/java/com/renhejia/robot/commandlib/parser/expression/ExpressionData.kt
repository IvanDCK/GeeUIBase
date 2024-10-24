package com.renhejia.robot.commandlib.parser.expression

/**
 * @author liujunbin
 */
class ExpressionData {
    var config_key: String? = null
    var config_title: String? = null
    var config_data: ExpressionConfigData? = null


    override fun toString(): String {
        return "{" +
                "config_key:'" + config_key + '\'' +
                ", config_title:'" + config_title + '\'' +
                ", config_data:" + config_data +
                '}'
    }
}
