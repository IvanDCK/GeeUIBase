package com.renhejia.robot.commandlib.parser.displaymodes.calendar

class CalenderItem {
    var memo_title: String? = null
    var memo_time: Long = 0
    var memo_time_label: String? = null

    override fun toString(): String {
        return "{" +
                "memo_title='" + memo_title + '\'' +
                ", memo_time=" + memo_time +
                ", memo_time_label='" + memo_time_label + '\'' +
                '}'
    }
}
