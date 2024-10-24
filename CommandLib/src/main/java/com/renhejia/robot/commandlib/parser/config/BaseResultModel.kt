package com.renhejia.robot.commandlib.parser.config

class BaseResultModel<T> {
    var msg: String? = null
    var data: T? = null
    var code: Int = 0
}
