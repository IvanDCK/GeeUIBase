package com.renhejia.robot.commandlib.parser.expression

class Expression {
    var code: Int = 0
    var msg: String? = null
    var data: ExpressionData? = null


    override fun toString(): String {
        return "{" +
                "code:" + code +
                ", msg:'" + msg + '\'' +
                ", data:" + data +
                '}'
    }
}
