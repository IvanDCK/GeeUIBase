package com.renhejia.robot.commandlib.parser.expression

class ExpressionText {
    var content: String? = null

    override fun toString(): String {
        return "{" +
                "content:'" + content + '\'' +
                '}'
    }
}
