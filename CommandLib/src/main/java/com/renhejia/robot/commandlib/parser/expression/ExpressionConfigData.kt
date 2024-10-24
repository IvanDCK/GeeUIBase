package com.renhejia.robot.commandlib.parser.expression

/**
 * @author liujunbin
 */
class ExpressionConfigData {
    var expression_content_list: Array<ExpressionText> = emptyArray()

    override fun toString(): String {
        return "{" +
                "expression_content_list:" + expression_content_list.contentToString() +
                '}'
    }
}
