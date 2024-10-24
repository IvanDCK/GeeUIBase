package com.renhejia.robot.commandlib.parser.displaymodes.calendar

class CalendarData {
    var event_total: Int = 0
    var isHas_more: Boolean = false
    var memo_list: Array<CalenderItem> = emptyArray()

    override fun toString(): String {
        return "{" +
                "event_total=" + event_total +
                ", has_more=" + isHas_more +
                ", memo_list=" + memo_list.contentToString() +
                '}'
    }
}
